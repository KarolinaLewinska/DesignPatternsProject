package com.java.designpatternsproject.behavioral.command;

import java.awt.Graphics2D;
import java.awt.image.BufferedImage;

public class CreateGraphicsCommand extends ImageCommand {
    public CreateGraphicsCommand(BufferedImage image) {
        super(image);
    }

    @Override
    public void executeImageCommand() {
        Graphics2D graphic = image.createGraphics();
        System.out.println(graphic.getPaint());
    }
}