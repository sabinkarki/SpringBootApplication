package com.boot.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.boot.dataMock.MockDataLoader;
import com.boot.model.Shipwreck;

@RestController
public class ShipWreckController extends BaseController {

	@GetMapping(value = "shipwrecks")
	public List<Shipwreck> listOfShipWreck() {
		return MockDataLoader.list();
	}

	@PostMapping
	public Shipwreck create(@RequestBody Shipwreck shipwreck) {
		return MockDataLoader.create(shipwreck);
	}

	@GetMapping(value = "shipwrecks/{id}")
	public Shipwreck get(@PathVariable Long id) {
		return MockDataLoader.get(id);
	}

	@PutMapping(value = "shipwrecks/{id}")
	public Shipwreck update(@PathVariable Long id, @RequestBody Shipwreck shipwreck) {
		return MockDataLoader.update(id, shipwreck);
	}

	@DeleteMapping(value = "shipwrecks/{id}")
	public Shipwreck delete(@PathVariable Long id) {
		return MockDataLoader.delete(id);
	}
}
