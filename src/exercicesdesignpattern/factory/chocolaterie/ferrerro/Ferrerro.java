/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicesdesignpattern.factory.chocolaterie.ferrerro;

import exercicesdesignpattern.factory.chocolaterie.ChocolatLaitAbstrait;
import exercicesdesignpattern.factory.chocolaterie.ChocolatNoirAbstrait;
import exercicesdesignpattern.factory.chocolaterie.IChocolaterie;

/**
 *
 * @author tkint
 */
public class Ferrerro implements IChocolaterie {

    @Override
    public ChocolatLaitAbstrait produitChocolatLait() {
        return new ChocolatLaitFerrerro();
    }

    @Override
    public ChocolatNoirAbstrait produitChocolatNoir() {
        return new ChocolatNoirFerrerro();
    }

}
