package cn.lhz.lyt.dao;

import cn.lhz.lyt.pojo.*;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ActivityMapper {
    int countByExample(ActivityExample example);

    int deleteByExample(ActivityExample example);

    int insert(Activity record);

    int insertSelective(Activity record);

    List<Activity> selectByExampleWithBLOBs(ActivityExample example);

    List<Activity> selectByExample(ActivityExample example);

    int updateByExampleSelective(@Param("record") Activity record, @Param("example") ActivityExample example);

    int updateByExampleWithBLOBs(@Param("record") Activity record, @Param("example") ActivityExample example);

    int updateByExample(@Param("record") Activity record, @Param("example") ActivityExample example);
}