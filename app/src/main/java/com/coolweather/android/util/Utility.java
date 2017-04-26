package com.coolweather.android.util;

import android.text.TextUtils;
import com.coolweather.android.db.City;
import com.coolweather.android.db.County;
import com.coolweather.android.db.Province;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 * Created by zhongchunjie on 17/4/26.
 */

public class Utility {
    /**
     * 解析返回的省级数据
     */
    public static boolean handleProvinceResponse(String response){
        if(!TextUtils.isEmpty(response)){
            try {
                JSONArray provinces=new JSONArray(response);
                for(int index=0;index<provinces.length();index++){
                    JSONObject provinceObject=provinces.getJSONObject(index);
                    Province province=new Province();
                    province.setProvinceCode(provinceObject.getInt("id"));
                    province.setProvinceName(provinceObject.getString("name"));
                    province.save();
                }
                return true;
            } catch (JSONException e) {
                Log.e("解析省级数据报错",e.toString());
            }
        }
        return false;
    }
    /**
     * 解析返回的市级数据
     */
    public static boolean handleCityResponse(String response,int provinceId){
        if(!TextUtils.isEmpty(response)){
            try {
                JSONArray cities=new JSONArray(response);
                for(int index=0;index<cities.length();index++){
                    JSONObject cityObject=cities.getJSONObject(index);
                    City city=new City();
                    city.setCityCode(cityObject.getInt("id"));
                    city.setCityName(cityObject.getString("name"));
                    city.setProvinceId(provinceId);
                    city.save();
                }
                return true;
            } catch (JSONException e) {
                Log.e("解析市级数据报错",e.toString());
            }
        }
        return false;
    }
    /**
     * 解析返回的县级数据
     */
    public static boolean handleCountyResponse(String response,int cityId){
        if(!TextUtils.isEmpty(response)){
            try {
                JSONArray counties=new JSONArray(response);
                for(int index=0;index<counties.length();index++){
                    JSONObject countyObject=counties.getJSONObject(index);
                    County county=new County();
                    county.setWeatherId(countyObject.getString("weather_id"));
                    county.setCountyName(countyObject.getString("name"));
                    county.setCityId(cityId);
                    county.save();
                }
                return true;
            } catch (JSONException e) {
                Log.e("解析县级数据报错",e.toString());
            }
        }
        return false;
    }
}
