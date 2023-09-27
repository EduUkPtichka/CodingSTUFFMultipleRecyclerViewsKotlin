package com.example.codingstuffmultiplerecyclerviewskotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.codingstuffmultiplerecyclerviewskotlin.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var mList: ArrayList<DataItem>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.rvMainRecyclerView.setHasFixedSize(true)
        binding.rvMainRecyclerView.layoutManager = LinearLayoutManager(this)

        mList = ArrayList()
        prepareData()

        val adapter = MainAdapter(mList)
        binding.rvMainRecyclerView.adapter = adapter
    }

    private fun prepareData() {

        val bestSellerList = ArrayList<RecyclerItem>()
        bestSellerList.add(RecyclerItem(R.drawable.rv1, "fdfdfd",))
        bestSellerList.add(RecyclerItem(R.drawable.rv2, "fdfdfd",))
        bestSellerList.add(RecyclerItem(R.drawable.rv3, "fdfdfd",))
        bestSellerList.add(RecyclerItem(R.drawable.rv4, "fdfdfd",))

        val clothingList = ArrayList<RecyclerItem>()
        bestSellerList.add(RecyclerItem(R.drawable.rv1, "fdfdfd",))
        bestSellerList.add(RecyclerItem(R.drawable.rv2, "fdfdfd",))
        bestSellerList.add(RecyclerItem(R.drawable.rv3, "fdfdfd",))
        bestSellerList.add(RecyclerItem(R.drawable.rv4, "fdfdfd",))

        mList.add(DataItem(DataItemType.BEST_SELLER, bestSellerList))
        mList.add(DataItem(DataItemType.BANNER, Banner(R.drawable.rv1)))
        mList.add(DataItem(DataItemType.CLOTHING, clothingList))
        mList.add(DataItem(DataItemType.BANNER, Banner(R.drawable.bat1)))
        mList.add(DataItem(DataItemType.BEST_SELLER, bestSellerList.asReversed()))



    }





}