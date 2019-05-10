package servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(
        name = "registro", 
        urlPatterns = {"/registro"}
    )
public class HelloServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
      Singleton tempo = Singleton.laconstructora();

        tempo.add(request.getParameter("ingresacorreo"),request.getParameter("contrasena"),request.getParameter("tipo"))
       
    }
    
}
