package com.example.biodata;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    Button btn;
    EditText edt_name,edt_dob,edit_father,edt_address,edt_email,edt_contact,edt_nation,edt_religion,edt_language,edt_hobbies,edt_status,edt_sex;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn = findViewById(R.id.btn);
        edt_name = findViewById(R.id.edt_name);
        edt_dob = findViewById(R.id.edt_dob);
        edit_father = findViewById(R.id.edt_father);
        edt_address = findViewById(R.id.edt_address);
        edt_email = findViewById(R.id.edt_email);
        edt_contact = findViewById(R.id.edt_contact);
        edt_nation = findViewById(R.id.edt_nation);
        edt_religion = findViewById(R.id.edt_religion);
        edt_language = findViewById(R.id.edt_language);
        edt_hobbies = findViewById(R.id.edt_hobbies);
        edt_status = findViewById(R.id.edt_status);
        edt_sex = findViewById(R.id.edt_sex);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String Name = edt_name.getText().toString();
                String dob = edt_dob.getText().toString();
                String Father = edit_father.getText().toString();
                String Address = edt_address.getText().toString();
                String Email = edt_email.getText().toString();
                String Contact = edt_contact.getText().toString();
                String Nation = edt_nation.getText().toString();
                String Religion = edt_religion.getText().toString();
                String Language = edt_language.getText().toString();
                String Hobbies = edt_hobbies.getText().toString();
                String Status = edt_status.getText().toString();
                String Sex = edt_sex.getText().toString();

                Intent intent = new Intent(MainActivity.this,SecondaryActivity.class);
                intent.putExtra("name",Name);
                intent.putExtra("dob",dob);
                intent.putExtra("father",Father);
                intent.putExtra("address",Address);
                intent.putExtra("email",Email);
                intent.putExtra("contact",Contact);
                intent.putExtra("nation",Nation);
                intent.putExtra("religion",Religion);
                intent.putExtra("language",Language);
                intent.putExtra("hobbies",Hobbies);
                intent.putExtra("status",Status);
                intent.putExtra("sex",Sex);
                startActivity(intent);
            }
        });
    }
}