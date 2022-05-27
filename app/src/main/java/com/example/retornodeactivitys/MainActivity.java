package com.example.retornodeactivitys;

import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button btn1;
    private Button btn2;
    private Button btn3;
    private TextView lblVolta;
    private TextView lblRes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn1 = findViewById( R.id.btn1);
        btn2 = findViewById( R.id.btn2);
        btn3 = findViewById( R.id.btn3);
        lblVolta = findViewById( R.id.lblVolta);
        lblRes = findViewById( R.id.lblRes);

        EscutadorBotao e = new EscutadorBotao();
        btn1.setOnClickListener(e);
        btn2.setOnClickListener(e);
        btn3.setOnClickListener(e);
    }

    private class EscutadorBotao implements View.OnClickListener {

        @Override
        public void onClick(View view) {
            Button b = (Button) view;

            switch (b.getId()){
                case R.id.btn1:

                    Intent i1 = new Intent(getApplicationContext(), UmActivity.class);
                    startActivityForResult(i1, 1);

                    break;

                case R.id.btn2:

                    Intent i2 = new Intent(getApplicationContext(), DoisActivity.class);
                    startActivityForResult(i2, 2);

                    break;

                case R.id.btn3:

                    Intent i3 = new Intent(getApplicationContext(), TresActivity.class);
                    startActivityForResult(i3, 3);

                    break;

            }
        }
    }

    public void onActivityResult(int requestCode, int resultCode, Intent i) {

        super.onActivityResult(requestCode, resultCode, i);

        switch (requestCode){
            case 1:
                lblVolta.setText("1");

                if (resultCode == RESULT_OK){
                    lblRes.setText("Ok");
                } else {
                    lblRes.setText("[voltar]");
                }
                break;

            case 2:
                lblVolta.setText("2");

                if (resultCode == RESULT_OK){
                    lblRes.setText("Ok");
                } else {
                    lblRes.setText("[voltar]");
                }
                break;

            case 3:
                lblVolta.setText("3");

                if (resultCode == RESULT_OK){
                    lblRes.setText("Ok");
                } else {
                    lblRes.setText("[voltar]");
                }
                break;
        }
    }
}