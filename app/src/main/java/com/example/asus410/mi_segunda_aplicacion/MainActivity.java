package com.example.asus410.mi_segunda_aplicacion;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    int cod;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Button btninteres = (Button)findViewById(R.id.btnIntereses);
        cod = 0;
    }

    @Override
    protected void onActivityResult(int request, int result, Intent i) {
        if(request == 10 && result == RESULT_OK) cod =1;
    }

    public void clickIntereses(View view){

        if(cod == 0){
            Toast t = Toast.makeText(getApplicationContext(),"Debe registrarse primero",
                    Toast.LENGTH_LONG);
            t.show();
        }else {
            Intent i = new Intent(this,Intereses.class);
            startActivity(i);
        }

    }

    public void clickNoticias(View v){
        if(cod == 0){
            Toast t = Toast.makeText(getApplicationContext(),"Debe registrarse primero",
                    Toast.LENGTH_LONG);
            t.show();
        }else {
            Intent i = new Intent(this, Noticias.class);
            startActivity(i);
        }
    }

    public void clickHistoria(View v){
        if(cod == 0){
            Toast t = Toast.makeText(getApplicationContext(),"Debe registrarse primero",
                    Toast.LENGTH_LONG);
            t.show();
        }else {
            Intent i = new Intent(this, Historia.class);
            startActivity(i);
        }
    }
    public void  clickRegistro(View v){
        Intent i = new Intent(this,Registro.class);
        startActivityForResult(i,10);
    }


}
