package com.company.designPattern.structural.facadePattern.productClient;

public class OrderClient {

    public static void main (String[] args) {

        ProductFacade productFacade = new ProductFacade();
        productFacade.createProduct();
    }
}
