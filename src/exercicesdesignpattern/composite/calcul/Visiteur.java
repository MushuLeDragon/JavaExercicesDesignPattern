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
public abstract class Visiteur<T> {

    public abstract <T> T visiteNombre(Nombre t);

    public abstract <T> T visiteAddition(Addition t);
    
    public abstract <T> T visiteSoustraction(Soustraction t);
}
