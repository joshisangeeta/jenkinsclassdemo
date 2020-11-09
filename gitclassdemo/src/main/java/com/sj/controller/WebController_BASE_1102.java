/**
 * 
 */
package com.sj.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author HP
 *
 */
@RestController
public class WebController {

	@GetMapping("/hello")
	public String sayHi() {
		return "Hello world";
	}
	
	
	
	
	
	
}
