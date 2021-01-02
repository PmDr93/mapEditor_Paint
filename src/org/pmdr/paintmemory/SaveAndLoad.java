package org.pmdr.paintmemory;

import java.io.*;

public class SaveAndLoad {

    private final String filePath = "resources/saved paint.txt";

    //save a string to a file
    public void writeToFile(String gridMemory) {

        try {

            PrintWriter printWriter = new PrintWriter(new FileWriter(filePath));
            printWriter.write(gridMemory);
            //printWriter.flush();

            printWriter.close();

        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }

    //load the string from file
    public String loadFromFile() {

        String paintLoad = "";

        try {

            String buffer;
            BufferedReader bufferedReader = new BufferedReader(new FileReader(filePath));

            while ((buffer = bufferedReader.readLine()) != null) {
                paintLoad += buffer;
            }

            bufferedReader.close();

        } catch (IOException e) {
            System.err.println(e.getMessage());
        }

        return paintLoad;
    }



}
