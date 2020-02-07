package com.web.spring.study.json;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.net.URL;
import java.util.Scanner;

public class JsonTest {

    static String addr = "台北市松山區";
    static int child = 10;
    static int adult = 10;
    static JsonArray datas;
    public static void main(String[] args) throws Exception {
        String path = "https://raw.githubusercontent.com/kiang/pharmacies/master/json/points.json";
        String json = new Scanner(new URL(path).openStream(), "UTF-8").useDelimiter("\\A").next();
        JsonElement jelement = JsonParser.parseString(json);
        datas = jelement.getAsJsonObject().get("features").getAsJsonArray();
        printTable();
    }

    private static void printTable() {
        String leftAlignFormat = "| %-5s | %-5d | %-5d | %-100s %n";
        System.out.format("+-----------+-------+-------+----------------------------------+%n");
        System.out.format("| ID        | Adult | Child | Address                          |%n");
        System.out.format("+-----------+-------+-------+----------------------------------+%n");
        for (int i = 0; i < datas.size(); i++) {
            JsonObject jo = datas.get(i).getAsJsonObject().get("properties").getAsJsonObject();
            if (jo.get("address").getAsString().contains(addr) && (jo.get("mask_child").getAsInt() >= child || (jo.get("mask_adult").getAsInt() >= adult))) {
                System.out.format(leftAlignFormat, jo.get("name").getAsString().substring(0, 4), jo.get("mask_adult").getAsInt(), jo.get("mask_child").getAsInt(), jo.get("address").getAsString());
            }
            
        }
        System.out.format("+-----------+-------+-------+----------------------------------+%n");
    }
}
