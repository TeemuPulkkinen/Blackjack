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
public class Blackjack {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Tässä testataan erilaisia koodinpätkiä ^_^
        
        //Viiniä
       
        
        //Luodaan muuttuja johon voidaan lisätä kortteja
        //Korttipakka kasikortit = new Korttipakka();
        
        //lisätään käteen kortteja
        //kasikortit.jaaKortti();
        //System.out.println("Kädessä on kortit " + kasikortit);
        
        
         //Luodaan Korttipakka-luokkaa kutsuen uusi muuttuja peliPakka
        Korttipakka peliPakka = new Korttipakka();

        //jaetaan kortteja niin monta kertaa kuin koodissa esiintyy komento pelipakka.jaaKortti();

        peliPakka.sekoita();

        System.out.println("Korttipakka järjestyksessä");

        peliPakka.sekoita();
        peliPakka.jaaKortti();
        peliPakka.jaaKortti();
        peliPakka.jaaKortti();

        System.out.println(peliPakka);

        
    }
}

