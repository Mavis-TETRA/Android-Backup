package com.example.libaryapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MenuAdmin extends AppCompatActivity {

    Button btn_adminExit, btn_adminControlBooks,btn_adminControlBorrowAndPay,
            btn_adminControlSpAccount,btn_adminControlAccount;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_admin);

        btn_adminExit = (Button) findViewById(R.id.btn_admin_exit);
        btn_adminControlBooks = (Button) findViewById(R.id.btn_admin_controlBooks);
        btn_adminControlBorrowAndPay = (Button) findViewById(R.id.btn_admin_controlBorrowAndPay);
        btn_adminControlSpAccount = (Button) findViewById(R.id.btn_admin_controlSpAccount);
        btn_adminControlAccount = (Button) findViewById(R.id.btn_admin_controlAccount);

        btn_adminExit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentExit = new Intent(MenuAdmin.this, Login.class);
                startActivity(intentExit);
                finish();
            }
        });

        btn_adminControlBooks.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentControlBooks = new Intent(MenuAdmin.this, ControlBooks.class);
                startActivity(intentControlBooks);

            }
        });
    }
}