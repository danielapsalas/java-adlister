import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name="HelloWorldServlet", urlPatterns = "/hello")
public class HelloWorldServlet extends HttpServlet {

//    Finish up the Hello World Servlet
//
//    Create a page that displays "Hello World!" when a user visits /hello
//
//    Bonus:
//
//    Make the page say "Hello, <name>!" if name is passed as part of the query string (e.g. /hello?name=codeup), otherwise default to "Hello, World!".
    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
        res.setContentType("text/html");
        String name = req.getParameter("name");
        PrintWriter out = res.getWriter();
        out.println("<h1>Hello " + name + "!</h1>" );
        out.println("<p>Lorem ipsum azebanisum, codeloriat Javainum enterprosit editionum.</p>");
        out.println("<h6>- Azeban Cohort, 2023</h6>");
    }

//    Create a page view counter
//
//    Create a page that displays a number that goes up by one every time the /count page is viewed.
//
//    Bonus:
//
//    Allow the user to pass a parameter in the query string to reset the counter

    
}
