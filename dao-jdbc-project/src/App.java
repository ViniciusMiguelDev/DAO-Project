
import java.util.Date;
import java.util.List;

import models.dao.Seller_Dao;
import models.entities.Department;
import models.entities.Seller;
import models.impl.DaoFactory;

public class App {
    public static void main(String[] args) throws Exception {

        Seller_Dao seller_Dao = DaoFactory.createSellerDao();

        System.out.println("=== TEST 1: seller findById ===");
        Seller seller = seller_Dao.findById(3);
        System.out.println(seller);

        System.out.println("=== TEST 2: seller findByDepartment ===");
        Department department = new Department(2, null);
        List<Seller> list = seller_Dao.findByDepartment(department);
        list.forEach(System.out::println);

        System.out.println("=== TEST 3: seller findAll ===");
        list = seller_Dao.findAll();
        list.forEach(System.out::println);

        System.out.println("=== TEST 4: seller insert ===");
        Seller newSeller = new Seller(null, "Greg", "Greg@gmail.com", new Date(), 4000.0, department);
        seller_Dao.insert(newSeller);
        System.out.println("Inserted! New id = " + newSeller.getId());

        System.out.println("=== TEST 5: seller update ===");
        seller = seller_Dao.findById(2);
        seller.setName("Vinizu");
        seller.setEmail("Vinizu@gmail.com");
        seller_Dao.update(seller);
        System.out.println("Update completed");

        System.out.println("=== TEST 5: seller deleteById ===");
        seller_Dao.deleteById(1);
        System.out.println("Delete completed");
    }
}
