package com.goktech.ops.sys.service;

// 位置: src/main/java/com/goktech/ops/sys/service/iTMessageService.java


import com.baomidou.mybatisplus.extension.service.IService;
import com.goktech.ops.sys.entity.base.TMessage;
import java.util.List;

public interface iTMessageService extends IService<TMessage> {
    List<TMessage> getMessagesWithReplies();
    void saveMessage(TMessage message);
    void deleteMessage(Long id);
}
