import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class Login extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
        throws ServletException, IOException {
        resp.setContentType("text/html");
        String username = req.getParameter("username");
        String password = req.getParameter("password");
        HttpSession session = req.getSession();
        session.setAttribute("us",username);
        session.setAttribute("pw",password);

    }
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
        throws ServletException, IOException {
        resp.setContentType("text/html");
        String username = req.getParameter("username");
        String password = req.getParameter("password");
        HttpSession session = req.getSession();
        session.setAttribute("us",username);
        session.setAttribute("pw",password);
        if (username == null || password == null || username.isEmpty() || password.isEmpty()) {
            resp.sendRedirect("/"); // Redirect back to home page
            return;
        }

        // Verify username and hashed password
        if (username.equals("phi") && password.equals("111")) {
            Cookie cookie = new Cookie("username", username);
            cookie.setMaxAge(40);
            cookie.setPath("/"); // Set path
            resp.addCookie(cookie);
            resp.sendRedirect("/mailbox/");
        } else {
            resp.sendRedirect("/"); // Redirect to home page
        }
    }
}
