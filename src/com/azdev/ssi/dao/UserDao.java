package com.azdev.ssi.dao;

import com.azdev.ssi.model.User;

public interface UserDao {
	public User getUserByName(String name);
}
