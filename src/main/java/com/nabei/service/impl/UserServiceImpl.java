package com.nabei.service.impl;

import com.nabei.entity.User;
import com.nabei.mapper.UserMapper;
import com.nabei.service.UserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author HuangXiaoSen
 * @since 2018-09-26
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

}
