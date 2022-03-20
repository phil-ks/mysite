package com.phil.mysite.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.phil.mysite.domain.Article;
import com.phil.mysite.service.ArticleService;
import com.phil.mysite.mapper.ArticleMapper;
import org.springframework.stereotype.Service;

/**
* @author phil
* @description 针对表【ms_article】的数据库操作Service实现
* @createDate 2022-03-20 20:50:41
*/
@Service
public class ArticleServiceImpl extends ServiceImpl<ArticleMapper, Article>
    implements ArticleService{

}




