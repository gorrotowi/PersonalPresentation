package com.gorrotowi.sebastiancv

import android.app.Activity
import android.support.v4.app.ActivityCompat
import android.support.v4.app.ActivityOptionsCompat
import android.support.v4.util.Pair
import android.support.v7.widget.CardView
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.LinearLayout
import de.hdodenhof.circleimageview.CircleImageView
import kotlinx.android.synthetic.main.cardviewxml.view.*
import org.jetbrains.anko.*
import org.jetbrains.anko.cardview.v7.cardView

/**
 * Created by Gorro on 02/01/17.
 */
class MainActivityUI : AnkoComponent<MainActivity> {

    val id_appbar = 1
    val id_collapsing = 2

    override fun createView(ui: AnkoContext<MainActivity>) = with(ui) {
        linearLayout {

            verticalLayout {
                val name = editText()
                button("Say Hello") {
                    onClick { toast("Hello, ${name.text}!") }
                }
            }

            orientation = LinearLayout.VERTICAL
            val cardview = cardView {
                val containerCardview = linearLayout {
                    orientation = LinearLayout.VERTICAL

                    val profileimg = circleImageView {
                        id = R.id.imgProfile
                        imageResource = R.mipmap.ic_launcher
                        scaleType = ImageView.ScaleType.CENTER_CROP
                        if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.LOLLIPOP) {
                            transitionName = resources.getString(R.string.imgTransition)
                        }
                        borderColor = resources.getColor(R.color.colorPrimary)
                        borderWidth = dip(2)
                        onClick {
                            //                            ui.owner.sayHello()
                            val imgtransition = Pair<View, String>(it, resources.getString(R.string.imgTransition))
                            val options = ActivityOptionsCompat.makeSceneTransitionAnimation(ctx as Activity?, imgtransition)
                            ActivityCompat.startActivity(ctx, intentFor<SecondActivity>(), options.toBundle())
                        }
                    }.lparams(width = dip(96), height = dip(96)) {
                        margin = dip(10)
                    }
                }

            }.lparams(width = matchParent)
            include<CardView>(R.layout.cardviewxml) {
//                val img = this.findViewById(R.id.imgPedritoXML) as CircleImageView
//                img.borderColor = resources.getColor(R.color.colorAccent)
//                img.borderWidth = dip(2)≥.
                imgPedritoXML.borderColor = resources.getColor(android.R.color.holo_green_light)
                imgPedritoXML.borderWidth = dip(2)
            }.lparams(width = matchParent)
            include<CardView>(R.layout.cardviewxml) {
                val img = this.findViewById(R.id.imgPedritoXML) as CircleImageView
                img.borderColor = resources.getColor(R.color.colorAccent)
                img.borderWidth = dip(2)
            }.lparams(width = matchParent)
        }.applyRecursively { v ->
            when (v) {
                is CardView -> {
                    val params: ViewGroup.MarginLayoutParams = v.layoutParams as ViewGroup.MarginLayoutParams
                    params.setMargins(dip(16), dip(16), dip(16), dip(0))
                    v.requestLayout()


                }
            }
        }


    }

}