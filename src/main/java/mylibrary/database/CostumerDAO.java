package mylibrary.database;

import com.mysql.cj.jdbc.JdbcConnection;
import mylibrary.models.Conexion;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
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

        Conexion bdConnect= new Conexion();
        PreparedStatement ps =null;
        ResultSet resultset = null;
        try(Connection connect = bdConnect.getConnection() ){
            String query = "SELECT * FROM costumer";
            ps =connect.prepareStatement(query);
            resultset = ps.executeQuery();
            while (resultset.next()){
                System.out.println("ID: "+ resultset.getInt("doc_ident"));
                System.out.println("Tipo de Documento: "+ resultset.getString("doc_type"));
                System.out.println("nombre: "+ resultset.getString("name"));
                System.out.println("apellido: "+ resultset.getString("last_name"));
                System.out.println("email: "+ resultset.getString("email"));
                System.out.println("programa: "+ resultset.getString("class"));
            }
        }catch (SQLException e){
            System.out.println("no se recuperaron registros");
            System.out.println(e);

        }

    }

    public static void updateCostumerDB(){

    }

    public static void deleteCostumerDB(){

    }
}
