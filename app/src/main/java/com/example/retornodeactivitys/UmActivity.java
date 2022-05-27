package com.example.retornodeactivitys;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class UmActivity extends AppCompatActivity {

    private Button btnOk;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_um);

        btnOk = findViewById( R.id.btnOk);

        btnOk.setOnClickListener( new EscutadorOk());
    }

    private class EscutadorOk implements View.OnClickListener {

        @Override
        public void onClick(View view) {

            Intent i = new Intent();

            setResult(RESULT_OK, i);

            finish();
            //onBackPressed();

        }
    }
}