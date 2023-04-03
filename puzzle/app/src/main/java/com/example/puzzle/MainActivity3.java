package com.example.puzzle;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import com.example.puzzle.databinding.ActivityMain3Binding;
import com.example.puzzle.databinding.ActivityMainBinding;

public class MainActivity3 extends AppCompatActivity {
    public ActivityMain3Binding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMain3Binding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);
        binding.f1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (binding.f1.getRotation()>360.0 || binding.f1.getRotation()<90|| binding.f2.getRotation()>360.0 || binding.f2.getRotation()<90 || binding.f3.getRotation()>360.0 || binding.f3.getRotation()<90|| binding.f4.getRotation()>360.0 || binding.f4.getRotation()<90|| binding.f5.getRotation()>360.0 || binding.f5.getRotation()<90|| binding.f6.getRotation()>360.0 || binding.f6.getRotation()<90|| binding.f7.getRotation()>360.0 || binding.f7.getRotation()<90|| binding.f8.getRotation()>360.0 || binding.f8.getRotation()<90|| binding.f9.getRotation()>360.0 || binding.f9.getRotation()<90){
                    binding.f1.animate().rotation(270).start();
                    binding.f2.animate().rotation(180).start();
                    binding.f3.animate().rotation(270).start();
                    binding.f4.animate().rotation(90).start();
                    binding.f5.animate().rotation(180).start();
                    binding.f6.animate().rotation(270).start();
                    binding.f7.animate().rotation(180).start();
                    binding.f8.animate().rotation(90).start();
                    binding.f9.animate().rotation(270).start();
                }
                else if (binding.f1.getRotation()==90.0 || binding.f2.getRotation()==90.0 || binding.f3.getRotation()==90.0 || binding.f4.getRotation()==90.0|| binding.f5.getRotation()==90.0|| binding.f6.getRotation()==90.0|| binding.f7.getRotation()==90.0|| binding.f8.getRotation()==90.0|| binding.f9.getRotation()==90.0){
                    binding.f1.animate().rotation(binding.f1.getRotation()+90).start();
                }
                else if(binding.f1.getRotation()==180.0 || binding.f2.getRotation()==180.0 || binding.f3.getRotation()==180.0 || binding.f4.getRotation()==180.0|| binding.f5.getRotation()==180.0|| binding.f6.getRotation()==180.0|| binding.f7.getRotation()==180.0|| binding.f8.getRotation()==180.0|| binding.f9.getRotation()==180.0){
                    binding.f1.animate().rotation(binding.f1.getRotation()+90).start();
                }
                else if(binding.f1.getRotation()==270.0 || binding.f2.getRotation()==270.0 || binding.f3.getRotation()==270.0 || binding.f4.getRotation()==270.0|| binding.f5.getRotation()==270.0|| binding.f6.getRotation()==270.0|| binding.f7.getRotation()==270.0|| binding.f8.getRotation()==270.0|| binding.f9.getRotation()==270.0){
                    binding.f1.animate().rotation(binding.f1.getRotation()+90).start();
                }
                else{

                    binding.f1.animate().rotation(binding.f1.getRotation()+0).start();
                }
            }
        });
        binding.f2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (binding.f1.getRotation()>360.0 || binding.f1.getRotation()<90|| binding.f2.getRotation()>360.0 || binding.f2.getRotation()<90 || binding.f3.getRotation()>360.0 || binding.f3.getRotation()<90|| binding.f4.getRotation()>360.0 || binding.f4.getRotation()<90|| binding.f5.getRotation()>360.0 || binding.f5.getRotation()<90|| binding.f6.getRotation()>360.0 || binding.f6.getRotation()<90|| binding.f7.getRotation()>360.0 || binding.f7.getRotation()<90|| binding.f8.getRotation()>360.0 || binding.f8.getRotation()<90|| binding.f9.getRotation()>360.0 || binding.f9.getRotation()<90){
                    binding.f1.animate().rotation(270).start();
                    binding.f2.animate().rotation(180).start();
                    binding.f3.animate().rotation(270).start();
                    binding.f4.animate().rotation(90).start();
                    binding.f5.animate().rotation(180).start();
                    binding.f6.animate().rotation(270).start();
                    binding.f7.animate().rotation(180).start();
                    binding.f8.animate().rotation(90).start();
                    binding.f9.animate().rotation(270).start();
                }
                else if (binding.f1.getRotation()==90.0 || binding.f2.getRotation()==90.0 || binding.f3.getRotation()==90.0 || binding.f4.getRotation()==90.0|| binding.f5.getRotation()==90.0|| binding.f6.getRotation()==90.0|| binding.f7.getRotation()==90.0|| binding.f8.getRotation()==90.0|| binding.f9.getRotation()==90.0){
                    binding.f2.animate().rotation(binding.f2.getRotation()+90).start();
                }
                else if(binding.f1.getRotation()==180.0 || binding.f2.getRotation()==180.0 || binding.f3.getRotation()==180.0 || binding.f4.getRotation()==180.0|| binding.f5.getRotation()==180.0|| binding.f6.getRotation()==180.0|| binding.f7.getRotation()==180.0|| binding.f8.getRotation()==180.0|| binding.f9.getRotation()==180.0){
                    binding.f2.animate().rotation(binding.f2.getRotation()+90).start();
                }
                else if(binding.f1.getRotation()==270.0 || binding.f2.getRotation()==270.0 || binding.f3.getRotation()==270.0 || binding.f4.getRotation()==270.0|| binding.f5.getRotation()==270.0|| binding.f6.getRotation()==270.0|| binding.f7.getRotation()==270.0|| binding.f8.getRotation()==270.0|| binding.f9.getRotation()==270.0){
                    binding.f2.animate().rotation(binding.f2.getRotation()+90).start();
                }
                else{

                    binding.f2.animate().rotation(binding.f2.getRotation()+0).start();
                }
            }
        });
        binding.f3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (binding.f1.getRotation()>360.0 || binding.f1.getRotation()<90|| binding.f2.getRotation()>360.0 || binding.f2.getRotation()<90 || binding.f3.getRotation()>360.0 || binding.f3.getRotation()<90|| binding.f4.getRotation()>360.0 || binding.f4.getRotation()<90|| binding.f5.getRotation()>360.0 || binding.f5.getRotation()<90|| binding.f6.getRotation()>360.0 || binding.f6.getRotation()<90|| binding.f7.getRotation()>360.0 || binding.f7.getRotation()<90|| binding.f8.getRotation()>360.0 || binding.f8.getRotation()<90|| binding.f9.getRotation()>360.0 || binding.f9.getRotation()<90){
                    binding.f1.animate().rotation(270).start();
                    binding.f2.animate().rotation(180).start();
                    binding.f3.animate().rotation(270).start();
                    binding.f4.animate().rotation(90).start();
                    binding.f5.animate().rotation(180).start();
                    binding.f6.animate().rotation(270).start();
                    binding.f7.animate().rotation(180).start();
                    binding.f8.animate().rotation(90).start();
                    binding.f9.animate().rotation(270).start();
                }
                else if (binding.f1.getRotation()==90.0 || binding.f2.getRotation()==90.0 || binding.f3.getRotation()==90.0 || binding.f4.getRotation()==90.0|| binding.f5.getRotation()==90.0|| binding.f6.getRotation()==90.0|| binding.f7.getRotation()==90.0|| binding.f8.getRotation()==90.0|| binding.f9.getRotation()==90.0){
                    binding.f3.animate().rotation(binding.f3.getRotation()+90).start();
                }
                else if(binding.f1.getRotation()==180.0 || binding.f2.getRotation()==180.0 || binding.f3.getRotation()==180.0 || binding.f4.getRotation()==180.0|| binding.f5.getRotation()==180.0|| binding.f6.getRotation()==180.0|| binding.f7.getRotation()==180.0|| binding.f8.getRotation()==180.0|| binding.f9.getRotation()==180.0){
                    binding.f3.animate().rotation(binding.f3.getRotation()+90).start();
                }
                else if(binding.f1.getRotation()==270.0 || binding.f2.getRotation()==270.0 || binding.f3.getRotation()==270.0 || binding.f4.getRotation()==270.0|| binding.f5.getRotation()==270.0|| binding.f6.getRotation()==270.0|| binding.f7.getRotation()==270.0|| binding.f8.getRotation()==270.0|| binding.f9.getRotation()==270.0){
                    binding.f3.animate().rotation(binding.f3.getRotation()+90).start();
                }
                else{

                    binding.f3.animate().rotation(binding.f3.getRotation()+0).start();
                }
            }
        });
        binding.f4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (binding.f1.getRotation()>360.0 || binding.f1.getRotation()<90|| binding.f2.getRotation()>360.0 || binding.f2.getRotation()<90 || binding.f3.getRotation()>360.0 || binding.f3.getRotation()<90|| binding.f4.getRotation()>360.0 || binding.f4.getRotation()<90|| binding.f5.getRotation()>360.0 || binding.f5.getRotation()<90|| binding.f6.getRotation()>360.0 || binding.f6.getRotation()<90|| binding.f7.getRotation()>360.0 || binding.f7.getRotation()<90|| binding.f8.getRotation()>360.0 || binding.f8.getRotation()<90|| binding.f9.getRotation()>360.0 || binding.f9.getRotation()<90){
                    binding.f1.animate().rotation(270).start();
                    binding.f2.animate().rotation(180).start();
                    binding.f3.animate().rotation(270).start();
                    binding.f4.animate().rotation(90).start();
                    binding.f5.animate().rotation(180).start();
                    binding.f6.animate().rotation(270).start();
                    binding.f7.animate().rotation(180).start();
                    binding.f8.animate().rotation(90).start();
                    binding.f9.animate().rotation(270).start();
                }
                else if (binding.f1.getRotation()==90.0 || binding.f2.getRotation()==90.0 || binding.f3.getRotation()==90.0 || binding.f4.getRotation()==90.0|| binding.f5.getRotation()==90.0|| binding.f6.getRotation()==90.0|| binding.f7.getRotation()==90.0|| binding.f8.getRotation()==90.0|| binding.f9.getRotation()==90.0){
                    binding.f4.animate().rotation(binding.f4.getRotation()+90).start();
                }
                else if(binding.f1.getRotation()==180.0 || binding.f2.getRotation()==180.0 || binding.f3.getRotation()==180.0 || binding.f4.getRotation()==180.0|| binding.f5.getRotation()==180.0|| binding.f6.getRotation()==180.0|| binding.f7.getRotation()==180.0|| binding.f8.getRotation()==180.0|| binding.f9.getRotation()==180.0){
                    binding.f4.animate().rotation(binding.f4.getRotation()+90).start();
                }
                else if(binding.f1.getRotation()==270.0 || binding.f2.getRotation()==270.0 || binding.f3.getRotation()==270.0 || binding.f4.getRotation()==270.0|| binding.f5.getRotation()==270.0|| binding.f6.getRotation()==270.0|| binding.f7.getRotation()==270.0|| binding.f8.getRotation()==270.0|| binding.f9.getRotation()==270.0){
                    binding.f4.animate().rotation(binding.f4.getRotation()+90).start();
                }
                else{

                    binding.f4.animate().rotation(binding.f4.getRotation()+0).start();
                }
            }
        });
        binding.f5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (binding.f1.getRotation()>360.0 || binding.f1.getRotation()<90|| binding.f2.getRotation()>360.0 || binding.f2.getRotation()<90 || binding.f3.getRotation()>360.0 || binding.f3.getRotation()<90|| binding.f4.getRotation()>360.0 || binding.f4.getRotation()<90|| binding.f5.getRotation()>360.0 || binding.f5.getRotation()<90|| binding.f6.getRotation()>360.0 || binding.f6.getRotation()<90|| binding.f7.getRotation()>360.0 || binding.f7.getRotation()<90|| binding.f8.getRotation()>360.0 || binding.f8.getRotation()<90|| binding.f9.getRotation()>360.0 || binding.f9.getRotation()<90){
                    binding.f1.animate().rotation(270).start();
                    binding.f2.animate().rotation(180).start();
                    binding.f3.animate().rotation(270).start();
                    binding.f4.animate().rotation(90).start();
                    binding.f5.animate().rotation(180).start();
                    binding.f6.animate().rotation(270).start();
                    binding.f7.animate().rotation(180).start();
                    binding.f8.animate().rotation(90).start();
                    binding.f9.animate().rotation(270).start();
                }
                else if (binding.f1.getRotation()==90.0 || binding.f2.getRotation()==90.0 || binding.f3.getRotation()==90.0 || binding.f4.getRotation()==90.0|| binding.f5.getRotation()==90.0|| binding.f6.getRotation()==90.0|| binding.f7.getRotation()==90.0|| binding.f8.getRotation()==90.0|| binding.f9.getRotation()==90.0){
                    binding.f5.animate().rotation(binding.f5.getRotation()+90).start();
                }
                else if(binding.f1.getRotation()==180.0 || binding.f2.getRotation()==180.0 || binding.f3.getRotation()==180.0 || binding.f4.getRotation()==180.0|| binding.f5.getRotation()==180.0|| binding.f6.getRotation()==180.0|| binding.f7.getRotation()==180.0|| binding.f8.getRotation()==180.0|| binding.f9.getRotation()==180.0){
                    binding.f5.animate().rotation(binding.f5.getRotation()+90).start();
                }
                else if(binding.f1.getRotation()==270.0 || binding.f2.getRotation()==270.0 || binding.f3.getRotation()==270.0 || binding.f4.getRotation()==270.0|| binding.f5.getRotation()==270.0|| binding.f6.getRotation()==270.0|| binding.f7.getRotation()==270.0|| binding.f8.getRotation()==270.0|| binding.f9.getRotation()==270.0){
                    binding.f5.animate().rotation(binding.f5.getRotation()+90).start();
                }
                else{

                    binding.f5.animate().rotation(binding.f5.getRotation()+0).start();
                }
            }
        });
        binding.f6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (binding.f1.getRotation()>360.0 || binding.f1.getRotation()<90|| binding.f2.getRotation()>360.0 || binding.f2.getRotation()<90 || binding.f3.getRotation()>360.0 || binding.f3.getRotation()<90|| binding.f4.getRotation()>360.0 || binding.f4.getRotation()<90|| binding.f5.getRotation()>360.0 || binding.f5.getRotation()<90|| binding.f6.getRotation()>360.0 || binding.f6.getRotation()<90|| binding.f7.getRotation()>360.0 || binding.f7.getRotation()<90|| binding.f8.getRotation()>360.0 || binding.f8.getRotation()<90|| binding.f9.getRotation()>360.0 || binding.f9.getRotation()<90){
                    binding.f1.animate().rotation(270).start();
                    binding.f2.animate().rotation(180).start();
                    binding.f3.animate().rotation(270).start();
                    binding.f4.animate().rotation(90).start();
                    binding.f5.animate().rotation(180).start();
                    binding.f6.animate().rotation(270).start();
                    binding.f7.animate().rotation(180).start();
                    binding.f8.animate().rotation(90).start();
                    binding.f9.animate().rotation(270).start();
                }
                else if (binding.f1.getRotation()==90.0 || binding.f2.getRotation()==90.0 || binding.f3.getRotation()==90.0 || binding.f4.getRotation()==90.0|| binding.f5.getRotation()==90.0|| binding.f6.getRotation()==90.0|| binding.f7.getRotation()==90.0|| binding.f8.getRotation()==90.0|| binding.f9.getRotation()==90.0){
                    binding.f6.animate().rotation(binding.f6.getRotation()+90).start();
                }
                else if(binding.f1.getRotation()==180.0 || binding.f2.getRotation()==180.0 || binding.f3.getRotation()==180.0 || binding.f4.getRotation()==180.0|| binding.f5.getRotation()==180.0|| binding.f6.getRotation()==180.0|| binding.f7.getRotation()==180.0|| binding.f8.getRotation()==180.0|| binding.f9.getRotation()==180.0){
                    binding.f6.animate().rotation(binding.f6.getRotation()+90).start();
                }
                else if(binding.f1.getRotation()==270.0 || binding.f2.getRotation()==270.0 || binding.f3.getRotation()==270.0 || binding.f4.getRotation()==270.0|| binding.f5.getRotation()==270.0|| binding.f6.getRotation()==270.0|| binding.f7.getRotation()==270.0|| binding.f8.getRotation()==270.0|| binding.f9.getRotation()==270.0){
                    binding.f6.animate().rotation(binding.f6.getRotation()+90).start();
                }
                else{

                    binding.f6.animate().rotation(binding.f6.getRotation()+0).start();
                }
            }
        });
        binding.f7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (binding.f1.getRotation()>360.0 || binding.f1.getRotation()<90|| binding.f2.getRotation()>360.0 || binding.f2.getRotation()<90 || binding.f3.getRotation()>360.0 || binding.f3.getRotation()<90|| binding.f4.getRotation()>360.0 || binding.f4.getRotation()<90|| binding.f5.getRotation()>360.0 || binding.f5.getRotation()<90|| binding.f6.getRotation()>360.0 || binding.f6.getRotation()<90|| binding.f7.getRotation()>360.0 || binding.f7.getRotation()<90|| binding.f8.getRotation()>360.0 || binding.f8.getRotation()<90|| binding.f9.getRotation()>360.0 || binding.f9.getRotation()<90){
                    binding.f1.animate().rotation(270).start();
                    binding.f2.animate().rotation(180).start();
                    binding.f3.animate().rotation(270).start();
                    binding.f4.animate().rotation(90).start();
                    binding.f5.animate().rotation(180).start();
                    binding.f6.animate().rotation(270).start();
                    binding.f7.animate().rotation(180).start();
                    binding.f8.animate().rotation(90).start();
                    binding.f9.animate().rotation(270).start();
                }
                else if (binding.f1.getRotation()==90.0 || binding.f2.getRotation()==90.0 || binding.f3.getRotation()==90.0 || binding.f4.getRotation()==90.0|| binding.f5.getRotation()==90.0|| binding.f6.getRotation()==90.0|| binding.f7.getRotation()==90.0|| binding.f8.getRotation()==90.0|| binding.f9.getRotation()==90.0){
                    binding.f7.animate().rotation(binding.f7.getRotation()+90).start();
                }
                else if(binding.f1.getRotation()==180.0 || binding.f2.getRotation()==180.0 || binding.f3.getRotation()==180.0 || binding.f4.getRotation()==180.0|| binding.f5.getRotation()==180.0|| binding.f6.getRotation()==180.0|| binding.f7.getRotation()==180.0|| binding.f8.getRotation()==180.0|| binding.f9.getRotation()==180.0){
                    binding.f7.animate().rotation(binding.f7.getRotation()+90).start();
                }
                else if(binding.f1.getRotation()==270.0 || binding.f2.getRotation()==270.0 || binding.f3.getRotation()==270.0 || binding.f4.getRotation()==270.0|| binding.f5.getRotation()==270.0|| binding.f6.getRotation()==270.0|| binding.f7.getRotation()==270.0|| binding.f8.getRotation()==270.0|| binding.f9.getRotation()==270.0){
                    binding.f7.animate().rotation(binding.f7.getRotation()+90).start();
                }
                else{

                    binding.f7.animate().rotation(binding.f7.getRotation()+0).start();
                }
            }
        });
        binding.f8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (binding.f1.getRotation()>360.0 || binding.f1.getRotation()<90|| binding.f2.getRotation()>360.0 || binding.f2.getRotation()<90 || binding.f3.getRotation()>360.0 || binding.f3.getRotation()<90|| binding.f4.getRotation()>360.0 || binding.f4.getRotation()<90|| binding.f5.getRotation()>360.0 || binding.f5.getRotation()<90|| binding.f6.getRotation()>360.0 || binding.f6.getRotation()<90|| binding.f7.getRotation()>360.0 || binding.f7.getRotation()<90|| binding.f8.getRotation()>360.0 || binding.f8.getRotation()<90|| binding.f9.getRotation()>360.0 || binding.f9.getRotation()<90){
                    binding.f1.animate().rotation(270).start();
                    binding.f2.animate().rotation(180).start();
                    binding.f3.animate().rotation(270).start();
                    binding.f4.animate().rotation(90).start();
                    binding.f5.animate().rotation(180).start();
                    binding.f6.animate().rotation(270).start();
                    binding.f7.animate().rotation(180).start();
                    binding.f8.animate().rotation(90).start();
                    binding.f9.animate().rotation(270).start();
                }
                else if (binding.f1.getRotation()==90.0 || binding.f2.getRotation()==90.0 || binding.f3.getRotation()==90.0 || binding.f4.getRotation()==90.0|| binding.f5.getRotation()==90.0|| binding.f6.getRotation()==90.0|| binding.f7.getRotation()==90.0|| binding.f8.getRotation()==90.0|| binding.f9.getRotation()==90.0){
                    binding.f8.animate().rotation(binding.f8.getRotation()+90).start();
                }
                else if(binding.f1.getRotation()==180.0 || binding.f2.getRotation()==180.0 || binding.f3.getRotation()==180.0 || binding.f4.getRotation()==180.0|| binding.f5.getRotation()==180.0|| binding.f6.getRotation()==180.0|| binding.f7.getRotation()==180.0|| binding.f8.getRotation()==180.0|| binding.f9.getRotation()==180.0){
                    binding.f8.animate().rotation(binding.f8.getRotation()+90).start();
                }
                else if(binding.f1.getRotation()==270.0 || binding.f2.getRotation()==270.0 || binding.f3.getRotation()==270.0 || binding.f4.getRotation()==270.0|| binding.f5.getRotation()==270.0|| binding.f6.getRotation()==270.0|| binding.f7.getRotation()==270.0|| binding.f8.getRotation()==270.0|| binding.f9.getRotation()==270.0){
                    binding.f8.animate().rotation(binding.f8.getRotation()+90).start();
                }
                else{

                    binding.f8.animate().rotation(binding.f8.getRotation()+0).start();
                }
            }
        });
        binding.f9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (binding.f1.getRotation()>360.0 || binding.f1.getRotation()<90|| binding.f2.getRotation()>360.0 || binding.f2.getRotation()<90 || binding.f3.getRotation()>360.0 || binding.f3.getRotation()<90|| binding.f4.getRotation()>360.0 || binding.f4.getRotation()<90|| binding.f5.getRotation()>360.0 || binding.f5.getRotation()<90|| binding.f6.getRotation()>360.0 || binding.f6.getRotation()<90|| binding.f7.getRotation()>360.0 || binding.f7.getRotation()<90|| binding.f8.getRotation()>360.0 || binding.f8.getRotation()<90|| binding.f9.getRotation()>360.0 || binding.f9.getRotation()<90){
                    binding.f1.animate().rotation(270).start();
                    binding.f2.animate().rotation(180).start();
                    binding.f3.animate().rotation(270).start();
                    binding.f4.animate().rotation(90).start();
                    binding.f5.animate().rotation(180).start();
                    binding.f6.animate().rotation(270).start();
                    binding.f7.animate().rotation(180).start();
                    binding.f8.animate().rotation(90).start();
                    binding.f9.animate().rotation(270).start();
                }
                else if (binding.f1.getRotation()==90.0 || binding.f2.getRotation()==90.0 || binding.f3.getRotation()==90.0 || binding.f4.getRotation()==90.0|| binding.f5.getRotation()==90.0|| binding.f6.getRotation()==90.0|| binding.f7.getRotation()==90.0|| binding.f8.getRotation()==90.0|| binding.f9.getRotation()==90.0){
                    binding.f9.animate().rotation(binding.f9.getRotation()+90).start();
                }
                else if(binding.f1.getRotation()==180.0 || binding.f2.getRotation()==180.0 || binding.f3.getRotation()==180.0 || binding.f4.getRotation()==180.0|| binding.f5.getRotation()==180.0|| binding.f6.getRotation()==180.0|| binding.f7.getRotation()==180.0|| binding.f8.getRotation()==180.0|| binding.f9.getRotation()==180.0){
                    binding.f9.animate().rotation(binding.f9.getRotation()+90).start();
                }
                else if(binding.f1.getRotation()==270.0 || binding.f2.getRotation()==270.0 || binding.f3.getRotation()==270.0 || binding.f4.getRotation()==270.0|| binding.f5.getRotation()==270.0|| binding.f6.getRotation()==270.0|| binding.f7.getRotation()==270.0|| binding.f8.getRotation()==270.0|| binding.f9.getRotation()==270.0){
                    binding.f9.animate().rotation(binding.f9.getRotation()+90).start();
                }
                else{

                    binding.f9.animate().rotation(binding.f9.getRotation()+0).start();
                }
            }
        });
        binding.button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                binding.f1.animate().rotation(180).start();
                binding.f2.animate().rotation(90).start();
                binding.f3.animate().rotation(270).start();
                binding.f4.animate().rotation(90).start();
                binding.f5.animate().rotation(180).start();
                binding.f6.animate().rotation(270).start();
                binding.f7.animate().rotation(180).start();
                binding.f8.animate().rotation(270).start();
                binding.f9.animate().rotation(180).start();
                binding.button4.setVisibility(View.INVISIBLE);
            }
        });
        binding.button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                System.exit(0);
            }
        });
        binding.button3.setVisibility(View.INVISIBLE);
    }
}