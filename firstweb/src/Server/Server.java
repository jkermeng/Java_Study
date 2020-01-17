package Server;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;


public class Server extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String tel = req.getParameter("tel");
        String name = req.getParameter("name");
        name = tel;
        PrintWriter writer = resp.getWriter();
        writer.println(name);
        System.out.println(name);
    }
    @Override
    public void destroy() {
        super.destroy();
    }
}
