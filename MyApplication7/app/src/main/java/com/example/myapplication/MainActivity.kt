package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val list = ArrayList<DataFriends>()
        for(i in 1..100 step 5) {
            list.add(DataFriends(i,"뽀또", "1000원"))
            list.add(DataFriends(i+1,"빠다코코낫", "1500원"))
            list.add(DataFriends(i+2,"치토스", "2000원"))
            list.add(DataFriends(i+3,"맛동산", "2500원"))
            list.add(DataFriends(i+4,"프링글스", "3000원"))
        }




        val adapter = RecyclerAdapterFriends(list)
        xml_main_rv_friends.adapter = adapter
    }
}