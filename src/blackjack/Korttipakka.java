/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blackjack;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/**
 *
 * @author s1800591
 */
public class Korttipakka {

    //luodaan ArrayList<Kortti>-tyyppinen attribuutti pakka
    private final ArrayList<Kortti> pakka = new ArrayList<>();

    //luodaan luokan Korttipakka oletuskonstruktori
    public Korttipakka() {

        ArrayList<String> maat = new ArrayList<>(Arrays.asList("Pata", "Hertta", "Ruutu", "Risti"));

        //Käy läpi kaikki annetut maat
        for (String maa : maat) {
            int i = 1;

            //käy läpi välin 1-13 , koska listan koko on aina n-1
            while (i < 14) {
                pakka.add(new Kortti(maa, i));

                i++;
            }
        }
    }

    public void shuffle() {
        Collections.shuffle(pakka);

    }

    public jaaKortti() {
        Random rand = new Random();
        int element = pakka.get(rand.nextInt(.size())
        );
        System.out.println("Seuraava kortti on " + element);
    }

}
