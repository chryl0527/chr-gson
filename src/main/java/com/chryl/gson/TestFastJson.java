package com.chryl.gson;

import com.chryl.model.Person;
import com.chryl.utils.FastJsonUtil;

/**
 * Created By Chr on 2019/6/28.
 */
public class TestFastJson {
    public static void main(String args[]) {
        Person person = TestGson.newPerson();
        String s = FastJsonUtil.bean2JsonFormatter(person);
        System.out.println(s);
    }
}
