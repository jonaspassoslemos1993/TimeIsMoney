package com.example.timeismoney;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class CadastroActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro);
    }

    public void avancaPrincipal(View view) {
        Intent intent = new Intent(this, PrincipalActivity.class );
        startActivity(intent);
    }
}