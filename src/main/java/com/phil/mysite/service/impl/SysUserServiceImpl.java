package com.phil.mysite.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.phil.mysite.domain.SysUser;
import com.phil.mysite.service.SysUserService;
import com.phil.mysite.mapper.SysUserMapper;
import org.springframework.stereotype.Service;

/**
* @author phil
* @description 针对表【ms_sys_user】的数据库操作Service实现
* @createDate 2022-03-20 20:50:41
*/
@Service
public class SysUserServiceImpl extends ServiceImpl<SysUserMapper, SysUser>
    implements SysUserService{

}




