package fr.ihoover.util;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/*
 * 
 */

/**
 *
 */
public class FileUtil {

	public static List<String> getFileLines(String path) {
		// on instancie les objets
		BufferedReader br = null;
		// On stockera les r�sultats dans cette liste
		List<String> lines = new ArrayList<String>();
		try {

			String sCurrentLine;
			// On lit le fichier.
			br = new BufferedReader(new FileReader(path));
			// On parcourt chaque ligne si elle n'est pas null
			while ((sCurrentLine = br.readLine()) != null) {
				// on ajoute les lignes dans notre liste
				lines.add(sCurrentLine);
			}
			// on retourne
			return lines;
		} catch (IOException e) {
			// si une exception est lev�e on retourne une stacktrace
			e.printStackTrace();
			return null;
		} finally {
			try {
				if (br != null)
					br.close();
			} catch (IOException ex) {
				ex.printStackTrace();
			}
		}

	}

}
