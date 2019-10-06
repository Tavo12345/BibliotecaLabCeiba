/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author JOAN
 */
@WebServlet(name = "RegistroPrestamoServlet", urlPatterns = {"/RegistroPrestamoServlet"})
public class RegistroPrestamoServlet extends HttpServlet {
    @EJB
    private PrestamoFacade prestamoFacade;

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String idprestamo=request.getParameter("idprestamo");
        String $fechaprestamo=request.getParameter("fechaprestamo");
        Date fechaprestamo = DATE_FORMAT_DD_MM_YYYY.parse($fechaprestamo);
        String $fechaentrega=request.getParameter("fechaentrega");
        Date fechaentrega = DATE_FORMAT_DD_MM_YYYY.parse($fechaentrega);
        String estado=request.getParameter("estado");
        String isbnlibro=request.getParameter("isbnlibro");
        String cedulausuario=request.getParameter("cedulausuario");
        
        LOG.log(Level.INFO, "idprestamo:(0)", idprestamo);
        LOG.log(Level.INFO, "fechaprestamo:(0)", fechaprestamo);
        LOG.log(Level.INFO, "fechaentrega:(0)", fechaentrega);
        LOG.log(Level.INFO, "estado:(0)", estado);
        LOG.log(Level.INFO, "isbnlibro:(0)", isbnlibro);
        LOG.log(Level.INFO, "cedulausuario:(0)", cedulausuario);
        
        Prestamo prestamo = new Prestamo();
        prestamo.setIdprestamo(idprestamo);
        prestamo.setFechaprestamo(fechaprestamo);
        prestamo.setFechaentrega(fechaentrega);
        prestamo.setEstado(estado);
        prestamo.setIsbnlibro(isbnlibro);
        prestamo.setCedulausuario(cedulausuario);
                
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet RegistroPrestamoServlet</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet RegistroPrestamoServlet at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
