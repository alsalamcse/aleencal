package com.nassra.aleen.aleencalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainCalcActivity extends AppCompatActivity implements View.OnClickListener
{
    private TextView tvEshara;
    private EditText etNum,etNum2,etResult;
    private Button btnPlase,btnMines,btnFe,btn3la,btnQoa,btnEq,btnClear;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_calc);
        tvEshara=(TextView)findViewById(R.id.tvEshara);
        etNum=(EditText)findViewById(R.id.etNum);
        etNum2=(EditText)findViewById(R.id.etNum2);
        etResult=(EditText)findViewById(R.id.etResult);
        btnPlase=(Button)findViewById(R.id.btnPlase);
        btnMines=(Button)findViewById(R.id.btnMines);
        btnFe=(Button)findViewById(R.id.btnFe);
        btn3la=(Button)findViewById(R.id.btn3la);
        btnQoa=(Button)findViewById(R.id.btnQoa);
        btnEq=(Button)findViewById(R.id.btnEq);
        btnClear=(Button)findViewById(R.id.btnClear);
        btnPlase.setOnClickListener(this);
        btnMines.setOnClickListener(this);
        btnFe.setOnClickListener(this);
        btn3la.setOnClickListener(this);
        btnQoa.setOnClickListener(this);
        btnEq.setOnClickListener(this);
        btnClear.setOnClickListener(this);
    }

    @Override
    public void onClick(View view)
    {

        String stNum1=etNum.getText().toString();
        String stNum2=etNum2.getText().toString();

        if(view==btnPlase)
        {

            tvEshara.setText("+");
        }
        if(view==btnMines)
        {

            tvEshara.setText("-");

        }
        if (view==btnFe)
        {

            tvEshara.setText("*");

        }
        if (view==btn3la)
        {

            tvEshara.setText("/");

        }
        if (view==btnQoa)
        {

            tvEshara.setText("^");

        }
        if (view==btnEq)
        {
            boolean isOk=true;
            if (stNum1.length()==0)
            {
                isOk=false;
                etNum.setError("give number");
            }
            if (stNum2.length()==0)
            {
                isOk=false;
                etNum2.setError("give number");
            }
            double num1=Double.parseDouble(stNum1);
            double num2=Double.parseDouble(stNum2);
            String es=tvEshara.getText().toString();
            switch (es)
            {
                case "+":
                    etResult.setText((num1+num2)+"");
                    break;
                case "-":
                    etResult.setText((num1-num2)+"");
                    break;
                case "*":
                    etResult.setText((num1*num2)+"");
                    break;
                case "/":
                    etResult.setText((num1/num2)+"");
                    break;
                case "^":
                    etResult.setText((Math.pow(num1,num2))+"");
                    break;
            }
        }
        if (view==btnClear)
        {
          etNum.setText("");
          etNum2.setText("");
          etResult.setText("");
          tvEshara.setText("?");

        }
    }
}
