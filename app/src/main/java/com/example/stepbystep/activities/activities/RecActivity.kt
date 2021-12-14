package com.example.stepbystep.activities.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.stepbystep.R
import com.example.stepbystep.activities.model.Courses
import com.stepbystep_tc.rvkotlin.RecycleAdapter

class RecActivity : AppCompatActivity() {
     lateinit var rec:RecyclerView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_rec)

        rec=findViewById(R.id.recy)
        rec.layoutManager = GridLayoutManager(this, 2)

        var a = RecycleAdapter(this,prepArray())
        rec.adapter = a



    }


    private fun prepArray():ArrayList<Courses>{
        val arr:ArrayList<Courses> = ArrayList()

        var c1=Courses()
        c1.name="Android"
        c1.img=R.drawable.android
        c1.info="دورة الاندرويد بواقع 86 ساعة تدريبية,تدريب عملي يقدمها لكم المهندس مهند ملحيس"
        c1.price="350 JOD"
        arr.add(c1)
        var c2=Courses()
        c2.name="Asp.net"
        c2.img=R.drawable.asp
        c2.info="بواقع 80 ساعة تدريبية Aspدورة الـ"
        c2.price="200 JOD"
        arr.add(c2)

        return arr
    }

}