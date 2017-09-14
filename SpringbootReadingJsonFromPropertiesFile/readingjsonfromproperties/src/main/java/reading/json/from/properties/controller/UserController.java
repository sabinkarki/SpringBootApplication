package reading.json.from.properties.controller;

import java.time.temporal.TemporalUnit;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.annotation.JsonIgnore;

import reading.json.from.properties.dataSetup.MockDataLoader;
import reading.json.from.properties.model.User;
import reading.json.from.properties.response.UserResponse;

@RestController
public class UserController {

	@Autowired
	private MockDataLoader mockDataLoader;

	/* Map<Integer, User> */

	/* List<User> */
	@GetMapping(value = "/")
	public ResponseEntity<UserResponse> users() {
		List<User> users = mockDataLoader.getUsers();
		Map<Integer, User> myMap = new HashMap<Integer, User>();
		users.forEach(user -> {
			if (myMap.containsKey(user.getId())) {
				user.setCount(myMap.get(user.getId()).getCount() + 1);
				myMap.put(user.getId(), user);
			} else {
				myMap.put(user.getId(), user);
			}
		});
		UserResponse response = new UserResponse();
		response.setUsers(myMap);

		return new ResponseEntity<UserResponse>(response, HttpStatus.OK);

		// return myMap;
		/*
		 * List<User> users2 = new ArrayList<>(); myMap.forEach((k, v) -> {
		 * users2.add(v);
		 * 
		 * }); return users2;
		 */
	}

}
