package main.servlets;

import main.bean.HomedirBean;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.nio.file.Path;
import java.util.List;

@WebServlet("/dir")
public class HomedirServlet extends HttpServlet {

    public HomedirServlet() {
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //@EJB
        HomedirBean bean = new HomedirBean();
        //req.setAttribute("string", "MyString");
        //req.setAttribute("files", pathList);
        System.out.println(req);
        System.out.println(resp);
        resp.setContentType("text/html");
        req.setAttribute("msg", "Bloody Hell");
        req.getServletContext().getRequestDispatcher("dir.jsp").forward(req,resp);

//        for (String file : pathList) {
//            resp.getWriter().write(file.toString());
//        }
//        resp.setStatus(200);
    }
}
