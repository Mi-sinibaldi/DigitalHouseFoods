package com.example.digitalhousefoods.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.widget.Toolbar
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import com.example.digitalhousefoods.R
import com.example.digitalhousefoods.model.MenuPrincipal
import com.example.digitalhousefoods.ui.adapter.PrincialAdapter

class PrincipalActivity : AppCompatActivity() {

    private val menuPrincipal: MutableList<MenuPrincipal> = mutableListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_principal)

        val toolbar: Toolbar = findViewById(R.id.toolbarPrincipal)
        toolbar.title = "Digital House Foods"
        setSupportActionBar(toolbar)

        supportActionBar!!.setDisplayHomeAsUpEnabled(false)

        menuPrincipal.add(
            MenuPrincipal(
                R.drawable.image1,
                "Tony Roma's",
                "Av. Lavandisca, 717 - Indianópolis, São Paulo",
                "Fecha às 22:00"
            )
        )
        menuPrincipal.add(
            MenuPrincipal(
                R.drawable.image3,
                "Aoyama - Moema",
                "Alameda dos Arapanés, 532 - Moema",
                "Fecha às 00:00"
            )
        )
        menuPrincipal.add(
            MenuPrincipal(
                R.drawable.image4,
                "Outback - Moema",
                "Av. Moaci, 187, 187 - Moema, São Paulo",
                "Fecha às 00:00"
            )
        )
        menuPrincipal.add(
            MenuPrincipal(
                R.drawable.image5,
                "Sí Señor!",
                "Alameda Jauaperi, 626 - Moema",
                "Fecha às 01:00"
            )
        )
        menuPrincipal.add(
            MenuPrincipal(
                R.drawable.image4,
                "Nonna di Lucca - Moema",
                "Rua Gaivota, 689",
                "Fecha às 01:00"
            )
        )
        menuPrincipal.add(
            MenuPrincipal(
                R.drawable.image1,
                "Super Pizza Pan Morumbi",
                " Rua Mal. Hastimphilo de Moura, 277",
                "Fecha às 01:00"
            )
        )

        val recyclerView: RecyclerView = findViewById(R.id.recyclerViewMenuPrincipal)

        recyclerView.adapter =
            PrincialAdapter(
                menuPrincipal.toList(),
                this
            )
        val layoutManager = StaggeredGridLayoutManager(1, StaggeredGridLayoutManager.VERTICAL)
        recyclerView.layoutManager = layoutManager
    }
}