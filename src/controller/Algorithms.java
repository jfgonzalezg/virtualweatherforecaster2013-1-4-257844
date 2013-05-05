/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.ArrayList;
import model.Data;

/**
 *
 * @author Javier
 */
public class Algorithms {

    private static int valueForecast;

    // Método que determina si es posible hacer la predicción.
    // Se necesitan al menos 5 datos.
    public static boolean verifyData(ArrayList<Data> temps) {
        if (temps.size() <= 4) {
            return false;
        } else {
            return true;
        }

    }
    // Simple Moving Average

    public static ArrayList<Data> sma(ArrayList<Data> temps) {
        SMA sma = new SMA(temps);

        return sma.forecastsma(getValueForecast());
    }

    // Double Moving Average(DMA)
    public static double dma(ArrayList<Data> temps) {
        return 0.0;
    }

    // Exponential Smoothing (ES)
    public static ArrayList<Data> es(ArrayList<Data> temps, double alpha, int numData) {
        ES es = new ES();

        return es.forecastES(temps, alpha, numData);
    }

    //Double Exponential Smoothing (DES)
    public static double des(ArrayList<Data> temps) {
        return 0.0;
    }

    //Holt Winters Multiplicative
    public static double hwm(ArrayList<Data> temps) {
        return 0.0;
    }

    public static double error(ArrayList<Data> temps, double forecast) {
        double error = 0;
        for (int i = 0; i < temps.size(); i++) {
            error = error + Math.abs(temps.get(i).getTemperature() - forecast) / temps.get(i).getTemperature();
        }
        error = error * 100 / temps.size();
        return error;
    }

    /**
     * @return the valueForecast
     */
    public static int getValueForecast() {
        return valueForecast;
    }

    /**
     * @param valueForecast the valueForecast to set
     */
    public static void setValueForecast(int valueForecast) {
        Algorithms.valueForecast = valueForecast;
    }
}
