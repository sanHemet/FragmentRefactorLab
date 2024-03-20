package edu.temple.fragmentrefactor

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val displayFragment = DisplayFragment()

        val fragmentTransaction = supportFragmentManager.beginTransaction()

        fragmentTransaction.add(R.id.fragmentContainerView, displayFragment)

        fragmentTransaction.commit()
    }
}