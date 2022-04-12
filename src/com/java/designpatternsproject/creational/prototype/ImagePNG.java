package com.java.designpatternsproject.creational.prototype;

import java.awt.image.BufferedImage;

public class ImagePNG extends Image {
    public ImagePNG(String imgName, String imgExtension, BufferedImage picture) {
        super(imgName, imgExtension, picture);
    }

    @Override
    public Image clone()  {
        ImagePNG imagePNG = new ImagePNG(imgName, imgExtension, picture);
        return imagePNG;
    }
}