// 位置: src/main/java/com/goktech/ops/sys/entity/base/TMessage.java
package com.goktech.ops.sys.entity.base;

import java.util.Date;

public class TMessage {
    private Long id;
    private Long userId;
    private String content;
    private Date time;
    private Long parentId;

    // 非数据库字段（用于前端展示）
    private String username;
    private String avatar;
    private TMessage parentMessage;

    // getters and setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public Long getUserId() { return userId; }
    public void setUserId(Long userId) { this.userId = userId; }
    public String getContent() { return content; }
    public void setContent(String content) { this.content = content; }
    public Date getTime() { return time; }
    public void setTime(Date time) { this.time = time; }
    public Long getParentId() { return parentId; }
    public void setParentId(Long parentId) { this.parentId = parentId; }
    public String getUsername() { return username; }
    public void setUsername(String username) { this.username = username; }
    public String getAvatar() { return avatar; }
    public void setAvatar(String avatar) { this.avatar = avatar; }
    public TMessage getParentMessage() { return parentMessage; }
    public void setParentMessage(TMessage parentMessage) { this.parentMessage = parentMessage; }
}