import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name="PickAColor", urlPatterns = "/pick-color")
public class PickAColor extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("/pick-color.jsp").forward(req, resp);
    }

    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String colorPicker = req.getParameter("color-picker");

        //Now - do we actually get a color in the terminal
        System.out.println(colorPicker);

        //Send this over to our other servlet

        resp.sendRedirect("/viewcolor?userColor=" + colorPicker);

    }
}
