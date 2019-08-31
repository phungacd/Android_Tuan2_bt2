package com.example.android_tuan2_bt2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText c,f;
    Button ConvertC,ConvertF,Clear;
    TextView kq;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        c = findViewById(R.id.txtC);
        f= findViewById(R.id.txtF);
        ConvertC = findViewById(R.id.btnC);
        ConvertF = findViewById(R.id.btnF);
        Clear = findViewById(R.id.btnclear);
        kq = findViewById(R.id.viewkq);

        ConvertF.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int cc = Integer.parseInt(c.getText().toString());
                kq.setText(" Chuyển C-> F :"+(cc*(9/5)+32));
            }
        });
        ConvertC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int ff = Integer.parseInt(f.getText().toString());
                kq.setText(" Chuyển F -> C :"+((ff-32)*5/9));
            }
        });
        Clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                c.setText("");
                f.setText("");
            }
        });
    }


}
