package com.ttn.mvp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import static android.widget.Toast.LENGTH_SHORT;

public class LoginActivity extends AppCompatActivity implements LoginView {

    private EditText usernameView;
    private EditText passwordView;
    private LoginPresenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        usernameView = (EditText) findViewById(R.id.username);
        passwordView = (EditText) findViewById(R.id.password);
        presenter = new LoginPresenter(this, new LoginService());
    }

    public void onLoginClicked(View view) {
        presenter.onLoginClicked();
    }

    @Override
    public String getUsername() {
        return usernameView.getText().toString();
    }

    @Override
    public void showUsernameError(int resId) {
        Toast.makeText(this, getString(R.string.username_error), LENGTH_SHORT).show();
    }

    @Override
    public String getPassword() {
        return passwordView.getText().toString();
    }

    @Override
    public void showPasswordError(int resId) {
        Toast.makeText(this, getString(R.string.password_error), LENGTH_SHORT).show();
    }

    @Override
    public void startMainActivity() {
        Toast.makeText(this, "Login Successfully", LENGTH_SHORT).show();
    }

    @Override
    public void showLoginError(int resId) {
        Toast.makeText(this, getString(resId), LENGTH_SHORT).show();
    }
}
