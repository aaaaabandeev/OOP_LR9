package com.example.oop_lr9;
import com.example.oop_lr9.User;
import com.example.oop_lr9.UserService;
import com.google.gson.Gson;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.*;
import java.util.List;



@WebServlet("/Users")
public class usercontroller extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        User user = new User();
        user.setUserName(request.getParameter("user_firstname"));
        user.setuser_lastname(request.getParameter("user_lastname"));
        user.setgroup(request.getParameter("group"));
        user.setage(request.getParameter("age"));
        user.setsubject(request.getParameter("subject"));

        UserService.saveUser(user);

        List<User> users = UserService.getAllUsers();
        String usersJson = new Gson().toJson(user);
        response.setContentType("application/json");
        response.setCharacterEncoding("UTF-8");
        response.getWriter().write(usersJson);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        RequestDispatcher requestDispatcher = request.getRequestDispatcher("Users.jsp");
        requestDispatcher.forward(request, response);

        List<User> users = UserService.getAllUsers();
        String usersJson = new Gson().toJson(users);
        response.setContentType("application/json");
        response.setCharacterEncoding("UTF-8");
        response.getWriter().write(usersJson);
    }
}
