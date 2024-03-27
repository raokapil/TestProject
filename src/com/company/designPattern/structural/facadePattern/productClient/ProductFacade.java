package com.company.designPattern.structural.facadePattern.productClient;

public class ProductFacade {

    private Product product;
    private Payment payment;
    private Invoice invoice;
    private Notification notification;

    public ProductFacade() {
        product = new Product();
        payment = new Payment();
        invoice = new Invoice();
        notification = new Notification();
    }

    public void createProduct() {

        product.createProduct();
        payment.makePayment();
        invoice.createInvoice();
        notification.sendNotification();
        // Order creation successful
    }
}
