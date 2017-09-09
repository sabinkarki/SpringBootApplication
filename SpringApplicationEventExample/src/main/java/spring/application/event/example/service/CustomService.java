package spring.application.event.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import spring.application.event.example.mockdata.MockData;

@Service
public class CustomService {

	@Autowired
	private MockData mockData;

	public List<String> lst() {
		return this.mockData.lst();
	}

}
