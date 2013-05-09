/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.ArrayList;
import model.Data;

/**
 *
 * @author John F
 */
public class DMA {
    
    private ArrayList<Data> data = new ArrayList();
    private double med = 0.0;

   public DMA(ArrayList<Data> temps) {
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

    public ArrayList<Data> forecastdma(int numDat) {
        ArrayList<Data> futureData = new ArrayList();
        ArrayList<Data> dma=new ArrayList();

        double yest = med;
        for (int i = 0; i < numDat; i++) {
            double pm = data.get(i).getTemperature() / data.size();
            double pn = yest / data.size();
            Data today = new Data(yest + pn - pm);
            futureData.add(today);
            yest = today.getTemperature();
        }
        
        for(int i=0;i<numDat;i++){
            double pm=(futureData.get(i).getTemperature()+futureData.get(i-1).getTemperature())/data.size();
            Data today=new Data(yest-pm);
            dma.add(today);
        }
        
        return dma;
    }
    
}

