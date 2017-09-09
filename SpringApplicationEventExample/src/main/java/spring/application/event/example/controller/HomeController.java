package spring.application.event.example.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.hateoas.Link;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import spring.application.event.example.eventlistner.CustomEvent;
import spring.application.event.example.service.CustomService;

@RestController
public class HomeController {

	@Autowired
	private ApplicationEventPublisher eventPublisher;

	@Autowired
	private CustomService customService;

	@GetMapping(value = "/", produces = MediaType.APPLICATION_JSON_VALUE)
	public Link getHome() {
		Link selfLink = new Link("http://localhost:8080/lst");
		return selfLink;
	}

	@GetMapping(value = "/lst", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<String> getList() {
		this.eventPublisher.publishEvent(new CustomEvent("AddedFromEvent"));
		return this.customService.lst();
	}
}
