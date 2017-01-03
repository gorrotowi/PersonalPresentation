package com.gorrotowi.sebastiancv

import org.jetbrains.anko.*

/**
 * Created by Gorro on 02/01/17.
 */
class MainActivityUI : AnkoComponent<MainActivity> {
    override fun createView(ui: AnkoContext<MainActivity>) = with(ui) {
        verticalLayout {
            textView("Start CV")
        }
    }

}