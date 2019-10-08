package com.jwhh.recyclerviewweatherlistexercise

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        weather_list.adapter = WeatherAdapter(generateData(days, temp))
        weather_list.layoutManager = LinearLayoutManager(this)

    }

    fun generateData(days: Array<String>, temp: Array<String>): List<WeatherAdapter.IRow> {
        val data = mutableListOf<WeatherAdapter.IRow>()

        for (i in 0..20) {
            if(days[i].equals("Saturday"))
            {
                data.add(WeatherAdapter.AdvertItem("Advertisement"))
            }
            data.add(WeatherAdapter.WeatherItem(getImage(temp[i]), days[i], temp[i]))
        }

        return data
    }

    // Start from today
    val days = arrayOf("Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday")

    // generate randon temperature
    val temp = arrayOf("31","12","23","11","09","39","42","23","12","19","20","25","34","31","23","12","19","20","25","34","31")

    // internal utility functions should be private
    fun getImage(temp: String): Int {

        val drawableResource = when(temp.toInt()){
            in 1..10 ->  R.drawable.temp_less_11
            in 11..20 -> R.drawable.temp_less_21
            in 21..30 -> R.drawable.temp_less_than_31
            in 31..40 -> R.drawable.temp_less_than_41
            else -> R.drawable.temp_less_11
        }

        return drawableResource
    }

}












