package java112.project3;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.util.*;

/**
 * The type Question answer servlet.
 */
@WebServlet(
        name = "questionAnswer",
        urlPatterns = { "/question" }
)

public class QuestionAnswerServlet extends HttpServlet {

    /**
     *  Handles HTTP GET requests.
     *
     *@param  request                   the HttpServletRequest object
     *@param  response                  the HttpServletResponse object
     *@exception  ServletException      if there is a Servlet failure
     *@exception  IOException           if there is an IO failure
     */
    public void doGet (HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // create object
        String q1 = request.getParameter("team1");
        String q2 = request.getParameter("team2");
        String q3 = request.getParameter("team3");
        int q4 = Integer.parseInt(request.getParameter("team4"));

        TeamFourBeanOne teamFour = new TeamFourBeanOne(q1, q2, q3, q4);


        if (q1.equals("array")) {
            request.setAttribute("answer1", "correct");
        } else {
            request.setAttribute("answer1", "wrong");
        }

        if (q2.equals("javaIo")) {
            request.setAttribute("answer2", "correct");
        } else {
            request.setAttribute("answer2", "wrong");
        }

        if (q3.equals("servletFour")) {
            request.setAttribute("answer3", "correct");
        } else {
            request.setAttribute("answer3", "wrong");
        }

        if (q4 == 3) {
            request.setAttribute("answer4", "correct");
        } else {
            request.setAttribute("answer4", "wrong");
        }

        request.setAttribute("TeamFour1", teamFour);

        // create url
        String url = "/teamFourResults.jsp";

        RequestDispatcher dispatcher
                = getServletContext().getRequestDispatcher(url);
        dispatcher.forward(request, response);
    }
}