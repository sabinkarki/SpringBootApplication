package com.boot.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.boot.model.Shipwreck;
import com.boot.repository.ShipwreckRepository;

@Service
@Transactional
public class ShipwreckService implements CommonService<Long, Shipwreck> {

	@Autowired
	private ShipwreckRepository shipWreckRepository;

	@Override
	public Shipwreck findOne(Long id) {
		// TODO Auto-generated method stub
		return this.shipWreckRepository.findOne(id);
	}

	@Override
	public List<Shipwreck> findAll() {
		return (List<Shipwreck>) this.shipWreckRepository.findAll();
	}

	@Override
	public Shipwreck create(Shipwreck wreck) {
		// TODO Auto-generated method stub
		return this.shipWreckRepository.save(wreck);
	}

	@Override
	public Shipwreck delete(Long id) {
		// TODO Auto-generated method stub
		Shipwreck tempWreck = this.shipWreckRepository.findOne(id);
		if (tempWreck == null) {

		}
		this.shipWreckRepository.delete(tempWreck);
		return tempWreck;

	}

	@Override
	public Shipwreck update(Long id, Shipwreck wreck) {
		Shipwreck tempWreck = this.shipWreckRepository.findOne(id);
		if (tempWreck == null) {

		}
		BeanUtils.copyProperties(wreck, tempWreck);
		return this.shipWreckRepository.save(tempWreck);
	}

}
