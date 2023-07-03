package com.itheima.dao;

import org.apache.ibatis.annotations.Insert;
import org.springframework.stereotype.Repository;

@Repository
public interface BookDao {
    void SayBookName();
}
