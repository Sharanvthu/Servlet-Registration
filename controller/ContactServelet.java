package net.java.Registration.controller;

import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.sun.corba.se.spi.protocol.RequestDispatcherDefault;

import net.java.Registration.dao.RegisterContactDao;
import net.java.Registration.model.Contact;

/**
 * Servlet implementation class ContactServelet
 */
@WebServlet("/login")
public class ContactServelet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private RegisterContactDao registerContactDao=new RegisterContactDao();
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ContactServelet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		
	
		RequestDispatcher dispatcher=request.getRequestDispatcher("WEB-INF/views/ContactRegisterPage.jsp");
		dispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name=request.getParameter("name");
		String number=request.getParameter("number");
		Contact contact=new Contact();
		contact.setName(name);
		contact.setNumber(number);
		try {
			registerContactDao.registerContact(contact);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		RequestDispatcher dispatcher=request.getRequestDispatcher("WEB-INF/views/RegisterSuccess.jsp");
		dispatcher.forward(request, response);
		
	}

}
