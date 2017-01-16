package com.gorrotowi.sebastiancv

import android.view.ViewManager
import de.hdodenhof.circleimageview.CircleImageView
import org.jetbrains.anko.custom.ankoView

/**
 * @author Gorrotowi
 */

//inline fun ViewManager.circleImageView(theme: Int = 0) = circleImageView(theme) { }

//inline fun ViewManager.circleImageView(theme: Int = 0, init: CircleImageView.() -> Unit) = ankoView({ circleImageView() }, theme, init)

inline fun ViewManager.circleImageView(theme: Int = 0) = circleImageView(theme) {}

inline fun ViewManager.circleImageView(theme: Int = 0, init: CircleImageView.() -> Unit) = ankoView(::CircleImageView, theme, init)

