package com.boot.service;

import java.util.List;

public interface CommonService<T, R> {

	R findOne(T t);

	List<R> findAll();

	R create(R r);

	R delete(T t);

	R update(T t,R r);

}
