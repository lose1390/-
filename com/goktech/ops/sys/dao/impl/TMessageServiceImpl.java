package com.goktech.ops.sys.dao.impl;

import com.goktech.ops.sys.dao.ITMessageService;
import com.goktech.ops.sys.entity.base.TMessage;
import com.goktech.ops.sys.mapper.TMessageMapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 留言表 服务实现类
 * </p>
 *
 * @author goktech
 * @since 2025-06-16
 */
@Service
public class TMessageServiceImpl extends ServiceImpl<TMessageMapper, TMessage> implements ITMessageService {

}
