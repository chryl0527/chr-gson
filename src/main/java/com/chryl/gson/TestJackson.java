package com.chryl.gson;

import com.chryl.model.Person;
import com.chryl.utils.JacksonUtil;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * Created By Chr on 2019/6/28.
 */
public class TestJackson {

    public static void main(String args[]) {
        Person person = TestGson.newPerson();
        String s = JacksonUtil.bean2Json(person);
        System.out.println("s" + s);
        Person person1 = JacksonUtil.json2Bean(s, Person.class);
        System.out.println("person1" + person1);

        //
        ObjectMapper mapper = new ObjectMapper();

    }

}
