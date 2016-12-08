package com.example.aw.fakeshoppingcart;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import com.example.aw.fakeshoppingcart.Models.Inventory;
import com.example.aw.fakeshoppingcart.Models.User;

import java.io.Serializable;

public class LoginActivity extends AppCompatActivity {

  public final static String USERNAME = "";
  public final static String PASSWORD = "";
  public boolean isBuyerLogin = true;

  // models/database init
  Inventory mInventory = new Inventory(true);
  User mUser;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_login);
  }

  public void login(View view)
  {
    Intent loginIntent = new Intent(this, BrowseActivity.class);

    // bundle for passing objects to other activities
    Bundle extras = new Bundle();

    EditText usernameEditText = (EditText) findViewById(R.id.usernameEditText);
    EditText passwordEditText = (EditText) findViewById(R.id.passwordEditText);

    String username = usernameEditText.getText().toString();
    String password = passwordEditText.getText().toString();

    // create a new user on login
    mUser = new User(username, password);

    // pass inventory & user to next activity
    extras.putSerializable( "mInventory", mInventory );
    extras.putSerializable("mUser", mUser);
    loginIntent.putExtras(extras);

    // start browse activity
    startActivity(loginIntent);

  }


}
