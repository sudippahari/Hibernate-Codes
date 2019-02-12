<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

    
    <%
    response.setContentType("text/html");
    out.println("Hello");
    
    //String config_msg = config.getInitParameter("config_param");
    //int hit_count = (Integer)application.getInitParameter("hits_count");
    
    out.println("<br>");
    //out.println("Config message is: " + config_msg);
    //out.println("Context message is: " + context_msg);
    
    out.println(config.getServletName());
    
    %>