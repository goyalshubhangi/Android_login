package com.example.faisal.login;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    Button b= (Button)findViewById(R.id.b1);
    EditText E1 =(EditText)findViewById(R.id.e1);
    EditText E2 =(EditText)findViewById(R.id.e2);

    public void verify(View v)
    {
        b.setOnClickListener(new View.OnClickListener()
                             {
                                 @Override
                                 public void onClick(View v) {
                                     if((E1.getText().toString().equals("goyalshubhangi72@gmail.com"))&&(E2.getText().toString().equals("shubh")))
                                     {
                                         Toast t1=Toast.makeText(getApplicationContext(),"Welcome",Toast.LENGTH_SHORT);
                                                 t1.show();
                                     }
                                     else
                                     {
                                         Toast t2=Toast.makeText(getApplicationContext(),"Invalid Login",Toast.LENGTH_SHORT);
                                         t2.show();
                                     }
                                 }
                             }
        );
    }


}
