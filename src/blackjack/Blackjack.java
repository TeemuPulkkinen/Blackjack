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
        
        //Luodaan muuttuja johon voidaan lisätä kortteja
        //Korttipakka kasikortit = new Korttipakka();
        // 
        //lisätään käteen kortteja
        //kasikortit.jaaKortti();
        //System.out.println("Kädessä on kortit " + kasikortit);
        
        
         //Luodaan Korttipakka-luokkaa kutsuen uusi muuttuja peliPakka
        Korttipakka peliPakka = new Korttipakka();

        //jaetaan kortteja niin monta kertaa kuin koodissa esiintyy komento pelipakka.jaaKortti();

        peliPakka.sekoita(); // sekoitetaan korttipakka
        Kortti kasi = peliPakka.jaaKortti(); // otetaan pakasta kortti ja jaetaan se
        Kortti kasi2 = peliPakka.jaaKortti(); // otetaan toinen kortti ja jaetaan se
        PelaajanKasi peliKasi = new PelaajanKasi(); // luodaan pelaajan käsi
        peliKasi.otaKortti(kasi); //lähetetään kortti pelaajan käteen
        peliKasi.otaKortti(kasi2); // lähetetään toinen kortti pelaajan käteen

        
        
        
        System.out.println(peliPakka);
        System.out.println(kasi);
        System.out.println(kasi2);
        System.out.println(peliKasi);

        
    }
}

