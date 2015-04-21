/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package demo;

import com.theopentutorials.jdbc.dao.EmployeeDAO;
import com.theopentutorials.jdbc.db.ConnectionFactory;
import com.theopentutorials.jdbc.db.DbUtil;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;

import com.theopentutorials.jdbc.db.ConnectionFactory;
import com.theopentutorials.jdbc.db.DbUtil;
import com.theopentutorials.jdbc.to.Employee;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Fabian
 */
public class demo1 {
        
        EmployeeDAO empDAO = new EmployeeDAO();
        Employee empleado = null;
        List<Employee> list;

    public demo1() throws SQLException {
        this.list = empDAO.getEmployees();
    }
}
