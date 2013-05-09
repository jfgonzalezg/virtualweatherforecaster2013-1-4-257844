/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import model.Data;
import model.VWFSystem;

/**
 *
 * @author David
 */
public class Control {

    private static VWFSystem vwfs = new VWFSystem();

    public static void addElement(double temp) {
        Data data = new Data(temp);
        getVwfs().getTemps().add(data);


    }

    public static void deleteElement() {
        if (getVwfs().getTemps().size() > 1) {
            getVwfs().getTemps().remove(vwfs.getTemps().size() - 1);
        } else {
            getVwfs().getTemps().remove(0);
        }
    }

    public static void deleteAll() {
        getVwfs().getTemps().removeAll(getVwfs().getTemps());
    }

    public static void showAll() {
        for (int i = 0; i < getVwfs().getTemps().size(); i++) {
            System.out.println(getVwfs().getTemps().get(i).getTemperature());
        }
    }

    /**
     * @return the vwfs
     */
    public static VWFSystem getVwfs() {
        return vwfs;
    }

    /**
     * @param aVwfs the vwfs to set
     */
    public static void setVwfs(VWFSystem aVwfs) {
        vwfs = aVwfs;
    }
}
