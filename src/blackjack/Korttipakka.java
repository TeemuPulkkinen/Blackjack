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
public class Korttipakka {

    //private static int[] arvot = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13};
    //private static String[] maat = {"Risti", "Ruutu", "Hertta", "Pata"};
    private ArrayList<Kortti> pakka = new ArrayList<Kortti>();

    public Korttipakka() {
        pakka.add(new Kortti (1, "Ristiässä"));
        pakka.add(new Kortti (2, "Risti"));
        pakka.add(new Kortti (3, "Risti"));
        pakka.add(new Kortti (4, "Risti"));
        pakka.add(new Kortti (5, "Risti"));
        pakka.add(new Kortti (6, "Risti"));
        pakka.add(new Kortti (7, "Risti"));
        pakka.add(new Kortti (8, "Risti"));
        pakka.add(new Kortti (9, "Risti"));
        pakka.add(new Kortti (10, "Risti"));
        pakka.add(new Kortti (11, "Ristijätkä"));
        pakka.add(new Kortti (12, "Ristiakka"));
        pakka.add(new Kortti (13, "Ristikurko"));
        
        pakka.add(new Kortti (1, "Pataässä"));
        pakka.add(new Kortti (2, "Pata"));
        pakka.add(new Kortti (3, "Pata"));
        pakka.add(new Kortti (4, "Pata"));
        pakka.add(new Kortti (5, "Pata"));
        pakka.add(new Kortti (6, "Pata"));
        pakka.add(new Kortti (7, "Pata"));
        pakka.add(new Kortti (8, "Pata"));
        pakka.add(new Kortti (9, "Pata"));
        pakka.add(new Kortti (10, "Pata"));
        pakka.add(new Kortti (11, "Patajätkä"));
        pakka.add(new Kortti (12, "Pata-akka"));
        pakka.add(new Kortti (13, "Patakurko"));
        
        pakka.add(new Kortti (1, "Herttaässä"));
        pakka.add(new Kortti (2, "Hertta"));
        pakka.add(new Kortti (3, "Hertta"));
        pakka.add(new Kortti (4, "Hertta"));
        pakka.add(new Kortti (5, "Hertta"));
        pakka.add(new Kortti (6, "Hertta"));
        pakka.add(new Kortti (7, "Hertta"));
        pakka.add(new Kortti (8, "Hertta"));
        pakka.add(new Kortti (9, "Hertta"));
        pakka.add(new Kortti (10, "Hertta"));
        pakka.add(new Kortti (11, "Herttajätkä"));
        pakka.add(new Kortti (12, "Herttaakka"));
        pakka.add(new Kortti (13, "Herttakurko"));
        
        pakka.add(new Kortti (1, "Ruutuässä"));
        pakka.add(new Kortti (2, "Ruutu"));
        pakka.add(new Kortti (3, "Ruutu"));
        pakka.add(new Kortti (4, "Ruutu"));
        pakka.add(new Kortti (5, "Ruutu"));
        pakka.add(new Kortti (6, "Ruutu"));
        pakka.add(new Kortti (7, "Ruutu"));
        pakka.add(new Kortti (8, "Ruutu"));
        pakka.add(new Kortti (9, "Ruutu"));
        pakka.add(new Kortti (10, "Ruutu"));
        pakka.add(new Kortti (11, "Ruutujätkä"));
        pakka.add(new Kortti (12, "Ruutuakka"));
        pakka.add(new Kortti (13, "Ruutukurko"));
        

    }
}
