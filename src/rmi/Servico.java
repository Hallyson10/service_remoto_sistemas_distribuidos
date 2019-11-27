import java.rmi.*;

public interface Servico extends Remote{

	public String criptografar (String a) throws RemoteException;
	public String descriptografar (String b) throws RemoteException;
}