package com.java.designpatternsproject.behavioral.command;

import java.awt.image.BufferedImage;

public abstract class ImageCommand {
    BufferedImage image;

    public ImageCommand(BufferedImage image) {
        this.image = image;
    }

    abstract void executeImageCommand();
}