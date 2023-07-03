package com.itheima.dao;

import com.itheima.pojo.Brand;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface BrandDao {
    @Select("select * from tb_brand")
    List<Brand> selectAll();
}
