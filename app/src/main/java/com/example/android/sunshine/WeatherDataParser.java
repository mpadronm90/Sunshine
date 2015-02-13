package com.example.android.sunshine;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 * Created by Salomon on 12/02/2015.
 */
public class WeatherDataParser {
    
    public static double getMaxTemperatureForDay(String weatherJsonString, int dayIndex) throws JSONException{
        JSONObject weather = new JSONObject(weatherJsonString);
        JSONArray days = weather.getJSONArray("list");
        JSONObject dayInfo = days.getJSONObject(dayIndex);
        JSONObject temperatureInfo = dayInfo.getJSONObject("temp");
        return temperatureInfo.getDouble("max");
    }
}
