package com.example.digitalhousefoods.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.widget.Toolbar
import com.example.digitalhousefoods.R

class RegisterActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        val toolbar: Toolbar = findViewById(R.id.toolbarPrincipal)
        toolbar.title = "Register"
        setSupportActionBar(toolbar)

        supportActionBar!!.setDisplayHomeAsUpEnabled(true)

        clickBtnRegister()
    }

    private fun clickBtnRegister() {
        val buttonRegister: Button = findViewById<View>(R.id.buttonRegister) as Button
        val editTextNameRegister: EditText = findViewById(R.id.editTextNameRegister)
        val editTextEmailRegister: EditText = findViewById(R.id.editTextEmailRegister)
        val editTextPasswordRegister: EditText = findViewById(R.id.editTextPasswordRegister)
        val editTextReapetPasswordRegister: EditText =
            findViewById(R.id.editTextReapetPasswordRegister)

        buttonRegister.setOnClickListener {
            if (editTextNameRegister.text.isNotEmpty() && editTextEmailRegister.text.isNotEmpty()
                && editTextPasswordRegister.text.isNotEmpty() && editTextReapetPasswordRegister.text.isNotEmpty()
            ) {
                startActivity(Intent(this@RegisterActivity, LoginActivity::class.java))
            }else{
                Toast.makeText(this, "Todos os campos devem ser preenchidos!", Toast.LENGTH_SHORT)
                    .show()
            }

        }
    }
}