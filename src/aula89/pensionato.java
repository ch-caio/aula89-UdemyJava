/*
Fazer um programa que inicie com todos os dez quartos vazios, e depois leia uma quantidade N representando o número de 
estudantes que vão alugar quartos (N pode ser de 1 a 10). Em seguida, registre o aluguel dos N estudantes. Para cada 
registro de aluguel, informar o nome e email do estudante, bem como qual dos quartos ele escolheu (de 0 a 9). Suponha
que seja escolhido um quarto vago. Ao final, seu programa deve imprimir um relatório de todas ocupações do 
pensionato, por ordem de quarto, conforme exemplo. */
package aula89;
import java.util.Locale;
import java.util.Scanner;
import rooms.roomsRent;

public class pensionato {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quantidade alunos");
		int n = sc.nextInt();
		
		roomsRent [] vect = new roomsRent[9];
		
		for (int i=0; i<n; i++) {
			sc.nextLine();
			System.out.print("nome: ");
			String name = sc.nextLine();
			
			System.out.print("email aluno: ");
			String email = sc.nextLine();
			
			System.out.print("quarto aluno: ");
			int room = sc.nextInt();
		
			vect [room] = new roomsRent (name, email, room);
		}
		
		for (int i=0; i<vect.length; i++) {
		if (vect[i] != null) {
			System.out.println(vect[i]);
		}
		}
		sc.close();

	}} // class & main










