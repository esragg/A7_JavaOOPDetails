package com.esragg.javaoopdetails;

public interface Egitim {
    public boolean egitimAl();

    public default boolean egitimAlBody() {
        System.out.println("Egitim almiyoruz");
        return false;
    }

    public void test();
}
