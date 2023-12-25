package com.esragg.javaoopdetails;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Kedi kedi = new Kedi("Duman", "sari", "gri");
        Kedi kedi2 = new Kedi();
        kedi2.isim = "Viccy";
        System.out.println(kedi2.isim);
        System.out.println(Kedi.turIsmi);
        kedi.konusKedi();
        Kedi.konusKediStatic();


        Kopek kopek = new Kopek();
        Kopek kopek2 = new Kopek("Barley", "sari", "sari");

        Hayvan hayvan = new Hayvan();
    }
}