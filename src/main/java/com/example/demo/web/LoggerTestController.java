package com.example.demo.web;

import com.example.demo.annotation.Log;
import org.slf4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by jh on 2018-01-03.
 */
@Controller
@RequestMapping
public class LoggerTestController {
	@Log
	private Logger logger;

	@ResponseBody
	@RequestMapping("/test")
	public String Test() {
		logger.info("logger annotation is good!");

		return "logger annotation is good";
	}
}
