package service.impl;

import dao.UserDao;
import service.UserService;

public class UserServiceImpl implements UserService {
	private UserDao userDao = null;
	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}
	public void getUser() {
		userDao.getUser();
	}
}
