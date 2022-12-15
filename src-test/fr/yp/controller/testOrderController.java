package fr.yp.controller;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import fr.ihoover.controller.ParserController;
import fr.ihoover.model.GridModel;
import fr.ihoover.model.IHooverModel;
import fr.ihoover.model.enums.CompassEnum;
import fr.ihoover.model.enums.OrderEnum;

public class testOrderController {

	@Test
	public void testGridParser() {

		String line = "140 56";
		GridModel myGrid = ParserController.parseGrid(line);
		GridModel expectedGrid = new GridModel(140, 56);

		System.out.println("myGrid :" + myGrid);
		System.out.println("expectedGrid :" + expectedGrid);
	}

	@Test
	public void testIHooverParser() {

		String line = "70 27 N";
		IHooverModel myIHoover = ParserController.parseIHoover(line);
		IHooverModel expectedIHoover = new IHooverModel(70, 27, CompassEnum.N);

		System.out.println("myIHoover :" + myIHoover);
		System.out.println("expectedIHoover :" + expectedIHoover);
	}

	@Test
	public void testOrderParser() {

		String line = "DADADADAA";
		List<OrderEnum> myOrders = ParserController.parseOrders(line);
		List<OrderEnum> expectedOrders = new ArrayList<OrderEnum>();
		expectedOrders.add(OrderEnum.D);
		expectedOrders.add(OrderEnum.A);
		expectedOrders.add(OrderEnum.D);
		expectedOrders.add(OrderEnum.A);
		expectedOrders.add(OrderEnum.D);
		expectedOrders.add(OrderEnum.A);
		expectedOrders.add(OrderEnum.D);
		expectedOrders.add(OrderEnum.A);
		expectedOrders.add(OrderEnum.A);
		System.out.println("myOrders :" + myOrders);
		System.out.println("expectedOrders :" + expectedOrders);
	}
}
