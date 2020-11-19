package com.crumbsproject.crumbsseller.view;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.crumbsproject.crumbsseller.R;

public class SellerAddItem extends AppCompatActivity {

    private Button button_add_my_item;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seller_add_item);

        button_add_my_item=findViewById(R.id.btn_add_item);

        button_add_my_item.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SellerAddItem.this,BottomNavigationSeller.class);
                startActivity(intent);
                finish();
            }
        });


    }
}