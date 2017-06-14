package com.example.gusdanan.coba;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText password;
    EditText username;
    Button login;
    Button register;

    String uname = "edo";
    String pass = "coba";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        username = (EditText)findViewById(R.id.username);
        password = (EditText)findViewById(R.id.pass);
        login = (Button)findViewById(R.id.login);
        register = (Button)findViewById(R.id.register);

        login.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                validasi();
            }
        });
    }

    private void validasi() {
        String inputuser = username.getText().toString();
        String inputpass = password.getText().toString();

        if (inputuser.equals(uname) && inputpass.equals(pass)) {
            Toast.makeText(this, "Berhasil", Toast.LENGTH_SHORT).show();
        }else{
            Toast.makeText(this, "Gagal", Toast.LENGTH_SHORT).show();
        }
    }
}
