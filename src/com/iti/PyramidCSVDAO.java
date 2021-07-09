package com.iti;
import java.io.File;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;

public class PyramidCSVDAO {

    List<PyramidInfo> pyramidInfo;

    public PyramidCSVDAO(String rawFile) {
        pyramidInfo = new ArrayList<>();
        File pyramidInfoFile = new File(rawFile);
        List<String> lines = new ArrayList<>();
        try {
            lines = Files.readAllLines(pyramidInfoFile.toPath());
        } catch (Exception e) {
            System.out.println("There is an error: " + e);
        }
        for (int i = 1; i < lines.size(); i++) {
            String line = lines.get(i);
            String[] fields = line.split(",");
            double height = Double.parseDouble(fields[7]);
            PyramidInfo pyramid = new PyramidInfo();
            pyramid.setPharaoh(fields[0]);
            pyramid.setHeight(height);
            pyramid.setModern_name(fields[2]);
            pyramid.setSite(fields[4]);
            pyramidInfo.add(pyramid);
        }
    }

    public void printPyramidList(){
        for(PyramidInfo pyramid: pyramidInfo){
            System.out.println(pyramid);
        }
    }
}