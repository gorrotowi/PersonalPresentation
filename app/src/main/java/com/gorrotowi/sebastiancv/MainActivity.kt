package com.gorrotowi.sebastiancv

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.text.Html
import kotlinx.android.synthetic.main.content_sheet_dialog.*
import org.jetbrains.anko.browse
import org.jetbrains.anko.email

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_layout)

        txtProfilePosition.text = Html.fromHtml("Mobile Leader at <u>Chilangolabs</u>")

        txtProfilePosition.setOnClickListener {
            browse("https://chilangolabs.com/")
        }

        txtProfileEmail.setOnClickListener {
            email(email = "sebastian@chilangolabs.com", subject = "Mobile Development Consult", text = "Hi Sebastian\n")
        }

    }

}
