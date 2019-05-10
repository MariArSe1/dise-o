package servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(
         name = "ingresar", 
        urlPatterns = {"/ingresar"}
        
    )
public class HelloServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        Singleton tempo = Singleton.laconstructora();

        String search = req.getParameter("ingresacorreo");
        Comprador project = tempo.ingresar(search);
        String data = project.toString();
        ServletOutputStream out = resp.getOutputStream();
		        out.write(data.getBytes());
		        out.flush();
		        out.close();


        User user = userService.find(ingresacorreo, contrasena);
    
}
