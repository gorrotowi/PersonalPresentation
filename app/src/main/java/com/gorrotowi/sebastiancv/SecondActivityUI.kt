package com.gorrotowi.sebastiancv

import android.support.v7.widget.LinearLayoutManager
import android.view.Gravity
import android.widget.ImageView
import org.jetbrains.anko.*
import org.jetbrains.anko.recyclerview.v7.recyclerView

/**
 * Created by Gorro on 09/01/17.
 */
class SecondActivityUI : AnkoComponent<SecondActivity> {
    override fun createView(ui: AnkoContext<SecondActivity>) = with(ui) {
        verticalLayout {
            circleImageView {
                imageResource = R.drawable.pedrito
                scaleType = ImageView.ScaleType.CENTER_CROP
                if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.LOLLIPOP) {
                    transitionName = resources.getString(R.string.imgTransition)
                }
                this@verticalLayout.gravity = Gravity.CENTER_HORIZONTAL
            }.lparams(width = dip(200), height = dip(200)) {
                margin = dip(40)
            }
            recyclerView {
                id = R.id.rcView
                layoutManager = LinearLayoutManager(ctx, LinearLayoutManager.VERTICAL, false)
            }.lparams(width = matchParent, height = matchParent)
        }
    }
}