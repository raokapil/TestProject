package com.company.designPattern.structural.compositePattern.fileSystem;

import java.util.ArrayList;
import java.util.List;

// Composite Object
public class Directory implements FileSystem{

    private String directoryName;
    private List<FileSystem> list;

    public Directory(String name) {
        this.directoryName = name;
        list = new ArrayList<>();
    }

    public void add (FileSystem object) {
        list.add(object);
    }

    @Override
    public void ls() {
        System.out.println("Directory Name : " + directoryName);

        for (FileSystem fileSystem : list) {
            fileSystem.ls();
        }
    }
}
