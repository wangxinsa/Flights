package com.project.demo.service;

import com.project.demo.entity.Article;
import com.project.demo.service.base.BaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 * 文章：用于内容管理系统的文章(Article)表服务接口
 */
@Service
public class ArticleService extends BaseService<Article> {

    // @Autowired
    // @PersistenceContext
    // private EntityManager entityManager;
    //
    //
    // public void demo(){
    //
    //     // StringBuffer sql = new StringBuffer("select * from user");
    //     String sql ="select * from user";
    //     // log.info("[{}] - 插入操作：{}"," ",sql);
    //     Query query =entityManager.createNativeQuery(sql.toString());
    //     System.out.println(query);
    //     System.out.println(query.executeUpdate());
    //
    // }
}


