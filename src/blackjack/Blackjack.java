/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blackjack;

import java.util.Scanner;

/**
 *
 * @author s1800591
 */
public class Blackjack {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

       Scanner lukija = new Scanner(System.in);
        Korttipakka peliPakka = new Korttipakka();
        
        String lisakortti;
        //jaetaan kortteja niin monta kertaa kuin koodissa esiintyy komento pelipakka.jaaKortti();
        peliPakka.sekoita(); // sekoitetaan korttipakka
        Kortti uusiKasikortti = peliPakka.jaaKortti(); // otetaan pakasta kortti ja jaetaan se
        Kortti uusiKasikortti2 = peliPakka.jaaKortti(); // otetaan toinen kortti ja jaetaan se
        PelaajanKasi peliKasi = new PelaajanKasi(); // luodaan pelaajan käsi
        PelaajanKasi loppuSumma = new PelaajanKasi();
        peliKasi.otaKortti(uusiKasikortti); //lähetetään kortti pelaajan käteen
        System.out.println("Nostetaan seuraava kortti.");
        peliKasi.otaKortti(uusiKasikortti2); // lähetetään toinen kortti pelaajan käteen
        
        peliKasi.selvitaSumma(); // käytetään selvitaSumma-muuttujaa pelaajan käteen
        loppuSumma.selvitaSumma();

        System.out.println(peliPakka);
        System.out.println(uusiKasikortti);
        System.out.println(uusiKasikortti2);
        System.out.println(peliKasi);
        System.out.println("Haluatko nostaa lisää kortteja? (k/e)");
        lisakortti = lukija.nextLine();
        int i;
        for (i = 0; i <=2; lisakortti.equalsIgnoreCase("k") ) {
            peliKasi.otaKortti(uusiKasikortti);
            i++;
        }
            System.out.println(loppuSumma);  
        }
       

    }
