package com.project.demo;

import com.project.demo.entity.User;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;
import java.util.Map;

/**
 * @author WxinSa
 * @date 2022/3/16 20:06
 */
@SpringBootTest
@Slf4j
public class Demo {
    @Autowired
    @PersistenceContext
    private EntityManager entityManager;

    @Test
    public void demo(){

        // StringBuffer sql = new StringBuffer("select * from user");
        String sql ="select * from user";
        // log.info("[{}] - 插入操作：{}"," ",sql);
        Query query =entityManager.createNativeQuery(sql, User.class);
        System.out.println("------------------------------------------");
        System.out.println(query);
        List resultList = query.getResultList();
        System.out.println(resultList);
        // System.out.println(query.executeUpdate());

    }
}
