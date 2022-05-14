package com.java.designpatternsproject.behavioral.command;

import java.util.ArrayList;
import java.util.List;

public class ImageCommandExecutor {
    private final List<ImageCommand> imageCommands = new ArrayList<>();

    public void executeImageCommands(ImageCommand imageCommand) {
        imageCommands.add(imageCommand);
        imageCommand.executeImageCommand();
    }
}