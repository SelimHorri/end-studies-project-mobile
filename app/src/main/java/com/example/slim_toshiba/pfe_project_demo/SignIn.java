package com.example.slim_toshiba.pfe_project_demo;

import android.app.Activity;
import android.os.Bundle;
import android.text.InputType;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

public class SignIn extends Activity {
// Begin Class
    
    private Button testBtn;
    private EditText emailEt;
    private EditText passwordEt;
    private CheckBox checkBox;
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);
    }
    
    public void showPassword(View view) {
        // Begin showPassword()
        
        checkBox = (CheckBox)findViewById(R.id.checkBoxId);
        passwordEt = (EditText)findViewById(R.id.pass);
        
        if (checkBox.isChecked())
            passwordEt.setInputType(InputType.TYPE_CLASS_TEXT | InputType.TYPE_TEXT_VARIATION_VISIBLE_PASSWORD);
        else {
            
            if (!checkBox.isChecked())
                passwordEt.setInputType(InputType.TYPE_CLASS_TEXT | InputType.TYPE_TEXT_VARIATION_PASSWORD);
        }
        
        // End showPassword()
    }
    
    public void testLogin (View view) {
        // Begin testLogin()
        
        testBtn = (Button) findViewById(R.id.mylog);
        emailEt = (EditText) findViewById(R.id.ed1);
        passwordEt = (EditText)findViewById(R.id.pass);
        
        String email = emailEt.getText().toString();
        String password = passwordEt.getText().toString();
        
        if ( (email.isEmpty()) || (password.isEmpty()) ) {
            Toast.makeText(this,"All fields are empty !! fill them up",Toast.LENGTH_SHORT).show();
        }
        
        // End testLogin()
    }


// End Class
}
