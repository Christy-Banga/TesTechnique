package fr.ihoover.view;

import java.util.List;

import fr.ihoover.controller.OrderController;
import fr.ihoover.model.IHooverModel;
import fr.ihoover.model.ParameterModel;
import fr.ihoover.util.FileUtil;

public class Main {

	public static void main(String[] args) {
		System.out.println(":::::::: Bienvenu dans IHoover ::::::::\n");

		// On positionne la valeur de fichier par defaut iHoover
		String path = "iHoover";
		// On detecte si un autre fichier d'entr�e est positionne
		if (args.length == 1) {
			path = args[0];
		}
		// on parse le fichier
		List<String> lines = FileUtil.getFileLines(path);

		// 1
		System.out.println("1) Recuperation du contenu du fichier");
		System.out.println("lignes " + lines);

		// 2
		System.out.println("2) Donnees en entree");
		ParameterModel parameter = new ParameterModel(lines);
		System.out.println("Dimension de la grille : " + parameter.getGrid());
		System.out.println("Position initiale : " + parameter.getIHoover());
		System.out.println("Instruction : " + parameter.getOrders());

		// 3
		System.out.println("3) Resultat");
		IHooverModel iHooverArrived = OrderController.getArrivedIHoover(parameter.getGrid(), parameter.getIHoover(),
				parameter.getOrders());
		System.out.println("Position finale " + iHooverArrived);

		// fin
		System.out.println("\n:::::::: Fin du programme ::::::::");
	}

}
