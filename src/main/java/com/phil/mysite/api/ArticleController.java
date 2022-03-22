package com.phil.mysite.api;/*
@author Administrator
@description 
@create 2022-03-22-17:30
*/

import com.phil.mysite.service.ArticleService;
import com.phil.mysite.vo.ArticleVo;
import com.phil.mysite.vo.params.PageParams;
import com.phil.mysite.vo.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping("/articles")
@RestController
public class ArticleController {
    @Autowired
    private ArticleService articleService;

    /**
     * 首页 文章列表
     * @param pageParams
     * @return
     */
    @PostMapping
    public Result articles(@RequestBody PageParams pageParams){
        List<ArticleVo> articles = articleService.listArticlesPage(pageParams);
        return Result.success(articles);
    }
}
