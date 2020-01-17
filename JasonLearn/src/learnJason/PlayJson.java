package learnJason;


import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import jdk.nashorn.internal.parser.JSONParser;

import java.io.*;
import java.net.URL;
import java.net.URLConnection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PlayJson {
    public static void main(String[] args) throws IOException {
 /*       java.lang.String u = "https://www.tianqiapi.com/api/?version=v1&cityid=101110101&appid=[87326859]&appsecret=[9iW1jrFe]";
        URL url = new URL(u);
        URLConnection urlConnection = url.openConnection();
        BufferedReader br = new BufferedReader(new InputStreamReader(urlConnection.getInputStream()));
        String s = null;
        char bt[] = new char[1024 * 1024];
        while ((s = br.readLine()) != null) {
            String s1 = String.valueOf(JSON.parse(s));

        }
        br.close();
从网上拿到天气数据
*/
        BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("D:\\java203\\Java_Study\\JasonLearn\\src\\learnJason\\weather.txt")));
        String s = br.readLine();
        Weather weather = JSON.parseObject(s, Weather.class);
        System.out.println(weather);
        JSONObject jsonObject = JSON.parseObject(s);
        JSONArray data = jsonObject.getJSONArray("data");
        for (int i = 0; i < data.size(); i++) {

            Data data1 = JSON.parseObject(data.get(i).toString(), Data.class);
            System.out.println(data1);
            JSONObject jsonObject1 = JSON.parseObject(data.get(i).toString());
            JSONArray hours = jsonObject1.getJSONArray("hours");
            List<Hours> hours1 = JSON.parseArray(hours.toString(), Hours.class);
            for (int j = 0; j < hours1.size(); j++) {
                System.out.println(hours.get(j));
            }
        }

    }
}


class Hours {
    private String wea;
    private String win_speed;
    private String day;
    private String tem;
    private String win;

    public Hours() {
    }

    public Hours(String wea, String win_speed, String day, String tem, String win) {
        this.wea = wea;
        this.win_speed = win_speed;
        this.day = day;
        this.tem = tem;
        this.win = win;
    }

    public String getWea() {
        return wea;
    }

    public void setWea(String wea) {
        this.wea = wea;
    }

    public String getWin_speed() {
        return win_speed;
    }

    public void setWin_speed(String win_speed) {
        this.win_speed = win_speed;
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public String getTem() {
        return tem;
    }

    public void setTem(String tem) {
        this.tem = tem;
    }

    public String getWin() {
        return win;
    }

    public void setWin(String win) {
        this.win = win;
    }

    @Override
    public String toString() {
        return "Hours{" +
                "wea='" + wea + '\'' +
                ", win_speed='" + win_speed + '\'' +
                ", day='" + day + '\'' +
                ", tem='" + tem + '\'' +
                ", win='" + win + '\'' +
                '}';
    }
}

class Data {
    private String date;
    private String tem2;
    private String air_level;


    public Data() {
    }

    public Data(String date, String tem2, String air_level) {
        this.date = date;
        this.tem2 = tem2;
        this.air_level = air_level;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTem2() {
        return tem2;
    }

    public void setTem2(String tem2) {
        this.tem2 = tem2;
    }

    public String getAir_level() {
        return air_level;
    }

    public void setAir_level(String air_level) {
        this.air_level = air_level;
    }


    @Override
    public String toString() {
        return "Data{" +
                "data='" + date + '\'' +
                ", tem2='" + tem2 + '\'' +
                ", air_level='" + air_level + '\'' +

                '}';
    }
}

/*
"city":"西安","cityEn":"xian","cityid":"101110101"
 */
class Weather {
    private String countryEn;
    private String country;
    private String update_time;
    private List<Data> data;
    private String city;
    private String cityEn;
    private String cityid;

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCityEn() {
        return cityEn;
    }

    public void setCityEn(String cityEn) {
        this.cityEn = cityEn;
    }

    public String getCityid() {
        return cityid;
    }

    public void setCityid(String cityid) {
        this.cityid = cityid;
    }

    public Weather() {
    }

    public List<Data> getData() {
        return data;
    }

    public void setData(List<Data> data) {
        this.data = data;
    }

    public Weather(String countryEn, String country, String update_time) {
        this.countryEn = countryEn;
        this.country = country;
        this.update_time = update_time;

    }

    public String getCountryEn() {
        return countryEn;
    }

    public void setCountryEn(String countryEn) {
        this.countryEn = countryEn;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getUpdate_time() {
        return update_time;
    }

    public void setUpdate_time(String update_time) {
        this.update_time = update_time;
    }


    @Override
    public String toString() {
        return "Weather{" +
                "countryEn='" + countryEn + '\'' +
                ", country='" + country + '\'' +
                ", update_time='" + update_time + '\'' +
                ", data=" + data +
                ", city='" + city + '\'' +
                ", cityEn='" + cityEn + '\'' +
                ", cityid='" + cityid + '\'' +
                '}';
    }
}

