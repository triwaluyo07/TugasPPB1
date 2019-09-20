package com.example.kalkulator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void hitungPersegi(View view) {
        EditText inputan1 = findViewById(R.id.inputan1);
        EditText inputan2 = findViewById(R.id.inputan2);

        double field1 = Double.parseDouble(inputan1.getText().toString());
        double field2 = Double.parseDouble(inputan2.getText().toString());

        TextView hasilLuas = findViewById(R.id.hasilLuas);
        TextView hasilKell = findViewById(R.id.hasilKell);

        hasilLuas.setText(Double.toString(field1*field2));
        hasilKell.setText(Double.toString(2*(field1+field2)));
    }

    public void hitungSegitiga(View view) {
        EditText inputan1 = findViewById(R.id.inputan1);
        EditText inputan2 = findViewById(R.id.inputan2);

        double field1 = Double.parseDouble(inputan1.getText().toString());
        double field2 = Double.parseDouble(inputan2.getText().toString());

        TextView hasilLuas = findViewById(R.id.hasilLuas);
        TextView hasilKell = findViewById(R.id.hasilKell);


        hasilLuas.setText(Double.toString(field1*field2/2));
        hasilKell.setText(Double.toString(field1+field1+field2));

    }
    public void hitungLingkaran(View view) {
        EditText inputan1 = findViewById(R.id.inputan1);

        double field1 = Double.parseDouble(inputan1.getText().toString());

        TextView hasilLuas = findViewById(R.id.hasilLuas);
        TextView hasilKell = findViewById(R.id.hasilKell);

        hasilLuas.setText(Double.toString(3.14*(field1/2)*(field1/2)));
        hasilKell.setText(Double.toString(3.14*field1));
    }


}
