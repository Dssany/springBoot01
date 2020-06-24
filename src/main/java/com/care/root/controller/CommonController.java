package com.care.root.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController //문자열로 데이터를 돌려주는 컨트롤러
public class CommonController {
	@RequestMapping("/")
	public String root_rest() {
		return "hello root01010";
	}
}
