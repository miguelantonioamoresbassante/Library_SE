package com.library.service;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.library.model.Reserve;

public class ReserveService implements ReserveServiceLocal {
	
	@PersistenceContext(unitName="Library")
	private EntityManager em;
	
	
	public void setEm(EntityManager em) {
		this.em = em;
	}


	public List<Reserve> queryAllReserves() {
		// TODO Auto-generated method stub
		return em.createNativeQuery("Reserve.findAll").getResultList();
	}

}
