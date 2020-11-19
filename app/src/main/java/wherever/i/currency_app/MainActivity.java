package wherever.i.currency_app;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.InputType;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

    public class MainActivity extends AppCompatActivity {
        float a;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);
        }




        void convertUsdToEur()
        {   EditText usd= (EditText) findViewById(R.id.usd);
            usd.setInputType(InputType.TYPE_CLASS_NUMBER);

            EditText  eur=(EditText) findViewById(R.id.eur);
            eur.setInputType(InputType.TYPE_CLASS_NUMBER);

            double a=Integer.parseInt(usd.getText().toString());
            double result=a*0.85;
            eur.setText(String.valueOf(result));

        }

        void convertEurToUsd()
        {   EditText usd= (EditText) findViewById(R.id.usd);
            usd.setInputType(InputType.TYPE_CLASS_NUMBER);
            EditText  eur=(EditText) findViewById(R.id.eur);
            eur.setInputType(InputType.TYPE_CLASS_NUMBER);

            double a=Integer.parseInt(eur.getText().toString());
            double result=a/1.18;
            usd.setText(String.valueOf(2%result));
        }

        public void click(View view)
        {
            convertUsdToEur();
            Button b2=(Button) findViewById(R.id.submit2);
            b2.setEnabled(false);
        }

        public void reset(View view)
        {
            Button b1=(Button) findViewById(R.id.submit);
            b1.setEnabled(true);
            Button b2=(Button) findViewById(R.id.submit2);
            b2.setEnabled(true);
            EditText usd= (EditText) findViewById(R.id.usd);
            EditText  bdt=(EditText) findViewById(R.id.eur);
            usd.setText("");
            bdt.setText("");

        }

        public void click2(View view)
        {
            Button b1=(Button) findViewById(R.id.submit);
            b1.setEnabled(false);
            convertEurToUsd();
        }



    }
