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

    //attribuutit
    private int arvo = 0;
    private String maa = "";

    //konstruktori
    public Kortti(String maa, int arvo) {
        this.arvo = arvo;
        this.maa = maa;
    }

    //muut metodit
    public String getMaa() {
        return maa;
    }

    public int getArvo() {
        return arvo;
    }

    public void setArvo(int arvo) {
        this.arvo = arvo;
    }

    public void setMaa(String maa) {
        this.maa = maa;
    }

    @Override
    public String toString() {

        String kortinNimi = maa + "" + arvo;
        return kortinNimi;
    }

}
