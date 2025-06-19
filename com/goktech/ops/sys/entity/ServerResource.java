package com.goktech.ops.sys.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;

/**
 * <p>
 * 服务器资源表
 * </p>
 *
 * @author goktech
 * @since 2025-06-16
 */
@TableName("server_resource")
public class ServerResource implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * id
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * 服务器名称
     */
    private String name;

    /**
     * 服务器Ip
     */
    private String ip;

    /**
     * 状态
     */
    private String stateRadio;

    /**
     * 备注
     */
    private String mark;

    /**
     * 创建时间
     */
    private String createtime;

    /**
     * 归属人
     */
    private String user;

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

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getStateRadio() {
        return stateRadio;
    }

    public void setStateRadio(String stateRadio) {
        this.stateRadio = stateRadio;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public String getCreatetime() {
        return createtime;
    }

    public void setCreatetime(String createtime) {
        this.createtime = createtime;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "ServerResource{" +
            "id = " + id +
            ", name = " + name +
            ", ip = " + ip +
            ", stateRadio = " + stateRadio +
            ", mark = " + mark +
            ", createtime = " + createtime +
            ", user = " + user +
            "}";
    }
}
