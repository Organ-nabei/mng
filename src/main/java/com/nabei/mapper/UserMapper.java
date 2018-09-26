package com.nabei.mapper;

import com.nabei.entity.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author HuangXiaoSen
 * @since 2018-09-26
 */
@Mapper
public interface UserMapper extends BaseMapper<User> {

}
