package com.example.filipe.menuprincipal;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MenuPrincipalActivity extends AppCompatActivity {

    private Button btPlay;
    private Button btSair;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_principal);

        btPlay = (Button) findViewById(R.id.btPlay);
        btSair = (Button) findViewById(R.id.btSair);

        Typeface fonte = Typeface.createFromAsset(getAssets(), "fonts/ackident.ttf");

        btPlay.setTypeface(fonte);
        btSair.setTypeface(fonte);
    }

    public void play(View v){
        Toast.makeText(this,"Aguarde o proximo capitulo",Toast.LENGTH_SHORT).show();
    }

    public void sair(View v){
        finish();
    }
}
