package dao.impl;

import dao.UserDao;

public class UserDaoMySqlImpl implements UserDao {
	@Override
	public void getUser() {
		System.out.println("mysql获取用户数据");
	}
}
