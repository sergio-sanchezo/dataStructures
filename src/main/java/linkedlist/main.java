/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linkedlist;

import java.util.*;
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        linkedList<Tarjeta_Madre> list = new linkedList<Tarjeta_Madre>();
        Tarjeta_Madre tm = new Tarjeta_Madre("Supermicro MBD-X10DAX","2 x LGA2011-3","EATX",2000,16,"Green / Black",-1,575.20);
        Tarjeta_Madre tm2 = new Tarjeta_Madre("Asus Z10PE-D16 WS","2 x LGA2011-3","SSI EEB",1024,16,"Black / Gold",-1,0);
        Tarjeta_Madre tm3 = new Tarjeta_Madre("ASRock EP2C612D16C-4L","2 x LGA2011-3 Narrow","SSI EEB",1024,16,"Green / Blue",0,349.99);
        Tarjeta_Madre tm4 = new Tarjeta_Madre("Supermicro MBD-X10DRI-O","2 x LGA2011-3 Narrow","EATX",1024,16,"Black / Green",0,578.54);
        Tarjeta_Madre tm5 = new Tarjeta_Madre("ASRock EP2C602-4L/D16","2 x LGA2011","SSI EEB",512,16,"Blue / White",-3,431.89);
        list.insertByPrice(tm);
        list.insertByPrice(tm3);
        list.insertByPrice(tm2);
        list.insertByPrice(tm4);
        list.insertByPrice(tm5);
        System.out.println(list.sizeLinkedList());
        list.printRecursive();
        list.popBack();
        System.out.println(list.sizeLinkedList());
        list.printRecursive();
        list.removeFirstByMemory(512);
        System.out.println(list.sizeLinkedList());
        list.printRecursive();
        list.FindAllByMemory(1024);
    }
    
}
