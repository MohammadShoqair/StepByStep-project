package com.example.stepbystep.activities.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.ListView
import com.example.stepbystep.R

class InfoActivity : AppCompatActivity() {
    lateinit var listv:ListView

    lateinit var adabter:ArrayAdapter<String>
    var data= arrayOf("Courses","Employees")


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_info)
        listv=findViewById(R.id.lV)
        adabter= ArrayAdapter(this,android.R.layout.simple_list_item_1,data)
        listv.adapter=adabter

        listv.onItemClickListener=object :AdapterView.OnItemClickListener{
            override fun onItemClick(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {

                if (p2==0)
                {
                    startActivity(Intent(this@InfoActivity,
                        RecActivity::class.java))
                }
            }
        }

    }
}