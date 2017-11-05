package com.example.administrator.demo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import static com.example.administrator.demo.R.id.weixin_btn;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button weixin_btn=(Button)findViewById(R.id.weixin_btn);
        weixin_btn.setOnClickListener(this);
    }
    public void onClick(View view) {
      /*  Toast.makeText(MainActivity.this,"微信！",Toast.LENGTH_SHORT).show();*/
        Intent intent=new Intent(MainActivity.this,Weixin.class);
        startActivity(intent);
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
