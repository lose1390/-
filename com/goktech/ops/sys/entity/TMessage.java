package com.goktech.ops.sys.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * <p>
 * 留言表
 * </p>
 *
 * @author goktech
 * @since 2025-06-16
 */
@TableName("t_message")
public class TMessage implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * ID
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * 内容
     */
    private String content;

    /**
     * 评论人
     */
    private String username;

    /**
     * 评论时间
     */
    private LocalDateTime time;

    /**
     * 父ID
     */
    private Long parentId;

    /**
     * 关联id
     */
    private Long foreignId;

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

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public LocalDateTime getTime() {
        return time;
    }

    public void setTime(LocalDateTime time) {
        this.time = time;
    }

    public Long getParentId() {
        return parentId;
    }

    public void setParentId(Long parentId) {
        this.parentId = parentId;
    }

    public Long getForeignId() {
        return foreignId;
    }

    public void setForeignId(Long foreignId) {
        this.foreignId = foreignId;
    }

    @Override
    public String toString() {
        return "TMessage{" +
            "id = " + id +
            ", content = " + content +
            ", username = " + username +
            ", time = " + time +
            ", parentId = " + parentId +
            ", foreignId = " + foreignId +
            "}";
    }
}
