package com.jsh.library.arrayList;

import java.util.ArrayList;
import java.util.List;

final public class MagicArrayList<T> {

    /**
     * ArrayList containing the data
     */
    private ArrayList<T> dataList = new ArrayList<>();

    /**
     * ArryList containing the attribut name for sorting the data
     */
    private ArrayList<String> sortedAttributsList = new ArrayList<>();

    /* ----------------------------------------------------- */

    public MagicArrayList() {

    }

    /* ----------------------------------------------------- */


    public void printGenericList(List l) {
        int nbLignes = l.size();
        System.out.println("----------------------------------");
        for(int i=0; i < nbLignes; i++) {
            System.out.println(i + " : " + l.get(i));
        }
        System.out.println("----------------------------------");
    }

    public void printprintAttributsList() {
        this.printGenericList(this.getSortedAttributsList());
    }

    public void printDataList() {
            this.printGenericList(this.getDataList());
        }

    /* ----------------------------------------------------- */

    public ArrayList<T> getDataList() {
        return this.dataList;
    }


    public void setDataList(ArrayList<T> pDataList) {
        this.dataList = pDataList;
    }

    public ArrayList<String> getSortedAttributsList() {
        return this.sortedAttributsList;
    }

    public void setSortedAttributsList(ArrayList<String> pSortedAttributsList) {
        this.sortedAttributsList = pSortedAttributsList;
    }

}
