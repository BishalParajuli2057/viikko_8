package com.example.viikko_8;

import android.os.Bundle;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import android.view.View;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
    public void Add(View v){
        EditText et1=(EditText) findViewById(R.id.editFirstNumber);
        EditText et2=(EditText) findViewById(R.id.editSecondNumber);
        EditText et3=(EditText) findViewById(R.id.textSeeResult);
        int n1=Integer.parseInt(et1.getText().toString());
        int n2=Integer.parseInt(et2.getText().toString());
        int result = n1+n2;
        et3.setText(String.valueOf(result));
    }

    public void subtract(View v){
        EditText et1=(EditText) findViewById(R.id.editFirstNumber);
        EditText et2=(EditText) findViewById(R.id.editSecondNumber);
        EditText et3=(EditText) findViewById(R.id.textSeeResult);
        int n1=Integer.parseInt(et1.getText().toString());
        int n2=Integer.parseInt(et2.getText().toString());
        int result = n1-n2;
        et3.setText(String.valueOf(result));;
    }

    public void multipuly(View v){
        EditText et1=(EditText) findViewById(R.id.editFirstNumber);
        EditText et2=(EditText) findViewById(R.id.editSecondNumber);
        EditText et3=(EditText) findViewById(R.id.textSeeResult);
        int n1=Integer.parseInt(et1.getText().toString());
        int n2=Integer.parseInt(et2.getText().toString());
        int result = n1*n2;
        et3.setText(String.valueOf(result));
    }

    public void divide(View v){
        EditText et1=(EditText) findViewById(R.id.editFirstNumber);
        EditText et2=(EditText) findViewById(R.id.editSecondNumber);
        EditText et3=(EditText) findViewById(R.id.textSeeResult);
        int n1=Integer.parseInt(et1.getText().toString());
        int n2=Integer.parseInt(et2.getText().toString());
        int result = n1/n2;
        et3.setText(String.valueOf(result));
    }

}