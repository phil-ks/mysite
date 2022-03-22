package com.phil.mysite.service;

import com.phil.mysite.domain.Article;
import com.baomidou.mybatisplus.extension.service.IService;
import com.phil.mysite.vo.ArticleVo;
import com.phil.mysite.vo.Result;
import com.phil.mysite.vo.params.PageParams;

import java.util.List;

/**
* @author phil
* @description 针对表【ms_article】的数据库操作Service
* @createDate 2022-03-20 20:50:41
*/
public interface ArticleService extends IService<Article> {
    /**
     * 分页查询文章列表
     * @param pageParams
     * @return
     */
    Result listArticlesPage(PageParams pageParams);
}
