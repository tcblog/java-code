package com.itheima.mapper;

import com.itheima.pojo.Brand;
import com.itheima.pojo.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BrandMapper {
    /**
     * 查询所有
     */
    public List<Brand> selectALL();

    /**
     * 查看详情，根据id查询
     */
    Brand selectById(int id);

    /**
     * 多条件查询
     *  * 参数接收
     *      1.散装参数：如果方法中有多个参数，需要用到@param
     *      2.对象参数: 对象的属性名称要和参数占位符名称一致
     *      3.map集合参数
     */

    List<Brand> selectByCondition(@Param("status")int status,@Param("companyName") String companyName,@Param("brandName") String brandName);


    /**
     * 添加
     */
    void add(Brand brand);

    /**
     * 修改
     */
    int update(Brand brand);

    /**
     * 根据id删除
     */
    void deleteById(int id);

    /**
     * 批量删除
     */
    void deleteByIds(int[] ids);


}
