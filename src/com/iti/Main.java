package com.iti;

public class Main {

    public static void main(String[] args) {
        PyramidCSVDAO dao = new PyramidCSVDAO("pyramids.csv");
        dao.printPyramidList();
    }
}