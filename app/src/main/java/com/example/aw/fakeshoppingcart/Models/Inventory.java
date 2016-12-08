package com.example.aw.fakeshoppingcart.Models;


import android.util.Log;

import java.io.Serializable;
import java.util.Vector;

public class Inventory implements Serializable
{
  int id;
  Vector<Product> products = new Vector<Product> ();
  public String inventoryString = "Inventory String";

  public Inventory(boolean isDefault)
  {
    if (isDefault) // initialize default inventory
    {
      String[] productTypes = { "apple", "banana", "book", "camera", "fan", "hat", "milk", "pant", "rice", "scissors", "shirts", "shoes" };
      int[] productQuantities = { 80, 50, 18, 15, 21, 35, 18, 22, 33, 25, 25, 12 };
      double[] productSellingPrices = { 1.00, 1.50, 10.00, 50.00, 20.00, 15.00, 2.00, 15.00, 8.00, 2.50, 5.00, 10.00 };
      double[] productInvoicePrices = { .75, 1.10, 5.50, 40.00, 16.50, 12.00, 1.25, 8.00, 4.50, 2.00, 3.00, 7.50 };

      for (int i = 0; i < productTypes.length; i++)
      {
        Log.d("ProductType: ", productTypes[i]);
        products.add(new Product(i, productTypes[i], productQuantities[i], productSellingPrices[i], productInvoicePrices[i]));
      }

      Log.d( "Product 0:", products.get(0).type );
    }
  }





  public Vector <Product> getProducts() { return products; } // gets inventory products

  public void addProduct(Product product, User user) // adds a product to inventory
  {
    if (user.isBuyer != true) // only add a product to the inventory if user is a seller
      products.add(product);
    else
      Log.d("Error: ", "User is not authorized to add product to inventory" );
  }


}
