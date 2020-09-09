package com.example.loginapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    var user1 = User("Batjargal", "Narantuya", "myracler1@gmail.com", "metroexpress")
    var user2 = User("John", "Legend", "john@gmail.com", "123")
    var user3 = User("Brad", "Pitt", "brad@gmail.com", "123")
    var user4 = User("Smighoul", "Precious", "smig@gmail.com", "123")
    var user5 = User("Enke", "Kim", "enke@gmail.com", "123")
    var users = mutableListOf<User>(user1,user2,user3,user4,user5)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        signIn.setOnClickListener {
            val email = emailInput.text.toString()
            val password = passwordInput.text.toString()

            var user = users.find {
                it.email == email && it.password == password
            }
            if(user == null) Toast.makeText(this, "Incorrect password", Toast.LENGTH_LONG).show()
            else Toast.makeText(this,user.firstname+" " + user.lastname, Toast.LENGTH_SHORT).show()
        }
    }
}