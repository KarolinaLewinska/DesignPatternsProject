package com.java.designpatternsproject.creational.prototype;

import java.awt.image.BufferedImage;

public class ImageJPG extends Image {
    public ImageJPG(String imgName, String imgExtension, BufferedImage picture) {
        super(imgName, imgExtension, picture);
    }

    @Override
    public Image clone() {
        ImageJPG imageJPG = new ImageJPG(imgName, imgExtension, picture);
        return imageJPG;
    }
}