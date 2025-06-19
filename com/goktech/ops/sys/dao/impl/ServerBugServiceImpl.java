package com.goktech.ops.sys.dao.impl;

import com.goktech.ops.sys.dao.IServerBugService;
import com.goktech.ops.sys.entity.ServerBug;
import com.goktech.ops.sys.mapper.ServerBugMapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 漏洞表 服务实现类
 * </p>
 *
 * @author goktech
 * @since 2025-06-16
 */
@Service
public class ServerBugServiceImpl extends ServiceImpl<ServerBugMapper, ServerBug> implements IServerBugService {

}
