/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplopatron;

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
import demo.demo1;

import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author Fabian
 */
public class EjemploPatron {
    
    private Connection connection;
    private Statement statement;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException {
        
        EmployeeDAO employee = new EmployeeDAO();
        Employee empleado = null;
        demo1 demo = new demo1();
        demo = demo1();
       /* Connection connection = null;
        try {
            connection = ConnectionFactory.getConnection();
        } 
        finally {
            DbUtil.close(connection);
        } */
    }
}
