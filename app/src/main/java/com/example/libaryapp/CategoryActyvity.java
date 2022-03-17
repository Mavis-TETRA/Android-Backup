package com.example.libaryapp;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;

public class CategoryActyvity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category_actyvity);
        Toolbar toolbar = (Toolbar) findViewById(R.id.category_toolbar);
        setSupportActionBar(toolbar);



    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle item selection
        switch (item.getItemId()) {
            case R.id.categorymenu_add:
                showDialog();
                return true;
            case R.id.categorymenu_return:
                Intent intent_return = new Intent(CategoryActyvity.this, ControlBooks.class);
                startActivity(intent_return);
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }

    private void showDialog() {
        //        Khai báo tạo builder
        AlertDialog.Builder builder =new AlertDialog.Builder(this);

//      Khai báo layout sẽ đưa vào nơi chỉ định
        LayoutInflater inflater = getLayoutInflater();
        View view = inflater.inflate(R.layout.dialog_category, null);

//      Khai báo nghiệm mặt định của khung edittext dialog
        final EditText dialogName = view.findViewById(R.id.categorylog_name);

        //Show dialog trắng
        builder.setView(view);
        builder.setTitle("Add/repair information phone").setPositiveButton("Save", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {

            }
        }).setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {

            }
        });
        builder.show();
    }
}