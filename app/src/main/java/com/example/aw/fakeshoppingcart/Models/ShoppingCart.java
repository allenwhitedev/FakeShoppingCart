package com.example.aw.fakeshoppingcart.Models;


import java.io.Serializable;

public class ShoppingCart implements Serializable
{
  int id;
  int userId;
  public ShoppingCart(int userId) { this.userId = userId; } // associate a shopping cart with a user when created



  // initialize shopping cart empty
  int numApples = 0;
  int numBananas = 0;
  int numBooks = 0;
  int numCameras = 0;
  int numFans = 0;
  int numHats = 0;
  int numMilks = 0;
  int numPants = 0;
  int numRices = 0;
  int numScissors = 0;
  int numShirts = 0;
  int numShoes = 0;


}
