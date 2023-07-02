package com.example.hw14;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView tvVhod = findViewById(R.id.tv_vhod);
        TextView psw = findViewById(R.id.tv_psw);
        TextView qwert = findViewById(R.id.tv_qwert);
        TextView welcome = findViewById(R.id.welcome);
        EditText password = findViewById(R.id.et_password);
        EditText email = findViewById(R.id.et_email);
        Button button = findViewById(R.id.btn_button);

        password.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
                if (!password.getText().toString().isEmpty() && !email.getText().toString().isEmpty()) {
                    button.setBackgroundColor(getColor(R.color.orange));
                } else {
                    button.setBackgroundColor(Color.GRAY);
                }
            }
        });

        email.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
                if (!password.getText().toString().isEmpty() && !email.getText().toString().isEmpty()) {
                    button.setBackgroundColor(getColor(R.color.orange));
                } else {
                    button.setBackgroundColor(Color.GRAY);
                }
            }
        });

        button.setOnClickListener(view -> {
            if (email.getText().toString().equals("admin") && password.getText().toString().equals("admin")) {
                Toast.makeText(MainActivity.this, "Вы успешно зарегистрировались", Toast.LENGTH_SHORT).show();
                tvVhod.animate().alpha(0);
                psw.animate().alpha(0);
                email.animate().alpha(0);
                password.animate().alpha(0);
                button.animate().alpha(0);
                qwert.animate().alpha(0);

            } else {
                Toast.makeText(MainActivity.this, "Неправильный логин и пароль", Toast.LENGTH_SHORT).show();

            }
        });

    }
}