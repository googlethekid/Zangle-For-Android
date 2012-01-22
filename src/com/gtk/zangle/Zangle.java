package com.gtk.zangle;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;

import java.net.*;
import java.io.*;

import com.gtk.helloworld.R;


public class Zangle extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
    }


public void selfDestruct(View view) {
	// Boom!!
}}


/* final EditText nameField = (EditText) findViewById(R.id.idnumber);
String name = nameField.getText().toString();

final EditText emailField = (EditText) findViewById(R.id.password);
String email = emailField.getText().toString(); */