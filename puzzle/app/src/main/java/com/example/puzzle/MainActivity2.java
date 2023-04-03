package com.example.puzzle;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import java.util.Random;

public class MainActivity2 extends AppCompatActivity {
    int sayilar[]={90,180,270};
    Random random=new Random();
    int index= random.nextInt(sayilar.length);
    int randomNum=sayilar[index];
    ImageButton foto1,foto2,foto3,foto4,foto5,foto6;
    Button rstr;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Button basla=findViewById(R.id.basla);
        basla.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                foto1.animate().rotation(180).start();
                foto2.animate().rotation(90).start();
                foto3.animate().rotation(270).start();
                foto4.animate().rotation(90).start();
                foto5.animate().rotation(180).start();
                foto6.animate().rotation(180).start();
                basla.setVisibility(View.INVISIBLE);
            }
        });
       Button next=findViewById(R.id.next);
       next.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               Intent intent = new Intent(MainActivity2.this,MainActivity3.class);
               startActivity(intent);
           }
       });
        rstr=findViewById(R.id.restart);
        rstr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                foto1.animate().rotation(270).start();
                foto2.animate().rotation(90).start();
                foto3.animate().rotation(180).start();
                foto4.animate().rotation(270).start();
                foto5.animate().rotation(180).start();
                foto6.animate().rotation(90).start();
                rstr.setVisibility(View.INVISIBLE);
                next.setVisibility(View.INVISIBLE);
            }
        });
        foto1=findViewById(R.id.foto1);
        foto1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (foto1.getRotation()>360.0 || foto1.getRotation()<90|| foto2.getRotation()>360.0 || foto2.getRotation()<90 || foto3.getRotation()>360.0 || foto3.getRotation()<90|| foto4.getRotation()>360.0 || foto4.getRotation()<90 || foto5.getRotation()>360.0 || foto5.getRotation()<90 || foto6.getRotation()>360.0 || foto6.getRotation()<90){
                    foto1.animate().rotation(270).start();
                    foto2.animate().rotation(90).start();
                    foto3.animate().rotation(180).start();
                    foto4.animate().rotation(270).start();
                    foto5.animate().rotation(180).start();
                    foto6.animate().rotation(90).start();
                }
                else if (foto1.getRotation()==90.0 || foto2.getRotation()==90.0 || foto3.getRotation()==90.0 || foto4.getRotation()==90.0 || foto5.getRotation()==90.0 || foto6.getRotation()==90.0){
                    foto1.animate().rotation(foto1.getRotation()+90).start();
                }
                else if(foto1.getRotation()==180.0 || foto2.getRotation()==180.0 || foto3.getRotation()==180.0 || foto4.getRotation()==180.0 || foto5.getRotation()==180.0 || foto6.getRotation()==180.0){
                    foto1.animate().rotation(foto1.getRotation()+90).start();
                }
                else if(foto1.getRotation()==270.0 || foto2.getRotation()==270.0 || foto3.getRotation()==270.0 || foto4.getRotation()==270.0 || foto5.getRotation()==270.0 || foto6.getRotation()==270.0){
                    foto1.animate().rotation(foto1.getRotation()+90).start();
                }
                else{
                    next.setVisibility(View.VISIBLE);
                    rstr.setVisibility(View.VISIBLE);
                    foto1.animate().rotation(foto1.getRotation()+0).start();
                }

            }
        });
        foto2=findViewById(R.id.foto2);
        foto2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (foto1.getRotation()>360.0 || foto1.getRotation()<90|| foto2.getRotation()>360.0 || foto2.getRotation()<90 || foto3.getRotation()>360.0 || foto3.getRotation()<90|| foto4.getRotation()>360.0 || foto4.getRotation()<90 || foto5.getRotation()>360.0 || foto5.getRotation()<90 || foto6.getRotation()>360.0 || foto6.getRotation()<90){
                    foto1.animate().rotation(270).start();
                    foto2.animate().rotation(90).start();
                    foto3.animate().rotation(180).start();
                    foto4.animate().rotation(270).start();
                    foto5.animate().rotation(180).start();
                    foto6.animate().rotation(90).start();
                }
                else if (foto1.getRotation()==90.0 || foto2.getRotation()==90.0 || foto3.getRotation()==90.0 || foto4.getRotation()==90.0 || foto5.getRotation()==90.0 || foto6.getRotation()==90.0){
                    foto2.animate().rotation(foto2.getRotation()+90).start();
                }
                else if(foto1.getRotation()==180.0 || foto2.getRotation()==180.0 || foto3.getRotation()==180.0 || foto4.getRotation()==180.0 || foto5.getRotation()==180.0 || foto6.getRotation()==180.0){
                    foto2.animate().rotation(foto2.getRotation()+90).start();
                }
                else if(foto1.getRotation()==270.0 || foto2.getRotation()==270.0 || foto3.getRotation()==270.0 || foto4.getRotation()==270.0 || foto5.getRotation()==270.0 || foto6.getRotation()==270.0){
                    foto2.animate().rotation(foto2.getRotation()+90).start();
                }
                else{
                    next.setVisibility(View.VISIBLE);
                    rstr.setVisibility(View.VISIBLE);
                    foto2.animate().rotation(foto2.getRotation()+0).start();
                }
            }
        });
        foto3=findViewById(R.id.foto3);
        foto3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (foto1.getRotation()>360.0 || foto1.getRotation()<90|| foto2.getRotation()>360.0 || foto2.getRotation()<90 || foto3.getRotation()>360.0 || foto3.getRotation()<90|| foto4.getRotation()>360.0 || foto4.getRotation()<90 || foto5.getRotation()>360.0 || foto5.getRotation()<90 || foto6.getRotation()>360.0 || foto6.getRotation()<90){
                    foto1.animate().rotation(270).start();
                    foto2.animate().rotation(90).start();
                    foto3.animate().rotation(180).start();
                    foto4.animate().rotation(270).start();
                    foto5.animate().rotation(180).start();
                    foto6.animate().rotation(90).start();
                }
                else if (foto1.getRotation()==90.0 || foto2.getRotation()==90.0 || foto3.getRotation()==90.0 || foto4.getRotation()==90.0 || foto5.getRotation()==90.0 || foto6.getRotation()==90.0){
                    foto3.animate().rotation(foto3.getRotation()+90).start();
                }
                else if(foto1.getRotation()==180.0 || foto2.getRotation()==180.0 || foto3.getRotation()==180.0 || foto4.getRotation()==180.0 || foto5.getRotation()==180.0 || foto6.getRotation()==180.0){
                    foto3.animate().rotation(foto3.getRotation()+90).start();
                }
                else if(foto1.getRotation()==270.0 || foto2.getRotation()==270.0 || foto3.getRotation()==270.0 || foto4.getRotation()==270.0 || foto5.getRotation()==270.0 || foto6.getRotation()==270.0){
                    foto3.animate().rotation(foto3.getRotation()+90).start();
                }
                else{
                    next.setVisibility(View.VISIBLE);
                    rstr.setVisibility(View.VISIBLE);
                    foto3.animate().rotation(foto3.getRotation()+0).start();
                }
            }
        });
        foto4=findViewById(R.id.foto4);
        foto4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (foto1.getRotation()>360.0 || foto1.getRotation()<90|| foto2.getRotation()>360.0 || foto2.getRotation()<90 || foto3.getRotation()>360.0 || foto3.getRotation()<90|| foto4.getRotation()>360.0 || foto4.getRotation()<90 || foto5.getRotation()>360.0 || foto5.getRotation()<90 || foto6.getRotation()>360.0 || foto6.getRotation()<90){
                    foto1.animate().rotation(270).start();
                    foto2.animate().rotation(90).start();
                    foto3.animate().rotation(180).start();
                    foto4.animate().rotation(270).start();
                    foto5.animate().rotation(180).start();
                    foto6.animate().rotation(90).start();
                }
                else if (foto1.getRotation()==90.0 || foto2.getRotation()==90.0 || foto3.getRotation()==90.0 || foto4.getRotation()==90.0 || foto5.getRotation()==90.0 || foto6.getRotation()==90.0){
                    foto4.animate().rotation(foto4.getRotation()+90).start();
                }
                else if(foto1.getRotation()==180.0 || foto2.getRotation()==180.0 || foto3.getRotation()==180.0 || foto4.getRotation()==180.0 || foto5.getRotation()==180.0 || foto6.getRotation()==180.0){
                    foto4.animate().rotation(foto4.getRotation()+90).start();
                }
                else if(foto1.getRotation()==270.0 || foto2.getRotation()==270.0 || foto3.getRotation()==270.0 || foto4.getRotation()==270.0 || foto5.getRotation()==270.0 || foto6.getRotation()==270.0){
                    foto4.animate().rotation(foto4.getRotation()+90).start();
                }
                else{
                    next.setVisibility(View.VISIBLE);
                    rstr.setVisibility(View.VISIBLE);
                    foto4.animate().rotation(foto4.getRotation()+0).start();
                }
            }
        });
        foto5=findViewById(R.id.foto5);
        foto5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (foto1.getRotation()>360.0 || foto1.getRotation()<90|| foto2.getRotation()>360.0 || foto2.getRotation()<90 || foto3.getRotation()>360.0 || foto3.getRotation()<90|| foto4.getRotation()>360.0 || foto4.getRotation()<90 || foto5.getRotation()>360.0 || foto5.getRotation()<90 || foto6.getRotation()>360.0 || foto6.getRotation()<90){
                    foto1.animate().rotation(270).start();
                    foto2.animate().rotation(90).start();
                    foto3.animate().rotation(180).start();
                    foto4.animate().rotation(270).start();
                    foto5.animate().rotation(180).start();
                    foto6.animate().rotation(90).start();
                }
                else if (foto1.getRotation()==90.0 || foto2.getRotation()==90.0 || foto3.getRotation()==90.0 || foto4.getRotation()==90.0 || foto5.getRotation()==90.0 || foto6.getRotation()==90.0){
                    foto5.animate().rotation(foto5.getRotation()+90).start();
                }
                else if(foto1.getRotation()==180.0 || foto2.getRotation()==180.0 || foto3.getRotation()==180.0 || foto4.getRotation()==180.0 || foto5.getRotation()==180.0 || foto6.getRotation()==180.0){
                    foto5.animate().rotation(foto5.getRotation()+90).start();
                }
                else if(foto1.getRotation()==270.0 || foto2.getRotation()==270.0 || foto3.getRotation()==270.0 || foto4.getRotation()==270.0 || foto5.getRotation()==270.0 || foto6.getRotation()==270.0){
                    foto5.animate().rotation(foto5.getRotation()+90).start();
                }
                else{
                    next.setVisibility(View.VISIBLE);
                    rstr.setVisibility(View.VISIBLE);
                    foto5.animate().rotation(foto5.getRotation()+0).start();
                }
            }
        });
        foto6=findViewById(R.id.foto6);
        foto6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (foto1.getRotation()>360.0 || foto1.getRotation()<90|| foto2.getRotation()>360.0 || foto2.getRotation()<90 || foto3.getRotation()>360.0 || foto3.getRotation()<90|| foto4.getRotation()>360.0 || foto4.getRotation()<90 || foto5.getRotation()>360.0 || foto5.getRotation()<90 || foto6.getRotation()>360.0 || foto6.getRotation()<90){
                    foto1.animate().rotation(270).start();
                    foto2.animate().rotation(90).start();
                    foto3.animate().rotation(180).start();
                    foto4.animate().rotation(270).start();
                    foto5.animate().rotation(180).start();
                    foto6.animate().rotation(90).start();
                }
                else if (foto1.getRotation()==90.0 || foto2.getRotation()==90.0 || foto3.getRotation()==90.0 || foto4.getRotation()==90.0 || foto5.getRotation()==90.0 || foto6.getRotation()==90.0){
                    foto6.animate().rotation(foto6.getRotation()+90).start();
                }
                else if(foto1.getRotation()==180.0 || foto2.getRotation()==180.0 || foto3.getRotation()==180.0 || foto4.getRotation()==180.0 || foto5.getRotation()==180.0 || foto6.getRotation()==180.0){
                    foto6.animate().rotation(foto6.getRotation()+90).start();
                }
                else if(foto1.getRotation()==270.0 || foto2.getRotation()==270.0 || foto3.getRotation()==270.0 || foto4.getRotation()==270.0 || foto5.getRotation()==270.0 || foto6.getRotation()==270.0){
                    foto6.animate().rotation(foto6.getRotation()+90).start();
                }
                else{
                    rstr.setVisibility(View.VISIBLE);
                    next.setVisibility(View.VISIBLE);
                    foto6.animate().rotation(foto6.getRotation()+0).start();
                }
            }
        });
        next.setVisibility(View.INVISIBLE);
        rstr.setVisibility(View.INVISIBLE);
        foto1.animate().rotation(360).start();
        foto2.animate().rotation(360).start();
        foto3.animate().rotation(360).start();
        foto4.animate().rotation(360).start();
        foto5.animate().rotation(360).start();
        foto6.animate().rotation(360).start();
    }

}