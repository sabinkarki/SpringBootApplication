package reading.json.from.properties.response;

import java.util.List;

import lombok.Getter;
import lombok.Setter;
import reading.json.from.properties.model.User;

public class UserResponse {

	@Getter
	@Setter
	private List<User> users;
}
