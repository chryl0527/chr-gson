package com.chryl.gson;

import com.chryl.model.FastJsonModel;
import com.chryl.model.Person;
import com.chryl.utils.FastJsonUtil;

import java.util.Date;

/**
 * Created By Chr on 2019/6/28.
 */
public class TestFastJson {
    public static void main(String args[]) {
        FastJsonModel fastJsonModel = new FastJsonModel("1029", "aim", "23", new Date());
        String s = FastJsonUtil.bean2Json(fastJsonModel);
        System.out.println(s);
    }

    public static void show() {
        Person person = TestGson.newPerson();
        String s = FastJsonUtil.bean2JsonFormatter(person);
        System.out.println(s);
    }
}
