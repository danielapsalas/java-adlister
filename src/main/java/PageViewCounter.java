import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name="PageViewCounter", urlPatterns = "/counter")
public class PageViewCounter extends HttpServlet {
//    Create a page view counter
//
//    Create a page that displays a number that goes up by one every time the /count page is viewed.
//
//    Bonus:
//
//    Allow the user to pass a parameter in the query string to reset the counter
    int counter = 0;

    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
        String reset = req.getParameter("reset");
        if(reset != null){
            counter = 0;
        }else{
            ++counter;
        }
        res.setContentType("text/html");
        PrintWriter out = res.getWriter();
        out.println("<h1>Hello User! This page has been viewed " + counter + " times </h1>" );
        out.println("<p>Lorem ipsum azebanisum, codeloriat Javainum enterprosit editionum.</p>");
        out.println("<h6>- Azeban Cohort, 2023</h6>");
    }

}
