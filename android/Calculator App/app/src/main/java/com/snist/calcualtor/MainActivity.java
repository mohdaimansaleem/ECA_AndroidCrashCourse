package com.snist.calcualtor;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b0;
    private TextView resultTv;

    private Button badd,bsub,bdiv,bmul,b15,b16,b17,b18,b19;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //string input
        StringBuilder input=new StringBuilder();

        //initializing the variables
        b0 = findViewById(R.id.button0);
        b1 = findViewById(R.id.button1);
        b2 = findViewById(R.id.button2);
        b3 = findViewById(R.id.button3);
        b4 = findViewById(R.id.button4);
        b5 = findViewById(R.id.button5);
        b6 = findViewById(R.id.button6);
        b7 = findViewById(R.id.button7);
        b8 = findViewById(R.id.button8);
        b9 = findViewById(R.id.button9);

        //exp
        resultTv = findViewById(R.id.resultTv);



        badd = findViewById(R.id.add);
        bsub = findViewById(R.id.sub);
        bmul = findViewById(R.id.buttonmul);
        bdiv = findViewById(R.id.div);



        //events on operations
        badd.setOnClickListener(v -> {
            input.append("+");
            resultTv.setText(input.toString());
        });

        bsub.setOnClickListener(v -> {
            input.append("-");
            resultTv.setText(input.toString());
        });
        bmul.setOnClickListener(v -> {
            input.append("*");
            resultTv.setText(input.toString());
        });
        bdiv.setOnClickListener(v -> {
            input.append("/");
            resultTv.setText(input.toString());
        });





        //events on numbers
        b0.setOnClickListener(v -> {
            input.append("0");
            resultTv.setText(input.toString());
        });
        b1.setOnClickListener(v -> {
            input.append("1");
            resultTv.setText(input.toString());
        });
        b2.setOnClickListener(v -> {
            input.append("2");
            resultTv.setText(input.toString());
        });
        b3.setOnClickListener(v -> {
            input.append("3");
            resultTv.setText(input.toString());

        });
        b4.setOnClickListener(v -> {
            input.append("4");
            resultTv.setText(input.toString());
        });
        b5.setOnClickListener(v -> {
            input.append("5");
            resultTv.setText(input.toString());
        });
        b6.setOnClickListener(v -> {
            input.append("6");
            resultTv.setText(input.toString());
        });
        b7.setOnClickListener(v -> {
            input.append("7");
            resultTv.setText(input.toString());
        });
        b8.setOnClickListener(v -> {
            input.append("8");
            resultTv.setText(input.toString());
        });
        b9.setOnClickListener(v -> {
            input.append("9");
            resultTv.setText(input.toString());
        });



        Button equal=findViewById(R.id.equal);
        TextView res=findViewById(R.id.res);


        //event on equal button
        equal.setOnClickListener(v -> {
            String inputString =input.toString();

            if(inputString.contains("+")){
                String arr[]=inputString.split("\\+");

                int a=Integer.parseInt(arr[0]);
                int b=Integer.parseInt(arr[1]);

                int ans=a+b;

                res.setText(ans+"");

            }else if(inputString.contains("-")){
                String arr[]=inputString.split("-");

                int a=Integer.parseInt(arr[0]);
                int b=Integer.parseInt(arr[1]);

                int ans=a-b;

                res.setText(ans+"");
            }else if(inputString.contains("/")){
                String arr[]=inputString.split("/");

                int a=Integer.parseInt(arr[0]);
                int b=Integer.parseInt(arr[1]);

                if(b==0){
                    res.setText("UNDEFINED");
                }
                else {
                    double ans = a*1.0 / b;

                    res.setText(ans + "");
                }
            }
        else if(inputString.contains("*")){
                String arr[]=inputString.split("-");

                int a=Integer.parseInt(arr[0]);
                int b=Integer.parseInt(arr[1]);

                int ans=a*b;

                res.setText(ans+"");
            }else{
                res.setText(input);
            }

        });



        // clearing the screen
        Button clear=findViewById(R.id.clear);
        clear.setOnClickListener(v -> {
            input.setLength(0);
            res.setText("");
            resultTv.setText("");
        });






    }
}