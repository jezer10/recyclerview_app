package pe.edu.upeu.class_two

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.AdapterView
import android.widget.EditText
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ScheduleAdapter : RecyclerView.Adapter<ScheduleAdapter.ScheduleViewHolder> {
    var scheduleList: MutableList<ScheduleModel>

    constructor(scheduleList: MutableList<ScheduleModel>) {
        this.scheduleList = scheduleList
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ScheduleViewHolder {
        var view: View = LayoutInflater.from(parent.context)
            .inflate(R.layout.activity_schedule_component, parent, false)
        return ScheduleViewHolder(view)
    }

    override fun onBindViewHolder(holder: ScheduleViewHolder, position: Int) {
        holder.asignarDato(scheduleList.get(position))
    }

    override fun getItemCount(): Int {
        return scheduleList.size
    }

    class ScheduleViewHolder : RecyclerView.ViewHolder {
        var title: TextView


        fun asignarDato(dato:ScheduleModel) {
            this.title.text = dato.title


        }

        constructor(itemView: View) : super(itemView) {
            title = itemView.findViewById(R.id.textview_item_schedule_title)
        }

    }
}