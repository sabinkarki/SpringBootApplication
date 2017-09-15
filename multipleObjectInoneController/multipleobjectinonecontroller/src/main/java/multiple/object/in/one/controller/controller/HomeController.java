package multiple.object.in.one.controller.controller;

import java.io.IOException;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import multiple.object.in.one.controller.domain.Address;
import multiple.object.in.one.controller.domain.User;
import multiple.object.in.one.controller.wrapper.CustomObjects;

@RestController
public class HomeController {

	@PostMapping(value = "/withWraperObject")
	public User user(@RequestBody CustomObjects custom) {
		User user = custom.getUser();
		Address address = custom.getAddress();
		return user;
	}

	@PostMapping(value = "/withmultipleObject")
	public Address address(@RequestBody String str) throws JsonProcessingException, IOException {
		ObjectMapper mapper = new ObjectMapper();
		JsonNode node = mapper.readTree(str);
		User theUser = mapper.convertValue(node.get("user"), User.class);
		Address theAddress = mapper.convertValue(node.get("address"), Address.class);
		return theAddress;
	}
}
