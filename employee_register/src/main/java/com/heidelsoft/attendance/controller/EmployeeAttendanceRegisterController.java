/**
 * 
 */
package com.heidelsoft.attendance.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.heidelsoft.attendance.pojo.Greeting;

/**
 * Employee Attendance Register Controller
 * @author lenovo
 *
 */
@Controller
public class EmployeeAttendanceRegisterController {
	@RequestMapping("/test")
	public @ResponseBody String helloWorld(){
		return "<H1>Hello World!!!</H1>";
	}
	
	@GetMapping("/greeting")
	  public String greetingForm(Model model) {
	    model.addAttribute("greeting", new Greeting());
	    return "greeting";
	  }

	  @PostMapping("/greeting")
	  public String greetingSubmit(@ModelAttribute Greeting greeting, Model model) {
		List<Greeting>greetingList = new ArrayList<>();
		greetingList.add(greeting);
		greetingList.add(greeting);
		model.addAttribute("greetings",greetingList);
	    return "result";
	  }
	  @GetMapping("/get/greeting")
	  public String greetingGet(@ModelAttribute Greeting greeting, Model model) {
		List<Greeting>greetingList = new ArrayList<>();
		greetingList.add(greeting);
		//greetingList.add(greeting);
		model.addAttribute("greetings",greetingList);
	    return "result";
	  }

}
