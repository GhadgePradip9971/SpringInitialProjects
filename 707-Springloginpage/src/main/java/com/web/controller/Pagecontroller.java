package com.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class Pagecontroller {

	@RequestMapping("/")
	public String form() {
		return "login"; // Ensure you have a login.jsp file
	}

	@RequestMapping("/request")
	public String logform(@RequestParam String uname, @RequestParam String pass, ModelMap model) {
		model.put("k1", uname);
		model.put("k2", pass);

		String message;
		if (uname.equals("pradip") && pass.equals("ghadge")) {
			System.out.println("Success");
			message = "Welcome, " + uname + "!";
		} else {
			System.out.println("Wrong");
			message = "Invalid username or password";
		}
		model.put("message", message);

		return "result";
	}
}
