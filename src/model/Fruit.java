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
public abstract class Fruit {
    protected int poids;
    
    public Fruit(){
        System.out.println("Creation d'un fruit");
    }
    public abstract void affiche();
    public abstract void affichePoids();
    
}
