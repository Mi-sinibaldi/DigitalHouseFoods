package com.example.digitalhousefoods.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.digitalhousefoods.R
import com.example.digitalhousefoods.model.DetailMenu
import com.example.digitalhousefoods.model.MenuPrincipal
import com.example.digitalhousefoods.ui.adapter.DetailMenuAdapter
import com.example.digitalhousefoods.ui.adapter.PrincialAdapter

class DetailMenuActivity : AppCompatActivity() {

    private val detailMenu: MutableList<DetailMenu> = mutableListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_menu)

        detailMenu.add(DetailMenu(R.drawable.image1, "Salada com molho de gengibre"))
        detailMenu.add(DetailMenu(R.drawable.image1, "Salada com molho de gengibre"))
        detailMenu.add(DetailMenu(R.drawable.image1, "Salada com molho de gengibre"))
        detailMenu.add(DetailMenu(R.drawable.image1, "Salada com molho de gengibre"))
        detailMenu.add(DetailMenu(R.drawable.image1, "Salada com molho de gengibre"))
        detailMenu.add(DetailMenu(R.drawable.image1, "Salada com molho de gengibre"))
        detailMenu.add(DetailMenu(R.drawable.image1, "Salada com molho de gengibre"))
        detailMenu.add(DetailMenu(R.drawable.image1, "Salada com molho de gengibre"))

        val recyclerView: RecyclerView = findViewById(R.id.recyclerViewDetailMenu)

        recyclerView.layoutManager = GridLayoutManager(this, 2)

        recyclerView.adapter =
            DetailMenuAdapter(
                detailMenu.toList(),
                this
            )

        backPrincipal()
    }

    fun backPrincipal(){
      val imageButtonArrowBack: ImageButton = findViewById(R.id.imageButtonArrowBack)
        imageButtonArrowBack.setOnClickListener {
            startActivity(Intent(this, PrincipalActivity::class.java))
        }
    }
}