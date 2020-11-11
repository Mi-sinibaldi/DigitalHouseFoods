package com.example.digitalhousefoods.ui.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.digitalhousefoods.R
import com.example.digitalhousefoods.model.DetailMenu

class DetailMenuAdapter(
    private val detailMenu: List<DetailMenu>,
    private val context: Context
) : RecyclerView.Adapter<DetailMenuAdapter.ViewHolder>() {

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): ViewHolder {
        val view = LayoutInflater.from(context).inflate(
            R.layout.detail_menu_adapter,
            parent, false
        )
        return ViewHolder(
            view
        )
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = detailMenu[position]
        holder.bind(item)
    }

    override fun getItemCount(): Int {
        return detailMenu.size
    }

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        private val image = itemView.findViewById<ImageView>(R.id.imageViewDetail)
        private val title = itemView.findViewById<TextView>(R.id.textViewDetail)

        fun bind(detailMenu: DetailMenu) {
            image.setImageResource(detailMenu.image)
            title.text = detailMenu.title
        }
    }
}
