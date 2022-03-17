package com.example.libaryapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.widget.TextView;
import android.widget.Toast;
import java.util.ArrayList;

import com.example.libaryapp.entity.IpConfig;
import com.vishnusivadas.advanced_httpurlconnection.PutData;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class Account extends AppCompatActivity {
    public TextView account, code, birth, myClass, phone, majors,address;
    private String mssv, password, name_stu;
    public final String[] students = {"mssv", "name_student", "class", "birth","phone", "majors", "address"};
    String value;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_account);

        //Nhận dữ liệu
        Intent intent = getIntent();
        Bundle bundle = intent.getExtras();
        if (bundle != null) {
            mssv = bundle.getString("mssv", "");
            password = bundle.getString("password", "");

        }
        //Get id

        account = (TextView) findViewById(R.id.stu_nameAccount);
        code = findViewById(R.id.stu_code);
        birth = findViewById(R.id.stu_birth);
        myClass = findViewById(R.id.stu_class);
        majors = findViewById(R.id.stu_majors);
        address = findViewById(R.id.stu_address);
        phone = findViewById(R.id.stu_phone);

            Handler handler = new Handler(Looper.getMainLooper());
            handler.post(new Runnable() {
                @Override
                public void run() {
                    String[] field = new String[3];
                    field[0] = "mssv";
                    field[1] = "password";
                    field[2] = "table";

                    String[] data = new String[3];
                    data[0] = mssv;
                    data[1] = password;
                    data[2] = "student";
                    PutData putData = new PutData("http://"+ IpConfig.IPCONFIG +"/CDVienDongLibary/InOutDB/outputdata.php", "POST", field, data);
                    if (putData.startPut()) {
                        if (putData.onComplete()) {
                            String result = putData.getResult();
                            account.setText(String.valueOf(result));


                                //code.setText(String.valueOf());
//                                code.setText(jsonArray.getString(Integer.parseInt("mssv")));
//                                birth.setText(jsonArray.getString("birth"));
//                                myClass.setText(object.getString("class"));
//                                phone.setText(object.getString("phone"));
//                                majors.setText(object.getString("majors"));
//                                address.setText(object.getString("address"));


                        }
                    }
                }
            });
    }
}