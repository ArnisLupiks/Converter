/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package converterws_client_application;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.NumberFormat;
import java.text.ParseException;

/**
 *
 * @author Arnis
 */
public class ConverterWS_Client_Application {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         System.out.print("Enter Euros to convert in USD: ");
          BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
          String euros = null;
        try{
          euros = br.readLine();
          double eu = NumberFormat.getInstance().parse(euros).doubleValue();
     
        double usd = 1.25;
         double result = eu*usd;
         
         System.out.println("Result: " +result);
        }catch(Exception e){
            System.out.println("Exception: " + e);
        }
        //Getting USD to convert into euros
          System.out.print("Enter USD to convert in Euro: ");
          BufferedReader bre = new BufferedReader(new InputStreamReader(System.in)); 
          String usds = null;
        try{
          usds = bre.readLine();
          double us = NumberFormat.getInstance().parse(euros).doubleValue();
     
        double euro = 1.25;
        double result2 = us/euro;
         
         System.out.println("Result: " +result2);
        }catch(Exception ex){
            System.out.println("Exception: " + ex);
        }
    }

    private static double euroUsd(double euro) {
        org.me.converter.ConverterWS_Service service = new org.me.converter.ConverterWS_Service();
        org.me.converter.ConverterWS port = service.getConverterWSPort();
        return port.euroUsd(euro);
    }

    private static double usdEuro(double usd) {
        org.me.converter.ConverterWS_Service service = new org.me.converter.ConverterWS_Service();
        org.me.converter.ConverterWS port = service.getConverterWSPort();
        return port.usdEuro(usd);
    }
    
}
