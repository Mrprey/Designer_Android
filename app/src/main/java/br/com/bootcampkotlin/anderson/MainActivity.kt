package br.com.bootcampkotlin.anderson

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private val rvList: RecyclerView by lazy {
        findViewById<RecyclerView>(R.id.rv_list)
    }

    private val adapter = ContacteAdapter()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        bindViews()
        updateList()
    }

    private fun bindViews(){
        rvList.adapter = this.adapter
        rvList.layoutManager = LinearLayoutManager(this)
    }


    private fun updateList(){
        adapter.updateList(arrayListOf(
            Contacte(
            "Lívia", "(82) 00000-0000", "test"
        ),
            Contacte(
                    "Lívia", "(82) 00000-0000", "test"
            )
        ))
    }
}