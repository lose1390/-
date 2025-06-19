package com.goktech.ops.sys.dao.impl;

import com.goktech.ops.sys.dao.ITNoticeService;
import com.goktech.ops.sys.entity.TNotice;
import com.goktech.ops.sys.mapper.TNoticeMapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 公告表 服务实现类
 * </p>
 *
 * @author goktech
 * @since 2025-06-16
 */
@Service
public class TNoticeServiceImpl extends ServiceImpl<TNoticeMapper, TNotice> implements ITNoticeService {

}
