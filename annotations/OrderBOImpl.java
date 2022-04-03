package com.ust1.spring.springcoreadvanced.injecting.interfaces.annotations;

public class OrderBOImpl implements OrderBo {

	private OrderDAO dao;

	@Override
	public void placeOrder() {
		System.out.println("Inside OrderBO placeOrder()");
		dao.createOrder();

	}

	public OrderDAO getDao() {
		return dao;
	}

	public void setDao(OrderDAO dao) {
		this.dao = dao;
	}

}