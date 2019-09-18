package cn.lhz.lyt.dao;

import cn.lhz.lyt.pojo.*;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BlogMapper {
    int countByExample(BlogExample example);

    int deleteByExample(BlogExample example);

    int insert(Blog record);

    int insertSelective(Blog record);

    List<Blog> selectByExampleWithBLOBs(BlogExample example);

    List<Blog> selectByExample(BlogExample example);

    int updateByExampleSelective(@Param("record") Blog record, @Param("example") BlogExample example);

    int updateByExampleWithBLOBs(@Param("record") Blog record, @Param("example") BlogExample example);

    int updateByExample(@Param("record") Blog record, @Param("example") BlogExample example);
}