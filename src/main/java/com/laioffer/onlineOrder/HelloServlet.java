package com.laioffer.onlineOrder;
import org.apache.commons.io.IOUtils;

import org.json.JSONObject;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class HelloServlet {

     protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
         // Read customer information from request body
         JSONObject jsonRequest = new JSONObject(IOUtils.toString(request.getReader()));
         String email = jsonRequest.getString("email");
         String firstName = jsonRequest.getString("first_name");
         String lastName = jsonRequest.getString("last_name");
         int age = jsonRequest.getInt("age");
         // Print customer information to IDE console
         System.out.println("Email is: " + email);
         System.out.println("First name is: " + firstName);
         System.out.println("Last name is: " + lastName);
         System.out.println("Age is: " + age);
         // Return status = ok as response body to the client
         response.setContentType("application/json");
         JSONObject jsonResponse = new JSONObject();
         jsonResponse.put("status", "ok");
         response.getWriter().print(jsonResponse);
     }

 }
