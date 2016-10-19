package com.example.administrator.onclicklistener;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    private Button btu1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btu1= (Button) findViewById(R.id.button1);
        btu1.setText("自身类");
        btu1.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Toast.makeText(this,"自身类作为监听",Toast.LENGTH_LONG).show();
    }
}
