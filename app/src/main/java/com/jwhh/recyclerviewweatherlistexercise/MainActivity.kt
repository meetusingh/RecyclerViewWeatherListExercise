package com.jwhh.recyclerviewweatherlistexercise

import android.annotation.SuppressLint
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*
import android.content.ClipData.Item
import android.media.Image
import android.widget.Button
import android.widget.ImageView


class MainActivity : AppCompatActivity() {

    val list_days: ArrayList<String> = ArrayList()
    val list_temperature: ArrayList<Int> = ArrayList()

    private val itemList: List<WeatherItem>? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        // Creates a vertical Layout Manager
        weather_list.layoutManager = LinearLayoutManager(this)
        weather_list.adapter = WeatherAdapter(list_days,list_temperature, this)

        adddays()
        addTemperature()

    }

    fun adddays(){
        list_days.add("Monday")
        list_days.add("Tuesday")
        list_days.add("Wednesday")
        list_days.add("Thursday")
        list_days.add("Friday")
        list_days.add("Saturday")
        list_days.add("Sunday")
        list_days.add("Monday")
        list_days.add("Tuesday")
        list_days.add("Wednesday")
        list_days.add("Thursday")
        list_days.add("Friday")
        list_days.add("Saturday")
        list_days.add("Sunday")
    }

    fun addTemperature(){
        list_temperature.add(31)
        list_temperature.add(1)
        list_temperature.add(21)
        list_temperature.add(11)
        list_temperature.add(21)
        list_temperature.add(31)
        list_temperature.add(30)
        list_temperature.add(26)
        list_temperature.add(31)
        list_temperature.add(31)
        list_temperature.add(29)
        list_temperature.add(19)
        list_temperature.add(31)
        list_temperature.add(30)
    }


}

