package com.example.administrator.onclicklistener;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Act5 extends AppCompatActivity {
    private Button btu5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_act5);
        btu5= (Button) findViewById(R.id.button5);
        btu5.setText("外部类");
        btu5.setOnClickListener(new OuterClass());
    }

}

    class OuterClass implements View.OnClickListener{

        @Override
        public void onClick(View v) {
         // System.out.print("外部类事件监听");
        Toast.makeText(v.getContext(),"外部类实现监听",Toast.LENGTH_LONG).show();
        }
    }