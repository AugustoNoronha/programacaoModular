package ex01;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderFunc {

    public static String[] readLinesFromFile(String filePath) {
    	String[] entrada = new String[5]; // ajuste o tamanho da entrada (3 para 10, 5 para 11)
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            int count = 0;
            while ((line = reader.readLine()) != null) {
            	entrada[count] = line;
                count++;
                
            }
            return entrada;
        } catch (IOException e) {
            e.printStackTrace();
        }
		return entrada;
    }


}
