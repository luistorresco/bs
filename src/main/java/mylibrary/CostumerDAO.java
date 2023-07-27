package mylibrary;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public interface CostumerDAO {
    public  static void createCostumerDB(CostumerModel cm){
        Conexion bdConnect= new Conexion();

        try(Connection connect = bdConnect.getConnection()) {
            PreparedStatement ps =null;
            try {
                String query= "INSERT INTO costumer (doc_ident, doc_type, name, last_name, email, class)VALUES(?,?,?,?,?,?)";
                ps = connect.prepareStatement(query);
                ps.setInt(1, cm.getIdentityDoc() );
                ps.setString(2, cm.getDocType() );
                ps.setString(3,cm.getName());
                ps.setString(4,cm.getLastName());
                ps.setString(5,cm.getEmail());
                ps.setString(6,cm.getGroupClass());
                ps.executeUpdate();
                System.out.println("Registro Exitoso");
            }catch (SQLException exeption){
                System.out.println(exeption);
        }
        }catch (SQLException e){
            System.out.println(e);
        }

    }

    public static void readCostummerDB(){

    }

    public static void updateCostumerDB(){

    }

    public static void deleteCostumerDB(){

    }
}
