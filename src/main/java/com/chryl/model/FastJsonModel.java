package com.chryl.model;

import com.alibaba.fastjson.annotation.JSONField;

import java.io.Serializable;
import java.util.Date;

/**
 * Created By Chr on 2019/7/12.
 */
public class FastJsonModel implements Serializable {
    private static final long serialVersionUID = 7588352804810005551L;
//    public @interface JSONField {
//        // 配置序列化和反序列化的顺序，1.1.42版本之后才⽀持
//        int ordinal() default 0;
//        // 指定字段的名称
//        String name() default "";
//        // 指定字段的格式，对⽇期格式有⽤
//        String format() default "";
//        // 是否序列化
//        boolean serialize() default true;
//        // 是否反序列化
//        boolean deserialize() default true;
//    }
    /**
     * 指定name属性,就是序列化之后,字段变为什么格式
     */
    @JSONField(ordinal = 1, name = "AimID")
    private String aimID;
    @JSONField(ordinal = 2, name = "AimName")
    private String aimName;
    @JSONField(ordinal = 3, name = "AimMax")
    private String aimMax;
    @JSONField(format = "yyyyMMdd")
    private Date date;

    public FastJsonModel(String aimID, String aimName, String aimMax, Date date) {
        this.aimID = aimID;
        this.aimName = aimName;
        this.aimMax = aimMax;
        this.date = date;
    }

    public String getAimID() {
        return aimID;
    }

    public void setAimID(String aimID) {
        this.aimID = aimID;
    }

    public String getAimName() {
        return aimName;
    }

    public void setAimName(String aimName) {
        this.aimName = aimName;
    }

    public String getAimMax() {
        return aimMax;
    }

    public void setAimMax(String aimMax) {
        this.aimMax = aimMax;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
