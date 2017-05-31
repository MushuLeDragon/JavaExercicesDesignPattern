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
public class Soustraction extends Binaire {

    public Soustraction(Expression expression1, Expression expression2) {
        super(expression1, expression2);
    }

    @Override
    public int interpreter() {
        return expression1.interpreter() - expression2.interpreter();
    }

    @Override
    public <T> T accepter(Visiteur<T> v) {
        return v.visiteSoustraction(this);
    }
}
