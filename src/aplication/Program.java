package aplication;

import java.util.List;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {


		SellerDao sellerDao = DaoFactory.createSellerDao();
		Seller seller = sellerDao.findById(3);
		System.out.println("=====teste 1\n\n");
		System.out.println(seller);
		
		System.out.println("=====teste 2\n");
		Department department = new Department(2,null);
		List<Seller> list = sellerDao.findByDepartment(department);
		for(Seller obj: list) {
			System.out.println(obj);
		}
		System.out.println("=====teste 3\n");
		list = sellerDao.findAll();
		for(Seller obj: list) {
			System.out.println(obj);
		}
	}

}
