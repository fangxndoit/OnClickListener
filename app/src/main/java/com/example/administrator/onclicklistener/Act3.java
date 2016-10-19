package com.example.administrator.onclicklistener;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Act3 extends AppCompatActivity {
    private Button btu3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_act3);
        btu3= (Button) findViewById(R.id.button3);
        btu3.setText("匿名类");
        btu3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Act3.this,"匿名类作为监听",Toast.LENGTH_LONG).show();
            }
        });
    }

}
