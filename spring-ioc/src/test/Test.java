package test;

import dao.impl.UserDaoMySqlImpl;
import dao.impl.UserDaoOracleImpl;
import service.impl.UserServiceImpl;

public class Test {
	public static void main(String[] args) {
		UserServiceImpl userService = new UserServiceImpl();
		userService.setUserDao(new UserDaoMySqlImpl());
		userService.getUser();
		System.out.println("-------------");
		userService.setUserDao(new UserDaoOracleImpl());
		userService.getUser();
	}
}
