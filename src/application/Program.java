package application;

import java.util.Date;
import java.util.List;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
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
		
		
		System.out.println("\n===== TESTE NUMERO 3: SELLER FIN ALL ==========");
		
		 list = sellerDao.findAll();
		for(Seller obj: list) {
			System.out.println(obj);
		}
		
		System.out.println("\n===== TESTE NUMERO 4: SELLER INSERT ==========");
		
		Seller newSeller = new Seller(null,"bruno", "bruno@gmail.com", new Date(), 400.00, department);
		sellerDao.insert(newSeller);
		System.out.println("Insert! new id = " + newSeller.getId());
		
		System.out.println("\n===== TESTE NUMERO 5: SELLER UPDATE ==========");
		seller1 = sellerDao.findById(1);
		seller1.setName("bruno");
		sellerDao.update(seller1);
		System.out.println("Update completed");
		
		
		System.out.println("\n===== TESTE NUMERO 6: SELLER DELETE ==========");
		System.out.println("Entre com um ID");
		int id = sc.nextInt();
		sellerDao.deleteById(id);
		System.out.println("DELETE COMPLETADO");
		
	}

}
