package com.example.administrator.demo;

import android.content.Intent;
import android.os.Bundle;

import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

/**
 * Created by Administrator on 2017/10/17.
 */

public class Login extends AppCompatActivity implements View.OnClickListener{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        Button login=(Button)findViewById(R.id.login_button);
        login.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        Toast.makeText(Login.this,"你成功登陆了！",Toast.LENGTH_SHORT).show();
        Intent intent=new Intent(Login.this,MainActivity.class);
        startActivity(intent);
    }

}
