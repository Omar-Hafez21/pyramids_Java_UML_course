package com.iti;

public class PyramidInfo {

    private String pharaoh;
    private String modern_name;
    private String site;
    private double height;

    @Override
    public String toString() {
        return "Pyramid: " +
                "Pharaoh ='" + pharaoh + '\'' +
                ", Modern name ='" + modern_name + '\'' +
                ", Site = '" + site + '\'' +
                ", Height = " + height;
    }

    public void setPharaoh(String pharaoh) {
        this.pharaoh = pharaoh;
    }

    public void setModern_name(String modern_name) {
        this.modern_name = modern_name;
    }

    public void setSite(String site) {
        this.site = site;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public String getPharaoh() {
        return pharaoh;
    }

    public String getModern_name() {
        return modern_name;
    }

    public String getSite() {
        return site;
    }

    public double getHeight() {
        return height;
    }
}
