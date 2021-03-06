package com.belongcompany.mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.belongcompany.User;




public interface UserDAOMapper {
	@Select("select * from user where name = #{name}")
	public User find(String name);
	
	@Select("select * from user where name = #{name} and pwd = #{pwd}")
	public User login(@Param("name")String name, @Param("pwd")String pwd);
}
