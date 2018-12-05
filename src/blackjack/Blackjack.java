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
        
        peliPakka.sekoita(); // sekoitetaan korttipakka
        //Kortti uusiKasikortti2 = peliPakka.jaaKortti(); // otetaan toinen kortti ja jaetaan se
        PelaajanKasi peliKasi = new PelaajanKasi(); // luodaan pelaajan käsi
       
        System.out.println("Nostetaan seuraava kortti.");
        Kortti uusiKasikortti = peliPakka.jaaKortti(); // otetaan pakasta kortti ja jaetaan se
        peliKasi.otaKortti(uusiKasikortti); //lähetetään kortti pelaajan käteen
        System.out.println("Ensimmäinen korttisi on " + uusiKasikortti);
        uusiKasikortti = peliPakka.jaaKortti(); // otetaan pakasta kortti ja jaetaan se
        peliKasi.otaKortti(uusiKasikortti);
        System.out.println("Toinen korttisi on " + uusiKasikortti);
        //peliKasi.otaKortti(uusiKasikortti2); // lähetetään toinen kortti pelaajan käteen
        
        peliKasi.selvitaSumma(); // käytetään selvitaSumma-muuttujaa pelaajan käteen

        //System.out.println(uusiKasikortti2);
        System.out.println(peliKasi);
        System.out.println("Haluatko nostaa lisää kortteja? (k/e)");
        lisakortti = lukija.nextLine();
        
        /*for (int i = 0; i <=2; lisakortti.equalsIgnoreCase("k") ) {
            peliKasi.otaKortti(uusiKasikortti);
            
            i++;
            
            //System.out.println(uusiKasiKortti);
            System.out.println(peliKasi); 
        }*/
        
        while (lisakortti.equalsIgnoreCase("k")){
            uusiKasikortti = peliPakka.jaaKortti();
            peliKasi.otaKortti(uusiKasikortti);
            System.out.println(peliKasi);
            System.out.println("Uusi kortti on " + uusiKasikortti);
            System.out.println("Haluatko nostaa uuden kortin?");
            lisakortti = lukija.nextLine();
            
        }
             
        }
       

    }