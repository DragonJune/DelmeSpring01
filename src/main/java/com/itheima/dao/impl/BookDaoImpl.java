package com.itheima.dao.impl;

import com.itheima.dao.BookDao;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

@Repository
@Primary
public class BookDaoImpl implements BookDao {
    @Override
    public void SayBookName() {
        System.out.println("SayBookName");
    }
}
