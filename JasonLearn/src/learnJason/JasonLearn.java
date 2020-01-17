package learnJason;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class JasonLearn {
    public static void main(String[] args) {
        //JSONObject.toJson();后台数据到前台
        //JSon.parse（）;前台数据到后台
        JSONObject jsonObject = new JSONObject();//后台传给前端 要new 一个对象put出去
        jsonObject.put("id", "1");
        jsonObject.put("name", "老师1");
        jsonObject.put("gender", "女");
        jsonObject.put("age", "18");

        String s = jsonObject.toJSONString();
        System.out.println(s);
        Teacher teacher = JSON.parseObject(s, Teacher.class);//前端拿数据给后台用静态方法拿
        System.out.println(teacher.toString());
        String msg = "[{'id':1, 'name':'老师1', 'gender':'女', 'age':18}," +
                "{'id':2, 'name':'老师2', 'gender':'女', 'age':19}," +
                "{'id':3, 'name':'老师3', 'gender':'女', 'age':17}," +
                "{'id':4, 'name':'老师4', 'gender':'女', 'age':22}]";
        List<Teacher> teachers = JSON.parseArray(msg, Teacher.class);//前端拿数据组给后台用静态方法拿
        for (Teacher t :
                teachers) {
            System.out.println(t);
        }
        JSONObject jsonObject1 = new JSONObject();
        Map<String, Teacher> tmap = new HashMap<>();
        tmap.put("teacher1", teachers.get(0));
        tmap.put("teacher2", teachers.get(1));
        tmap.put("teacher3", teachers.get(2));
        String s1 = JSON.toJSONString(tmap);
        System.out.println(s1);


        Map<String, Object> map1 = new HashMap<>();
        map1.put("resualtcode", "200");
        map1.put("reason", "查询成功!");
        Map<String, Object> map2 = new HashMap<>();
        Map<String, Object> map3 = new HashMap<>();
        map3.put("temp", "21");
        map3.put("wind_direction", "西风");
        map3.put("wind_strength", "2级");
        map3.put("humidity", "4%");
        map3.put("time", "14:25");
        JSONObject jsonObject2 = new JSONObject();
        jsonObject2.putAll(map3);
        map2.put("sk", jsonObject2);
        Map<String, Object> map4 = new HashMap<>();
        map4.put("city", "天津");
        map4.put("date_y", "2014年03月21日");
        map4.put("week", "星期五");
        map4.put("temperature", "8℃~20℃");
        map4.put("weather", "晴转霾");
        Map<String, Object> map5 = new HashMap<>();
        map5.put("fa", "00");
        map5.put("fb", "53");
        JSONObject jsonObject4 = new JSONObject();
        jsonObject4.putAll(map5);
        map4.put("weather_id", jsonObject4);
        JSONObject jsonObject3 = new JSONObject();
        jsonObject3.putAll(map4);
        map1.put("result", map2);
        map2.put("today", jsonObject3);
        map2.put("wind", "西南风微风");
        map2.put("dressing_index", "较冷");
        map2.put("dressing_advice", "建议着大衣、呢外套加毛衣、卫衣等服装。");
        map2.put("uv_index", "中等");
        map2.put("wash_index", "较适宜");
        JSONObject jsonObject6 = new JSONObject();
        jsonObject6.putAll(map2);
        JSONObject jsonObject7 = new JSONObject();
        jsonObject7.putAll(map1);
        System.out.println(jsonObject7.toJSONString());

    }
}

class Teacher {
    private int id;
    private String name;
    private String gender;
    private int age;

    public Teacher() {
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", age=" + age +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Teacher(int id, String name, String gender, int age) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.age = age;
    }
}

