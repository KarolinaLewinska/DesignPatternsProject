package com.java.designpatternsproject.behavioral.command;

import java.awt.image.BufferedImage;
import java.awt.image.WritableRaster;

public class CopyImageCommand extends ImageCommand {
    WritableRaster raster;
    public CopyImageCommand(BufferedImage image) {
        super(image);
    }

    @Override
    void executeImageCommand() {
        this.raster = image.copyData(raster);
        System.out.println("Image copied to " + raster);
    }
}