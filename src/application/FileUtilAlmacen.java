package application;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import java.util.Scanner;

import java.util.ArrayList; 
import java.io.File;
import java.io.FileNotFoundException;

public class FileUtilAlmacen {

	private final String ruta = "data/clientes.txt";
	private final String separador = "$"; 

	public boolean guardar(Client c) {

		FileWriter fichero = null; 
		try{ 
			fichero = new FileWriter(ruta,true); 
			// Escribimos linea a linea en el fichero
				fichero.write(c.getFirstName());
				fichero.write(separador);
				fichero.write(c.getSecondsName());
				fichero.write(separador);
				fichero.write(c.getUsername());
				fichero.write(separador);
				fichero.write(c.getPassword());
				fichero.write(separador);
				fichero.write(c.getEmail());
				fichero.write(separador);
				fichero.write(String.valueOf(c.getNumero()));
				fichero.write(separador);
				fichero.write(c.getDirection());
				fichero.write("\n");
			fichero.close();
			return true;
		} 
		catch(IOException ex) {
			return false;
		}
	}
	
	public List<Client> leer(){
		
		List<Client> devolver = new ArrayList<Client>();
		
		try {
			File fichero = new File(ruta);
			Scanner s = new Scanner(fichero);
			while (s.hasNextLine()) {
				String linea = s.nextLine();
				if(linea != "") {
					String [] almacen = linea.split("\\$");
					
					int numero = Integer.parseInt(almacen[5]);
					devolver.add(new Client(almacen[0], almacen[1], almacen[2] , almacen[3], almacen[4], numero, almacen[6]));
				}
			}
		}catch (FileNotFoundException ex) {
			devolver = null;
		}
		return devolver;
	}
	
}
