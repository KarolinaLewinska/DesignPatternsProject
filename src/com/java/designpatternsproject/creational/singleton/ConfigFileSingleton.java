package com.java.designpatternsproject.creational.singleton;

import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.attribute.BasicFileAttributeView;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.Date;

public class ConfigFileSingleton {
    private static volatile ConfigFileSingleton CONFIG_FILE_INSTANCE;

    private static final Path CONFIG_FILE_PATH = FileSystems.getDefault()
            .getPath("src/com/java/designpatternsproject/creational/singleton/", "dbconfig.txt");
    private static final BasicFileAttributeView FILE_ATR_VIEW = Files.getFileAttributeView(CONFIG_FILE_PATH, BasicFileAttributeView.class);
    private final BasicFileAttributes FILE_ATTR = FILE_ATR_VIEW.readAttributes();

    private Date creationTime = new Date(FILE_ATTR.creationTime().toMillis());
    private Date lastAccessTime = new Date(FILE_ATTR.lastAccessTime().toMillis());
    private Date lastModifiedTime = new Date(FILE_ATTR.lastModifiedTime().toMillis());
    private long fileSize = FILE_ATTR.size();

    private ConfigFileSingleton() throws IOException {}

    public static synchronized ConfigFileSingleton getInstance() throws Exception {
        try {
            if (CONFIG_FILE_INSTANCE == null) {
                CONFIG_FILE_INSTANCE = new ConfigFileSingleton();
            }
            return CONFIG_FILE_INSTANCE;
        } catch (Exception exc) {
            exc.printStackTrace();
            throw new Exception("Exception occurred during creating singleton instance");
        }
    }

    public Path getConfigFilePath() {
        return CONFIG_FILE_PATH;
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