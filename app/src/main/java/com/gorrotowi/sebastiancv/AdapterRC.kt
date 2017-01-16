package com.gorrotowi.sebastiancv

import android.support.v7.widget.RecyclerView
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import org.jetbrains.anko.*

/**
 * Created by Gorro on 09/01/17.
 */
class AdapterRC(val data: List<ItemRC>) : RecyclerView.Adapter<AdapterRC.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int) =
            ViewHolder(ViewRecycler().createView(AnkoContext.Companion.create(parent!!.context, parent)))


    override fun onBindViewHolder(holder: ViewHolder?, position: Int) {
        holder!!.bind(data[position])
    }

    override fun getItemCount() = data.size


    class ViewHolder(itemView: View?) : RecyclerView.ViewHolder(itemView) {
        val name: TextView? = itemView?.find(R.id.txtRc)
        fun bind(itemRC: ItemRC) {
            name?.text = itemRC.name
        }
    }

    class ViewRecycler : AnkoComponent<ViewGroup> {
        override fun createView(ui: AnkoContext<ViewGroup>) = with(ui) {
            verticalLayout {
                textView {
                    id = R.id.txtRc
                    padding = dip(16)
                }
            }
        }

    }

}