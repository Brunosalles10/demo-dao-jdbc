package application;

import java.util.Date;
import java.util.List;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {
	public static void main(String[] args) {
		
		SellerDao sellerDao = DaoFactory.creatSellerDao();
		
		System.out.println("===== TESTE NUMERO 1: SELLER FINDBYID ==========");
		Seller seller1 = sellerDao.findById(3);
		System.out.println(seller1);
		
		System.out.println("\n===== TESTE NUMERO 2: SELLER FINDBYdepartment ==========");
		Department department = new Department(2, null);
		List<Seller> list = sellerDao.findByDepartment(department);
		for(Seller obj: list) {
			System.out.println(obj);
		}
		
	}

}
