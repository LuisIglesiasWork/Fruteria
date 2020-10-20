package com.example.fruteria;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.*;
import android.widget.*;

import java.util.*;

public class MainActivity extends AppCompatActivity {

    private ListView listView;
    private List<String> frutas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        frutas = new ArrayList<>();
        frutas.add("Tomate");
        frutas.add("Manzana");
        frutas.add("Naranja");
        frutas.add("Banana");
        frutas.add("Toronja");

        ArrayAdapter <String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,frutas);

        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                       @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
                           Toast.makeText(MainActivity.this, "Clic a "+frutas.get(position),Toast.LENGTH_LONG).show();
                       }
        });
    }
}