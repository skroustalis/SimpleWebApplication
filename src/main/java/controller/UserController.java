package controller;


import java.io.IOException;
import java.sql.Date;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//import dao.ArrayList;
import dao.UserDao;
import model.Address;
import model.User;


@WebServlet("/")
public class UserController extends HttpServlet {
    private static final long serialVersionUID = 1L;
    private UserDao userDao;

    public void init() {
        userDao = new UserDao();
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        String action = request.getServletPath();
    
    try {
    	switch (action){
    	case "/add" : addUser(request,response);
    	break;
    	} 	
    	
    	}catch (ServletException ex) {
        	throw new ServletException(ex);
    	}
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        String action = request.getServletPath();
        
        try {
        	switch (action) {
        	case "/register": register(request,response);
        		break;
        	case "/display": display(request,response);
        		break;
        	case "/delete": delete(request,response);
    		break;
        	default: home(request,response);
        	break;
        	}
        	
        } catch (ServletException ex) {
        	throw new ServletException(ex);
        }
    }

    private void display(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException  {
    	
    	List<User> listUser =userDao.getAllUsers();
		request.setAttribute("listUser", listUser);
		System.out.print(listUser.toString());

		RequestDispatcher dispatcher = request.getRequestDispatcher("display.jsp");
		dispatcher.forward(request, response);
		
	}

	private void addUser (HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
    	String name = request.getParameter("name");
		String surname = request.getParameter("surname");
		String gender = request.getParameter("gender");
		String birthdate = request.getParameter("birthdate");
		String work_address = request.getParameter("work_address");
		String home_address = request.getParameter("home_address");

		Date date=Date.valueOf(birthdate);
		
		Address address = new Address();
		address.setWork_address(work_address);
		address.setHome_address(home_address);
		
		User user = new User();
		user.setName(name);
		user.setSurname(surname);
		user.setGender(gender);
		user.setBirthdate(date);
		user.setAddress(address);
				
		System.out.print(name);
		
        userDao.saveUser(user);
        
       
        response.sendRedirect("/SimpleWebApplication/display");
      
    }
    
	private void home (HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
	
		RequestDispatcher dispatcher = request.getRequestDispatcher("home.jsp");
        dispatcher.forward(request, response);
		
	}
	
	private void register (HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("register.jsp");
        dispatcher.forward(request, response);
		
	}
	
	private void delete (HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		
		int id = Integer.parseInt(request.getParameter("id"));
		userDao.deleteUser(id);
		
		response.sendRedirect("/SimpleWebApplication/display");
	}	
    
}