package com.productid.web;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import com.productid.web.dao.ProductDao;
import com.productid.web.model.product;

@WebServlet(name = "getProductController", value = "/getProductController")
public class getProductController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        int productID = Integer.parseInt(request.getParameter("id"));
        ProductDao dao = new ProductDao();

        product a = dao.getProduct(productID);

        request.setAttribute("product", a);
        
        RequestDispatcher rd = request.getRequestDispatcher("showProduct.jsp");
        rd.forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}