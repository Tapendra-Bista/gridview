package com.example.griddview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.GridView
import android.widget.Toast
@SuppressWarnings("unused")


class MainActivity : AppCompatActivity() {
    private  lateinit var  mygridView:GridView

  private  var arrayName = ArrayList<String>()
  private  var arrayImage = ArrayList<Int>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        mygridView = findViewById(R.id.gridview_id)

        arrayItems()
        val myadapter = AdapterClass(arrayName,arrayImage,applicationContext)
  mygridView.adapter = myadapter
mygridView.setOnItemClickListener{adapterview,
    View,
    position,
    id->
    val name:String  =  adapterview.getItemAtPosition(position).toString()
        Toast.makeText(applicationContext,"This is a $name",Toast.LENGTH_SHORT).show()
}

    }
    private fun arrayItems (){
        arrayImage.add(R.drawable.bike)
        arrayImage.add(R.drawable.car)
        arrayImage.add(R.drawable.cat)
        arrayImage.add(R.drawable.dog)
        arrayImage.add(R.drawable.goat)
        arrayImage.add(R.drawable.horse)
        arrayImage.add(R.drawable.lion)
        arrayImage.add(R.drawable.monkey)
        arrayImage.add(R.drawable.racoon)
        arrayImage.add(R.drawable.tiger)
        arrayName.add("Bike")
        arrayName.add("Car")
        arrayName.add("Cat")
        arrayName.add("Dog")
        arrayName.add("Goat")
        arrayName.add("Horse")
        arrayName.add("Lion")
        arrayName.add("Monkey")
        arrayName.add("Racoon")
        arrayName.add("Tiger")

}

}