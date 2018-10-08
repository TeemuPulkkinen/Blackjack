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

    //atribuutit
    private int arvo = 0;
    private String maa = "";
    
    private static int[] arvot = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13};
    private static String[] maat = {"Risti","Ruutu","Hertta","Pata"};

    //konstruktori
    public Kortti(int kortinArvo, String kortinMaa) {
        this.arvo = kortinArvo;
        this.maa = kortinMaa;
    }
    
    public String toString(){
        return arvot[arvo]+", "+maat[maa];
    }
    
    //muut metodit
}
