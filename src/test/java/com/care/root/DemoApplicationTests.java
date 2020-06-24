package com.care.root;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.care.root.configration.UserTest;
import com.care.root.dao.UserDAO;
import com.care.root.service.UserService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {
	@Autowired
	UserService userService;
	@Autowired
	UserDAO userdao;
	@Autowired
	UserTest userTest;
	@Test
	public void contextLoads() {
		Assert.assertNotNull(userService);//해당하는 값이 널인지 아닌지를 확인해준다
	}
	
	@Test
	public void userDAO() {
		Assert.assertNotNull(userdao);
	}

	@Test
	public void userTest() {
		Assert.assertNotNull(userTest);
	}

}
