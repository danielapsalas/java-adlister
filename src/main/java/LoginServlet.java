import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet(name = "LoginServlet", urlPatterns = "/login")
public class LoginServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();
        //do the opposite
        if (session != null && session.getAttribute("user") != null) {
            response.sendRedirect("/profile");
        }else{
            request.getRequestDispatcher("/login.jsp").forward(request, response);
        }
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        // get the info from the login form
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        boolean validAttempt = username.equals("admin") && password.equals("password");

        if (validAttempt) {
            HttpSession session = request.getSession();//when a user successfully logs in
            session.setAttribute("user", username);//set a key named "user" in the session
            response.sendRedirect("/profile");// then redirect the user to their profile page
        } else {
            response.sendRedirect("/login");
        }
    }
}
