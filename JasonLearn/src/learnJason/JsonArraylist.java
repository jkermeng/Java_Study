package learnJason;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


public class JsonArraylist {
    public static void main(String[] args) {
        Set<Teacher> listt = new HashSet<>();
        listt.add(new Teacher(1,"j","f",18));
        listt.add(new Teacher(2,"k","m",19));
        listt.add(new Teacher(3,"e","m",20));

        Object o = JSONArray.toJSON(listt);
        System.out.println(o.toString());
        Object o1 = JSONObject.toJSON(listt);
        System.out.println(o1);
    }
}
