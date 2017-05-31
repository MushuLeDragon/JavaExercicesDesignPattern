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
public class VisiteurString extends Visiteur<String> {

    @Override
    public String visiteNombre(Nombre t) {
        return String.valueOf(t.getValeur());
    }

    @Override
    public String visiteAddition(Addition t) {
        return String.valueOf(t.getExpression1().accepter(this)) + " + " + String.valueOf(t.getExpression2().accepter(this));
    }

    @Override
    public String visiteSoustraction(Soustraction t) {
        return String.valueOf(t.getExpression1().accepter(this)) + " - " + String.valueOf(t.getExpression2().accepter(this)) + " = " + String.valueOf(t.interpreter());
    }
}
