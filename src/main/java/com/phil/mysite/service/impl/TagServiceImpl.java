package com.phil.mysite.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.phil.mysite.domain.Tag;
import com.phil.mysite.service.TagService;
import com.phil.mysite.mapper.TagMapper;
import org.springframework.stereotype.Service;

/**
* @author phil
* @description 针对表【ms_tag】的数据库操作Service实现
* @createDate 2022-03-20 20:50:41
*/
@Service
public class TagServiceImpl extends ServiceImpl<TagMapper, Tag>
    implements TagService{

}




