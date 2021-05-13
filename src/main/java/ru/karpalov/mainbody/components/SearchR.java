package ru.karpalov.mainbody.components;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class SearchR {
    //String separator = File.separator;
    //InputStream input = .getResourceAsStream("location of ramps.txt");

    //String path = "location of ramps.txt";
    //File file = new File(path);
    //Scanner scanner = new Scanner(file);



    Map<String,String> storeRamp = new HashMap<>();

    public SearchR() throws FileNotFoundException {
       // this.storeAdd();
        this.path();

    }

    /**public void storeAdd(){
        while (scanner.hasNextLine()){
            String qwer = kickDot(scanner.nextLine());
            String splitLine [] = qwer.split(",");
            storeRamp.put(splitLine[0],splitLine[1] );
        }
        storeRamp.put("23","6");

    }*/
     public String returnRamp(String store){
        if (store == null){
            return "";
        }else {

         return String.valueOf(storeRamp.get(store));}
     }
    private String kickDot (String line){
        return line.substring(0,line.length()-1);
    }

    private void path(){


       System.out.println();
        new TxtPath().exit();
    }
    public class TxtPath {
        public void exit(){
            //System.out.println(TxtPath.class.getClass());
            System.out.println(TxtPath.class.getClassLoader().getResourceAsStream("/src/main/resources/location of ramps.txt"));
        }
        private TxtPath(){}
    }


}
