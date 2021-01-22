package com.example.slim_toshiba.pfe_project_demo;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.text.InputType;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

public class SignUp extends Activity {
// Begin Class
    
    /*
    AutoCompleteTextView auto;
    String myFruits[];
    
    private void textAuto () {
        
        auto = findViewById(R.id.fruitsId);
        myFruits = getResources().getStringArray(R.array.fruits);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,myFruits);
        auto.setAdapter(adapter);
        
    }
    */
    
    private EditText firstnameEdT;
    private EditText lastnameEdT;
    private EditText emailEdT;
    private EditText pass1EdT;
    private EditText pass2EdT;
    private CheckBox showPassCheckBox;
    
    public void showThePassword (View view) {
        // Begin showThePassword()
        
        pass1EdT = findViewById(R.id.passwordEditTextId);
        pass2EdT = findViewById(R.id.password2EditTextId);
        showPassCheckBox = findViewById(R.id.showPasswordCheckBoxId);
        
        if (showPassCheckBox.isChecked()) {
            pass1EdT.setInputType(InputType.TYPE_CLASS_TEXT | InputType.TYPE_TEXT_VARIATION_VISIBLE_PASSWORD);
            pass2EdT.setInputType(InputType.TYPE_CLASS_TEXT | InputType.TYPE_TEXT_VARIATION_VISIBLE_PASSWORD);
        }
        else {
            
            if (!showPassCheckBox.isChecked()) {
                pass1EdT.setInputType(InputType.TYPE_CLASS_TEXT | InputType.TYPE_TEXT_VARIATION_PASSWORD);
                pass2EdT.setInputType(InputType.TYPE_CLASS_TEXT | InputType.TYPE_TEXT_VARIATION_PASSWORD);
            }
            
        }
        
        // End showThePassword()
    }
    
    public void saveInDb (View view) {
        // Begin saveInDb()
        
        firstnameEdT = findViewById(R.id.firstnameEditTextId);
        lastnameEdT = findViewById(R.id.lastnameEditTextId);
        emailEdT = findViewById(R.id.emailEditTextId);
        pass1EdT = findViewById(R.id.passwordEditTextId);
        pass2EdT = findViewById(R.id.password2EditTextId);
        
        String firstname = firstnameEdT.getText().toString().trim();
        String lastname = lastnameEdT.getText().toString().trim();
        String email = emailEdT.getText().toString().trim();
        String pass1 = pass1EdT.getText().toString();
        String pass2 = pass2EdT.getText().toString();
        
        if ( (firstname.isEmpty()) && (lastname.isEmpty()) && (email.isEmpty()) && (pass1.isEmpty()) && (pass2.isEmpty()) )
            Toast.makeText(this,"All fields are empty !! Type Something.",Toast.LENGTH_SHORT).show();
        else {
            Intent intent = new Intent(this,MapsActivity.class);
            startActivity(intent);
        }
        
        // End saveInDb()
    }
    
    @Override
    protected void onCreate (Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
        // this.textAuto();
    }

// End Class
}
