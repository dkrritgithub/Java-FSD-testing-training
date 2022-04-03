package com.ust1.spring.springcoreadvanced.injecting.interfaces.annotations;

public class OrderDAOImpl2 implements OrderDAO {

	@Override
	public void createOrder() {
		System.out.println("inside OrderDAOImpl2 createOrder()");

	}
}
