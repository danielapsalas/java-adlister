import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "IndexServlet", urlPatterns = "/ads")
public class IndexServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        Ads listingAdsDao = DaoFactory.getAdsDao();
        List<Ad> adsList = listingAdsDao.all();

        request.setAttribute("ads", adsList);//lists of ads
        request.getRequestDispatcher("/ads/index.jsp").forward(request, response);
    }
}
