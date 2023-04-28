package com.redis.main;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import redis.clients.jedis.Jedis;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("Welcome home!" , locale);
		
		// Redis 연결
//		Jedis jedis = new Jedis("localhost");
//		Set<String> allKeys = jedis.keys("*");
//		Map<String, String> allData = new HashMap<>();
//		 for (String key : allKeys) {
//		        allData.put(key, jedis.get(key));
//		    }
//		jedis.close();
//		
//		
//		model.addAttribute("allData", allData );
		
		return "home";
	}
	
}
