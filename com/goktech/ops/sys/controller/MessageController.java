package com.goktech.ops.sys.controller;


import com.goktech.ops.sys.entity.base.R;
import com.goktech.ops.sys.entity.base.TMessage;

import com.goktech.ops.sys.service.iTMessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping("/api/message")
public class MessageController {

    @Autowired
    private iTMessageService messageService;

    // 获取所有留言
    @PostMapping("/foreign")
    public R<List<TMessage>> listMessages() {
        List<TMessage> messages = messageService.list();
        return R.success(messages);
    }

    // 保存留言
    @PostMapping("/save")
    public R<String> saveMessage(@RequestBody TMessage message) {
        if (message.getUserId() == null) {
            return R.fail("请登录");
        }
        if (message.getContent() == null || message.getContent().trim().isEmpty()) {
            return R.fail("请填写内容");
        }
        if (message.getParentId() == null){
            message.setParentId(0L);
        }
        messageService.saveMessage(message);
        return R.success("评论成功");
    }

    // 删除留言
    @PostMapping("/delete")
    public R<String> deleteMessage(@RequestBody TMessage message) {
        messageService.deleteMessage(message.getId());
        return R.success("删除成功");
    }
}
