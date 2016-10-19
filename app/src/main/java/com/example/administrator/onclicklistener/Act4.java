package com.example.administrator.onclicklistener;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Act4 extends AppCompatActivity {

    private Button btu4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_act4);
        btu4= (Button) findViewById(R.id.button4);
        btu4.setText("xml点击");
    }
    public void myClick(View v){
        Toast.makeText(this,"布局xml定义",Toast.LENGTH_LONG).show();
    }
}
