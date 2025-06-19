package com.goktech.ops.sys.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.goktech.ops.sys.dao.ITLogService;
import com.goktech.ops.sys.entity.param.LogPageParam;
import com.goktech.ops.sys.entity.TLog;
import com.goktech.ops.sys.entity.base.R;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/log")
public class LogController {

    @Autowired
    private ITLogService logService;

    @PostMapping("/page")
    public R<IPage<TLog>> page(@RequestBody LogPageParam param) {
        return R.success(logService.page(
                new Page<>(param.getPageNum(), param.getPageSize()),
                new QueryWrapper<TLog>().like(StringUtils.hasText(param.getSearchkey()), "content", param.getSearchkey())
        ));
    }
}
