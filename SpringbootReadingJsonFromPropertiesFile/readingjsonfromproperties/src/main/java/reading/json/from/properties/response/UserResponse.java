package reading.json.from.properties.response;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import lombok.Getter;
import lombok.Setter;
import reading.json.from.properties.model.User;

public class UserResponse {
	/*
	 * @Getter
	 * 
	 * @Setter
	 * 
	 * @JsonIgnore private Map<Integer,User> users;
	 */

	@Getter
	@Setter
	private List<User> lstusers;

	public UserResponse() {
		//users = new HashMap<>();
		lstusers = new ArrayList<>();
	}
}
