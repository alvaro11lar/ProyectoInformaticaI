package application;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class UserFileHandler {

    public static void main(String[] args) {
        String filePath = "ruta/del/archivo.txt"; // Ruta de tu archivo

        // Leer el archivo
        readFromFile(filePath);

        // Escribir en el archivo
        writeToFile(filePath, "nuevoUsuario", "nuevaContraseña");

        // Volver a leer el archivo para verificar la escritura
        readFromFile(filePath);
    }

    private static void readFromFile(String filePath) {
        try {
            FileReader fileReader = new FileReader(filePath);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            String line;
            while ((line = bufferedReader.readLine()) != null) {
                String[] parts = line.split(":");
                if (parts.length == 2) {
                    String username = parts[0].trim();
                    String password = parts[1].trim();
                    System.out.println("Username: " + username + ", Password: " + password);
                } else {
                    System.err.println("Formato incorrecto en la línea: " + line);
                }
            }

            bufferedReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void writeToFile(String filePath, String newUsername, String newPassword) {
        try {
            FileWriter fileWriter = new FileWriter(filePath, true); // El segundo parámetro true indica modo de apendizaje
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

            // Escribir la nueva línea en el formato "username:password"
            bufferedWriter.write(newUsername + ":" + newPassword);
            bufferedWriter.newLine(); // Añadir una nueva línea

            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
