package hyd.base.dao.mapper;

import hyd.base.pojo.po.Dicttype;
import hyd.base.pojo.po.DicttypeExample;

import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface DicttypeMapper {
    int countByExample(DicttypeExample example);

    int deleteByExample(DicttypeExample example);

    int deleteByPrimaryKey(String typecode);

    int insert(Dicttype record);

    int insertSelective(Dicttype record);

    List<Dicttype> selectByExample(DicttypeExample example);

    Dicttype selectByPrimaryKey(String typecode);

    int updateByExampleSelective(@Param("record") Dicttype record, @Param("example") DicttypeExample example);

    int updateByExample(@Param("record") Dicttype record, @Param("example") DicttypeExample example);

    int updateByPrimaryKeySelective(Dicttype record);

    int updateByPrimaryKey(Dicttype record);
}