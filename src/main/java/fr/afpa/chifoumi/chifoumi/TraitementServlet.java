package fr.afpa.chifoumi.chifoumi;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;

@WebServlet("/traitement")
public class TraitementServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String chi = request.getParameter("chi");
        String fou = request.getParameter("fou");
        String mi = request.getParameter("mi");
        String resultat = "";
        if (chi != null) {
            resultat = "pierre";
        }
        if (fou != null) {
            resultat = "feuille";
        }
        if (mi != null) {
            resultat = "ciseau";
        }
        request.setAttribute("leResultat", resultat);

//        RequestDispatcher rd = request.getRequestDispatcher("WEB-INF/resultat.jsp");
//        rd.forward(request, response);

        request.getRequestDispatcher("WEB-INF/resultat.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws
            ServletException, IOException {

    }
}
