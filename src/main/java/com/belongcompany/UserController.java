package com.belongcompany;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("v1")
public class UserController {
	@Autowired
	UserService userService;

	@RequestMapping(value = "/azs/{id}", method = RequestMethod.GET)
	public String getAzById(@PathVariable("id") String id) {
		System.out.println("inter*************");
		return "访问结果：" + userService.findsss(id).getPwd();
	}

}
