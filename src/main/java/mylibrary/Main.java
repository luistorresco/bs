package mylibrary;

import mylibrary.interfaces.Menu;
import mylibrary.models.Conexion;

import java.sql.Connection;
import java.sql.SQLException;

public class Main {
    public static void main(String[]args){
        Menu menu = new Menu();
        menu.menuApp();

        Conexion connectDB = new Conexion();
        try(Connection connect = connectDB.getConnection() ){
    }catch (SQLException e){
            System.out.println(e);
        }
    }
}
