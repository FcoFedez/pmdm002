package com.example.asus410.mi_segunda_aplicacion;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Acercade extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_acercade);
    }

    public void clic(View v){
        finish();
    }
}
