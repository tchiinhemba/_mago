package com.example.mago;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Home extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home);

       Button btnPal = (Button) findViewById(R.id.btnPalpite);
       btnPal.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {

               EditText edit1 = (EditText) findViewById(R.id.num);
               TextView result = (TextView) findViewById(R.id.txtResult);
               int n1 = Integer.parseInt(edit1.getText().toString());
               double n2 = 1 + Math.random()*(6-1);
               int n3 = (int) n2;

               String res = (n1 == n3)?("Você Acertou! " + n3 + " foi o numero que pensei"):("Você errou, eu pensei "+n3);
               result.setText(res);

           }
       });




    }
}
