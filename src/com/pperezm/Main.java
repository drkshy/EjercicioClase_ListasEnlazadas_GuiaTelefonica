package com.pperezm;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

/*
@author Pablo Arturo Pérez Mata
@email pablo.arturo.perez@gmail.com
@description Practica de Listas enlazadas
*/

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner scanner = new Scanner(System.in);
        String nombre = "";
        String numero = "";
        LinkedList<EntradaTelefono> agenda =
                new LinkedList<EntradaTelefono>();
        agenda.add(new EntradaTelefono("Ernesto", "555–3456"));
        agenda.add(new EntradaTelefono("Carlos", "555–3976"));
        agenda.add(new EntradaTelefono("Karen", "555–1010"));


// Usa un Iterador para mostrar la lista.
        Iterator<EntradaTelefono> itr = agenda.iterator();
        EntradaTelefono et;
        System.out.println("Itera en la lista en " +
                "direcci\u00a2n hacia delante:");
        while (itr.hasNext()) {
            et = itr.next();
            System.out.println(et.nombre + ": " + et.numero);
        }
        System.out.println();
// Usa un ListIterator para mostrar la lista en orden inverso.
        ListIterator<EntradaTelefono> litr =
                agenda.listIterator(agenda.size());
        System.out.println("Itera en la lista en " +
                "direcci\u00a2n inversa:");
        while (litr.hasPrevious()) {
            et = litr.previous();
            System.out.println(et.nombre + ": " + et.numero);
        }
        System.out.println("Desea agregar un nombre y numero más? S/N");
        Character respuesta = scanner.next().charAt(0);
        if (respuesta.equals('S') || respuesta.equals('s')) {

            System.out.println("Nombre: ");
            nombre = scanner.next();
            System.out.println( "Numero: ");
            numero = scanner.next();

            agenda.add(new EntradaTelefono(nombre, numero));
            litr = agenda.listIterator(agenda.size());
            System.out.println("Itera en la lista en " +
                    "direcci\u00a2n inversa:");
            while (litr.hasPrevious()) {
                et = litr.previous();
                System.out.println(et.nombre + ": " + et.numero);
            }
            ListIterator<EntradaTelefono> itr2 = agenda.listIterator( );
            System.out.println("Itera en la lista en " +
                    "direcci\u00a2n hacia delante:");
            while(itr2.hasNext( )) {
                et = itr2.next( );
                System.out.println(et.nombre + ": " + et.numero);
            }


            // Usa un ListIterador para mostrar la lista en dirección hacia delante.

        } else {
            litr = agenda.listIterator(agenda.size());
            System.out.println("Itera en la lista en " +
                    "direcci\u00a2n inversa:");
            while (litr.hasPrevious()) {
                et = litr.previous();
                System.out.println(et.nombre + ": " + et.numero);
            }
            ListIterator<EntradaTelefono> itr2 = agenda.listIterator( );
            System.out.println("Itera en la lista en " +
                    "direcci\u00a2n hacia delante:");
            while(itr2.hasNext( )) {
                et = itr2.next( );
                System.out.println(et.nombre + ": " + et.numero);
            }

            System.out.println("GRACIAS");

        }
    }
}

