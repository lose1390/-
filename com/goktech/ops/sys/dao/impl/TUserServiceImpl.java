package com.goktech.ops.sys.dao.impl;

import com.goktech.ops.sys.dao.ITUserService;
import com.goktech.ops.sys.entity.TUser;
import com.goktech.ops.sys.mapper.TUserMapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 用户表 服务实现类
 * </p>
 *
 * @author goktech
 * @since 2025-06-16
 */
@Service
public class TUserServiceImpl extends ServiceImpl<TUserMapper, TUser> implements ITUserService {

}
