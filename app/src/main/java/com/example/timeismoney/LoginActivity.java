package com.example.timeismoney;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    public void avancaCadastro(View view) {
        Intent intent = new Intent(this, CadastroActivity.class );
        startActivity(intent);
    }
}