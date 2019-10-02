package com.jwhh.recyclerviewweatherlistexercise

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import kotlinx.android.synthetic.main.weather_list_item.view.*
import java.lang.IllegalArgumentException

class WeatherAdapter(private val rows: List<IRow>) : RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    interface IRow

    data class WeatherItem(var imageId: Int, var day: String, var temperature: String) : IRow

    data class AdvertItem(var advertTitle: String?) : IRow

    companion object {
        private const val WEATHER_ROW = 0
        private const val ADVERT_ROW = 1
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int)= when (viewType) {

        WEATHER_ROW -> WeatherViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.weather_list_item, parent, false))
        ADVERT_ROW -> AdvertisementViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.advert_list_item, parent, false))
        else -> throw IllegalArgumentException()

    }

    override fun getItemViewType(position: Int): Int =
        when (rows[position]) {
            is WeatherItem -> WEATHER_ROW
            is AdvertItem -> ADVERT_ROW
            else -> throw IllegalArgumentException()
        }


    override fun getItemCount()= rows.count()


    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) =
        when (holder.itemViewType) {
            WEATHER_ROW -> onBindWeatherRow(holder, rows[position] as WeatherItem)
            ADVERT_ROW -> onBindAdvertRow(holder, rows[position] as AdvertItem)
            else -> throw IllegalArgumentException()
        }

    private fun onBindWeatherRow(holder: RecyclerView.ViewHolder, row: WeatherItem) {
        val weatherRow = holder as WeatherViewHolder
        weatherRow.weatherDay.text = row.day
        weatherRow.weatherTemp.text = row.temperature
        weatherRow.weatherImage.setImageResource(row.imageId)
    }

    private fun onBindAdvertRow(holder: RecyclerView.ViewHolder, row: AdvertItem) {
        val advertRow = holder as AdvertisementViewHolder
        advertRow.advertText.text = row.advertTitle
    }


}




