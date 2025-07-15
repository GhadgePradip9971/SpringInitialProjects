package com.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class Biggestnumbercontroller {
	// private static final Object BiggestNo = null;

	@RequestMapping("/")

	public String nameForm() {
		return "number";
	}

	@RequestMapping("/resultUrl")
	public String Biggest(@RequestParam String fno, @RequestParam String sno, @RequestParam String tno,
			ModelMap model) {
		model.put("k1", fno);
		model.put("k2", sno);
		model.put("k3", tno);

		int num1 = Integer.parseInt(fno);
		int num2 = Integer.parseInt(sno);
		int num3 = Integer.parseInt(tno);

		int BiggestNo;
		if (num1 > num2 && num1 > num3) {
			BiggestNo = num1;
		} else if (num2 > num1 && num2 > num3) {
			BiggestNo = num2;
		} else {
			BiggestNo = num3;
		}

		model.put("BiggestNo", BiggestNo);
		return "result";
	}

}