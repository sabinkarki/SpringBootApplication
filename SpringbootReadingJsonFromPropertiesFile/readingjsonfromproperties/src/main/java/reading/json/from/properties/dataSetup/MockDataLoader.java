package reading.json.from.properties.dataSetup;

import java.io.File;
import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Component;

import com.fasterxml.jackson.databind.ObjectMapper;

import lombok.Getter;
import reading.json.from.properties.model.User;

@Component
public class MockDataLoader implements CommandLineRunner {

	@Getter
	private List<User> users;

	@Override
	public void run(String... arg0) throws Exception {
		String userURL = "/json/users.json";
		Resource rsrc = new ClassPathResource(userURL);
		String path = rsrc.getFile().getAbsolutePath();
		ObjectMapper mapper = new ObjectMapper();
		users = mapper.readValue(new File(path),
				mapper.getTypeFactory().constructCollectionType(List.class, User.class));
	}

}
