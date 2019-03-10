package com.demo.dao;

import com.demo.bean.UserFriends;
import com.demo.bean.UserFriendsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserFriendsMapper {
    int countByExample(UserFriendsExample example);

    int deleteByExample(UserFriendsExample example);

    int deleteByPrimaryKey(Long id);

    int insert(UserFriends record);

    int insertSelective(UserFriends record);

    List<UserFriends> selectByExample(UserFriendsExample example);

    UserFriends selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") UserFriends record, @Param("example") UserFriendsExample example);

    int updateByExample(@Param("record") UserFriends record, @Param("example") UserFriendsExample example);

    int updateByPrimaryKeySelective(UserFriends record);

    int updateByPrimaryKey(UserFriends record);
}