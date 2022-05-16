/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polym;

import java.util.ArrayList;
import model.Fruit;
import model.Orange;
import model.Pomme;

public class Polym {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     ArrayList<Fruit> fruits = new ArrayList<>();
     fruits.add(new Pomme(60));
     fruits.add(new Orange(90));
     fruits.add(new Pomme(90));
     for (Fruit fruit : fruits) {
         fruit.affiche();
            
        }
    }    
}
