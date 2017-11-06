package com.example.administrator.demo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button wx_btn=(Button)findViewById(R.id.weixin_btn);
        wx_btn.setOnClickListener(this);
        Button conlist_btn=(Button)findViewById(R.id.conlist_btn);
        conlist_btn.setOnClickListener(this);
        Button wo_btn=(Button)findViewById(R.id.wo_btn);
        wo_btn.setOnClickListener(this);
    }
    public void onClick(View view) {
    /* Toast.makeText(MainActivity.this,"微信！",Toast.LENGTH_SHORT).show();*/
    switch(view.getId()){
        case R.id.weixin_btn:
            Intent intent=new Intent(MainActivity.this,Weixin.class);
            startActivity(intent);
            break;
        case R.id.conlist_btn:
            Intent intent1=new Intent(MainActivity.this,ContextList.class);
            startActivity(intent1);
            break;
        case R.id.wo_btn:
            Intent intent2=new Intent(MainActivity.this,Info.class);
            startActivity(intent2);
            break;
        default:
            break;
    }
}
   /* public boolean onCreateOptionMenu(Menu menu){
        getMenuInflater().inflate(R.menu.main,menu);
        return true;
    }
    public boolean onOptionsItemSelected(MenuItem item){
        switch (item.getItemId()){
            case R.id.add_item:
                Toast.makeText(this,"add friend",Toast.LENGTH_SHORT).show();
                break;
            case R.id.chat_item:
                Toast.makeText(this,"chat",Toast.LENGTH_SHORT).show();
                break;

            default:
                break;
        }
        return true;
    }
*/
}
