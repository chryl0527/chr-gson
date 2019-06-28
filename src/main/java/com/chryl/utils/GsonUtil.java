package com.chryl.utils;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;

/**
 * Created By Chr on 2019/6/28.
 */
public class GsonUtil {
    private static Gson gson = new GsonBuilder().create();

    /**
     * bean->jsonStr
     *
     * @param obj
     * @return
     */
    public static String bean2Json(Object obj) {
        return gson.toJson(obj);
    }

    /**
     * jsonStr->bean
     *
     * @param jsonStr
     * @param objClass
     * @param <T>
     * @return
     */
    public static <T> T json2Bean(String jsonStr, Class<T> objClass) {
        return gson.fromJson(jsonStr, objClass);
    }

    /**
     * 格式化jsonStr
     *
     * @param uglyJsonStr
     * @return
     */
    public static String jsonFormatter(String uglyJsonStr) {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        JsonParser jp = new JsonParser();
        JsonElement je = jp.parse(uglyJsonStr);
        return gson.toJson(je);
    }
}
