package com.crumbsproject.crumbsseller.view;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.crumbsproject.crumbsseller.R;

public class RegisSeller extends AppCompatActivity {

    private Button button_regis_seller;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_regis_seller);

        button_regis_seller=findViewById(R.id.btn_regis_seller);

        button_regis_seller.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(RegisSeller.this,LoginSeller.class);
                startActivity(intent);
                finish();
            }
        });
    }
}