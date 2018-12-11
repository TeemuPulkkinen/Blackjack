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
        // eurooppalainen blackjack

        Scanner lukija = new Scanner(System.in);
        Korttipakka peliPakka = new Korttipakka();

        String lisakortti;

        peliPakka.sekoita(); // sekoitetaan korttipakka

        PelaajanKasi peliKasi = new PelaajanKasi(); // luodaan pelaajan käsi
        PelaajanKasi emannanKasi = new PelaajanKasi();
        /*
        Uusi PelaajanKasi luokan olio tekee kopion kaikista sen luokan metodeista,
        listoista, muuttujista ja sen sellaisesta. Eli emännälle ei esimerkiksi
        tarvitse tehdä omaa listaa.
         */
        Kortti uusiKasikortti = peliPakka.jaaKortti(); // otetaan pakasta kortti ja jaetaan se pelaajalle

        peliKasi.otaKortti(uusiKasikortti); //lähetetään kortti pelaajan käteen
        //peliKasi.otaKortti(new Kortti("Ruutu ", 1));
        System.out.println("Ensimmäinen korttisi on " + uusiKasikortti + ".");
        System.out.println("Emäntä nostaa ensimmäisen korttinsa.");
        Kortti uusiEmannanKortti = peliPakka.jaaKortti(); //otetaan pakasta kortti ja jaetaan se emännälle
        emannanKasi.otaKortti(uusiEmannanKortti); //lähetetään kortti emännän käteen
        System.out.println("Emännän ensimmäinen kortti on " + uusiEmannanKortti + ".");
        System.out.println("Nostetaan seuraava pelaajan kortti.");
        uusiKasikortti = peliPakka.jaaKortti(); // otetaan pakasta kortti ja jaetaan se
        peliKasi.otaKortti(uusiKasikortti);
        //peliKasi.otaKortti(new Kortti("Hertta ", 12));
        System.out.println("Toinen korttisi on " + uusiKasikortti + ".");

        //testiä
        peliKasi.selvitaSumma(); // käytetään selvitaSumma-muuttujaa pelaajan käteen

        System.out.println("Pelaajan" + peliKasi);
        peliKasi.blackjack();
        System.out.println("Haluatko nostaa lisää kortteja? (k/e)");
        lisakortti = lukija.nextLine();

        while (lisakortti.equalsIgnoreCase("k")) {
            uusiKasikortti = peliPakka.jaaKortti();
            peliKasi.otaKortti(uusiKasikortti);
            System.out.println("Uusi kortti on " + uusiKasikortti);
            System.out.println("Pelaajan" + peliKasi);
            if (peliKasi.selvitaSumma() >= 21) {
                if (peliKasi.selvitaSumma() == 21) {
                    break;
                } else {
                    System.out.println("Hävisit!");
                    System.exit(0);//lopettaa Java-ohjelman
                }

            }
            System.out.println("Haluatko nostaa lisää kortteja? (k/e)");
            lisakortti = lukija.nextLine();
            if (lisakortti.equalsIgnoreCase("e")) {
                System.out.println("Lopullinen käsi on " + peliKasi.selvitaSumma());
                System.out.println("Nyt on emännän vuoro pelata!");
                break;
            }

        }
        /*
        Emäntä pelaa tässä oman vaiheensa.
         */
        System.out.println("Emäntä nostaa toisen kortin.");
        uusiEmannanKortti = peliPakka.jaaKortti(); //otetaan pakasta kortti ja jaetaan se emännälle
        emannanKasi.otaKortti(uusiEmannanKortti); //lähetetään kortti emännän käteen
        System.out.println("Emännän toinen kortti on " + uusiEmannanKortti + ".");
        System.out.println("Emännän" + emannanKasi);
        while (emannanKasi.selvitaSumma() < 15) {

            uusiEmannanKortti = peliPakka.jaaKortti();
            emannanKasi.otaKortti(uusiEmannanKortti);
            if (emannanKasi.selvitaSumma() >= 15) {
                break;
            } else if (emannanKasi.selvitaSumma() > 21) {
                System.out.println("Emäntä hävisi, sinä voitit!");
            }
        }
        if ((peliKasi.selvitaSumma() > emannanKasi.selvitaSumma()) && peliKasi.selvitaSumma() <= 21) {
            System.out.println("Sinä voitit!");

        } else if (emannanKasi.selvitaSumma() > peliKasi.selvitaSumma()) {
            System.out.println("Emäntä voitti!");
        }
        /* Tällä hetkellä vaikka kummallakaan ei olisi blackjackia mutta tilanne on tasan
        pelaaja saa silti rahansa takaisin ja peli päättyy tasapeliin.
         */
        if (peliKasi.selvitaSumma() == emannanKasi.selvitaSumma()) {
            System.out.println("Tasatilanne, saat rahasi takaisin.");
        }
        System.out.println("Kiitos että pelasit Blackjackia. :)");
    }

}
