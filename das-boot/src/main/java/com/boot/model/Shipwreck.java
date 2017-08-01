package com.boot.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class Shipwreck {
	private Long id;
	private String name;
	private String description;
	private String condition;
	private Integer depth;
	private Double latitude;
	private Double longitude;
	private Integer yearDiscovered;

}
