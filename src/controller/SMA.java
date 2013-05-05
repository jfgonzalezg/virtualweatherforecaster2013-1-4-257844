/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.ArrayList;
import model.Data;

/**
 *
 * @author Lorena
 */
public class SMA {

    private ArrayList<Data> data = new ArrayList();
    private double med = 0.0;

    public SMA(ArrayList<Data> temps) {
        data = temps;
        average();

    }

    private void average() {

        double sum = 0.0;

        for (Data dat : data) {
            sum += dat.getTemperature();
        }

        med = sum / (data.size());
    }

    public ArrayList<Data> forecastsma(int numDat) {
        ArrayList<Data> futureData = new ArrayList();

        double yest = med;
        for (int i = 0; i < numDat; i++) {
            double pm = data.get(i).getTemperature() / data.size();
            double pn = yest / data.size();
            Data today = new Data(yest + pn - pm);
            futureData.add(today);
            yest = today.getTemperature();
        }
        return futureData;
    }
}
