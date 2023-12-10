package com.example.hesapmakinas3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView tv1,tv2,tv3,tv4;
    EditText et1,et2;
    Button bt1;
    Spinner sp1;
    int x,y;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv1 = findViewById(R.id.tv1);
        tv2= findViewById(R.id.tv2);
        tv3 = findViewById(R.id.tv3);
        et1 = findViewById(R.id.et1);
        et2 = findViewById(R.id.et2);
        bt1 =findViewById(R.id.bt1);
        tv4 = findViewById(R.id.tv4);
        sp1 = findViewById(R.id.sp);


        sp1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long l) {
                switch (position) {
                    case 0:
                        tv4.setText("TOPLAMA");
                        break;
                    case 1:
                        tv4.setText("CIKARMA");
                        break;
                    case 2:
                        tv4.setText("CARPMA");
                        break;
                    case 3:
                        tv4.setText("BOLME");
                        break;
                }

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (et1.getText().toString().equals("")||et2.getText().toString().equals("")){
                    tv4.setText("BOŞ YAPMAYINIZ...");
                    Toast.makeText(getApplicationContext(),"BOS YAPMAYINIZ...",Toast.LENGTH_SHORT).show();

                }
                else {
                    if (sp1.getSelectedItem().toString().equals("TOPLAMA") ||tv4.getText() == "TOPLAMA");
                    {
                        x = Integer.parseInt(et1.getText().toString());
                        y = Integer.parseInt(et2.getText().toString());
                        tv4.setText(Integer.toString(x + y));
                    }

                    if (sp1.getSelectedItem().toString().equals("CIKARMA"))
                    {
                            x = Integer.parseInt(et1.getText().toString());
                            y = Integer.parseInt(et2.getText().toString());
                            tv4.setText(Integer.toString(x - y));
                    }

                    if (sp1.getSelectedItem().toString().equals("CARPMA"))
                    {
                        x = Integer.parseInt(et1.getText().toString());
                        y = Integer.parseInt(et2.getText().toString());
                        tv4.setText(Integer.toString(x * y));
                    }

                    if (sp1.getSelectedItem().toString().equals("BOLME"))
                    {
                        x = Integer.parseInt(et1.getText().toString());
                        y = Integer.parseInt(et2.getText().toString());
                        tv4.setText(Integer.toString(x / y));
                    }
                }
            }
        });


    }



}