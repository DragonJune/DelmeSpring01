package com.itheima.service.impl;

import com.itheima.dao.BookDao;
import com.itheima.dao.BrandDao;
import com.itheima.pojo.Brand;
import com.itheima.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service(value = "bookService")
public class BookServiceImpl implements BookService {

    @Autowired
    BrandDao brandMapper;

    @Override
    public void SayBookNameService() {
        System.out.println("SayBookNameService");
    }

    @Override
    public void PrintBrandList() {
        List<Brand> list = brandMapper.selectAll();
        System.out.println(list);
    }
}
