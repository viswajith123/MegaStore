package com.store.megastore;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private TextView registerBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        registerBtn = (TextView)findViewById(R.id.registerBtn);
        registerBtn.setOnClickListener(this);
    }


    //inter connecting

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.registerBtn:
                startActivity(new Intent(this,RegisterUser.class));
                break;

        }

    }
}