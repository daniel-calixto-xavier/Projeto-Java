/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex4;

    import java.util.Scanner;
/**
 *
 * @author Daniel
 */
public class Ex4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String[] cadastros = new String[15];
        int cadastroCount = 0; // contador 
        int escolha;
        Scanner num = new Scanner(System.in);

        do {
            System.out.print("Escolha 1- Cadastrar, 2- Pesquisar, 3- Sair: ");
            escolha = num.nextInt();
            num.nextLine(); 

            switch (escolha) {
                case 1:
                    if (cadastroCount < 15) { //aqui
                        System.out.print("Digite o nome para cadastro: ");
                        cadastros[cadastroCount] = num.nextLine();
                        cadastroCount++;
                    } else {
                        System.out.println("Limite de 15 cadastros atingido.");
                    }
                    break;

                case 2:
                    System.out.print("Digite o nome para pesquisa: ");
                    String nomePesquisa = num.nextLine();
                    boolean encontrado = false;

                    for (int i = 0; i < cadastroCount; i++) {
                        if (cadastros[i].equals(nomePesquisa)) {
                            System.out.println(cadastros[i] + " cadastrado no índice " + i);
                            encontrado = true;
                            break;
                        }
                    }

                    if (!encontrado) {
                        System.out.println("Hóspede não encontrado");
                    }
                    break;

                case 3:
                    System.out.println("Sair");
                    break;

                default:
                    System.out.println("Opção inválida");
            }
        } while (escolha != 3);

        num.close();
        
    }
    
}
