package com.care.root.configration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UserConfigration {
	@Bean
	public UserTest userTest() {
		return new UserTest();
	}//자바코드에 어노테이션을 이용해 객체를 생성하는 방법
}
