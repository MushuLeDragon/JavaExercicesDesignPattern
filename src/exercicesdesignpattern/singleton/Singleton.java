/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicesdesignpattern.singleton;

/**
 *
 * @author tkint
 */
public class Singleton {

    private static Singleton instance;

    private Singleton() {
        System.out.println("Nouvelle instance");
    }

    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        } else {
            System.out.println("Récupération de l'instance");
        }
        return instance;
    }
}
