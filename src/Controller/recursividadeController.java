package Controller;

/*
 * 5. Criar uma aplicação em Java que tenha uma função recursiva que, recebendo um número
inteiro (N), apresente a saída da somatória:

SS = 1 + 1/2 + 1/3 + 1/4 ... 1/n

• O Código deve apresentar, em formato de comentário, como foi definida a condição
de parada;
• O Código deve apresentar, em formato de comentário, como foi definida a relação de
chamada dos passos;
 */

public class recursividadeController {

	public recursividadeController() {
		
	}
	
	public double somatoria(int n, int valorAtual){
		
		if (n >= valorAtual) { 
			return 1.0/valorAtual + somatoria(n,valorAtual+1); //Soma 1/ValorAtual + 1/ValorAtual+1 até 1/N 
		}
		else {
			return 0; //A condição de parada é quando valorAtual > n, ou seja, a soma foi feita até 1/N
		}
	}
	
}
