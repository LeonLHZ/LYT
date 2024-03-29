package cn.lhz.lyt.dao;

import cn.lhz.lyt.pojo.*;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserMapper {
    int countByExample(UserExample example);

    int deleteByExample(UserExample example);

    int insert(User record);

    int insertSelective(User record);

    List<User> selectByExample(UserExample example);

    int updateByExampleSelective(@Param("record") User record, @Param("example") UserExample example);

    int updateByExample(@Param("record") User record, @Param("example") UserExample example);

   User selectByCondition(User user);

   int updateByUser(User user);

    User selectUserLogin(@Param("userEmail") String email,@Param("userPassword") String password);
}