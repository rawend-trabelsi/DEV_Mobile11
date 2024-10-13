package com.example.tdex5;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private EditText ed1, ed2;
    private TextView res;
    private Button btn;
    private CheckBox checkBox;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Initialisation des composants
        ed1 = findViewById(R.id.ed1);
        ed2 = findViewById(R.id.ed2);

        btn = findViewById(R.id.button);
        checkBox=findViewById(R.id.checkBox2);

        // Définir l'action du bouton
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                concat();
            }
        });
    }

    private void concat() {
        String mot1 = ed1.getText().toString().trim();
        String mot2 = ed2.getText().toString().trim();

        if (mot1.isEmpty() || mot2.isEmpty()) {
            Toast.makeText(MainActivity.this, "Champs vide", Toast.LENGTH_SHORT).show();
        } else {

            String result;
            if (checkBox.isChecked()) {

                result = mot1 + " " + mot2;
            } else {

                result = mot1 + mot2;
            }


            Toast.makeText(MainActivity.this, result, Toast.LENGTH_SHORT).show();
        }
    }}