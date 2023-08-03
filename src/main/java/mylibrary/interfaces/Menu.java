package mylibrary.interfaces;

import mylibrary.database.CostumerService;

import java.util.Scanner;

public class Menu {
    Scanner sc=new Scanner(System.in);
    CostumerService costumerService = new CostumerService();

    public void menuApp(){

        int opc;


        do{
            System.out.println("----------------------------------------------------");
            System.out.println("1. Registrar Usuario\n"+ "2. Listar usuarios\n" + "3. Actualizar datos usuario\n"+ "4. borrar datos de usuario\n"+ "5. salir\n");
            System.out.println("-----------------------------------------------------");
            System.out.println("Seleccione una opcion");
            opc=sc.nextInt();

            switch (opc){
                case 1:
                    System.out.println("Registro de Usuarios");
                    CostumerService.createCostumer();
                    break;
                case 2:
                    System.out.println("listado de usuarios");
                    CostumerService.readCostummer();
                    break;
                case 3:
                    System.out.println("actualizar datos de usuario");
                    break;
                case 4:
                    System.out.println("borrar Usuarios");
                    break;
                case 5:
                    System.out.println("salir del sistema");
                    break;
                default:
            }

        }while (opc!=5);
    }
}
