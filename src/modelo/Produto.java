package modelo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
        
public class Produto {
	static Integer valorMenu = 0;
	static Scanner entrada = new Scanner(System.in);
	static List<Produto> produtos = new ArrayList<Produto>();
			
	public static void main(String[] args) {
		while (valorMenu != 3) {
			if (null == valorMenu) {
                            chamarMenu();
                        } else switch (valorMenu) {
                        case 1:
                            informarValores();
                            chamarMenu();
                            break;
                        case 2:
                            imprimir();
                            chamarMenu();
                            break;
                        case 3:
                            System.exit(0);
                        default:
                            chamarMenu();
                            break;
                    }
		}
	}

	private static void imprimir() {
            produtos.forEach((produto) -> {
                System.out.println(produto);
            });
		
	}

	private static void informarValores() {
		System.out.println("\nInforma o nome do Produto");
		String name = entrada.next();
		System.out.println("Quantidade de Produto");
		Integer quant = entrada.nextInt();
		System.out.println("Valor do Produto");
		Float valor = entrada.nextFloat();
		
		Produto nomeProduto = new Produto();
		Produto.add (nomeProduto);
	}

	private static void chamarMenu() {
		System.out.println("\n#########################");
		System.out.println("MENU");
		System.out.println("1:CADASTRAR PRODUTO");
		System.out.println("2:IMPRIMIR");
		System.out.println("3:SAIR");
		
		valorMenu = entrada.nextInt();
	
	}

    private Produto(String nome, Integer quantidade, Float valor) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}

