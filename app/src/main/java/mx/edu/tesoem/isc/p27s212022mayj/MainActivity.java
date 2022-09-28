package mx.edu.tesoem.isc.p27s212022mayj;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText txtnum1,txtnum2;
    Button btnmas, btnmenos, btnmulti, btndiv;
    TextView lbresult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtnum1= findViewById(R.id.txtnum1);
        txtnum2= findViewById(R.id.txtnum2);

        lbresult= findViewById(R.id.lbresult);

        btnmas= findViewById(R.id.btnmas);
        btnmenos= findViewById(R.id.btnmenos);
        btnmulti= findViewById(R.id.btnmulti);
        btndiv= findViewById(R.id.btndiv);

        btnmas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try{
                    int num1 = Integer.parseInt(txtnum1.getText().toString());
                    int num2 = Integer.parseInt(txtnum2.getText().toString());
                    lbresult.setText(lbresult.getText().toString() + " " + String.valueOf(num1 + num2));
                }catch (NumberFormatException ex){
                    lbresult.setText("No se han colocado numeros validos");
                }
            }
        });
        btnmenos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    int num1 = Integer.parseInt(txtnum1.getText().toString());
                    int num2 = Integer.parseInt(txtnum2.getText().toString());
                    lbresult.setText(lbresult.getText().toString() + " " + String.valueOf(num1 - num2));
                }catch (NumberFormatException ex){
                    lbresult.setText("No se han colocado numeros validos");
                }
            }
        });
        btnmulti.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    int num1 = Integer.parseInt(txtnum1.getText().toString());
                    int num2 = Integer.parseInt(txtnum2.getText().toString());
                    lbresult.setText(lbresult.getText().toString() + " " + String.valueOf(num1 * num2));

                }catch (NumberFormatException ex){
                    lbresult.setText("No se han colocado numeros validos");
                }

            }
        });
        btndiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                try {
                    int num1 = Integer.parseInt(txtnum1.getText().toString());
                    int num2 = Integer.parseInt(txtnum2.getText().toString());
                    lbresult.setText(lbresult.getText().toString() + " " + String.valueOf(num1 / num2));
                }catch (ArithmeticException ex){
                    lbresult.setText(lbresult.getText().toString()+" Error, No se puede dividir entre 0");
                }catch (NumberFormatException ex){
                    lbresult.setText("No se han colocado numeros validos");
                }


            }
        });
    }
}