package com.wilgon.traductorop;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import android.content.Intent;
import android.os.Bundle;

import com.wilgon.traductorop.databinding.ActivityMain2Binding;
import com.wilgon.traductorop.databinding.ActivityMainBinding;

//activity
public class MainActivity2 extends AppCompatActivity {

    ActivityMain2Binding binding2;
    ViewModel2_controlador vm2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main2);
        binding2 = ActivityMain2Binding.inflate(getLayoutInflater());
        setContentView(binding2.getRoot());

        //crea el vm2(vista modelo)
        vm2 = ViewModelProvider.AndroidViewModelFactory.getInstance(getApplication()).create(ViewModel2_controlador.class);
        //llamar al mutable, lo trae. Observador
        vm2.getMutable().observe(this, new Observer<Palabra>() {

            @Override
            public void onChanged(Palabra palabra) {
                binding2.tvPalabraT.setText(palabra.getPalabraIng());
                binding2.ivImgT.setImageResource(palabra.getImg());
            }
        });


        Intent intent2= getIntent();

        vm2.TraducirPalabra(intent2);
    }




}