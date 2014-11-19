/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package converterws_client_application;

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
        double euro = 1.25;
        double usd = 1.25;
         double result = euroUsd(euro/usd);
         System.out.println("Result: " +result);
        }catch(Exception e){
            System.out.println("Exception: " + e);
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
