package com.example.griddview

import android.annotation.SuppressLint
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView

class AdapterClass  (private var  arrayName:ArrayList<String>,
                     private var  arrayImage: ArrayList<Int>,
                     var context: Context): BaseAdapter() {

    override fun getCount(): Int {
       return  arrayName.size
    }

    override fun getItem(p0: Int): Any? {
        return  null
    }

    override fun getItemId(p0: Int): Long {
        return  0
    }

    @SuppressLint("ViewHolder")
    override fun getView(position: Int, convertview: View?, parent: ViewGroup?): View{
       val view:View = LayoutInflater.from(parent!!.context)
           .inflate(R.layout.secondlayout,parent,false)

        val animalName : TextView = view.findViewById(R.id.textview_id)
        val animalImage : ImageView = view.findViewById(R.id.imageview_id)
animalName.text = arrayName[position]
        animalImage.setImageResource(arrayImage[position])
return  view
    }


}