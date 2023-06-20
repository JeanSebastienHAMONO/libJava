package com.tests.jsh;

import com.jsh.library.arrayList.MagicArrayList;

public class Main {
    public static void main(String[] args) {
        System.out.println("DEBUT");
        System.out.println("------------------------------------");

        MagicArrayList<String> mal = new MagicArrayList<>();

        mal.getSortedAttributsList().add("Premier");
        mal.getSortedAttributsList().add("Deuxième");
        mal.getSortedAttributsList().add("Troisième");

        mal.printAttributsList();

        System.out.println("------------------------------------");
        System.out.println("FIN");
    }
}