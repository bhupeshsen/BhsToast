package com.bhs.searchdropdown;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.bhs.bhstoast.BhsToast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        BhsToast.showBhsToast(this,"Hello world");
    }
}