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

    private final ArrayList<Kortti> kortit = new ArrayList<>();

    public int otaKortti(int satunnaisKortti) {

        int pelaajankasi = satunnaisKortti;
        return satunnaisKortti;
    }

    int arvo = 0;
    int kortti1 = 0;
    int kortti2 = 0;

    public int selvitaSumma(int kadenSumma) {

        if (arvo >= 2 || arvo <= 10) {

            kadenSumma = kadenSumma + arvo;
        }
        if (arvo >= 11 || arvo <= 13) {

            kadenSumma = kadenSumma + 10;
        }
        if (arvo == 1) {

            kadenSumma = kadenSumma + 11;
        }
        if (kortti1 + kortti2 == 21) {

            kadenSumma = kadenSumma - 10;
        }
        return kadenSumma;
    }

    //selvittää onko pelaajalla blackjack
    public void blackjack() {

        if (kortti1 >= 10 && kortti1 <= 13 && kortti2 == 1) {
            System.out.println("Sinulla on blackjack!");
        }
    }

}
