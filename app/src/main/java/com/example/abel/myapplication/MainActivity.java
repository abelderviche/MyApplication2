package com.example.abel.myapplication;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity  implements View.OnClickListener{

    Button buttonSum, buttonRes,buttonPor,buttonDiv,buttonIgual;
    EditText  editNum;
    int op1,op2,res;
    String oper;
    TextView resultados;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        editNum     = (EditText) findViewById(R.id.editNum);
        buttonSum   = (Button) findViewById(R.id.buttonSum);
        buttonRes   = (Button) findViewById(R.id.buttonRes);
        buttonPor   = (Button) findViewById(R.id.buttonPor);
        buttonDiv   = (Button) findViewById(R.id.buttonDiv);
        buttonIgual = (Button) findViewById(R.id.buttonIgual);
        resultados     = (TextView) findViewById(R.id.resultView);


        buttonSum.setOnClickListener(this);
        buttonRes.setOnClickListener(this);
        buttonPor.setOnClickListener(this);
        buttonDiv.setOnClickListener(this);
        buttonIgual.setOnClickListener(this);


    }
    public void calcular(){
        if(oper.equals("+")){
            op2 = Integer.parseInt(editNum.getText().toString());
            editNum.setText("");
            op1 += op2;
            resultados.setText(Integer.toString(op1));
            op1 = 0;
            op2 = 0;
        }else if(oper.equals("-")){
            op2 = Integer.parseInt(editNum.getText().toString());
            editNum.setText("");
            op1 = op1 - op2;
            resultados.setText(Integer.toString(op1));
            op1 = 0;
            op2 = 0;
        }else if(oper.equals("*")){
            op2 = Integer.parseInt(editNum.getText().toString());
            editNum.setText("");
            op1 = op1 * op2;
            resultados.setText(Integer.toString(op1));
            op1 = 0;
            op2 = 0;
        }else if(oper.equals("/")){
            op2 = Integer.parseInt(editNum.getText().toString());
            editNum.setText("");
            op1 = op1 / op2;
            resultados.setText(Integer.toString(op1));
            op1 = 0;
            op2 = 0;
        }
    }

    public void onClick(View v) {
        switch(v.getId()){
            case R.id.buttonSum:
                oper = "+";
                if(op1 == 0){
                    op1 = Integer.parseInt(editNum.getText().toString());
                    editNum.setText("");
                } else if(op2 != 0){
                    op2 = 0;
                    editNum.setText("");
                } else{
                    op2 = Integer.parseInt(editNum.getText().toString());
                    editNum.setText("");
                    op1 = op1 + op2;
                    resultados.setText(Integer.toString(op1));
                }

                //resultados.setText(op1);
                Log.v("blah", "blah blah");
                break;
            case R.id.buttonRes:
                oper = "-";
                if(op1 == 0){
                    op1 = Integer.parseInt(editNum.getText().toString());
                    editNum.setText("");
                }
                break;
            case R.id.buttonPor:
                oper = "*";
                if(op1 == 0){
                    op1 = Integer.parseInt(editNum.getText().toString());
                    editNum.setText("");
                } else if(op2 != 0){
                    op2 = 0;
                    editNum.setText("");
                } else {
                    op2 = Integer.parseInt(editNum.getText().toString());
                    editNum.setText("");
                    op1 = op1 * op2;
                    resultados.setText(Integer.toString(op1));
                }
                break;
            case R.id.buttonDiv:
                oper = "/";
                if(op1 == 0){
                    op1 = Integer.parseInt(editNum.getText().toString());
                    editNum.setText("");
                } else if(op2 != 0){
                    op2 = 0;
                    editNum.setText("");
                } else {
                    op2 = Integer.parseInt(editNum.getText().toString());
                    editNum.setText("");
                    op1 = op1 / op2;
                    resultados.setText(Integer.toString(op1));
                }
                break;
            case R.id.buttonIgual:
                calcular();
                break;

            default:
                break;

        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            resultados.setText("");
            return true;
        }

        return super.onOptionsItemSelected(item);
    }


}
