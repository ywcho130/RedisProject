package com.redis.controller;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import redis.clients.jedis.Jedis;


@Controller
@RequestMapping("/redis")
public class RedisController {
	
	@RequestMapping("/list")
	public String list(Model model) {
	
	 // Redis 연결
    Jedis jedis = new Jedis("localhost");
    Set<String> allKeys = jedis.keys("*");
    Map<String, String> allData = new HashMap<>();

    for (String key : allKeys) {
        allData.put(key, jedis.get(key));
    }
    jedis.close();

    model.addAttribute("allData", allData );
		

		return "redis/list";
		
	}
	
	@GetMapping("/write")
	public String writeForm() {
		return "redis/write";
	}
	
	@PostMapping("/write")
	public String write(HttpServletRequest request) {
		
		String first = request.getParameter("first");
		String second = request.getParameter("second");
		Jedis jedis = new Jedis("localhost");
		jedis.set(first, second);
		return "redirect:list";
	}

}
