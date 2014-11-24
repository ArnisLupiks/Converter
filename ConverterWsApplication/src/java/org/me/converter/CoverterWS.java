/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.me.converter;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.ejb.Stateless;

/**
 *
 * @author Arnis
 */
@WebService(serviceName = "CoverterWS")
@Stateless()
public class CoverterWS {

    /**
     * Web service operation for euroToUsd
     */
    @WebMethod(operationName = "euroToUsd")
    public double euroToUsd(@WebParam(name = "euro") double usd) {
         double result = usd * 1.78; 
         return result;
    }

    /**
     * Web service operation for usdToEuro
     */
    @WebMethod(operationName = "usdToEuro")
    public double usdToEuro(@WebParam(name = "usd") double euro) {
         double result2 = euro / 1.78; 
         return result2; 
    }
}
