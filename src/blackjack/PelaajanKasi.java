/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blackjack;

import java.util.ArrayList;

/**
 *
 * @author s1800591
 */
public class PelaajanKasi {

    private ArrayList<Kortti> kortit = new ArrayList<>();

    public void otaKortti(Kortti jaettu) {
        kortit.add(jaettu); // otetaan pääohjelmasta lähetetty kortti vastaan ja lisätään se pelaajan käden listaan
    }

    public int selvitaSumma() {

        int kadenSumma = 0;
        /* Tämä for each-looppi käy läpi kortit-listassa olevat kortit ja tarkistaa
        Kortti-tyypin muuttujan lappu avulla kortin arvon, ja vertaa sitä
        annettuihin arvoihin.
         */
        

        for (Kortti lappu : kortit) {

            
            if (lappu.getArvo() >= 2 && lappu.getArvo() <= 10) {

                kadenSumma = kadenSumma + lappu.getArvo();
            } else if (lappu.getArvo() >= 11 && lappu.getArvo() <= 13) {

                kadenSumma = kadenSumma + 10;
            } else if (lappu.getArvo() == 1) {

                kadenSumma = kadenSumma + 11;
            // jos indeksissä 1 olevan kortin arvo on 0, lisätään 2 eli 1
            } if (kortit.get(1).equals(14)) {
                
                kadenSumma = kadenSumma + 1;
                
            }
            
            

        }
        
        if (kortit.size() == 2 && kadenSumma > 21) {
                // toisen ässän lista-arvoksi asetetaan 0, jotta voidaan lisätä 2 eli 1.
                System.out.println("Sait kaksi ässää, toisen arvoksi asetetaan 1.");
                kadenSumma = kadenSumma - 10;
                kortit.get(1).getArvo();
                kortit.get(1).setArvo(14);

            }
        return kadenSumma;//palauttaa käden summan
    }

    //selvittää onko pelaajalla blackjack
    
    public boolean blackjack() {
           
        boolean selvitaBlackjack = false;
        
            if (kortit.size() == 2 && selvitaSumma() == 21) {
                
                selvitaBlackjack = true;
            }
        
        
        return selvitaBlackjack;
    }
     
    @Override
    public String toString() {
        return "Pelaajan kädessä on kortit " + kortit + ", joiden summa on " + selvitaSumma() + ".";
    }

}
