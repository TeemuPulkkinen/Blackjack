/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blackjack;

/**
 *
 * @author s1800591
 */
public class Kortti {

    //atribuutit, ehkä tarvitaan private
    int arvo = 0;
    String maa = "";
    //String kortinNimi = "";

    //konstruktori
    public Kortti(int kortinArvo, String kortinMaa) {
        this.arvo = kortinArvo;
        this.maa = kortinMaa;
    }

    //muut metodit
    void setArvo(Integer arvo) {
        this.arvo = arvo;
    }

    void setMaa(String maa) {
        this.maa = maa;
    }

    String getMaa() {
        return maa;
    }

    Integer getArvo() {
        return arvo;
    }

    @Override
    public String toString() {
        String kortinNimi;
        return kortinNimi = maa + "" + arvo;
    }
    //testikommentti
}
