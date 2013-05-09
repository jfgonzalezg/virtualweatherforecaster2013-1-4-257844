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
public class DES extends ES  {
    
    private ArrayList<Data> report = new ArrayList<>();
    private ArrayList<Data> forecast = new ArrayList<>();
    private double ST;
    private double BT;
    private double alfa ;
    private  double beta;
     public void Forecastdes (ArrayList<Data> Array,int k){
         
         ArrayList<Data> futureData=new ArrayList();
         report=Array;
         int n ;
       
        n = report.size();
       
       
       
       
       
       alfa = 2/(n+1);
        beta = Math.sqrt(Math.pow(((2/alfa)-1),2)-1);
      
       double[] St = new double[n];
       double[] Bt = new double[n];
       for(int i=0;i<n;i++){
          if(i==0){
              St[i] = 0;
              Bt[i] = 0;
          }
         
           St[i] = (alfa*report.get(i).getTemperature())+(1-alfa)*(St[i-1]+ Bt[i-1]);
           Bt[i] = (beta*(St[i]-St[i-1]))+(1-beta)*(Bt[i-1]);
           if(i==n){
              ST=St[i];
              BT=Bt[i];
           }
          
       }
                  
       double[] Stpre = new double[k];
       double[] Btpre = new double[k];
       
       for(int i=0;i<k;i++){
          
           double x;
           x = St[n]+((n+i)*Bt[n]);
           Data rep = new Data(x);
           futureData.add(rep);
       }
       
        for(int j=0;j<k;j++){
            System.out.println(forecast.get(j).getTemperature());
        }   
         
    }
        
}