package com.java.designpatternsproject.behavioral.command;

import javax.imageio.ImageIO;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.FileOutputStream;
import java.io.IOException;

public class RotateImageCommand extends ImageCommand {
    private int angleToRotate = 90;

    public RotateImageCommand(BufferedImage image) {
        super(image);
    }

    @Override
    public void executeImageCommand() {
        BufferedImage rotated = new BufferedImage(image.getWidth(), image.getHeight(), image.getType());
        Graphics2D graphic = rotated.createGraphics();
        graphic.rotate(Math.toRadians(angleToRotate), (float)image.getWidth()/2, (float)image.getHeight()/2);
        graphic.drawImage(image, null, 0, 0);
        graphic.dispose();
        saveRotatedImage(rotated, "png", "src/com/java/designpatternsproject/behavioral/command/rotatedImage.png");
    }

    private void saveRotatedImage(BufferedImage rotatedImage, String extension, String fileFullPath) {
        try {
            ImageIO.write(rotatedImage, extension, new FileOutputStream(fileFullPath));
        } catch (IOException exc) {
            exc.printStackTrace();
        }
    }
}