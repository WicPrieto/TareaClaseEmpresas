package conexion2;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class Empresa {

        public static void creartablausuarios() {
            String createTableSQL = "CREATE TABLE Dietas("
                    + "id VARCHAR(15) NOT NULL, "
                    + "empleado VARCHAR(50), "
                    + "departamento VARCHAR(50), "
                    + "cantidad en euros VARCHAR(15) NOT NULL, "
                    + "concepto VARCHAR(50) "
                    + "PRIMARY KEY (id))";

            try (Connection conn = conexion.getConnection();
                 Statement stmt = conn.createStatement()) {
                stmt.execute(createTableSQL);
                System.out.println("La tabla Dietas está lista.");
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        public static void main(String[] args) {
            creartablausuarios();
        }
    }


