package com.example.trist;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {
    EditText chirp;
    Button btncal;
    TextView tresult;
    DecimalFormat formatter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        chirp = findViewById(R.id.chirp);
        btncal = findViewById(R.id.btncal);
        tresult = findViewById(R.id.tresult);
        tresult.setVisibility(View.GONE);
        formatter = new DecimalFormat("#0.0");
        btncal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                if(chirp.getText().toString().isEmpty())
                {
                    Toast.makeText(MainActivity.this ,"Enter all fields!" , Toast.LENGTH_SHORT).show();
                }
                else
                {
                    int chirps = Integer.parseInt(chirp.getText().toString().trim());
                    double temp = (chirps / 3.0) + 4;
                    String results = "The approximate temperature is : " + formatter.format(temp )+ "Degrees Celcius";

                    tresult.setText(results);
                    tresult.setVisibility(View.VISIBLE);
                }


            }
        });

    }
}