package com.example.swapperio;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class HomeScreen extends AppCompatActivity {

    EditText editTextValueA;
    EditText editTextValueB;
    TextView textViewOutput;
    Button buttonSwap;
    Button buttonAdd;
    Button buttonSub;
    Button buttonMul;
    Button buttonDiv;
    Button buttonMod;

    public String A,B;
    public double x,y;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_screen);

        editTextValueA = (EditText) findViewById(R.id.editTextA);
        editTextValueB = (EditText) findViewById(R.id.editTextB);

        buttonSwap = (Button) findViewById(R.id.buttonSw);
        buttonAdd = (Button) findViewById(R.id.buttonA);
        buttonSub = (Button) findViewById(R.id.buttonS);
        buttonMul = (Button) findViewById(R.id.buttonMu);
        buttonDiv = (Button) findViewById(R.id.buttonD);
        buttonMod = (Button) findViewById(R.id.buttonM);
        textViewOutput = (TextView) findViewById(R.id.textViewOutput);
        View.OnClickListener onClickListenerSwap = new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                A = editTextValueA.getText().toString();
                B = editTextValueB.getText().toString();

                x = Double.parseDouble(A);
                y = Double.parseDouble(B);

                Swap();

                A = String.valueOf(x);
                B = String.valueOf(y);

                String outputSwap = "\nAfter Swap, A is " + A + " and B is " + B;
                textViewOutput.append(outputSwap);
            }
        };
        buttonSwap.setOnClickListener(onClickListenerSwap);
        View.OnClickListener onClickListenerAdd = new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                A = editTextValueA.getText().toString();
                B = editTextValueB.getText().toString();

                x = Double.parseDouble(A);
                y = Double.parseDouble(B);

                String outputAdd = "\nSum of A and B is " + Add();
                textViewOutput.append(outputAdd);
            }
        };
        buttonAdd.setOnClickListener(onClickListenerAdd);
        View.OnClickListener onClickListenerSub = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                A = editTextValueA.getText().toString();
                B = editTextValueB.getText().toString();

                x = Double.parseDouble(A);
                y = Double.parseDouble(B);

                String outputSub = "\nDifference of A and B is " + Sub();
                textViewOutput.append(outputSub);
            }
        };
        buttonSub.setOnClickListener(onClickListenerSub);
        View.OnClickListener onClickListenerMul = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                A = editTextValueA.getText().toString();
                B = editTextValueB.getText().toString();

                x = Double.parseDouble(A);
                y = Double.parseDouble(B);

                String outputMul = "\nMultiplication of A and B is " + Mul();
                textViewOutput.append(outputMul);
            }
        };
        buttonMul.setOnClickListener(onClickListenerMul);
        View.OnClickListener onClickListenerDiv = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                A = editTextValueA.getText().toString();
                B = editTextValueB.getText().toString();

                x = Double.parseDouble(A);
                y = Double.parseDouble(B);

                String outputDiv = "\nDivision of A and B is " + Div();
                textViewOutput.append(outputDiv);
            }
        };
        buttonDiv.setOnClickListener(onClickListenerDiv);
        View.OnClickListener onClickListenerMod = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                A = editTextValueA.getText().toString();
                B = editTextValueB.getText().toString();

                x = Double.parseDouble(A);
                y = Double.parseDouble(B);

                String outputMod = "\nModulation of A and B is " + Mod();
                textViewOutput.append(outputMod);
            }
        };
        buttonMod.setOnClickListener(onClickListenerMod);
    }
    public void Swap()
    {
        x = x+y;
        y = x-y;
        x = x-y;
    }
    public double Add()
    {
        return x+y;
    }
    public double Sub()
    {
        return (x>y ? x-y : y-x);
    }
    public double Mul()
    {
        return x*y;
    }
    public double Div()
    {
        return (x>y ? x/y : y/x);
    }
    public double Mod()
    {
        return (x>y ? x%y : y%x);
    }
}