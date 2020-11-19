package com.crumbsproject.crumbsseller.view;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.crumbsproject.crumbsseller.R;

public class LoginSeller extends AppCompatActivity {

    private Button button_login_seller;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_seller);

        button_login_seller=findViewById(R.id.btn_login_seller);
        button_login_seller.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LoginSeller.this,BottomNavigationSeller.class);
                startActivity(intent);
                finish();
            }
        });
    }
}