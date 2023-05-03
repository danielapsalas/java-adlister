import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Arrays;

@WebServlet(name = "PizzaServlet", urlPatterns = "/order-form")
public class PizzaOrderServlet extends HttpServlet {
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
        req.getRequestDispatcher("/pizza-order.jsp").forward(req, resp);
    }
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String crustType = req.getParameter("crust-type");
        String sauceType = req.getParameter("sauce-type");
        String sizeType = req.getParameter("size-type");
        String[] toppings = req.getParameterValues("toppings");
        String address = req.getParameter("delivery-address");

        System.out.println("Hello!" +
                            "\nThis your order: " +
                            "\nCrust: " + crustType +
                            "\nSize: " + sizeType +
                            "\nSauce: " + sauceType +
                            "\nToppings: " + Arrays.toString(toppings) +
                            "\nDelivery Address: " + address);
    }
}
