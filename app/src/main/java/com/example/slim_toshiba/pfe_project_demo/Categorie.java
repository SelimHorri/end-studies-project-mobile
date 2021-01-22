package com.example.slim_toshiba.pfe_project_demo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Categorie extends AppCompatActivity {
// Begin Class
    
    public void toLogin(View view) {
        // Begin toLogin()
        
        Intent intent = new Intent(this,SignIn.class);
        startActivity(intent);
        
        // End toLogin()
    }
    
    public void toSignUp(View view) {
        // Begin toSignUp()
        
        Intent intent = new Intent(this,SignUp.class);
        startActivity(intent);
        
        // End toSignUp()
    }
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_categorie);
    }

// End Class
}
