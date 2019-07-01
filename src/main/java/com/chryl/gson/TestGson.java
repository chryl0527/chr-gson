package com.chryl.gson;

import com.chryl.model.FullName;
import com.chryl.model.Person;
import com.chryl.utils.GsonUtil;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.util.*;

/**
 * Gson
 * <p>
 * Created By Chr on 2019/6/28.
 */
public class TestGson {

    public static void main(String args[]) {
        //1.未格式化
//        showOne();

        //2.格式化
        showGson();
    }

    //第一次测试
    public static void showOne() {
        Map<String, String> map = new HashMap<>();
        map.put("maa", "12");
        map.put("3", "12");
        map.put("ma4a", "12");
        map.put("ma2a", "12");
        map.put("m1aa", "12");
        Map<String, String> map2 = new HashMap<>();
        map2.put("1", "a");
        map2.put("2", "b");
        map2.put("3", "c");
        map2.put("4", "d");
        map2.put("5", "e");

        Gson gson = new GsonBuilder().create();
        System.out.println("map:" + map);//{ma2a=12, 3=12, ma4a=12, m1aa=12, maa=12}
        String s = gson.toJson(map);
        System.out.println("s:" + s);//{"ma2a":"12","3":"12","ma4a":"12","m1aa":"12","maa":"12"}


        //person
        ////to Json
        Person person = newPerson();
        String s1 = gson.toJson(person);
        System.out.println("s1:" + s1);
        ////to Bean
        Person person1 = gson.fromJson(s1, Person.class);
        System.out.println("person1:" + person1);
        String s2 = GsonUtil.jsonFormatter(s1);
        System.out.println(s2);//格式化jsonStr
    }

    //new person
    public static Person newPerson() {
        //hobbies
        List<String> hobbies = new ArrayList<>();
        hobbies.add("basketball");
        hobbies.add("movie");
        hobbies.add("music");
        //clothes
        Map<String, String> clothes = new HashMap<>();
        clothes.put("pink", "T-shirt");
        clothes.put("blue", "T-shirt");
        clothes.put("yellow", "T-shirt");
        clothes.put("red", "T-shirt");
        //friends
        List<Person> friends = new ArrayList<>();
        Person p1 = new Person("wangyc"
                , new FullName("wang", "y", "c")
                , 16, new Date(99, 3, 1), hobbies, clothes, null);
        Person p2 = new Person("handl"
                , new FullName("han", "d", "l")
                , 17, new Date(96, 5, 7), hobbies, clothes, null);

        friends.add(p1);
        friends.add(p2);

        //new Persion
        Person person = new Person("chryl"
                , new FullName("chr", "y", "l")
                , 18
                , new Date(98, 5, 1)
                , hobbies
                , clothes
                , friends);

        return person;
    }

    //拓展gson,gson格式化配置
    public static void showGson() {
        //格式化输出、日期时间及其它
        Gson gson = new GsonBuilder()
                //序列化null
                .serializeNulls()
                // 设置日期时间格式，另有2个重载方法
                // 在序列化和反序化时均生效
                .setDateFormat("yyyy-MM-dd")//yyyy-MM-dd HH:mm:ss
                // 禁此序列化内部类
                .disableInnerClassSerialization()
                //生成不可执行的Json（多了 )]}' 这4个字符）:
//                .generateNonExecutableJson()
                //禁止转义html标签
                .disableHtmlEscaping()
                //格式化输出
//                .setPrettyPrinting()
                //在序列化和反序列化时，要不要将该字段接入操作
//                .excludeFieldsWithoutExposeAnnotation()
                /**
                 * @Until是 <= 某Version
                 *
                 * @Since是 >= 某Version
                 * 当前设置版本17 < @Since(18)此时，此时将不会输出age:
                 */
                //设置当前版本
//                .setVersion(17)
                //new Instance
                .create();

        //
        Person person = TestGson.newPerson();
        String s = gson.toJson(person);
        System.out.println(s);
    }
}
