package com.goktech.ops.sys.controller;



import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;

import com.goktech.ops.sys.dao.ITNoticeService;
import com.goktech.ops.sys.entity.param.NoticePageParam;
import com.goktech.ops.sys.entity.TNotice;
import com.goktech.ops.sys.entity.base.R;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@RestController
@RequestMapping("/api/notice")
public class NoticeController {

    @Autowired
    private ITNoticeService noticeService;

    @PostMapping("/page")
    public R<IPage<TNotice>> page(@RequestBody NoticePageParam param) {
        return R.success(noticeService.page(new Page<>(param.getPageNum(), param.getPageSize())));
    }

    @PostMapping("/save")
    public R save(@RequestBody TNotice notice) {
        notice.setTime(LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")));
        if (noticeService.save(notice)) {
            return R.success(null);
        } else {
            return R.fail("新增失败");
        }
    }

    @PostMapping("/detail")
    public R<TNotice> detail(@RequestBody TNotice notice) {
        return R.success(noticeService.getById(notice.getId()));
    }

    @PostMapping("/edit")
    public R edit(@RequestBody TNotice notice) {
        if (noticeService.updateById(notice)) {
            return R.success(null);
        } else {
            return R.fail("修改失败");
        }
    }

    @PostMapping("/delete")
    public R delete(@RequestBody TNotice notice) {
        if (noticeService.removeById(notice.getId())) {
            return R.success(null);
        } else {
            return R.fail("删除失败");
        }
    }
}
