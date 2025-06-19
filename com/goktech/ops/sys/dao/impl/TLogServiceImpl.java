package com.goktech.ops.sys.dao.impl;

import com.goktech.ops.sys.dao.ITLogService;
import com.goktech.ops.sys.entity.TLog;
import com.goktech.ops.sys.mapper.TLogMapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 日志表 服务实现类
 * </p>
 *
 * @author goktech
 * @since 2025-06-16
 */
@Service
public class TLogServiceImpl extends ServiceImpl<TLogMapper, TLog> implements ITLogService {

}
