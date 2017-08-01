package com.boot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.boot.dataMock.MockDataLoader;
import com.boot.model.Shipwreck;
import com.boot.service.ShipwreckService;

@RestController
public class ShipwreckController extends BaseController {

	@Autowired
	private ShipwreckService shipwreckService;

	@GetMapping(value = "shipwrecks")
	public List<Shipwreck> listOfShipWreck() {
		// return MockDataLoader.list();
		return shipwreckService.findAll();
	}

	@PostMapping(value = "shipwrecks")
	public Shipwreck create(@RequestBody Shipwreck shipwreck) {
		// return MockDataLoader.create(shipwreck);
		return shipwreckService.create(shipwreck);
	}

	@GetMapping(value = "shipwrecks/{id}")
	public Shipwreck get(@PathVariable Long id) {
		// return MockDataLoader.get(id);
		return shipwreckService.findOne(id);
	}

	@PutMapping(value = "shipwrecks/{id}")
	public Shipwreck update(@PathVariable Long id, @RequestBody Shipwreck shipwreck) {
		// return MockDataLoader.update(id, shipwreck);
		return shipwreckService.update(id, shipwreck);
	}

	@DeleteMapping(value = "shipwrecks/{id}")
	public Shipwreck delete(@PathVariable Long id) {
		// return MockDataLoader.delete(id);
		return shipwreckService.delete(id);
	}
}
