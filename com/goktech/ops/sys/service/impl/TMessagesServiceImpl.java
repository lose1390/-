package com.goktech.ops.sys.service.impl;

// 位置: src/main/java/com/goktech/ops/sys/service/impl/TMessagesServiceImpl.java

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.goktech.ops.sys.entity.base.TMessage;
import com.goktech.ops.sys.mapper.TMessagesMapper;

import com.goktech.ops.sys.service.iTMessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class TMessagesServiceImpl extends ServiceImpl<TMessagesMapper, TMessage> implements iTMessageService {

    @Autowired
    private TMessagesMapper messagesMapper;

    @Override
    public List<TMessage> getMessagesWithReplies() {
        return messagesMapper.selectMessagesWithReplies();
    }

    @Override
    @Transactional
    public void saveMessage(TMessage message) {
        messagesMapper.insertMessage(message);
    }

    @Override
    @Transactional
    public void deleteMessage(Long id) {
        messagesMapper.deleteMessageById(id);
    }
}
