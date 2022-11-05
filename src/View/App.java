package View;

import Model.Funcionario;
import Model.Pessoa;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        
        Pessoa pessoa = new Pessoa();
        Funcionario func = new Funcionario();

        pessoa.setNomePessoa("Eliane");
        func.setNomePessoa("José");
        
        System.out.println(pessoa.getNomePessoa());
        System.out.println(func.getNomePessoa());
    
              
    }
}
