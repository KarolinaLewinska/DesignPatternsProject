package com.java.designpatternsproject.creational.prototype;

import java.awt.image.BufferedImage;

public abstract class Image {
    public String imgName;
    public String imgExtension;
    public BufferedImage picture;

    public Image(String imgName, String imgExtension, BufferedImage picture) {
        this.imgName = imgName;
        this.imgExtension = imgExtension;
        this.picture = picture;
    }

    public abstract Image clone();
}