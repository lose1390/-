package com.goktech.ops.sys.dao.impl;

import com.goktech.ops.sys.dao.ITPermissionService;
import com.goktech.ops.sys.entity.TPermission;
import com.goktech.ops.sys.mapper.TPermissionMapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 权限菜单表 服务实现类
 * </p>
 *
 * @author goktech
 * @since 2025-06-16
 */
@Service
public class TPermissionServiceImpl extends ServiceImpl<TPermissionMapper, TPermission> implements ITPermissionService {

}
