package LkArts.cliente.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class SplashActivity extends AppCompatActivity {
 int tempoEspera = 1000 * 10;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
 new Handler().postDelayed(new Runnable() {
     @Override
     public void run() {
         Intent acaoIr = new Intent(SplashActivity.this, MainActivity.class);
         startActivity(acaoIr);
         finish();
     }
 },tempoEspera);


    }



}