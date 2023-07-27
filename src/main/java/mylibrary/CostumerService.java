package mylibrary;

import java.util.Scanner;

public class CostumerService {
    static Scanner sc = new Scanner(System.in);
    public  static void createCostumer(){
        System.out.println("identificacion");
        int id = sc.nextInt();
        System.out.println("tipo Id");
        String docType = sc.next();
        System.out.println("nombre");
        String name = sc.next();
        System.out.println("Apellido");
        String lastName = sc.next();
        System.out.println("email");
        String email = sc.next();
        System.out.println("grupo");
        String group = sc.next();

        CostumerModel register = new CostumerModel();
        register.setIdentityDoc(id);
        register.setDocType(docType);
        register.setName(name);
        register.setLastName(lastName);
        register.setEmail(email);
        register.setGroupClass(group);

        CostumerDAO.createCostumerDB(register);

    }

    public static void readCostummer(){

    }

    public static void updateCostumer(){

    }

    public static void deleteCostumer(){

    }
}
