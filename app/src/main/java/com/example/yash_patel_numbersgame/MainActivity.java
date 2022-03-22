package com.example.yash_patel_numbersgame;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


   //utton reset,button1,button2,button3,utton1button1button1

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void buttonClicked(android.view.View view){
        Log.i("Button","Button Clicked");
        Button button = (Button) view;
        String buttonText = button.getText().toString();
        Log.i("Button","Button is :" + buttonText);

        int currentNumber = Integer.parseInt(buttonText);
        if(currentNumber < 5)
        {
            currentNumber = currentNumber + 1;
        }
        else if(currentNumber > 5)
        {
            currentNumber = currentNumber - 1;
        }
        else
        {
            currentNumber = currentNumber;
        }

        button.setText(Integer.toString(currentNumber));

    }
    public void reset(android.view.View v1){
        //Reset all the values to its original values
        Button btn1 = (Button) findViewById(R.id.button4);btn1.setText("2");
        Button btn2 = (Button) findViewById(R.id.button9);btn2.setText("5");
        Button btn3 = (Button) findViewById(R.id.button6);btn3.setText("0");
        Button btn4 = (Button) findViewById(R.id.button7);btn4.setText("5");
        Button btn5 = (Button) findViewById(R.id.button8);btn5.setText("0");
        Button btn6 = (Button) findViewById(R.id.button9);btn6.setText("5");
        Button btn7 = (Button) findViewById(R.id.button10);btn7.setText("0");
        Button btn8 = (Button) findViewById(R.id.button11);btn8.setText("9");
        Button btn9 = (Button) findViewById(R.id.button3);btn9.setText("8");
    }
}