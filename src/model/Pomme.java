/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author samnd
 */
public class Pomme extends Fruit{
    public Pomme(int p){
        poids = p;
    System.out .println("Creation d'une pomme "+poids+" grammes");
    }
    @Override
    public void affiche(){
        System.out.println("C'est une pomme");
    }
    public void affichePoids(){
        System.out.println("Le poids de la pomme est: "+ poids);
    }
    
}
