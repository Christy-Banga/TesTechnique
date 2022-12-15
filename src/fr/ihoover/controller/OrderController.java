/**
 * 
 */
package fr.ihoover.controller;

import java.util.List;

import fr.ihoover.model.GridModel;
import fr.ihoover.model.IHooverModel;
import fr.ihoover.model.enums.OrderEnum;

/**
 *
 */
public class OrderController {

	private static final int UNIT_DISTANCE = 1;

	public static IHooverModel getArrivedIHoover(GridModel grid, IHooverModel iHoover, List<OrderEnum> orders) {

		for (OrderEnum orderEnum : orders) {
			switch (orderEnum) {
			case A:
				switch (iHoover.getDirection()) {
				case 0:
					iHoover.setY(iHoover.getY() + UNIT_DISTANCE);
					break;
				case 1:
					iHoover.setX(iHoover.getX() + UNIT_DISTANCE);
					break;
				case 2:
					iHoover.setY(iHoover.getY() - UNIT_DISTANCE);
					break;
				case 3:
					iHoover.setX(iHoover.getX() - UNIT_DISTANCE);
					break;
				}
				// V�rifier que les coordonn�es de l'aspirateur sont toujours dans le cadre initial
				CheckController.checkCadre(grid, iHoover);
				break;
			case G:
				iHoover.setDirectionAndCompass(3 + iHoover.getDirection());
				break;
			case D:
				iHoover.setDirectionAndCompass(1 + iHoover.getDirection());
				break;

			default:
				break;
			}

		}

		return iHoover;
	}


}
