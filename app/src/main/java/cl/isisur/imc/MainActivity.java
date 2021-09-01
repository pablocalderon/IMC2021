package cl.isisur.imc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    protected EditText ETpeso,ETaltura;
    protected Button BTcalcular;
    protected TextView TVresultado;
    float peso, altura, resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //------------- //
        ETpeso =(EditText)  findViewById(R.id.eTPeso);
        ETaltura=(EditText) findViewById(R.id.eTAltura);
        BTcalcular=(Button) findViewById(R.id.btCalcular);
        TVresultado =(TextView) findViewById(R.id.tVResultado);
        peso=0;
        altura=0;
        resultado=0;

        BTcalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                peso= Float.parseFloat(ETpeso.getText().toString()) ;;
                altura=Float.parseFloat(ETaltura.getText().toString()) ;
                resultado=peso/(altura*altura);

                TVresultado.setText("" + resultado);


            }
        });



    }
}

/*
* IMC
* IMC= peso KG / (altura * altura) CM
*
*
*
*
* */