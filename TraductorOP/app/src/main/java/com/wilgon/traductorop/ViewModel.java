package com.wilgon.traductorop;

import static androidx.core.content.ContextCompat.startActivity;

import android.app.Application;
import android.content.Context;
import android.content.Intent;

import androidx.activity.result.contract.ActivityResultContracts;
import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;

public class ViewModel extends AndroidViewModel {

    public ViewModel(@NonNull Application application) {
        super(application);
    }

    //public MutableLiveData<String> mutable;

 /*   public LiveData<String> getMutable() {
        if (mutable==null){
            mutable= new MutableLiveData<>();
        }
        return mutable;
    }
*/

    public void traducir(String p){
      // mutable.setValue(p); //aca le metemos la palabra

        //creamos el intent.      getApp..(porque no es un activity, es una clase java)
        // es el contexto(desde donde estoy, hacia donde enviamos )
        Intent intent= new Intent(getApplication(),MainActivity2.class);
        //le metemos el dato que vamos a pasarle. set
        //es el que lleva
        intent.putExtra("palabra", p);
        //exception
        intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        //inicia el intent
        getApplication().startActivity(intent);



    }


}
