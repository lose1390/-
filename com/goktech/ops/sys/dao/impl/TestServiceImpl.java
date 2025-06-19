package com.goktech.ops.sys.dao.impl;

import com.goktech.ops.sys.dao.ITestService;
import com.goktech.ops.sys.entity.Test;
import com.goktech.ops.sys.mapper.TestMapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 测试 服务实现类
 * </p>
 *
 * @author goktech
 * @since 2025-06-16
 */
@Service
public class TestServiceImpl extends ServiceImpl<TestMapper, Test> implements ITestService {

}
