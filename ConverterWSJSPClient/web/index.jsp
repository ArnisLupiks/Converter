<%-- 
    Document   : index
    Created on : 21-Nov-2014, 15:16:25
    Author     : Arnis
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Currency Converter</h1>    <%-- start web service invocation --%><hr/>
        <h2>
            Converting 20 Euro to Dollar
        </h2>
        <%
    try {
	org.me.converter.CoverterWS_Service service = new org.me.converter.CoverterWS_Service();
	org.me.converter.CoverterWS port = service.getCoverterWSPort();
	 // TODO initialize WS operation arguments here
	double euro = 20;
	// TODO process result here
	double result = port.euroToUsd(euro);
	out.println("Result = "+result);
    } catch (Exception ex) {
	// TODO handle custom exceptions here
    }
    %>
    <%-- end web service invocation --%><hr/>
    <h2>
            Converting 20 Dollar to Euro
        </h2>
    <%-- start web service invocation --%><hr/>
    <%
    try {
	org.me.converter.CoverterWS_Service service = new org.me.converter.CoverterWS_Service();
	org.me.converter.CoverterWS port = service.getCoverterWSPort();
	 // TODO initialize WS operation arguments here
	double usd = 20;
	// TODO process result here
	double result = port.usdToEuro(usd);
	out.println("Result = "+result);
    } catch (Exception ex) {
	// TODO handle custom exceptions here
    }
    %>
    <%-- end web service invocation --%><hr/>

    </body>
</html>
