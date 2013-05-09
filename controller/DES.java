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
    
    /*private ArrayList<Data> data = new ArrayList<>();
    private ArrayList<Data> forecast = new ArrayList<>();
    private double ST;
    private double BT;
    private double alpha ;
    private  double beta;
    */
    public ArrayList<Data> forecastDES(ArrayList<Data> temps,double alpha,double betha,int numDat ){
        
        ArrayList<Data> report=new ArrayList();
        ArrayList<Data> forecast=new ArrayList();
        int n=report.size();
        double[] St=new double[n];
        double[] bt=new double[n];
        
        
        alpha=2/(n+1);
        betha=Math.sqrt(Math.pow(((2/alpha)-1),2)-1);
        
        
        for(int i=0;i<temps.size();i++){
            if(i==0){
                St[i]=temps.get(i).getTemperature();
                bt[i]=temps.get(i+1).getTemperature()-temps.get(i).getTemperature();
            }
            St[i]=alpha*temps.get(i).getTemperature()+(1-alpha)*(St[i-1]+bt[i-1]);
            bt[i]=betha*(St[i]-St[i-1])+(1-betha)*(bt[i-1]);
            if(i!=0){
                
               
                
            }
        }
            
        
        
        
        

        
        
        return report;
        
        
    }
}
    
    /*public void forecastdes(ArrayList<Data> temps,int k){
    //ArrayList<Reporte> reportes       
       
      data=temps;
      int n ;
      
      // array where predictions were recorded
      n = data.size();
      alpha = 2/(n+1);
      beta = Math.sqrt(Math.pow(((2/alpha)-1),2)-1);
      //creating two arrays in order to store the St and Bt of each 
      //date for the recursion
      double[] St = new double[n];
      double[] Bt = new double[n];
      for(int i=0;i<n;i++){
        if(i==0){
           St[i] = 0;
           Bt[i] = 0;
          }
         
        St[i] = (alpha*data.get(i).getTemperature()+(1-alpha))*(St[i-1]+ Bt[i-1]);
        Bt[i] = (beta*(St[i]-St[i-1]))+(1-beta)*(Bt[i-1]);
        if(i==n){
           ST=St[i];
           BT=Bt[i];
        }
          
       }
       
       /*
        * creacion de dos arreglos con el fin de almacenar los St y Bt de cada
        * fecha para hallar las predicciones
        
            
       double[] Stpre = new double[k];
       double[] Btpre = new double[k];
       
       for(int i=0;i<k;i++){
           //reporte.get(5).getTemperatura();
          /* if (i==0){
                Stpre[i] = (alfa*reportes.get(i).getTemperatura())+(1-alfa)*(St[n]+ Bt[n]);
                Btpre[i] = (beta*(Stpre[i]-St[n]))+(1-beta)*(Bt[n]); 
           }
           else {
               
                Stpre[i] = (alfa*reportes.get(i).getTemperatura())+(1-alfa)*(Stpre[i-1]+ Btpre[i-1]);
                Btpre[i] = (beta*(Stpre[i]-Stpre[i-1]))+(1-beta)*(Btpre[i-1]);   
               
           }
           
           //double x = St[n]+(k*Bt[n]);
           double x;
           x = St[n]+((n+i)*Bt[n]);
           data rep = new data(x);
           //pronosticos.add(i, rep);
           forecast.add(rep);
       }
    }
*/

