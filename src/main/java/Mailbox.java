import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class Mailbox extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
        throws ServletException, IOException {
        resp.setContentType("text/html");
        boolean authenticated = false;
        Cookie[] cookies = req.getCookies();
        if (cookies != null) {
            for (Cookie cookie : cookies) {
                if ("username".equals(cookie.getName()) && "phi".equals(cookie.getValue())) {
                    authenticated = true;
                    break;
                }
            }
        }
        if (authenticated) {
            req.getRequestDispatcher("/mailbox.jsp").forward(req, resp);
        } else {
            resp.sendRedirect("/");
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
        throws ServletException, IOException {
        HttpSession session = req.getSession();
        String username = (String) session.getAttribute("us");
        String password = (String) session.getAttribute("pw");
        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();
        out.println("<!DOCTYPE html>");
        out.println("<html>");
        out.println("<head>");
        out.println("<title>mailbox</title>");
        out.println("<style>");
        out.println("body { background-color: #f3f3b6; display: flex; justify-content: center; align-items: center; height: 70vh; }");
        out.println("table { margin-top: 20px; margin-left: 50px; }");
        out.println("h1 { text-align: center; }");
        out.println("</style>");
        out.println("</head>");
        out.println("<body>");
        out.println("<div>");
        out.println("<h1>Reading Personal Information</h1>");
        out.println("<table border='1' >");
        out.println("    <tr>");
        out.println("        <td>Your Name</td>");
        out.println("        <td>" + req.getParameter("fname") +req.getParameter("lname") + "</td>");
        out.println("    </tr>");
        out.println("    <tr>");
        out.println("        <td>Gender</td>");
        out.println("        <td>" + req.getParameter("gender") + "</td>");
        out.println("    </tr>");
        out.println("    <tr>");
        out.println("        <td>Birthday</td>");
        out.println("        <td>" + req.getParameter("days") +"/" + req.getParameter("month")+"/"+req.getParameter("year") + "</td>");
        out.println("    </tr>");
        out.println("    <tr>");
        out.println("        <td>Major</td>");
        out.println("        <td>" + req.getParameter("major") + "</td>");
        out.println("    </tr>");
        out.println("    <tr>");
        out.println("        <td>I live in</</td>");
        out.println("        <td>" + req.getParameter("country") + "</td>");
        out.println("    </tr>");
        out.println("    <tr>");
        out.println("        <td>Your username</td>");
        out.println("        <td>" + username +"</td>");
        out.println("    </tr>");
        out.println("    <tr>");
        out.println("        <td>Your password</td>");
        out.println("        <td>" + password + "</td>");
        out.println("    </tr>");
        out.println("</table>");
        out.println("</div>");
        out.println("</body>");
        out.println("</html>");
    }
}
