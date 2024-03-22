package com.wilgon.traductorop;

import android.app.Application;
import android.content.Intent;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;

public class ViewModel2_controlador extends AndroidViewModel {
    //
    private MutableLiveData<Palabra> mutable;
    Palabra p1= new Palabra("auto","car",R.drawable.car);
    Palabra p2= new Palabra("gato","cat", R.drawable.cat);
    Palabra p3= new Palabra("perro","dog", R.drawable.dog);
    Palabra p4= new Palabra("","no encontrado",R.drawable.caritatriste);


    public LiveData<Palabra> getMutable() {
        if (mutable == null) {
            mutable = new MutableLiveData<>();
        }
        return mutable;
    }


    public ViewModel2_controlador(@NonNull Application application) {
        super(application);
    }

    public void TraducirPalabra(Intent intent2) {
        //le pido que me traiga la palabra original
        String palabraOriginal= intent2.getStringExtra("palabra");

        switch (palabraOriginal){
            case "auto":
                mutable.setValue(p1);
                break;
            case "gato":
                mutable.setValue(p2);
                break;
            case "perro":
                mutable.setValue(p3);
                break;
            default:
                mutable.setValue(p4);
        }
    }

}
