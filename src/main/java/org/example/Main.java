package org.example;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str1 = scanner.nextLine();
        int num = scanner.nextInt();
        String[] strs = str1.split(" ");
        int numCercanoSup;
        int numCercanoInf;
        int difSup = Integer.MAX_VALUE;
        int difInf = Integer.MAX_VALUE;
        List<Integer> cercanosSup = new ArrayList<>();
        List<Integer> cercanosInf = new ArrayList<>();
        boolean esIgual = false;
        int cantIgual = 0;
        for (String str : strs) {
            int aux = Integer.parseInt(str);
            int difActual = Math.abs(num - aux);
            if (aux > num) {
                if (difActual <= difSup) {
                    if (difActual < difSup) {
                        cercanosSup.clear();
                        difSup = difActual;
                    }
                    numCercanoSup = aux;
                    cercanosSup.add(numCercanoSup);
                }
            } else if (aux < num) {
                if (difActual <= difInf) {
                    if (difActual < difInf) {
                        cercanosInf.clear();
                        difInf = difActual;
                    }
                    numCercanoInf = aux;
                    cercanosInf.add(numCercanoInf);
                }
            } else {
                esIgual = true;
                cantIgual++;
            }
        }
        if (esIgual) {
            for (int i = 0; i < cantIgual; i++) {
                System.out.print(num + " ");
            }
        } else {
            if (difInf <= difSup) {
                for (Integer value : cercanosInf) {
                    System.out.print(value + " ");
                }
            }
            if (difSup <= difInf) {
                for (Integer integer : cercanosSup) {
                    System.out.print(integer + " ");
                }
            }
        }
    }
}
