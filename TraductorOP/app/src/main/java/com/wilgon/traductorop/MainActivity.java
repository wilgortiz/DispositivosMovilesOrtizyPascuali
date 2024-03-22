package com.wilgon.traductorop;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;



import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import com.wilgon.traductorop.databinding.ActivityMain2Binding;
import com.wilgon.traductorop.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    ActivityMainBinding binding;
    //private com.wilgon.traductorop.ViewModel viewModel;
    //el modelo vista
    ViewModel vm1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // setContentView(R.layout.activity_main);

        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        vm1 = ViewModelProvider.AndroidViewModelFactory.getInstance(getApplication()).create(ViewModel.class);

        //  viewModel.getMutableGradoF().observe(this, new Observer<Double>() {
        //   @Override
        //   public void onChanged(Double aDouble) {
        //       binding.tvResultado.setText(aDouble+"");
        //  }
        binding.btnTraducir.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                String palabraIngresada = binding.eTpalabraIngresada.getText().toString();

                //al controlador
                vm1.traducir(palabraIngresada);
            }





        });
    }
}