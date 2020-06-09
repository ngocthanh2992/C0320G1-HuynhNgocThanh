import javax.servlet.annotation.WebServlet;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "CalculatorServlet",urlPatterns = "/display-discount")
public class DiscountServlet extends javax.servlet.http.HttpServlet {
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
    String product = request.getParameter("product");
    float price = Float.parseFloat(request.getParameter("price"));
    float discount = Float.parseFloat(request.getParameter("discount"));

    float discountAmount = price * discount * 0.01f;
    float discountPrice = price - discountAmount;

        PrintWriter writer = response.getWriter();
        writer.println("<html>");
        writer.println("Your product is "+ product+ "<br>");
        writer.println("Your discount amount is "+ discountAmount+"<br>");
        writer.println("Your discount price is "+ discountPrice +"<br>");
        writer.println("</html>");
    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {

    }
}
