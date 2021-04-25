package ru.karpalov.mainbody.components;


import java.util.HashMap;
import java.util.Map;


public class SearchR {
    Map<String,String> storeRamp = new HashMap<>();

    public SearchR() {
        this.storeAdd();

    }

    public void storeAdd(){
        storeRamp.put("23","6");
        storeRamp.put("88","6");
        storeRamp.put("105","6");

        storeRamp.put("49","7");
        storeRamp.put("64","7");
        storeRamp.put("85","7");
        storeRamp.put("107","7");

        storeRamp.put("69","9");
        storeRamp.put("25","9");
        storeRamp.put("92","9");
        storeRamp.put("54","9");

        storeRamp.put("78","10");
        storeRamp.put("72","10");
        storeRamp.put("76","10");
        storeRamp.put("31","10");
        storeRamp.put("37","10");
        storeRamp.put("67","10");

        storeRamp.put("36","11");
        storeRamp.put("39","11");
        storeRamp.put("75","11");
        storeRamp.put("45","11");

        storeRamp.put("61","12");
        storeRamp.put("11","12");
        storeRamp.put("8","12");
        storeRamp.put("14","12");
        storeRamp.put("2","12");
        storeRamp.put("103","12");

        storeRamp.put("65","13");
        storeRamp.put("4","13");
        storeRamp.put("48","13");
        storeRamp.put("104","13");
        storeRamp.put("6","13");

        storeRamp.put("51","14");
        storeRamp.put("62","14");
        storeRamp.put("15","14");
        storeRamp.put("12","14");
        storeRamp.put("84","14");

        storeRamp.put("59","15");
        storeRamp.put("43","15");
        storeRamp.put("68","15");
        storeRamp.put("13","15");

        storeRamp.put("101","20");
        storeRamp.put("108","20");

        storeRamp.put("82","21");
        storeRamp.put("89","21");
        storeRamp.put("20","21");
        storeRamp.put("71","21");
        storeRamp.put("3","21");
        storeRamp.put("7","21");
        storeRamp.put("17","21");
        storeRamp.put("93","21");
        storeRamp.put("27","21");

        storeRamp.put("66","22");
        storeRamp.put("21","22");
        storeRamp.put("10","22");
        storeRamp.put("5","22");
        storeRamp.put("96","22");
        storeRamp.put("44","22");
        storeRamp.put("35","22");
        storeRamp.put("56","22");
        storeRamp.put("57","22");

        storeRamp.put("53","23");
        storeRamp.put("42","23");
        storeRamp.put("83","23");
        storeRamp.put("74","23");
        storeRamp.put("52","23");
        storeRamp.put("46","23");
        storeRamp.put("29","23");
        storeRamp.put("70","23");

        storeRamp.put("63","24");
        storeRamp.put("28","24");
        storeRamp.put("40","24");
        storeRamp.put("30","24");
        storeRamp.put("33","24");
        storeRamp.put("34","24");
        storeRamp.put("22","24");
        storeRamp.put("81","24");
        storeRamp.put("99","25");

        storeRamp.put("80","25");
        storeRamp.put("90","25");
        storeRamp.put("18","25");
        storeRamp.put("50","25");
        storeRamp.put("94","25");
        storeRamp.put("47","25");
        storeRamp.put("41","25");
        storeRamp.put("24","25");

        storeRamp.put("19","26");
        storeRamp.put("98","26");
        storeRamp.put("95","26");
        storeRamp.put("73","26");
        storeRamp.put("97","26");
        storeRamp.put("60","26");
        storeRamp.put("58","26");
        storeRamp.put("38","26");

        storeRamp.put("109","27");
        storeRamp.put("106","27");
        storeRamp.put("102","27");
        storeRamp.put("100","27");

    }
     public String returnRamp(String store){
        if (store == null){
            return "";
        }else {

         return String.valueOf(storeRamp.get(store));}
     }

}
