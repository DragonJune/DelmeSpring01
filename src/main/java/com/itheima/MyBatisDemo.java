package com.itheima;

import com.itheima.config.SpringConfig;
import com.itheima.dao.BookDao;
import com.itheima.service.BookService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.io.IOException;

public class MyBatisDemo {
    public static void main(String[] args) throws IOException {
//        String resource = "mybatis-config.xml";
//        InputStream inputStream = Resources.getResourceAsStream(resource);
//        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
//
//        SqlSession sqlSession = sqlSessionFactory.openSession();
//
//        BrandMapper brandMapper = sqlSession.getMapper(BrandMapper.class);
//
//        List<Brand> brandList = brandMapper.selectAll();
//        System.out.println(brandList);
//        sqlSession.close();

//        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringConfig.class);
        BookDao bookDao = applicationContext.getBean(BookDao.class);
        bookDao.SayBookName();

//        BookService bookService = (BookService) applicationContext.getBean("bookService");
//        bookService.PrintBrandList();
    }
}
