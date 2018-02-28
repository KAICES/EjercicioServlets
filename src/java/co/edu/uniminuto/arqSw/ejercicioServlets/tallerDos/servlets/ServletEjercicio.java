/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.uniminuto.arqSw.ejercicioServlets.tallerDos.servlets;

import co.edu.uniminuto.arqSw.ejercicioServlets.tallerDos.vos.FormularioPersonaVo;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
/**
 *
 * @authores
 * Cesar Ramirez == 378938
 * Lizeth Castro == 310894
 * 
 */
public class ServletEjercicio extends HttpServlet {

    private FormularioPersonaVo miForm;
    
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
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Resultado ServletEjercicio</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>TALLER SERVLET</h1>");
            out.println("<form action='ServletEjercicio' method='POST'>");
            out.println( "Nombre:<br>");
            out.println("<input type ='text' name='nombre'></input><br>");
            out.println("<br>");
            out.println( "Fecha de nacimiento:<br>");
            out.println("<input type ='date' name='fechaNac'></input><br>");
            out.println("<br>");
            out.println("<input type='submit' href='index.jsp'/>");            
            out.println("</form>");
            out.println("<h1>Hola Sr(a) " + miForm.getNombre() + ", usted tiene " + miForm.getFechaNac() + " años"+ "</h1>");
            out.println("</body>");
            out.println("</html>");
        } finally {
            out.close();
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
        
        String nombre = request.getParameter("nombre");
        
        String fechaNac = request.getParameter("fechaNac");
        
        
        // *****  Calculando la edad  ************
        
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate fechaNacimiento = LocalDate.parse(fechaNac, fmt);
        
            LocalDate ahora = LocalDate.now();
            Period periodo = Period.between(fechaNacimiento, ahora);                  
            String edadReal = String.valueOf(periodo.getYears()) ;       
        
        /// **************************************************************
            
            
        miForm = new FormularioPersonaVo (nombre, edadReal);
        
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
