/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package converterws_client_application;

import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author Arnis
 */
public class ConverterWS_Client_Application {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        try{
            double usd = 20;
         double result = usd * 1.78; 
         System.out.println("Result USD to Euro: "+result);
        }catch (Exception e){
            System.out.println("Error: "+e);
        }
        try{
         double euro = 20;
         double result2 = euro / 1.78; 
         System.out.println("Result Euro to USD: "+result2);
        }catch (Exception e){
               System.out.println("Error: "+e);
        }
    }

    private static double euroToUsd(double euro) {
        org.me.converter.CoverterWS_Service service = new org.me.converter.CoverterWS_Service();
        org.me.converter.CoverterWS port = service.getCoverterWSPort();
        return port.euroToUsd(euro);
    }

    private static double usdToEuro(double usd) {
        org.me.converter.CoverterWS_Service service = new org.me.converter.CoverterWS_Service();
        org.me.converter.CoverterWS port = service.getCoverterWSPort();
        return port.usdToEuro(usd);
    }
    
}
