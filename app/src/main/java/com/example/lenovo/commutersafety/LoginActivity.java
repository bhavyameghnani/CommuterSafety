package com.example.lenovo.commutersafety;

import android.app.ProgressDialog;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class LoginActivity extends AppCompatActivity implements View.OnClickListener {

    private Button buttonLogin;
    private EditText editTextUserID;
    private EditText editTextUserPassword;
    private TextView textViewRegister;
    private ProgressDialog progressDialog;
    private FirebaseAuth firebaseAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        firebaseAuth = FirebaseAuth.getInstance();

        if(firebaseAuth.getCurrentUser()!=null){
            finish();
            startActivity(new Intent(getApplicationContext() , MainActivity.class));
        }

        progressDialog = new ProgressDialog(this);

        buttonLogin = (Button)findViewById(R.id.userLogIN);
        editTextUserID = (EditText)findViewById(R.id.editTextUserID);
        editTextUserPassword=(EditText)findViewById(R.id.editTextUserPassword);
        textViewRegister = (TextView)findViewById(R.id.textViewRegister);

        buttonLogin.setOnClickListener(this);
        textViewRegister.setOnClickListener(this);
    }

    private void logInUser(){
        String email = editTextUserID.getText().toString().trim();
        String password = editTextUserPassword.getText().toString().trim();

        if(TextUtils.isEmpty(email)){
            Toast.makeText(this, "Please Enter Your Email Id", Toast.LENGTH_SHORT).show();
            return;
        }

        if(TextUtils.isEmpty(password)){
            Toast.makeText(this, "Please Enter Password To Continue", Toast.LENGTH_SHORT).show();
            return;
        }

        progressDialog.setMessage("LogIn , Please wait .....");
        progressDialog.show();

        firebaseAuth.signInWithEmailAndPassword(email,password).addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
            @Override
            public void onComplete(@NonNull Task<AuthResult> task) {
                progressDialog.dismiss();

                if(task.isSuccessful()){
                    finish();
                    startActivity(new Intent(getApplicationContext() , MainActivity.class));
                }

            }
        });
    }

    @Override
    public void onClick(View v) {

        if(v == buttonLogin){
            logInUser();
        }
        if(v == textViewRegister){
            finish();
            startActivity(new Intent(this , RegisterActivity.class));
        }

    }
}

