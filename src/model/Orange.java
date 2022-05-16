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
public class Orange extends Fruit{
     public Orange(int p){
        poids = p;
    System.out .println("Creation d'une orange "+poids+" grammes");
    }
     @Override
    public void affiche(){
        System.out.println("C'est une orangee");
    }
    public void affichePoids(){
        System.out.println("Le poids de la orange est: "+ poids);
    }
}
