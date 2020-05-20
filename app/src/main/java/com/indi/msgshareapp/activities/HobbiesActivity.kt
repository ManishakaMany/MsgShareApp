package com.indi.msgshareapp.activities

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.indi.msgshareapp.adapters.HobbiesAdapter
import com.indi.msgshareapp.R
import com.indi.msgshareapp.models.Supplier
import kotlinx.android.synthetic.main.activity_hobbies.*

class HobbiesActivity : AppCompatActivity(){

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hobbies)
        setupRecyclerView()
    }

    private fun setupRecyclerView(){
        val layoutManager = LinearLayoutManager(this)
        //val layoutManager = GridLayoutManagerLayoutManager(this)
        //val layoutManager = StaggeredGridLayoutManager(this)
        layoutManager.orientation = LinearLayoutManager.VERTICAL
        recyclerView.layoutManager = layoutManager
        val adapter = HobbiesAdapter(this,Supplier.hobbies)
        recyclerView.adapter = adapter
    }
}
