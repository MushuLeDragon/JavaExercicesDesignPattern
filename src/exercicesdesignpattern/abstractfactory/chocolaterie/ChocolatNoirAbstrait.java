/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicesdesignpattern.abstractfactory.chocolaterie;

/**
 *
 * @author tkint
 */
public abstract class ChocolatNoirAbstrait implements IChocolat {

    @Override
    public void afficheToi() {
        System.out.println("Chocolat noir");
    }
}
