package pe.edu.upeu.class_two

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.AdapterView
import android.widget.LinearLayout
import android.widget.ListView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    var scheduleList= mutableListOf<ScheduleModel>()
    lateinit var recycler:RecyclerView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recycler = findViewById(R.id.listview_main_principal)
        recycler.layoutManager= LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false)

        for(i in 1..20){
            var schedule = ScheduleModel("ola","ola","ola","Marselo","ola")
            scheduleList.add(schedule)
        }

        var adapter = ScheduleAdapter(scheduleList)

        recycler.adapter=adapter

    }
}