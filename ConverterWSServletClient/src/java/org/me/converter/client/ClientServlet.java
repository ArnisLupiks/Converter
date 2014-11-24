/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.me.converter.client;

import java.io.IOException;
import java.io.PrintWriter;
import static java.lang.System.out;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.ws.WebServiceRef;
import org.me.converter.CoverterWS_Service;

/**
 *
 * @author Arnis
 */
@WebServlet(name = "ClientServlet", urlPatterns = {"/ClientServlet"})
public class ClientServlet extends HttpServlet {
    @WebServiceRef(wsdlLocation = "WEB-INF/wsdl/localhost_8080/CoverterWS/CoverterWS.wsdl")
    private CoverterWS_Service service;

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet ClientServlet</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet ClientServlet at " + request.getContextPath() + "</h1>");
            
            
        try{
            double usd = 20;
            out.println("<h1>Converted amount is 20 USD</h1>");
            double result = usd * 1.78; 
         out.println("<h2>Result USD to Euro: "+result+"</h2>");
        }catch (Exception ex){
            out.println("Error: "+ex);
        }
        try{
            double euro = 20;
            out.println("<h1>Converted amount is 20 Euro</h1>");
            double result2 = euro / 1.78; 
         out.println("<h2>Result Euro to USD: "+result2+"</h2>");
        }catch (Exception exe){
            out.println("Error: "+exe);
        }
       
            
            out.println("</body>");
            out.println("</html>");
        }finally{
            out.close();
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

    private double euroToUsd(double euro) {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        org.me.converter.CoverterWS port = service.getCoverterWSPort();
        return port.euroToUsd(euro);
    }

    private double usdToEuro(double usd) {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        org.me.converter.CoverterWS port = service.getCoverterWSPort();
        return port.usdToEuro(usd);
    }

}
