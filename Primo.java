import java.util.Scanner;
public class Primo {

	public static void main(String[] args) {

		//ler o numero inteiro do teclado
		int n;
		Scanner	scan = new Scanner(System.in);
		System.out.print("Digite um número inteiro: ");
		n = scan.nextInt();
		scan.close();
		//calcular se o número é primo
		int contador = 2;
		boolean achouDivisor = false;
		while(contador < n && !achouDivisor){
			if(n%contador == 0){
				achouDivisor = true;
			}else{
				contador++;
			}
		}
		//imprimir resultado
		if(achouDivisor) {
			System.out.println(n + " não é um número primo.");
		}else{
			System.out.println(n + " é um número primo.");
		}
		
	}

}
