package com.gorrotowi.sebastiancv

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Button
import android.widget.EditText
import android.widget.LinearLayout
import android.widget.Toast
import de.hdodenhof.circleimageview.CircleImageView
import org.jetbrains.anko.imageResource
import org.jetbrains.anko.setContentView
import org.jetbrains.anko.toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val view = MainActivityUI().setContentView(this)

        val circleV = view.findViewById(R.id.imgProfile) as CircleImageView

        circleV.imageResource = R.drawable.pedrito

        val layout = LinearLayout(this)
        layout.orientation = LinearLayout.VERTICAL
        val name = EditText(this)
        val button = Button(this)
        button.text = getString(R.string.say_hello)
        button.setOnClickListener {
            Toast.makeText(this, "Hello, ${name.text}!", Toast.LENGTH_SHORT).show()
        }
        layout.addView(name)
        layout.addView(button)

    }

    fun sayHello() {
        toast("Hello dude")
    }
}
