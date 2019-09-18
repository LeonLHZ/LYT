package cn.lhz.lyt.dao;

import cn.lhz.lyt.pojo.*;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface RelationshipMapper {
    int countByExample(RelationshipExample example);

    int deleteByExample(RelationshipExample example);

    int insert(Relationship record);

    int insertSelective(Relationship record);

    List<Relationship> selectByExample(RelationshipExample example);

    int updateByExampleSelective(@Param("record") Relationship record, @Param("example") RelationshipExample example);

    int updateByExample(@Param("record") Relationship record, @Param("example") RelationshipExample example);
}