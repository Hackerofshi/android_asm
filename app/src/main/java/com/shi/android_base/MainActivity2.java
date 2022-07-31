package com.shi.android_base;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.shixin.apt_annotation.AptAnnotation;

@AptAnnotation(desc = "我是Main上注解")
public class MainActivity2 extends AppCompatActivity {

    @AptAnnotation(desc = "我是 OnCreate注解")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        HelloWorld helloWorld = new HelloWorld();
    }
}