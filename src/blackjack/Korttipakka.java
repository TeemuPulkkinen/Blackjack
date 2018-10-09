/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blackjack;

import java.util.*;


/**
 *
 * @author s1800591
 */
public class Korttipakka {

    //nämä ei ole listoja vaan taulukkoja
    public static String[] arvot = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13"};
    public static String[] maat = {"Risti", "Ruutu", "Hertta", "Pata"};
    //luodaan ArrayList
    public ArrayList<Kortti> pakka = new ArrayList<Kortti>();

    for (int a=0; a<=arvot.length(); a++)
            {
                for (int b=0; b<= maat.length(); b++)
                 {
                   pakka.add(new Kortti(arvot[a], maat[b]));  //I've noticed many people use this to add the card names and suits to the cards ArrayList, and it gives me an error of not being able to turn suits[b] into an integer, so I'm confused as to how it worked for others  

                 }
    /*public Korttipakka() {
        pakka.add(new Kortti(1, "Ristiässä"));
        pakka.add(new Kortti(2, "Risti"));
        pakka.add(new Kortti(3, "Risti"));
        pakka.add(new Kortti(4, "Risti"));
        pakka.add(new Kortti(5, "Risti"));
        pakka.add(new Kortti(6, "Risti"));
        pakka.add(new Kortti(7, "Risti"));
        pakka.add(new Kortti(8, "Risti"));
        pakka.add(new Kortti(9, "Risti"));
        pakka.add(new Kortti(10, "Risti"));
        pakka.add(new Kortti(11, "Ristijätkä"));
        pakka.add(new Kortti(12, "Ristiakka"));
        pakka.add(new Kortti(13, "Ristikurko"));

        pakka.add(new Kortti(1, "Pataässä"));
        pakka.add(new Kortti(2, "Pata"));
        pakka.add(new Kortti(3, "Pata"));
        pakka.add(new Kortti(4, "Pata"));
        pakka.add(new Kortti(5, "Pata"));
        pakka.add(new Kortti(6, "Pata"));
        pakka.add(new Kortti(7, "Pata"));
        pakka.add(new Kortti(8, "Pata"));
        pakka.add(new Kortti(9, "Pata"));
        pakka.add(new Kortti(10, "Pata"));
        pakka.add(new Kortti(11, "Patajätkä"));
        pakka.add(new Kortti(12, "Pata-akka"));
        pakka.add(new Kortti(13, "Patakurko"));

        pakka.add(new Kortti(1, "Herttaässä"));
        pakka.add(new Kortti(2, "Hertta"));
        pakka.add(new Kortti(3, "Hertta"));
        pakka.add(new Kortti(4, "Hertta"));
        pakka.add(new Kortti(5, "Hertta"));
        pakka.add(new Kortti(6, "Hertta"));
        pakka.add(new Kortti(7, "Hertta"));
        pakka.add(new Kortti(8, "Hertta"));
        pakka.add(new Kortti(9, "Hertta"));
        pakka.add(new Kortti(10, "Hertta"));
        pakka.add(new Kortti(11, "Herttajätkä"));
        pakka.add(new Kortti(12, "Hertta-akka"));
        pakka.add(new Kortti(13, "Herttakurko"));

        pakka.add(new Kortti(1, "Ruutuässä"));
        pakka.add(new Kortti(2, "Ruutu"));
        pakka.add(new Kortti(3, "Ruutu"));
        pakka.add(new Kortti(4, "Ruutu"));
        pakka.add(new Kortti(5, "Ruutu"));
        pakka.add(new Kortti(6, "Ruutu"));
        pakka.add(new Kortti(7, "Ruutu"));
        pakka.add(new Kortti(8, "Ruutu"));
        pakka.add(new Kortti(9, "Ruutu"));
        pakka.add(new Kortti(10, "Ruutu"));
        pakka.add(new Kortti(11, "Ruutujätkä"));
        pakka.add(new Kortti(12, "Ruutuakka"));
        pakka.add(new Kortti(13, "Ruutukurko"));

    }*/


    public void shuffle() {
        Collections.shuffle(pakka);
        
    }
    
    public jaaKortti() {
        Random rand = new Random();
        int element = pakka.get(rand.nextInt(.size()));
        System.out.println("Seuraava kortti on " + element);
    }
        
}


