package com.goktech.ops.sys.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;

/**
 * <p>
 * 漏洞表
 * </p>
 *
 * @author goktech
 * @since 2025-06-16
 */
@TableName("server_bug")
public class ServerBug implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * IP地址
     */
    private String ip;

    /**
     * 端口号
     */
    private String port;

    /**
     * 描述
     */
    private String content;

    /**
     * 类型
     */
    private String typeRadio;

    /**
     * 创建时间
     */
    private String createtime;

    /**
     * 状态
     */
    private String stateRadio;

    /**
     * 处理人
     */
    private String user;

    /**
     * 处理内容
     */
    private String solveCont;

    /**
     * 处理人id
     */
    private Integer userId;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getPort() {
        return port;
    }

    public void setPort(String port) {
        this.port = port;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getTypeRadio() {
        return typeRadio;
    }

    public void setTypeRadio(String typeRadio) {
        this.typeRadio = typeRadio;
    }

    public String getCreatetime() {
        return createtime;
    }

    public void setCreatetime(String createtime) {
        this.createtime = createtime;
    }

    public String getStateRadio() {
        return stateRadio;
    }

    public void setStateRadio(String stateRadio) {
        this.stateRadio = stateRadio;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getSolveCont() {
        return solveCont;
    }

    public void setSolveCont(String solveCont) {
        this.solveCont = solveCont;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    @Override
    public String toString() {
        return "ServerBug{" +
            "id = " + id +
            ", ip = " + ip +
            ", port = " + port +
            ", content = " + content +
            ", typeRadio = " + typeRadio +
            ", createtime = " + createtime +
            ", stateRadio = " + stateRadio +
            ", user = " + user +
            ", solveCont = " + solveCont +
            ", userId = " + userId +
            "}";
    }
}
