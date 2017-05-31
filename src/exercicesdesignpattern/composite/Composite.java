/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicesdesignpattern.composite;

import exercicesdesignpattern.composite.arbre.*;
import exercicesdesignpattern.composite.calcul.*;
import java.util.ArrayList;

/**
 *
 * @author Thomas Kint
 */
public class Composite {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //arbre();
        calcul();
    }

    private static void arbre() {
        ArrayList<IComposantArbre> branches = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            Composant branche = new Composant();

            for (int j = 0; j < 10; j++) {
                branche.getComposants().add(new Feuille());
            }

            branches.add(branche);
        }

        Composant arbre = new Composant(branches);
        arbre.dessine();
    }

    private static void calcul() {
        Nombre exp1 = new Nombre(123);
        Addition exp2 = new Addition(
                new Nombre(33),
                new Nombre(66)
        );

        Addition exp3 = new Addition(
                new Nombre(99),
                new Addition(
                        new Nombre(33),
                        new Nombre(66)
                )
        );
        
//        System.out.println(exp1.interpreter());
//        System.out.println(exp2.interpreter());
//        System.out.println(exp3.interpreter());
        
        Visiteur visiteur1 = new VisiteurString();
        
        System.out.println(visiteur1.visiteNombre(exp1));
        System.out.println(visiteur1.visiteAddition(exp2));
        System.out.println(visiteur1.visiteAddition(exp3));
    }
}
