import java.util.Scanner;
public class Primo {

	public static void main(String[] args) {

		//ler o numero inteiro do teclado
		int n;
		Scanner	scan = new Scanner(System.in);
		System.out.print("Digite um n�mero inteiro: ");
		n = scan.nextInt();
		scan.close();
		//calcular se o n�mero � primo
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
			System.out.println(n + " n�o � um n�mero primo.");
		}else{
			System.out.println(n + " � um n�mero primo.");
		}
		
	}

}
