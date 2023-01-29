package com.example.myfirstapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {


    private int cash = 312;


    private int coat = 70;
    private int coatDiscount = 123;

    private int hat = 25;
    private int hatDiscount = 34;

    private int businessSuit = 53;
    private int businessSuitDiscount = 76;

    private int shirt = 19;

    private int shoes = 41;
    private int shoesDiscount = 54;


    public boolean canMuyComputer() {
       float result;

       result = (coat * coatDiscount + hat *
               hatDiscount + businessSuit * businessSuitDiscount +
               shirt + shoes * shoesDiscount) / 100;

       result = cash - result;

       if (result < 0)
           return false;else;return true;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);





    }
}