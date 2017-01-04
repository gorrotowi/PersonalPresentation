package com.gorrotowi.sebastiancv

import android.content.Context
import android.widget.ImageView
import android.widget.LinearLayout
import org.jetbrains.anko.*
import org.jetbrains.anko.cardview.v7.cardView

/**
 * Created by Gorro on 02/01/17.
 */
class MainActivityUI(val context: Context) : AnkoComponent<MainActivity> {

    val id_appbar = 1
    val id_collapsing = 2

    override fun createView(ui: AnkoContext<MainActivity>) = with(ui) {
        linearLayout {
            orientation = LinearLayout.VERTICAL
            cardView {
                linearLayout {
                    orientation = LinearLayout.VERTICAL
                    imageView {
                        imageResource = R.mipmap.ic_launcher
                        scaleType = ImageView.ScaleType.CENTER_CROP
                    }.lparams(width = dip(96), height = dip(96))
                }

            }.lparams(width = matchParent) {
                padding = dip(10)
                margin = dip(16)
            }

//            cardView {
//                linearLayout {
//                    orientation = LinearLayout.VERTICAL
//                    linearLayout {
//                        gravity = Gravity.CENTER_VERTICAL
//                        orientation = LinearLayout.HORIZONTAL
//
//                        imageView {
//                            imageResource = R.mipmap.ic_launcher
//                            scaleType = ImageView.ScaleType.CENTER_CROP
//                        }.lparams(width = dip(0), height = wrapContent, weight = 1f)
//
//                        verticalLayout {
//                            textView("Hello text 1")
//                            textView("Hello text 2")
//                        }.lparams(width = dip(0), height = wrapContent, weight = 2f)
//
//                    }.lparams(width = matchParent, height = matchParent)
//                }.lparams(width = matchParent, height = wrapContent)
//            }.lparams {
//                margin = dip(16)
//                padding = dip(10)
//            }
        }


    }

}