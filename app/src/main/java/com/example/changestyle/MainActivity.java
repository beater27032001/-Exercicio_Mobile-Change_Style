package com.example.changestyle;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btBackgroundColor = findViewById(R.id.btBackgroundColor);
        Button btEstadoInicial = findViewById(R.id.btEstadoInicial);
        Button btNewText = findViewById(R.id.btNewText);
        TextView textView = findViewById(R.id.textView);

        btBackgroundColor.setOnClickListener(view -> {
            textView.setBackgroundColor(Color.parseColor("#c9c9c9c"));
        });

        btNewText.setOnClickListener(view -> {
            textView.setText("Mudando o Texto");
        });

        btEstadoInicial.setOnClickListener(view -> {
            textView.setText("TextView");
            textView.setBackgroundColor(Color.TRANSPARENT);
        });
    }
}