package com.example.aw.fakeshoppingcart;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class LoginActivity extends AppCompatActivity {

  public final static String USERNAME = "";
  public final static String PASSWORD = "";
  public boolean isBuyerLogin = true;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_login);
  }

  public void login(View view)
  {
    Intent loginIntent = new Intent(this, BrowseActivity.class);
    Bundle extras = new Bundle();

    EditText usernameEditText = (EditText) findViewById(R.id.usernameEditText);
    EditText passwordEditText = (EditText) findViewById(R.id.passwordEditText);

    String username = usernameEditText.getText().toString();
    String password = passwordEditText.getText().toString();

    extras.putString("USERNAME", username);
    extras.putString("PASSWORD", password);
    loginIntent.putExtras(extras);

    startActivity(loginIntent);

  }

}
