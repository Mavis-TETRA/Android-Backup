package com.example.libaryapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ControlBooks extends AppCompatActivity {
    Button category, author, column, books, comment;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_control_books);

        //Khai báo biến
        category = (Button) findViewById(R.id.book_category);
        author = (Button) findViewById(R.id.book_author);
        column = (Button) findViewById(R.id.book_column);
        books = (Button) findViewById(R.id.book_setBook);
        comment = (Button) findViewById(R.id.book_coment);
        //==========================

        //Xử lí Chuyển trang

        category.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentcategory = new Intent(ControlBooks.this, CategoryActyvity.class);
                startActivity(intentcategory);
            }
        });

    }
}