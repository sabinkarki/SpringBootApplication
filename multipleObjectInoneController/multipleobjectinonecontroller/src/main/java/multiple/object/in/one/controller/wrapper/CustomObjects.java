package multiple.object.in.one.controller.wrapper;

import lombok.Getter;
import lombok.Setter;
import multiple.object.in.one.controller.domain.Address;
import multiple.object.in.one.controller.domain.User;

@Getter
@Setter
public class CustomObjects {
	private User user;
	private Address address;
}
