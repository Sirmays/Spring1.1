import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;

@WebServlet(name = "Products", urlPatterns = "/products")
public class Products implements Servlet {
    private static final Logger logger = LoggerFactory.getLogger(Products.class);
    private transient ServletConfig config;

    @Override
    public void init(ServletConfig config) {
        this.config = config;
    }

    @Override
    public ServletConfig getServletConfig() {
        return config;
    }

    @Override
    public void service(ServletRequest req, ServletResponse res) throws
            IOException {
        logger.info("New request");
        res.getWriter().println("<h1>" + new Product(1, "Bread", 100) + "</h1>");
        res.getWriter().println("<h1>" + new Product(2, "Milk", 120) + "</h1>");
        res.getWriter().println("<h1>" + new Product(3, "Chocolate", 10) + "</h1>");
        res.getWriter().println("<h1>" + new Product(4, "Meat", 300) + "</h1>");
        res.getWriter().println("<h1>" + new Product(5, "Cheese", 150) + "</h1>");
        res.getWriter().println("<h1>" + new Product(6, "Apple", 100) + "</h1>");
        res.getWriter().println("<h1>" + new Product(7, "Water", 100) + "</h1>");
        res.getWriter().println("<h1>" + new Product(8, "Juice", 100) + "</h1>");
        res.getWriter().println("<h1>" + new Product(9, "CatMeat", 1000) + "</h1>");
        res.getWriter().println("<h1>" + new Product(10, "Squirrel", 500) + "</h1>");
    }

    @Override
    public String getServletInfo() {
        return "BasicServlet";
    }

    @Override
    public void destroy() {
        logger.info("Servlet {} destroyed", getServletInfo());
    }
}

