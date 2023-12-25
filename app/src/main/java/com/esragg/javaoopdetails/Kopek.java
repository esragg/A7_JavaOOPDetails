package com.esragg.javaoopdetails;

import javax.xml.transform.Source;

public class Kopek extends Hayvan implements Egitim {

    public Kopek() {
        super();
    }
    public Kopek(String isim, String gozRengi, String tuyRengi) {
        super(isim, gozRengi, tuyRengi);
    }

    @Override
    public boolean egitimAl() {
        System.out.println("Kopekler egitilebilir");
        return true;
    }

    @Override
    public boolean egitimAlBody() {
        System.out.println("Kopekler gayet de egitim alir");
        return true;
    }

    @Override
    public void test() {

    }
}
