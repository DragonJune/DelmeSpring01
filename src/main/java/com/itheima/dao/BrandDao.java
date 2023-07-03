package com.itheima.dao;

import com.itheima.pojo.Brand;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface BrandDao {
    List<Brand> selectAll();
}
