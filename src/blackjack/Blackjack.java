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
        /*
        peliKasi.otaKortti(new Kortti("Ruutu", 1)); voi testata yksittäisten
        korttien nostoa. Tai tiettyjä käsiä.
        */

        Scanner lukija = new Scanner(System.in);
        Korttipakka peliPakka = new Korttipakka();

        String lisakortti;

        peliPakka.sekoita(); // sekoitetaan korttipakka

        PelaajanKasi peliKasi = new PelaajanKasi(); // luodaan pelaajan käsi

        System.out.println("Nostetaan seuraava kortti.");
        Kortti uusiKasikortti = peliPakka.jaaKortti(); // otetaan pakasta kortti ja jaetaan se
        //peliKasi.otaKortti(uusiKasikortti); //lähetetään kortti pelaajan käteen
        peliKasi.otaKortti(new Kortti("Ruutu ", 1));
        System.out.println("Ensimmäinen korttisi on " + uusiKasikortti);
        uusiKasikortti = peliPakka.jaaKortti(); // otetaan pakasta kortti ja jaetaan se
        //peliKasi.otaKortti(uusiKasikortti);
        peliKasi.otaKortti(new Kortti("Hertta ", 1));
        System.out.println("Toinen korttisi on " + uusiKasikortti);

        //testiä
        peliKasi.selvitaSumma(); // käytetään selvitaSumma-muuttujaa pelaajan käteen

        System.out.println(peliKasi);
        System.out.println("Haluatko nostaa lisää kortteja? (k/e)");
        lisakortti = lukija.nextLine();

        while (lisakortti.equalsIgnoreCase("k")) {
            uusiKasikortti = peliPakka.jaaKortti();
            //peliKasi.otaKortti(uusiKasikortti);
            System.out.println(peliKasi);
            System.out.println("Uusi kortti on " + uusiKasikortti);
            System.out.println("Haluatko nostaa lisää kortteja? (k/e)");
            lisakortti = lukija.nextLine();

        }

    }

}
