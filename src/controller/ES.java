/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.ArrayList;
import model.Data;

/**
 *
 * @author David
 */
public class ES {

    public ArrayList<Data> forecastES(ArrayList<Data> temps, double alpha, int numDat) {
        ArrayList<Data> futureData = new ArrayList();
        double P = 0;
        double beta = 1 - alpha;
        for (int i = 0; i < temps.size(); i++) {
            P = P + alpha * Math.pow(beta, i) * temps.get(temps.size() - 1 - i).getTemperature();
        }
        Data today = new Data(P);
        futureData.add(today);
        for (int i = 1; i < numDat; i++) {
            P = alpha * temps.get(temps.size() - 1).getTemperature() + beta * P;
            Data x = new Data(P);
            futureData.add(x);
        }
        return futureData;
    }
}
