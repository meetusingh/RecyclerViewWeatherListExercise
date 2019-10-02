package com.jwhh.recyclerviewweatherlistexercise

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.weather_list_item.view.*

class WeatherAdapter(val dayItems: ArrayList<String>, val temperatureItems: ArrayList<Int>,  val context: Context) : RecyclerView.Adapter<WeatherViewHolder>() {

    override fun onBindViewHolder(holder: WeatherViewHolder, position: Int) {
        holder.weatherDay.text =  dayItems.get(position)
        holder.weatherTemp.text =  temperatureItems.get(position).toString()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): WeatherViewHolder {
        return WeatherViewHolder(LayoutInflater.from(context).inflate(R.layout.weather_list_item, parent, false))
    }

    override fun getItemCount(): Int {
        return dayItems.size
    }

}

class WeatherViewHolder (view: View) : RecyclerView.ViewHolder(view){
    var weatherImage = view.weather_icon
    val weatherDay = view.day
    val weatherTemp = view.temperature
}

class AdvertViewHolder (view: View) : RecyclerView.ViewHolder(view){
    var weatherImage = view.weather_icon
    val weatherDay = view.day
    val weatherTemp = view.temperature
}
