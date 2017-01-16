package com.gorrotowi.sebastiancv

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.RecyclerView
import org.jetbrains.anko.setContentView

class SecondActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val view = SecondActivityUI().setContentView(this)

        val rcv: RecyclerView = view.findViewById(R.id.rcView) as RecyclerView
        val data = mutableListOf<ItemRC>()
        data.add(ItemRC("Android"))
        data.add(ItemRC("Lollipop"))
        data.add(ItemRC("Kitkat"))
        data.add(ItemRC("Marshmallow"))
        data.add(ItemRC("Nougat"))
        val adapter: AdapterRC = AdapterRC(data)
        rcv.adapter = adapter

        val suma = 4.add(6)
    }

    fun Int.add(y: Int) = this + y
}
