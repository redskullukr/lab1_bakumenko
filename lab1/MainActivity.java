// LoginActivity.java
package stu.cn.ua.lab1_bogdan_bakumenko;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private EditText editTextLogin;
    private EditText editTextPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextLogin = findViewById(R.id.editTextLogin);
        editTextPassword = findViewById(R.id.editTextPassword);
    }

    public void login(View view) {
        String login = editTextLogin.getText().toString();
        String password = editTextPassword.getText().toString();

        if (isValidLogin(login) && isValidPassword(password)) {
            Intent intent = new Intent(this, GameActivity.class);
            intent.putExtra("LOGIN_NAME", login);
            startActivity(intent);
        } else {
            Toast.makeText(this, "Невірний логін або пароль", Toast.LENGTH_SHORT).show();
        }
    }

    private boolean isValidLogin(String login) {
        return login.equals("admin");
    }

    private boolean isValidPassword(String password) {
        return password.equals("admin");
    }
}