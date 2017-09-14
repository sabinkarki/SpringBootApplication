package reading.json.from.properties.response;

import java.util.HashMap;
import java.util.Map;

import lombok.Getter;
import lombok.Setter;
import reading.json.from.properties.model.User;

public class UserResponse {

    @Getter
    @Setter
  /*  @JsonIgnore*/
	private Map<Integer,User> users;
    
    public UserResponse() {
		users=new HashMap<>();
	}
}

