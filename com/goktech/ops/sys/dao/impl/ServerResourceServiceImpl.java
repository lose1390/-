package com.goktech.ops.sys.dao.impl;

import com.goktech.ops.sys.dao.IServerResourceService;
import com.goktech.ops.sys.entity.ServerResource;
import com.goktech.ops.sys.mapper.ServerResourceMapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 服务器资源表 服务实现类
 * </p>
 *
 * @author goktech
 * @since 2025-06-16
 */
@Service
public class ServerResourceServiceImpl extends ServiceImpl<ServerResourceMapper, ServerResource> implements IServerResourceService {

}
