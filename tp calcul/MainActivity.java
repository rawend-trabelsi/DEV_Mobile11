package com.example.calculatrice1;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private EditText editText1, editText2;
    private TextView resultTextView;
    private RadioGroup radioGroup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.calcul);

        editText1 = findViewById(R.id.texte1);
        editText2 = findViewById(R.id.texte2);
        resultTextView = findViewById(R.id.res);
        radioGroup = findViewById(R.id.radioGroup);

        Button button = findViewById(R.id.btn);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text1 = editText1.getText().toString().trim();
                String text2 = editText2.getText().toString().trim();

                if (text1.isEmpty() || text2.isEmpty()) {
                    Toast.makeText(getApplicationContext(), "Champs vides", Toast.LENGTH_SHORT).show();
                } else {
                    int number1 = Integer.parseInt(text1);
                    int number2 = Integer.parseInt(text2);
                    int result = 0;

                    int selectedId = radioGroup.getCheckedRadioButtonId();

                    if (selectedId == R.id.r1) {
                        result = number1 + number2;
                    } else if (selectedId == R.id.r2) {
                        result = number1 - number2;
                    } else if (selectedId == R.id.r3) {
                        result = number1 * number2;
                    } else if (selectedId == R.id.r4) {
                        if (number2 == 0) {
                            Toast.makeText(getApplicationContext(), "Division par zéro impossible", Toast.LENGTH_SHORT).show();
                        } else {
                            result = number1 / number2;
                        }
                    }

                    resultTextView.setText(String.valueOf(result));
                }
            }
        });
    }
}