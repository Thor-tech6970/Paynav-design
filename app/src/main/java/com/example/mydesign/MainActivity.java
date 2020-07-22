package com.example.mydesign;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewpager.widget.ViewPager;
import androidx.viewpager2.widget.ViewPager2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

ImageView qrImageView , notificationImageView , homeImageView , duesImageView , plusImageView , requestImageView , profileImageView;

public void viewAll(View view){

Intent intent = new Intent(MainActivity.this , viewAllActivity.class);

startActivity(intent);


}


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ViewPager viewPager = (ViewPager) findViewById(R.id.viewPage);

        ImageAdapter adapterView = new ImageAdapter(this);

        viewPager.setAdapter(adapterView);

        qrImageView = (ImageView) findViewById(R.id.qrImageView);
        notificationImageView = (ImageView) findViewById(R.id.notificationImageView);
        homeImageView = (ImageView) findViewById(R.id.homeImageView);
        duesImageView = (ImageView) findViewById(R.id.duesImageView);
        plusImageView = (ImageView) findViewById(R.id.plusImageView);
        requestImageView = (ImageView) findViewById(R.id.requestImageView);
        profileImageView = (ImageView) findViewById(R.id.profileImageView);



        plusImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this , PlusActivity.class);

                startActivity(intent);
            }
        });

        requestImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                 Intent intent = new Intent(MainActivity.this , RequestActivity.class);

                 startActivity(intent);
            }
        });

        profileImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(MainActivity.this , ProfileActivity.class);

                startActivity(intent);
            }
        });

        duesImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, DuesActivity.class);

                startActivity(intent);
            }
        });


        homeImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, HomeActivity.class);

                startActivity(intent);
            }
        });

        qrImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(MainActivity.this , QRActivity.class);

                startActivity(intent);



            }
        });



        notificationImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent= new Intent(MainActivity.this, NotificationActivity.class);

                startActivity(intent);


            }
        });

        ConstraintLayout constraintLayout = findViewById(R.id.layout1);

        constraintLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(MainActivity.this , NikamActivity.class);

                startActivity(intent);

            }
        });


        ConstraintLayout constraintLayout2 = findViewById(R.id.layout2);

        constraintLayout2.setOnClickListener(new View.OnClickListener() {

            @Override

            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this , HeartyActivity.class);

                startActivity(intent);
            }
        });

        ConstraintLayout constraintLayout3 = findViewById(R.id.layout3);
        constraintLayout3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this , TransactionActivity.class);
                startActivity(intent);
            }
        });

        ConstraintLayout constraintLayout4 = findViewById(R.id.layout4);
        constraintLayout4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this , ResponsibilityActivity.class);
                startActivity(intent);
            }
        });
    }
}