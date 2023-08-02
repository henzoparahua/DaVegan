package br.com.etecia.davegan;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.android.material.textfield.TextInputEditText;


public class Login_activity extends AppCompatActivity {

    Button btnentrar;
    TextInputEditText txtusu, txtpass;
    TextView fyp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_layout);

        btnentrar = findViewById(R.id.btnentrar);
        txtusu = findViewById(R.id.txtusu);
        txtpass = findViewById(R.id.txtpass);
        fyp = findViewById(R.id.fyp);


        btnentrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), Menu_activity.class));
                finish();
            }
        });
    }
}