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
	
<<<<<<< HEAD
	
	public String test() {
		return("Test from local");
	}
	 
=======
	//Written by by another devloper
	@GetMapping("/hi")
	public String sayHello(){

	    return "Hi world ";
	}
>>>>>>> 369e67e9814305a3416fd43eb34298509acaa5e4
	
	
}
