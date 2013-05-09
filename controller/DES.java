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
    
    

