package com.goktech.ops.sys.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;

/**
 * <p>
 * 日志表
 * </p>
 *
 * @author goktech
 * @since 2025-06-16
 */
@TableName("t_log")
public class TLog implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 序号
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * 操作内容
     */
    private String content;

    /**
     * 操作时间
     */
    private String time;

    /**
     * 操作人
     */
    private String user;

    /**
     * ip
     */
    private String ip;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    @Override
    public String toString() {
        return "TLog{" +
            "id = " + id +
            ", content = " + content +
            ", time = " + time +
            ", user = " + user +
            ", ip = " + ip +
            "}";
    }
}
