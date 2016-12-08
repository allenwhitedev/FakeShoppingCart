package com.example.aw.fakeshoppingcart;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import com.example.aw.fakeshoppingcart.Models.Inventory;
import com.example.aw.fakeshoppingcart.Models.User;

import static com.example.aw.fakeshoppingcart.LoginActivity.PASSWORD;
import static com.example.aw.fakeshoppingcart.LoginActivity.USERNAME;

public class BrowseActivity extends AppCompatActivity {

  String currentTab = "storeTab";

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_browse);

    Intent loginIntent = getIntent();
    Bundle loginExtras = loginIntent.getExtras();

    // get user & inventory from previous Activitity
    Inventory mInventory = (Inventory) loginExtras.getSerializable("mInventory");
    User mUser = (User) loginExtras.getSerializable("mUser");

    TextView usernameTextView = (TextView) findViewById(R.id.usernameTextView);
    TextView passwordTextView = (TextView) findViewById(R.id.passwordTextView);

    usernameTextView.setText(mUser.username);
    passwordTextView.setText(mUser.password);

    ViewGroup layout = (ViewGroup) findViewById(R.id.activity_browse);

    final Context context = this;

    // override imageButton onclick for tab items in bottom navigation ---
    final ImageButton storeTab = (ImageButton) findViewById(R.id.storeTab);
    final ImageButton cartTab = (ImageButton) findViewById(R.id.cartTab);
    final ImageButton accountTab = (ImageButton) findViewById(R.id.accountTab);

    // storeTab click
    storeTab.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View view)
      {
        if (currentTab != "storeTab")
        {
          storeTab.setColorFilter(ContextCompat.getColor(context, R.color.colorPrimary));
          if (currentTab == "cartTab")
            cartTab.setColorFilter(ContextCompat.getColor(context, R.color.colorAccent));
          else if (currentTab == "accountTab")
            accountTab.setColorFilter(ContextCompat.getColor(context, R.color.colorAccent));
          currentTab = "storeTab";
        }
      }
    });

    // cartTab click
    cartTab.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View view)
      {
        if (currentTab != "cartTab")
        {
          cartTab.setColorFilter(ContextCompat.getColor(context, R.color.colorPrimary));
          if (currentTab == "storeTab")
            storeTab.setColorFilter(ContextCompat.getColor(context, R.color.colorAccent));
          else if (currentTab == "accountTab")
            accountTab.setColorFilter(ContextCompat.getColor(context, R.color.colorAccent));
          currentTab = "cartTab";
        }
      }
    });

    // accountTab click
    accountTab.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View view)
      {
        if (currentTab != "accountTab")
        {
          accountTab.setColorFilter(ContextCompat.getColor(context, R.color.colorPrimary));
          if (currentTab == "cartTab")
            cartTab.setColorFilter(ContextCompat.getColor(context, R.color.colorAccent));
          else if (currentTab == "accountTab")
            accountTab.setColorFilter(ContextCompat.getColor(context, R.color.colorAccent));
          currentTab = "accountTab";
        }
      }
    });

    // ---
  }






}
