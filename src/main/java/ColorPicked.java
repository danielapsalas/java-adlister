import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name="ColorPicked", urlPatterns = "/viewcolor")
public class ColorPicked extends HttpServlet{


    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
       String colorFromQueryString = request.getParameter("userColor");
        System.out.println("colorFromQueryString = " + colorFromQueryString);

        request.setAttribute("colorForJSP", colorFromQueryString);

        request.getRequestDispatcher("color-picked.jsp").forward(request, response);

    }

}
