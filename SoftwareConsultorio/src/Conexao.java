import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Conexao {
	
	
	public Connection con;   //COLOQUEI PUBLIC PARA PODER UTILIZAR EM OUTROS ARQUIVOS - 
							//A VARIAVEL con SERÁ COMO UMA CHAVE TODA VEZ QUE EU IREI INTERAGIR COM O BANCO DE DADOS PRECISO CHAMAR A VARIAVEL con
	public PreparedStatement pst;
	public ResultSet rs;
	
	public void conectar() {
		try {
			
			String addressDB = "jdbc:mysql://localhost:3306/db_consultorio";
			String userDB = "root";
			String passwordDB = "";
			
			Class.forName("com.mysql.cj.jdbc.Driver");//CONFIGURAÇÃO PARA DIZER QUE ESTAMOS UTILIZANDO UM BANCO MYSQL
			
			con = DriverManager.getConnection(addressDB,userDB,passwordDB); //CONFIGURAÇÃO PARA ACESSAR O BANCO DE DADOS
			
		} catch (ClassNotFoundException ex) {
			Logger.getLogger(MedicoForm.class.getName()).log(Level.SEVERE, null, ex);
		} catch (SQLException ex) {
			Logger.getLogger(MedicoForm.class.getName()).log(Level.SEVERE, null, ex);
		}
	}

}
