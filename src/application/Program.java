package application;

import java.util.List;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();
		/*
		SellerDao sellerDao = DaoFactory.createSellerDao();
		
		System.out.println("=== TEST 1: seller findById ===");
		Seller seller = sellerDao.findById(8);
		System.out.println(seller);
		
		System.out.println("\n=== TEST 2: seller findByDepartment ===");
		Department department = new Department(2, null);
		List<Seller> list = sellerDao.findByDepartment(department);
		list.forEach(System.out::println);
		
		System.out.println("\n=== TEST 3: seller findByDepartment ===");
		List<Seller> alllist = sellerDao.findAll();
		alllist.forEach(System.out::println);
		
		System.out.println("\n=== TEST 4: seller insert ===");
		Seller obj = new Seller(null, "Greg", "greg@gmail.com", new Date(), 4000.0, department);
		sellerDao.insert(obj);
		System.out.println("Inserted! New id = " + obj.getId());
		
		System.out.println("\n=== TEST 5: seller update ===");
		obj = sellerDao.findById(14);
		obj.setName("Martha Waine");
		sellerDao.update(obj);
		System.out.println("Update completed!");
		
		System.out.println("\n=== TEST 6: seller delete ===");
		System.out.println("Enter id for delete teste: ");
		int id = sc.nextInt();
		sellerDao.deleteById(id);
		System.out.println("Delete completed!");
		 */
		
		System.out.println("=== TEST 1: department findById ===");
		Department seller = departmentDao.findById(1);
		System.out.println(seller);

		System.out.println("\n=== TEST 2: department allList ===");
		List<Department> list = departmentDao.findAll();
		list.forEach(System.out::println);
		
		System.out.println("\n=== TEST 3: department insert ===");
		Department dep = new Department(null, "D2");
		departmentDao.insert(dep);
		System.out.println("Insert departmente id: " + dep.getId());
		
		System.out.println("\n=== TEST 4: department update ===");
		dep.setName("Sports");
		departmentDao.update(dep);
		System.out.println("Update department: " + dep.getId());
		
		System.out.println("\n=== TEST 5: department delete ===");
		System.out.println("Enter id for delete teste: ");
		int id = sc.nextInt();
		departmentDao.deleteById(id);
		System.out.println("Delete completed!");
		
		sc.close();
	}
}
