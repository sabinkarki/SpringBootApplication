package spring.application.event.example.mockdata;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class MockData implements CommandLineRunner {

	@Value("${key}")
	private String surname;
	private List<String> myList;

	@Override
	public void run(String... args) throws Exception {
		myList = new ArrayList<String>();
		myList.add("Sabin");
		myList.add("Nikita");
		myList.add(surname);
	}

	public void add(String str) {
		myList.add(str);
	}

	public List<String> lst() {
		return this.myList;
	}

}
