/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicesdesignpattern.composite.calcul;

/**
 *
 * @author tkint
 */
public class Nombre extends Expression {

    private int valeur;

    public Nombre(int valeur) {
        this.valeur = valeur;
    }

    public int getValeur() {
        return valeur;
    }

    public void setValeur(int valeur) {
        this.valeur = valeur;
    }

    @Override
    public int interpreter() {
        return valeur;
    }

    @Override
    public <T> T accepter(Visiteur<T> v) {
        return v.visiteNombre(this);
    }
}
