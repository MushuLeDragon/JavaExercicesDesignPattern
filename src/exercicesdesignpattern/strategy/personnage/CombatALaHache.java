/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicesdesignpattern.strategy.personnage;

/**
 *
 * @author tkint
 */
public class CombatALaHache implements Combat {

    @Override
    public void executeToi() {
        System.out.println("YAAAAAAAAARGH!!");
    }
}
