/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import domain.Note;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Chaudhari
 */
public class NoteServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String path = getServletContext().getRealPath("/WEB-INF/note.txt");
        BufferedReader br = new BufferedReader(new FileReader(new File(path)));
        String titleQuery = request.getParameter("title");
        String contentQuery = request.getParameter("content");
        Note note;

        if (titleQuery == null && contentQuery == null) {
            String title = br.readLine();
            String content = br.readLine();
            note = new Note(title, content);
        } else {
            note = new Note(titleQuery, contentQuery);
        }

       

        request.setAttribute("note", note);

        String editNote = request.getParameter("edit");

        if (editNote == null) {
            getServletContext().getRequestDispatcher("/WEB-INF/viewnote.jsp").forward(request, response);
        } else if (editNote.isEmpty()) {
            getServletContext().getRequestDispatcher("/WEB-INF/editnote.jsp").forward(request, response);

        }

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String path = getServletContext().getRealPath("/WEB-INF/note.txt");
        PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter(path, false)));
        String title = request.getParameter("title");
        String content = request.getParameter("content");
        pw.print(title);
        pw.println(content);
    }

}
