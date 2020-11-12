package com.example.digitalhousefoods.ui

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import com.example.digitalhousefoods.R
import com.example.digitalhousefoods.domain.User

class LoginActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val toolbar: Toolbar = findViewById(R.id.toolbarPrincipal)
        toolbar.title = "Digital House Foods"
        setSupportActionBar(toolbar)

        supportActionBar!!.setDisplayHomeAsUpEnabled(false)

        clickBtnRegister()
        clickBtnLogin()

    }

    private fun clickBtnLogin() {
        val btnLogin: Button = findViewById<View>(R.id.btnLogin) as Button
        val editTexUserLogin: EditText = findViewById(R.id.editTexUserLogin)
        val editTextPasswordLogin: EditText = findViewById(R.id.editTextPasswordLogin)

        btnLogin.setOnClickListener {
            if (editTexUserLogin.text.isNotEmpty() && editTextPasswordLogin.text.isNotEmpty()) {
                startActivity(Intent(this@LoginActivity, PrincipalActivity::class.java))
            } else {
                Toast.makeText(this, "Email e senha não podem ser vazios", Toast.LENGTH_SHORT)
                    .show()

            }
        }
    }

    private fun clickBtnRegister() {
        val btnRegister: Button = findViewById<View>(R.id.btnRegister) as Button
        btnRegister.setOnClickListener {
            startActivity(Intent(this@LoginActivity, RegisterActivity::class.java))
        }
    }
}