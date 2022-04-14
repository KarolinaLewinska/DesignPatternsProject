package com.java.designpatternsproject.creational.singleton;

import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.attribute.BasicFileAttributeView;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.Date;

public class ConfigFileSingleton {
    private static volatile ConfigFileSingleton configFileSingletonInstance;

    Path configFilePath = FileSystems.getDefault().getPath("src/com/java/designpatternsproject/creational/singleton/", "dbconfig.txt");
    BasicFileAttributeView fileAttrView = Files.getFileAttributeView(configFilePath, BasicFileAttributeView.class);
    BasicFileAttributes fileAttr = fileAttrView .readAttributes();

    Date creationTime = new Date(fileAttr.creationTime().toMillis());
    Date lastAccessTime = new Date(fileAttr.lastAccessTime().toMillis());
    Date lastModifiedTime = new Date(fileAttr.lastModifiedTime().toMillis());
    long fileSize = fileAttr.size();

    private ConfigFileSingleton() throws IOException {}

    public static synchronized ConfigFileSingleton getInstance() throws Exception {
        try {
            if (configFileSingletonInstance == null) {
                configFileSingletonInstance = new ConfigFileSingleton();
            }
            return configFileSingletonInstance;
        } catch (Exception exc) {
            exc.printStackTrace();
            throw new Exception("Exception occurred during creating singleton instance");
        }
    }

    public Path getConfigFilePath() {
        return configFilePath;
    }

    public Date getCreationTime() {
        return creationTime;
    }

    public Date getLastAccessTime() {
        return lastAccessTime;
    }

    public Date getLastModifiedTime() {
        return lastModifiedTime;
    }

    public long getFileSize() {
        return fileSize;
    }
}