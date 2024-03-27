package com.company.designPattern.structural.compositePattern.fileSystem;

// Leaf Node : It can't do anything. Just return the same thing.
public class FIle implements FileSystem{

    private String fileName;

    public FIle(String name) {
        this.fileName = name;
    }

    @Override
    public void ls() {
        System.out.println("File Name : " + fileName);
    }
}
