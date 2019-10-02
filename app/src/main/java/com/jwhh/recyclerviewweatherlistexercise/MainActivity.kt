package com.jwhh.recyclerviewweatherlistexercise

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*
import java.time.DayOfWeek
import java.util.*


class MainActivity : AppCompatActivity() {

    private val itemList: List<WeatherAdapter.WeatherItem>? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        weather_list.adapter = WeatherAdapter(generateData(days))
        weather_list.layoutManager = LinearLayoutManager(this)

    }

    fun generateData(days: Array<String>): List<WeatherAdapter.IRow> {
        val data = mutableListOf<WeatherAdapter.IRow>()
        var calendar = Calendar.getInstance()
        var day = calendar.get(Calendar.DAY_OF_WEEK)

        for (i in 0..13) {
            if(days[i].equals("Saturday"))
            {
                data.add(WeatherAdapter.AdvertItem("Advertisement"))
                data.add(WeatherAdapter.WeatherItem(R.drawable.temp_less_11, days[i], "31"))
            }
            else
                data.add(WeatherAdapter.WeatherItem(R.drawable.temp_less_11, days[i], "31"))
        }

        return data
    }

    val days = arrayOf("Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday")

}












