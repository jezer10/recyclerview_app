package pe.edu.upeu.class_two

class ScheduleModel {
    lateinit var hour:String
    lateinit var meridian:String
    lateinit var tag:String
    lateinit var title:String
    lateinit var exhibitor:String
    constructor(hour:String,meridian:String,tag:String,title:String,exhibitor:String){
        this.hour = hour
        this.meridian = meridian
        this.tag = tag
        this.title=title
        this.exhibitor=exhibitor
    }
}