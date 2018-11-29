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

    private final ArrayList<Kortti> pelaajanKortit = new ArrayList<>();

    public void otaKortti(Kortti jaettu) {
        pelaajanKortit.add(jaettu); // otetaan pääohjelmasta lähetetty kortti vastaan ja lisätään se pelaajan käden listaan
    }

    public int selvitaSumma() {

        int kadenSumma = 0;
        /* Tämä for-looppi käy läpi kortit-listassa olevat kortit ja tarkistaa
        Kortti-tyypin muuttujan lappu avulla kortin arvon, ja vertaa sitä
        annettuihin arvoihin.
         */
        for (Kortti lappu : pelaajanKortit) {

            if (lappu.getArvo() >= 2 && lappu.getArvo() <= 10) {

                kadenSumma = kadenSumma + lappu.getArvo();
            } else if (lappu.getArvo() >= 11 && lappu.getArvo() <= 13) {

                kadenSumma = kadenSumma + 10;
            } else if (lappu.getArvo() == 1) {

                kadenSumma = kadenSumma + 11;
            }

        }

        return kadenSumma;//palauttaa käden summan
    }

    //selvittää onko pelaajalla blackjack
    /*public void blackjack() {

        if (lappu >= 10 && lappu <= 13 && lappu2 == 1) {
            System.out.println("Sinulla on blackjack!");
        }

    }*/
    @Override
    public String toString() {
        return "Pelaajan kädessä on kortit " + pelaajanKortit + ", joiden summa on " + selvitaSumma() + ".";
    }

}
