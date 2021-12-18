package com.yusuftalhaklc.ajavanavigation;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavDirections;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


public class FirstFragment extends Fragment {


    public FirstFragment() {

    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {



        return inflater.inflate(R.layout.fragment_first, container, false);
    }

    //sonradan eklendi
    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        //dinleyici
        Button button = view.findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                goToSecond(view);
            }
        });



    }



    public void goToSecond(View view){
        // direkt fragment 2 ye gidebiliyoruz
       // NavDirections action = FirstFragmentDirections.actionFirstFragmentToSecondFragment2(); 61 ve 64 kullanırsak direkt 2nd fragment a geçer
        FirstFragmentDirections.ActionFirstFragmentToSecondFragment2 action =FirstFragmentDirections.actionFirstFragmentToSecondFragment2(); // değer atadığımız için bunu kullanıyoruz
        action.setAge(15); // setter ve getter oluştu
        Navigation.findNavController(view).navigate(action);

    }
}