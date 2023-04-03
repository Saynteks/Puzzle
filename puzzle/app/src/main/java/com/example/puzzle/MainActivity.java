package com.example.puzzle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    int sayilar[]={90,180,270};
    Random random=new Random();
    int index= random.nextInt(sayilar.length);
    int randomNum=sayilar[index];
    public int deger=0;
    ImageButton kali1,kali2,kali3,kali4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button start=findViewById(R.id.button5);
        start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                kali1.animate().rotation(180).start();
                kali2.animate().rotation(270).start();
                kali3.animate().rotation(90).start();
                kali4.animate().rotation(180).start();

                start.setVisibility(View.INVISIBLE);
            }
        });
        Button nextLevel=findViewById(R.id.button2);
        nextLevel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,MainActivity2.class);
                startActivity(intent);
            }
        });
        Button restart=findViewById(R.id.button);
        restart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                kali1.animate().rotation(180).start();
                kali2.animate().rotation(270).start();
                kali3.animate().rotation(180).start();
                kali4.animate().rotation(90).start();
                restart.setVisibility(View.INVISIBLE);
                nextLevel.setVisibility(View.INVISIBLE);
            }
        });
        kali1=(ImageButton)findViewById(R.id.imageButton5);
        kali1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (kali1.getRotation()>360.0 || kali1.getRotation()<90|| kali2.getRotation()>360.0 || kali2.getRotation()<90 || kali3.getRotation()>360.0 || kali3.getRotation()<90|| kali4.getRotation()>360.0 || kali4.getRotation()<90){
                    kali1.animate().rotation(270).start();
                    kali2.animate().rotation(90).start();
                    kali3.animate().rotation(180).start();
                    kali4.animate().rotation(90).start();
                }
                else if (kali1.getRotation()==90.0 || kali2.getRotation()==90.0 || kali3.getRotation()==90.0 || kali4.getRotation()==90.0){
                    kali1.animate().rotation(kali1.getRotation()+90).start();
                }
                else if(kali1.getRotation()==180.0 || kali2.getRotation()==180.0 || kali3.getRotation()==180.0 || kali4.getRotation()==180.0){
                    kali1.animate().rotation(kali1.getRotation()+90).start();
                }
                else if(kali1.getRotation()==270.0 || kali2.getRotation()==270.0 || kali3.getRotation()==270.0 || kali4.getRotation()==270.0){
                    kali1.animate().rotation(kali1.getRotation()+90).start();
                }
                else{
                    restart.setVisibility(View.VISIBLE);
                    nextLevel.setVisibility(View.VISIBLE);
                    kali1.animate().rotation(kali1.getRotation()+0).start();
                }


            }
        });
        kali2=(ImageButton)findViewById(R.id.imageButton6);
        kali2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (kali1.getRotation()>360.0 || kali1.getRotation()<90|| kali2.getRotation()>360.0 || kali2.getRotation()<90 || kali3.getRotation()>360.0 || kali3.getRotation()<90|| kali4.getRotation()>360.0 || kali4.getRotation()<90){
                    kali1.animate().rotation(270).start();
                    kali2.animate().rotation(90).start();
                    kali3.animate().rotation(180).start();
                    kali4.animate().rotation(90).start();
                }
               else if (kali1.getRotation()==90.0 || kali2.getRotation()==90.0 || kali3.getRotation()==90.0 || kali4.getRotation()==90.0){
                    kali2.animate().rotation(kali2.getRotation()+90).start();
                }
                else if(kali1.getRotation()==180.0 || kali2.getRotation()==180.0 || kali3.getRotation()==180.0 || kali4.getRotation()==180.0){
                    kali2.animate().rotation(kali2.getRotation()+90).start();
                }
                else if(kali1.getRotation()==270.0 || kali2.getRotation()==270.0 || kali3.getRotation()==270.0 || kali4.getRotation()==270.0){
                    kali2.animate().rotation(kali2.getRotation()+90).start();
                }
                else{
                    restart.setVisibility(View.VISIBLE);
                    nextLevel.setVisibility(View.VISIBLE);
                    kali2.animate().rotation(kali2.getRotation()+0).start();
                }
            }
        });
        kali3=(ImageButton)findViewById(R.id.imageButton7);
        kali3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (kali1.getRotation()>360.0 || kali1.getRotation()<90|| kali2.getRotation()>360.0 || kali2.getRotation()<90 || kali3.getRotation()>360.0 || kali3.getRotation()<90|| kali4.getRotation()>360.0 || kali4.getRotation()<90){
                    kali1.animate().rotation(270).start();
                    kali2.animate().rotation(90).start();
                    kali3.animate().rotation(180).start();
                    kali4.animate().rotation(90).start();
                }
               else if (kali1.getRotation()==90.0 || kali2.getRotation()==90.0 || kali3.getRotation()==90.0 || kali4.getRotation()==90.0){
                    kali3.animate().rotation(kali3.getRotation()+90).start();
                }
                else if(kali1.getRotation()==180.0 || kali2.getRotation()==180.0 || kali3.getRotation()==180.0 || kali4.getRotation()==180.0){
                    kali3.animate().rotation(kali3.getRotation()+90).start();
                }
                else if(kali1.getRotation()==270.0 || kali2.getRotation()==270.0 || kali3.getRotation()==270.0 || kali4.getRotation()==270.0){
                    kali3.animate().rotation(kali3.getRotation()+90).start();
                }
                else{
                    restart.setVisibility(View.VISIBLE);
                    nextLevel.setVisibility(View.VISIBLE);
                    kali3.animate().rotation(kali3.getRotation()+0).start();

                }


            }
        });
        kali4=(ImageButton)findViewById(R.id.imageButton8);
        kali4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (kali1.getRotation()>360.0 || kali1.getRotation()<90|| kali2.getRotation()>360.0 || kali2.getRotation()<90 || kali3.getRotation()>360.0 || kali3.getRotation()<90|| kali4.getRotation()>360.0 || kali4.getRotation()<90){
                    kali1.animate().rotation(270).start();
                    kali2.animate().rotation(90).start();
                    kali3.animate().rotation(180).start();
                    kali4.animate().rotation(90).start();
                }
                else if (kali1.getRotation()==90.0 || kali2.getRotation()==90.0 || kali3.getRotation()==90.0 || kali4.getRotation()==90.0){
                    kali4.animate().rotation(kali4.getRotation()+90).start();
                }
                else if(kali1.getRotation()==180.0 || kali2.getRotation()==180.0 || kali3.getRotation()==180.0 || kali4.getRotation()==180.0){
                    kali4.animate().rotation(kali4.getRotation()+90).start();
                }
                else if(kali1.getRotation()==270.0 || kali2.getRotation()==270.0 || kali3.getRotation()==270.0 || kali4.getRotation()==270.0){
                    kali4.animate().rotation(kali4.getRotation()+90).start();
                }
                else{
                    restart.setVisibility(View.VISIBLE);
                    nextLevel.setVisibility(View.VISIBLE);
                    kali4.animate().rotation(kali4.getRotation()+0).start();
                }


            }
        });
        nextLevel.setVisibility(View.INVISIBLE);
        restart.setVisibility(View.INVISIBLE);
        kali1.animate().rotation(360).start();
        kali2.animate().rotation(360).start();
        kali3.animate().rotation(360).start();
        kali4.animate().rotation(360).start();
    }

}