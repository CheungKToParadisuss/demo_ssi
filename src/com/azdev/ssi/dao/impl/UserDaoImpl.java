package com.azdev.ssi.dao.impl;

import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.stereotype.Repository;

import com.azdev.ssi.dao.UserDao;
import com.azdev.ssi.model.User;

@Repository(value = "userDao")
public class UserDaoImpl extends SqlSessionDaoSupport implements UserDao {

	@Override
	public User getUserByName(String name) {

		User user = new User();

		// select��䣬����һ������������User����
		// -------------------------------------------------------------------------
		user = getSqlSession().selectOne("UserMapper.getUserByName", name);// select��䣬����һ������������User����

		// insert��䣬����һ������
		// -------------------------------------------------------------------------------------
		User oneUser = new User();
		oneUser.setId(Long.parseLong("6"));
		oneUser.setName("go07");
		oneUser.setPwd("pesd07");
		oneUser.setAge(Long.parseLong("25"));
		oneUser.setSex(Long.parseLong("1"));
		// int result =
		// getSqlSession().insert("UserMapper.insertUser",oneUser);//insert��䣬����һ������
		// System.out.println("insert result:"+result);

		return user;
	}

}