package reading.json.from.properties.model;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode
public class User {
	private int id;
	private String name;
	private String address;
	private int count;
}
