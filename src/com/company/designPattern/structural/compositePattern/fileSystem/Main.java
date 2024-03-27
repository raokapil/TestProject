package com.company.designPattern.structural.compositePattern.fileSystem;

/**
 * Composite is a structural design pattern that lets you compose objects into tree structures and then
 * work with these structures as if they were individual objects.
 */
// When problem resembles a tree like structure like Organisation hierarchy.

// Composite Object means, when it contains itself.
public class Main {

    public static void main (String[] args) {

        Directory movieDirectory = new Directory("Movie Directory");

        FileSystem file = new FIle("Gadar 2");
        movieDirectory.add(file);

        Directory comedyMovieDirectory = new Directory("Comedy Movie Directory");
        FileSystem fileSystem = new FIle("Jawan");
        comedyMovieDirectory.add(fileSystem);

        movieDirectory.add(comedyMovieDirectory);

        movieDirectory.ls();


    }
}
