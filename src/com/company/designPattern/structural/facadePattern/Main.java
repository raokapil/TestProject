package com.company.designPattern.structural.facadePattern;

// It is used when we have to hide the system complexity from the client.
// It's a layer between client and complex functionality.
// It's non-mandatory, if client wants to call the complex functionality, it can call its individual
// components directly in this pattern.

// So any change in creation steps of a product will only impact facade layer not the client.

// Facade can use others facade

/**
 * Facade is a structural design pattern that provides a simplified interface to a library, a framework,
 * or any other complex set of classes.
 */

// Proxy  vs Facade : Proxy takes care of particular type of object but facade can incorporate multiple objects.

// Adapter vs Facade : Adapter is used to bring the compatibility between the client and original interface,
// while the facade is used to hide the complexity.
public class Main {
}
