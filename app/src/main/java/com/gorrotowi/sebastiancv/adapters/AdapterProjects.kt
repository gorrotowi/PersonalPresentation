package com.gorrotowi.sebastiancv.adapters

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.gorrotowi.sebastiancv.R
import com.gorrotowi.sebastiancv.entitys.ItemProject
import kotlinx.android.synthetic.main.item_project.view.*
import org.jetbrains.anko.browse

/**
 * @author Gorro.
 */
class AdapterProjects(val data: List<ItemProject>) : RecyclerView.Adapter<AdapterProjects.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder =
            ViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.item_project, parent, false))

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bindView(data[position])
    }

    override fun getItemCount(): Int = data.size

    class ViewHolder(v: View) : RecyclerView.ViewHolder(v) {
        fun bindView(item: ItemProject) {
            itemView.let {view ->
                with(view) {
                    txtItemProject.text = item.name
                    imgItemProject.setImageResource(item.img)
                    setOnClickListener {
                        context.browse(item.urlProject)
                    }
                }
            }
        }
    }
}