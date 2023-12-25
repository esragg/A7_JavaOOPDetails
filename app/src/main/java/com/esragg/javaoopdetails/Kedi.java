package com.esragg.javaoopdetails;

public class Kedi implements Egitim{
    String isim;
    String gozRengi;
    String tuyRengi;
    public static final String turIsmi = "felis";

    public Kedi() {

    }
    public Kedi(String isim, String gozRengi, String tuyRengi) {
        this.isim = isim;
        this.gozRengi = gozRengi;
        this.tuyRengi = tuyRengi;
    }

    public static void konusKediStatic() {
        System.out.println("Benim turum: " + turIsmi);
    }

    public void konusKedi() {
        System.out.println("Benim ismim: " + this.isim + " Benim turum: " + turIsmi);
    }

    @Override
    public boolean egitimAl() {
        System.out.println("Kediler egitilemez");
        return false;
    }

    @Override
    public void test() {

    }
}
