package com.goktech.ops.sys.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;

import java.io.Serializable;

/**
 * <p>
 * 测试
 * </p>
 *
 * @author goktech
 * @since 2025-06-16
 */
public class Test implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * id
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * 姓名
     */
    private String name;

    /**
     * 日期
     */
    private String date;

    /**
     * 时间
     */
    private String time;

    /**
     * 男,女
     */
    private String sexRadio;

    /**
     * 用户
     */
    private String userRel;

    /**
     * 文件
     */
    private String file;

    /**
     * 图片
     */
    private String img;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getSexRadio() {
        return sexRadio;
    }

    public void setSexRadio(String sexRadio) {
        this.sexRadio = sexRadio;
    }

    public String getUserRel() {
        return userRel;
    }

    public void setUserRel(String userRel) {
        this.userRel = userRel;
    }

    public String getFile() {
        return file;
    }

    public void setFile(String file) {
        this.file = file;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    @Override
    public String toString() {
        return "Test{" +
            "id = " + id +
            ", name = " + name +
            ", date = " + date +
            ", time = " + time +
            ", sexRadio = " + sexRadio +
            ", userRel = " + userRel +
            ", file = " + file +
            ", img = " + img +
            "}";
    }
}
