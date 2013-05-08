/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.ArrayList;
import java.util.Iterator;
import model.Data;

/**
 *
 * @author Ivan C
 *
 *
 *
 */
public class MAPE {

    private ArrayList<Data> At;
    private ArrayList<Data> Ft;
    private int n;
    private double error;

    public double MAPE(ArrayList<Data> algorithmR, ArrayList<Data> inputData) {
        this.Ft = algorithmR;
        this.At = inputData;
        this.n = inputData.size();

        double suma = 0;

        for (int i = 0; i < n; i++) {

            suma = suma
                    + ((At.get(i).getTemperature() - Ft.get(i).getTemperature())
                    / At.get(i).getTemperature());

        }

        error = (1 / n) * suma;
        return error;
    }
}
