import Item.*;
import Dao.*;
import java.io.*;
import java.util.*;
import javax.servlet.*;
import java.sql.*;
import javax.servlet.http.*;

public class control extends HttpServlet{
    public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException{
        int i;
        res.setContentType("text/html");
        PrintWriter out = res.getWriter();
        int cid=Integer.parseInt(req.getParameter("cid"));
        int vnv=Integer.parseInt(req.getParameter("vnv"));
        String ret = "";

        extDao d = new extDao();
        ret = d.extract(vnv, cid);
        out.print(ret);
    }
}