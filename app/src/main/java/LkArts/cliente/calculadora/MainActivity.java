package LkArts.cliente.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {

    EditText edtCaixaUm, edtCaixaDois;
    TextView resultado;
    Button soma;
    DecimalFormat dcf = new DecimalFormat("0");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtCaixaUm = findViewById(R.id.edtCaixaUm);
        edtCaixaDois = findViewById(R.id.edtCaixaDois);
        resultado = findViewById(R.id.resultadoConta);
        soma = findViewById(R.id.soma);




    }
    public void soma(View view){
        double caixa1 = Double.parseDouble(edtCaixaUm.getText().toString());
        double caixa2 = Double.parseDouble(edtCaixaDois.getText().toString());
        double res = caixa1 + caixa2;
        String valor = dcf.format(res);
        resultado.setText(valor);

    }



}