package filter.inceptor.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

	@GetMapping(value = "/")
	public String getString() {
		return "Hello from HomeController";
	}

	@GetMapping(value = "/webFilter1")
	public List myList() {
		List myList = new ArrayList<>();
		myList.add("Sabin");
		myList.add("Nikita");
		return myList;
	}

	@GetMapping(value = "/webFilter2")
	public String fromWebFilter() {
		return "Filter WebFilter2 works";
	}

	@GetMapping(value = "/interceptorTest")
	public String interceptorTest() {
		return "Interceptor Works";
	}

}
