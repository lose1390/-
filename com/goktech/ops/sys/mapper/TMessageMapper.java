package com.goktech.ops.sys.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.goktech.ops.sys.entity.base.TMessage;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * <p>
 * 留言表 Mapper 接口
 * </p>
 *
 * @author goktech
 * @since 2025-06-16
 */
public interface TMessageMapper extends BaseMapper<TMessage> {
    // 查询所有留言（带回复关系）
    List<TMessage> selectMessagesWithReplies();

    // 新增留言
    int insertMessage(TMessage message);

    // 根据ID删除留言
    int deleteMessageById(@Param("id") Long id);
}
