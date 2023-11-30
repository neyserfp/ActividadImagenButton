package com.neyser.actividadimagenbutton;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private ImageView img01, img02;
    private TextView t01;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void jugar(View view){

        img01 = findViewById(R.id.img01);
        img02 = findViewById(R.id.img02);
        t01 = findViewById(R.id.t01);

        Integer num1 = 1 + new Random().nextInt(6);
        Integer num2 = 1 + new Random().nextInt(6);
        String resultado = "";

        System.out.println("Valor 1: "+num1);
        System.out.println("Valor 2: "+num2);

        asignarImagen(img01, num1);
        asignarImagen(img02, num2);

        if (num1 == num2){
            resultado = "los dados son iguales";
        }

        t01.setText(resultado);

    }

    public void asignarImagen(ImageView img, Integer valor){

        switch (valor){
            case 1:
                img.setImageResource(R.drawable.d1);
                break;
            case 2:
                img.setImageResource(R.drawable.d2);
                break;
            case 3:
                img.setImageResource(R.drawable.d3);
                break;
            case 4:
                img.setImageResource(R.drawable.d4);
                break;
            case 5:
                img.setImageResource(R.drawable.d5);
                break;
            case 6:
                img.setImageResource(R.drawable.d6);
                break;
            default:
                Toast.makeText(this, "Valor inválido", Toast.LENGTH_SHORT).show();
        }
    }

}