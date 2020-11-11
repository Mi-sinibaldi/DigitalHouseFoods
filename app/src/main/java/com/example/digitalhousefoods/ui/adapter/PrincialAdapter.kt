package com.example.digitalhousefoods.ui.adapter

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView
import com.example.digitalhousefoods.R
import com.example.digitalhousefoods.model.MenuPrincipal
import com.example.digitalhousefoods.ui.DetailMenuActivity

class PrincialAdapter(
    private val menuPrincipal: List<MenuPrincipal>,
    private val context: Context
) : RecyclerView.Adapter<PrincialAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(context).inflate(
            R.layout.principal_adapter,
            parent, false
        )

        return ViewHolder(
            view
        )
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = menuPrincipal[position]
        holder.bind(item)

        holder.itemView.setOnClickListener {
            ItemClick(item)
        }
    }

    override fun getItemCount(): Int {
        return menuPrincipal.size
    }

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        private val image = itemView.findViewById<ImageView>(R.id.imageViewDetail)
        private val title = itemView.findViewById<TextView>(R.id.textViewDetail)
        private val address = itemView.findViewById<TextView>(R.id.textViewAddress)
        private val hours = itemView.findViewById<TextView>(R.id.textViewHours)

        fun bind(menuPrincipal: MenuPrincipal) {
            image.setImageResource(menuPrincipal.image)
            title.text = menuPrincipal.title
            address.text = menuPrincipal.address
            hours.text = menuPrincipal.hours
        }
    }

    fun ItemClick(menuPrincipal: MenuPrincipal) {
        val detailMenu =
            Intent(context, DetailMenuActivity::class.java)

        ContextCompat.startActivity(context, detailMenu, null)
    }

}