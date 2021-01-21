package com.example.hitung;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int counter;

    Button tambah, reset;
    TextView nilai;
    Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.hitung);

        context = this;

        tambah = (Button) findViewById(R.id.btnTambah);
        reset = (Button) findViewById(R.id.btnReset);
        nilai = (TextView) findViewById(R.id.txtNilai);
        nilai.setText("" + counter);

        tambah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                counter++;
                nilai.setText("" + counter);
            }
        });


        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                counter = 0;
                nilai.setText("" + counter);
            }
        });
    }
}
