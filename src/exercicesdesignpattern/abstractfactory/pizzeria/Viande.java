/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicesdesignpattern.abstractfactory.pizzeria;

/**
 *
 * @author Thomas Kint
 */
public abstract class Viande {

    protected String nom;

    public Viande(String nom) {
        this.nom = nom;
    }

    public String getNom() {
        return nom;
    }

    public void afficheToi() {
        System.out.println(nom);
    }
}
