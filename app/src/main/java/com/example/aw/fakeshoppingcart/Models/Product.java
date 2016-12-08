package com.example.aw.fakeshoppingcart.Models;


import java.io.Serializable;

public class Product implements Serializable
{
  int ID;
  public String type = "default Type";
  int quantity;
  double sellingPrice;
  double invoicePrice;

  public String productString = "Product String";

  // invoice price is how much it costs to stock a product
  public Product(int ID, String type, int quantity, double sellingPrice, double invoicePrice)
  {
    this.ID = ID;
    this.type = type;
    this.quantity = quantity;
    this.sellingPrice = sellingPrice;
    this.invoicePrice = invoicePrice;
  }



}
