/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author Ivan C
 */
public class VWFSystem {

    private ArrayList<Data> temps = new ArrayList();

    /**
     * @return the temps
     */
    public ArrayList<Data> getTemps() {
        return temps;
    }

    /**
     * @param temps the temps to set
     */
    public void setTemps(ArrayList<Data> temps) {
        this.temps = temps;
    }
}
