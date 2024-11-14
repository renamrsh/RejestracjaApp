package com.example.rejestracjaapp;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    private Button btn;
    private EditText email, password, password2;
    private TextView info;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn = findViewById(R.id.btn);
        email = findViewById(R.id.email);
        password = findViewById(R.id.password);
        password2 = findViewById(R.id.password2);
        info = findViewById(R.id.info);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text1 = password.getText().toString();
                String text2 = password2.getText().toString();
                String emailText = email.getText().toString();
                if(!emailText.contains("@")) {
                    info.setText("Nieprawidłowy adres e-mail");
                } else if(!text1.equals(text2)){
                    info.setText("Hasła się róznią");
                } else {
                    info.setText("Witaj "+ emailText);
                }
            }
        });
    }
}