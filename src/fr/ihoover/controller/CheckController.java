package fr.ihoover.controller;

import fr.ihoover.model.GridModel;
import fr.ihoover.model.IHooverModel;

public class CheckController {


	public static void checkCadre(GridModel grid, IHooverModel iHoover) {
//			je verifie que je reste dans le cadre
		if (iHoover.getY() > grid.getHeight() || iHoover.getX() > grid.getWidth()) {
				System.out.println("la destination de l'aspirateur est Hors cadre!");
				System.exit(0);
			}
	}
}
