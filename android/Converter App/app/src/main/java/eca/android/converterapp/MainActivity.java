package eca.android.converterapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }
   public void find(View view){

        TextView input=findViewById(R.id.input);
        TextView output=findViewById(R.id.result);

        String inr=input.getText().toString();

         if(inr.equals("")){
              return;
         }

        double value=Double.parseDouble(inr)/81.85;
        String set="USD : "+value;

        output.setText(set);
    }

}