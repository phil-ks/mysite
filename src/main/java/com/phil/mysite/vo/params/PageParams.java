package com.phil.mysite.vo.params;/*
@author Administrator
@description 
@create 2022-03-22-19:09
*/

import lombok.Data;

@Data
public class PageParams {
    private int page = 1;
    private int pageSize = 10;
}
