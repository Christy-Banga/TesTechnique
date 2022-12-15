package fr.ihoover.controller;

import java.util.ArrayList;
import java.util.List;

import fr.ihoover.model.GridModel;
import fr.ihoover.model.IHooverModel;
import fr.ihoover.model.enums.CompassEnum;
import fr.ihoover.model.enums.OrderEnum;

public class ParserController {

	private static final String SEPARATOR = " ";

	public static GridModel parseGrid(String line) {
		int x = 0;
		int y = 0;
		if (line.contains(SEPARATOR)) {
			x = Integer.valueOf(line.split(SEPARATOR)[0]);
			y = Integer.valueOf(line.split(SEPARATOR)[1]);

		}
		return new GridModel(x, y);

	}

	public static IHooverModel parseIHoover(String line) {
		int x = 0;
		int y = 0;
		CompassEnum compass = null;

		if (line.contains(SEPARATOR)) {
			x = Integer.valueOf(line.split(SEPARATOR)[0]);
			y = Integer.valueOf(line.split(SEPARATOR)[1]);
			compass = CompassEnum.valueOf(line.split(SEPARATOR)[2]);
		}

		return new IHooverModel(x, y, compass);

	}

	public static List<OrderEnum> parseOrders(String line) {
		// on instancie notre liste d'ordre
		List<OrderEnum> orders = new ArrayList<OrderEnum>();
		// on liste les lettres de la ligne
		char[] chars = line.toCharArray();
		// On parcourt les lettres pour les ajouter � notre liste d'ordre
		for (char myChar : chars) {
			orders.add(OrderEnum.valueOf(Character.toString(myChar)));
		}

		return orders;
	}

}
