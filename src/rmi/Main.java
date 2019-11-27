import java.rmi.*;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		try {
			Scanner entrada = new Scanner(System.in);
			Servico s = (Servico) Naming.lookup("//localhost/EdFService");
			float peso, altura;
			int idade;
			char sexo;

			int opcao = -1;
			
			while(opcao != 0){
				System.out.println("Opções");
				System.out.println("1 - Criptografar mensagem ");
				
				System.out.println("2 - Descriptografar mensagem ");
				System.out.println("0 - Para sair");

				opcao = entrada.nextInt();

				switch(opcao){
					case 1:
						System.out.println("Digite sua mensagem...");
					String mensagem = entrada.next();
					System.out.println(s.criptografar(mensagem));
					break;
					case 2:
					System.out.println("Digite sua mensagem...");
					String mensagem2 = entrada.next();
					System.out.println(s.descriptografar(mensagem2));

					case 0:
						break;
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}