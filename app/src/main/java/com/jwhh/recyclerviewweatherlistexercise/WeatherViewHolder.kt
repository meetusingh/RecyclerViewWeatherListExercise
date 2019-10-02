package com.jwhh.recyclerviewweatherlistexercise

import android.support.v7.widget.RecyclerView
import android.view.View
import android.widget.ImageView
import android.widget.TextView

class WeatherViewHolder (itemView: View) : RecyclerView.ViewHolder(itemView){
    var weatherImage : ImageView = itemView.findViewById(R.id.weather_icon)
    val weatherDay : TextView = itemView.findViewById(R.id.day)
    val weatherTemp : TextView = itemView.findViewById(R.id.temperature)
}