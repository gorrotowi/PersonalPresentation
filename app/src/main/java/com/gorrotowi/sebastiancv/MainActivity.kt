package com.gorrotowi.sebastiancv

import android.os.Bundle
import android.support.design.widget.BottomSheetBehavior
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import android.text.Html
import android.view.View
import android.view.animation.AnimationUtils
import android.view.animation.LayoutAnimationController
import com.gorrotowi.sebastiancv.adapters.AdapterProjects
import com.gorrotowi.sebastiancv.entitys.ItemProject
import kotlinx.android.synthetic.main.activity_main_layout.*
import kotlinx.android.synthetic.main.content_sheet_dialog.*
import org.jetbrains.anko.browse
import org.jetbrains.anko.email

class MainActivity : AppCompatActivity() {

    var bottomSheetBehavior: BottomSheetBehavior<View>? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_layout)

        rcProfileProjects.layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)

        val items = (0..7).map {
            ItemProject(R.drawable.ic_nothing, "Nothing", "https://play.google.com/store/apps/details?id=com.gorro.nothing")
        }

        bottomSheetBehavior = BottomSheetBehavior.from(btmsdProfile)
        viewColor.background.alpha = 60

        val layoutAnimator: LayoutAnimationController = AnimationUtils.loadLayoutAnimation(this, R.anim.layout_animation_down)
        rcProfileProjects.layoutAnimation = layoutAnimator
        viewQuote.layoutAnimation = layoutAnimator
        containerName.layoutAnimation = layoutAnimator
        val fadeAnim = AnimationUtils.loadAnimation(this, R.anim.item_animaton_down)
        txtProfilePosition.startAnimation(fadeAnim)
        txtProfileEmail.startAnimation(fadeAnim)
        txtProfileLocation.startAnimation(fadeAnim)

        val adapter = AdapterProjects(items)
        rcProfileProjects.adapter = adapter
        // 🤔

        txtProfilePosition.text = Html.fromHtml("Mobile Leader at <u>Chilangolabs</u>")

        txtProfilePosition.setOnClickListener {
            browse("https://chilangolabs.com/")
        }

        txtProfileEmail.setOnClickListener {
            email(email = "sebastian@chilangolabs.com", subject = "Mobile Development Consult", text = "Hi Sebastian\n")
        }
    }

    override fun onResume() {
        super.onResume()
        bottomSheetBehavior?.setBottomSheetCallback(object : BottomSheetBehavior.BottomSheetCallback() {
            override fun onSlide(bottomSheet: View, slideOffset: Float) {
                val alpha = (slideOffset * 255).toInt()
                if (alpha >= 60) {
                    viewColor.background.alpha = alpha
                }
            }

            override fun onStateChanged(bottomSheet: View, newState: Int) {

            }
        })
    }

}
