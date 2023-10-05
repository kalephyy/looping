package com.example.looping;

import androidx.appcompat.app.AppCompatActivity;
// miaw
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
Button BtnFor, BtnWhile, BtnDoWhile;
EditText Input1;
TextView Input2;
TextView TVHasil;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TVHasil = findViewById(R.id.hasil);
        BtnFor = findViewById(R.id.Bfor);
        BtnWhile = findViewById(R.id.Bwhile);
        BtnDoWhile = findViewById(R.id.BdoWhile);
        Input1 = findViewById(R.id.first);
        Input2 = findViewById(R.id.End);
        BtnFor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int InputI = 0;
                int InputII = 0;
                if (Input1.getText().toString() != "" && Input2.getText().toString() != "") {
                    InputI = Integer.parseInt(Input1.getText().toString());
                    InputII = Integer.parseInt(Input2.getText().toString());
                    TVHasil.setText("");
                    if (InputI <= InputII) {
                        for (int x = InputI; x <= InputII; x++) {
                            TVHasil.setText(TVHasil.getText().toString() + x + "\n");
                        }
                    }
                    if (InputI >= InputII){
                        for (int x = InputI; x >= InputII; x--) {
                            System.out.println(x);
                            TVHasil.setText(TVHasil.getText().toString() + x + "\n");
                        }
                    }
                }
                }});

        BtnWhile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int InputI = 0;
                int InputII = 0;
                if (Input1.getText().toString() != "" && Input2.getText().toString() != "") {
                    InputI = Integer.parseInt(Input1.getText().toString());
                    InputII = Integer.parseInt(Input2.getText().toString());
                    TVHasil.setText("");
                    if (InputI <= InputII) {
                        int y = InputI;
                        while (y<=InputII){
                            TVHasil.setText(TVHasil.getText().toString()+y+"\n");
                            y++;
                        }
                    }
                    if (InputI >= InputII){
                        int y = InputI;
                        while (y>=InputII){
                            TVHasil.setText(TVHasil.getText().toString()+y+"\n");
                            y--;
                        }
                    }
                }
            }
        });
        BtnDoWhile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int InputI = 0;
                int InputII = 0;
                if (Input1.getText().toString() != "" && Input2.getText().toString() != "") {
                    InputI = Integer.parseInt(Input1.getText().toString());
                    InputII = Integer.parseInt(Input2.getText().toString());
                    TVHasil.setText("");
                    if (InputI <= InputII) {
                        int z=InputI;
                        do {
                            TVHasil.setText(TVHasil.getText().toString()+z+"\n");
                            z++;
                        }while (z<=InputII);
                    }
                    if (InputI >= InputII){
                        int z=InputI;
                        do {
                            TVHasil.setText(TVHasil.getText().toString()+z+"\n");
                            z--;
                        }while (z>=InputII);
                    }
                }
            }
        });
    }
}