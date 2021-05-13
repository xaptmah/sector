package ru.karpalov.mainbody.components;

import java.io.File;
import java.io.FileNotFoundException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public  class Test {
    public static void main(String args[]) throws FileNotFoundException {
        String separator = File.separator;
        String path = "." + separator +"src" + separator + "main" + separator + "resources" + separator + "location of ramps.txt";

        File file = new File(path);


        Map<String,String> storeRamp = new HashMap<>();
        Scanner scanner = new Scanner(file);
        Test test = new Test();
        test.path();
        while (scanner.hasNextLine()){


            String qwer = test.kickDot(scanner.nextLine());
            String splitLine [] = qwer.split(",");
            storeRamp.put(splitLine[0],splitLine[1] );
        }
        System.out.println(storeRamp.get("31"));


    }
    private String kickDot (String line){
        return line.substring(0,line.length()-1);
    }
    private void path(){
        URL inputStream = getClass().getResource("/src/main/resources/location of ramps.txt");
        System.out.println(inputStream);
    }
}
