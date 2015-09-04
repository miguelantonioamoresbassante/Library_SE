package com.library.service;

import java.util.List;

import javax.ejb.Local;

import com.library.model.Reserve;

@Local
public interface ReserveServiceLocal {
	
	List<Reserve> queryAllReserves();

}
