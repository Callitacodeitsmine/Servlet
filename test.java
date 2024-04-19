package com.example.servlets;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class TouristServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<!DOCTYPE html>");
        out.println("<html>");
        out.println("<head>");
        out.println("<meta charset=\"UTF-8\">");
        out.println("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">");
        out.println("<title>Tourist Management System</title>");
        out.println("<link rel=\"stylesheet\" href=\"styles.css\">");
        out.println("</head>");
        out.println("<body>");
        out.println("<header>");
        out.println("<h1>Tourist Management System</h1>");
        out.println("</header>");
        out.println("<nav>");
        out.println("<ul>");
        out.println("<li><a href=\"#home\">Home</a></li>");
        out.println("<li><a href=\"#destinations\">Destinations</a></li>");
        out.println("<li><a href=\"#contact\">Contact</a></li>");
        out.println("</ul>");
        out.println("</nav>");
        out.println("<section id=\"home\">");
        out.println("<h2>Welcome to our Tourist Management System!</h2>");
        out.println("<p>Explore our featured destinations and plan your next adventure.</p>");
        out.println("</section>");
        out.println("<section id=\"destinations\">");
        out.println("<h2>Featured Destinations</h2>");
        out.println("<div id=\"destination-list\" class=\"destination-list\">");
        out.println("<div class=\"destination-card\">");
        out.println("<img src=\"images/paris.jpg\" alt=\"Paris\">");
        out.println("<h3>Paris</h3>");
        out.println("<p>The City of Light</p>");
        out.println("</div>");
        out.println("<div class=\"destination-card\">");
        out.println("<img src=\"images/tokyo.jpg\" alt=\"Tokyo\">");
        out.println("<h3>Tokyo</h3>");
        out.println("<p>The Capital of Japan</p>");
        out.println("</div>");
        out.println("<div class=\"destination-card\">");
        out.println("<img src=\"images/rome.jpg\" alt=\"Rome\">");
        out.println("<h3>Rome</h3>");
        out.println("<p>The Eternal City</p>");
        out.println("</div>");
        out.println("</div>");
        out.println("</section>");
        out.println("<section id=\"contact\">");
        out.println("<h2>Contact Us</h2>");
        out.println("<form id=\"contact-form\" method=\"post\">");
        out.println("<label for=\"name\">Name:</label>");
        out.println("<input type=\"text\" id=\"name\" name=\"name\" required>");
        out.println("<label for=\"email\">Email:</label>");
        out.println("<input type=\"email\" id=\"email\" name=\"email\" required>");
        out.println("<label for=\"message\">Message:</label>");
        out.println("<textarea id=\"message\" name=\"message\" required></textarea>");
        out.println("<button type=\"submit\">Send</button>");
        out.println("</form>");
        out.println("</section>");
        out.println("<footer>");
        out.println("<p>&copy; 2024 Tourist Management System</p>");
        out.println("</footer>");
        out.println("</body>");
        out.println("</html>");
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }
}
