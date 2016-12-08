package com.example.aw.fakeshoppingcart;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.aw.fakeshoppingcart.Models.Inventory;
import com.example.aw.fakeshoppingcart.Models.User;

import static com.example.aw.fakeshoppingcart.LoginActivity.PASSWORD;
import static com.example.aw.fakeshoppingcart.LoginActivity.USERNAME;

public class BrowseActivity extends AppCompatActivity {

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_browse);

    Intent loginIntent = getIntent();
    //Inventory inventory = (Inventory) loginIntent.getSerializableExtra("inventoryObject");
    Bundle loginExtras = loginIntent.getExtras();

    // get user & inventory from previous Activitity
    Inventory mInventory = (Inventory) loginExtras.getSerializable("mInventory");
    User mUser = (User) loginExtras.getSerializable("mUser");

    //String username = loginIntent.getStringExtra("USERNAME");
    //String password = loginIntent.getStringExtra("PASSWORD");

    //Inventory myInventoryYo = (Inventory) loginIntent.getSerializableExtra("myInventory");

    TextView usernameTextView = (TextView) findViewById(R.id.usernameTextView);
    TextView passwordTextView = (TextView) findViewById(R.id.passwordTextView);


    //usernameTextView.setText( loginExtras.getExtra(mInventory);//.getProducts().get(0).type );
    usernameTextView.setText(mUser.username);
    passwordTextView.setText(mUser.password);


    ViewGroup layout = (ViewGroup) findViewById(R.id.activity_browse);


  }
}
