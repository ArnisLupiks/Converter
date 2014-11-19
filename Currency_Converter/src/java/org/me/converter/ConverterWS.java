/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.me.converter;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author Arnis
 */
@WebService(serviceName = "ConverterWS")
public class ConverterWS {

    /**
     * Web service operation
     */
    @WebMethod(operationName = "usdEuro")
    public double usdEuro(@WebParam(name = "usd") double usd ){
        //TODO write your implementation code here:
        
          double result = usd/ 1.25;
          return result;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "euroUsd")
    public double euroUsd(@WebParam(name = "euro") double euro) {
        //TODO write your implementation code here:
        double result = 1.25 * euro;
        return result;
    }
}
