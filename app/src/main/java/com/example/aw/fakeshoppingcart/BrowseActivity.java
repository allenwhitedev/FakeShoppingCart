package com.example.aw.fakeshoppingcart;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.TextView;

import static com.example.aw.fakeshoppingcart.LoginActivity.PASSWORD;
import static com.example.aw.fakeshoppingcart.LoginActivity.USERNAME;

public class BrowseActivity extends AppCompatActivity {

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_browse);

    Intent loginIntent = getIntent();
    Bundle loginExtras = loginIntent.getExtras();

    String username = loginIntent.getStringExtra("USERNAME");
    String password = loginIntent.getStringExtra("PASSWORD");

    TextView usernameTextView = (TextView) findViewById(R.id.usernameTextView);
    TextView passwordTextView = (TextView) findViewById(R.id.passwordTextView);

    usernameTextView.setText(username);
    passwordTextView.setText(password);


    ViewGroup layout = (ViewGroup) findViewById(R.id.activity_browse);


  }
}
