package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class DB {

	private static Connection conn = null;

	public static Connection getConnection() {
	
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
	            String url = "jdbc:mysql://localhost:3306/coursejdbc"; 
	            String usuario = "root"; 
	            String senha = "arkad"; 
	            conn = DriverManager.getConnection(url, usuario, senha);
	            if (conn != null) {
	                System.out.println("Conexão bem-sucedida!");
	            } else {
	                System.out.println("Não foi possível conectar ao banco de dados.");
			
				}
	            }
			catch (SQLException e) {
				throw new DbException(e.getMessage());
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}
			return conn;
			
		}
		

	public static void closeConnection() {
		if(conn != null) {
			try {
				conn.close();
			}
			catch(SQLException e) {
				throw new DbException(e.getMessage());
			}
		}
	}
	
	public static void cloaseStatement(Statement st) {
		if(st != null) {
			try {
				st.close();
			}catch (Exception e) {
				throw new DbException(e.getMessage());
			}
		}
	}
	
	public static void closedResutset(ResultSet rs) {
		if(rs != null) {
			try {
				rs.close();
			}catch (Exception e) {
				throw new DbException(e.getMessage());
				
			}
		}
	}
	
	}

	
