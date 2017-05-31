/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicesdesignpattern.composite.calcul;

import java.util.List;

/**
 *
 * @author tkint
 */
public abstract class Expression {

    public abstract int interpreter();

    public abstract <T> T accepter(Visiteur<T> v);
}
