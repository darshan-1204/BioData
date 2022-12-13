package com.example.biodata;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class SecondaryActivity extends AppCompatActivity {

    TextView name,Dob,father,address,status,hobbies,language,religion,nation,email,contact,sex;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secondary);

        name = findViewById(R.id.name);
        Dob = findViewById(R.id.dob);
        father = findViewById(R.id.father);
        address = findViewById(R.id.address);
        status = findViewById(R.id.status);
        hobbies = findViewById(R.id.hobbies);
        language = findViewById(R.id.language);
        religion = findViewById(R.id.religion);
        nation = findViewById(R.id.nation);
        email = findViewById(R.id.email);
        contact = findViewById(R.id.contact);
        sex = findViewById(R.id.sex);


        String Name = getIntent().getStringExtra("name");
        String dob = getIntent().getStringExtra("dob");
        String Father = getIntent().getStringExtra("father");
        String Sex = getIntent().getStringExtra("sex");
        String Address = getIntent().getStringExtra("address");
        String Contact = getIntent().getStringExtra("contact");
        String Nation = getIntent().getStringExtra("nation");
        String Religion = getIntent().getStringExtra("religion");
        String Status = getIntent().getStringExtra("status");
        String Language = getIntent().getStringExtra("language");
        String Hobbies = getIntent().getStringExtra("hobbies");
        String Email = getIntent().getStringExtra("email");

        name.setText(""+Name);
        Dob.setText(""+dob);
        father.setText(""+Father);
        sex.setText(""+Sex);
        address.setText(""+Address);
        contact.setText(""+Contact);
        nation.setText(""+Nation);
        email.setText(""+Email);
        religion.setText(""+Religion);
        status.setText(""+Status);
        language.setText(""+Language);
        hobbies.setText(""+Hobbies);
    }
}