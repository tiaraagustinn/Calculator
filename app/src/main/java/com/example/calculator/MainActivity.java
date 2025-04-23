package com.example.calculator;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    EditText inputA, inputB;
    TextView hasil;
    Button btnTambah;
    Calculator calculator;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        inputA = findViewById(R.id.inputA);
        inputB = findViewById(R.id.inputB);
        hasil = findViewById(R.id.hasil);
        btnTambah = findViewById(R.id.btnTambah);

        calculator = new Calculator();

        btnTambah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    int a = Integer.parseInt(inputA.getText().toString());
                    int b = Integer.parseInt(inputB.getText().toString());
                    int result = calculator.add(a, b);
                    hasil.setText("Hasil: " + result);
                } catch (NumberFormatException e) {
                    hasil.setText("Harap masukkan angka yang valid!");
                }
            }
        });
    }
}
