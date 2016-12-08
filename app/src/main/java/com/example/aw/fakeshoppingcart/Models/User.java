package com.example.aw.fakeshoppingcart.Models;


import android.util.Log;

import java.io.Serializable;
import java.util.Random;

public class User implements Serializable {
  boolean isBuyer = true;
  public String username;
  public String password;
  int id;

  ShoppingCart myShoppingCart;

  public User(String username, String password)
  {
    this.username = username;
    this.password = password;
    this.id = new Random().nextInt();
    Log.d("Id: ", Integer.toString(id) );
  }



}
