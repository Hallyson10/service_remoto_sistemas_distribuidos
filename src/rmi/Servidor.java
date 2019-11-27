import java.rmi.*;
import java.rmi.server.UnicastRemoteObject;

public class Servidor {
	public static void main(String[] args) {
		try{
			Servico s = new Servente();
			Servico stub = (Servico)UnicastRemoteObject.exportObject(s, 0);
			Naming.rebind("EdFService", s);
			System.out.println("Servidor em execução");
		} catch (Exception e) {
			System.out.println("Deu ruim parceiro, conexão não foi aceita! \n"+e.getMessage());
		}
	}
}