package com.example.myapplication

import android.system.Os.bind
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.list_friends.view.*

class RecyclerAdapterFriends(private val items:ArrayList<DataFriends>) : RecyclerView.Adapter<RecyclerAdapterFriends.ViewHolder>() {

    override fun getItemCount(): Int = items.size

    override fun onBindViewHolder(holder: RecyclerAdapterFriends.ViewHolder, position: Int) {
        val item = items[position]
        val listener = View.OnClickListener { it ->
            Toast.makeText(it.context, "Clicked:" + item.strName, Toast.LENGTH_SHORT).show()
        }
        holder.apply {
            bind(listener, item)
            itemView.tag = item
        }
    }

        override fun onCreateViewHolder( parent: ViewGroup, viewType: Int): RecyclerAdapterFriends.ViewHolder {
            val inflatedView = LayoutInflater.from(parent.context).inflate(R.layout.list_friends, parent, false)
            return RecyclerAdapterFriends.ViewHolder(inflatedView)
        }

        class ViewHolder(v: View) : RecyclerView.ViewHolder(v) {
            private var view: View = v
            fun bind(listener: View.OnClickListener, item:DataFriends)

            {
                view.xml_lstfrd_txt_number.text = item.num.toString()
                view.xml_lstfrd_txt_name.text = item.strName
                view.xml_lstfrd_txt_price.text = item.strPrice
                view.setOnClickListener(listener)
        }
    }
}