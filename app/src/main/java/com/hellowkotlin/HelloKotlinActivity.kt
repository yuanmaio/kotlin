package com.hellowkotlin

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_hello_kotlin.*

class HelloKotlinActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hello_kotlin)
        btnlogin.setOnClickListener { check() }
    }

    fun check(){
        if(username!=null && username.length()>0){
            if(password!=null && password.length()>0){
               Toast.makeText(this,"成功",Toast.LENGTH_LONG).show();

            }else{
                Toast.makeText(this,"密码不为空",Toast.LENGTH_LONG).show();
                return;
            }
        }else{
            Toast.makeText(this,"用户名不为空",Toast.LENGTH_LONG).show();
        }
    }
}
