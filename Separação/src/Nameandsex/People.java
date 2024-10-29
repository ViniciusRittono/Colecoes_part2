package Nameandsex;

import java.util.ArrayList;
import java.util.Scanner;

public class People {


	public class SepararPessoasPorSexo {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        ArrayList<String> listaMasculino = new ArrayList<>();
	        ArrayList<String> listaFeminino = new ArrayList<>();

	        String continuar = "s";

	        while (continuar.equalsIgnoreCase("s")) {
	            System.out.print("Digite o nome da pessoa: ");
	            String nome = scanner.nextLine();

	            System.out.print("Digite o sexo da pessoa (M/F): ");
	            String sexo = scanner.nextLine();

	            if (sexo.equalsIgnoreCase("M")) {
	                listaMasculino.add(nome);
	            } else if (sexo.equalsIgnoreCase("F")) {
	                listaFeminino.add(nome);
	            } else {
	                System.out.println("Sexo inválido. Por favor, digite 'M' para masculino ou 'F' para feminino.");
	            }

	            System.out.print("Deseja continuar? (s/n): ");
	            continuar = scanner.nextLine();
	        }

	        scanner.close();

	        System.out.println("\nPessoas do sexo masculino:");
	        for (String nome : listaMasculino) {
	            System.out.println(nome);
	        }

	        System.out.println("\nPessoas do sexo feminino:");
	        for (String nome : listaFeminino) {
	            System.out.println(nome);
	        }
	    }
	}
}
