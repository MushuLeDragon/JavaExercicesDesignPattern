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
public class VisiteurEntier extends Visiteur<Integer> {

    @Override
    public Integer visiteNombre(Nombre t) {
        return t.interpreter();
    }

    @Override
    public Integer visiteAddition(Addition t) {
        return t.getExpression1().accepter(this) + t.getExpression2().accepter(this);
    }

    @Override
    public Integer visiteSoustraction(Soustraction t) {
        return t.getExpression1().accepter(this) - t.getExpression2().accepter(this);
    }

}
