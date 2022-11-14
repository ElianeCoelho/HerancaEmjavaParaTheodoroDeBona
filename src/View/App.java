package View;

import Model.Funcionario;
import Model.Professor;

public class App {
    public static void main(String[] args) throws Exception {
      //  System.out.println("Hello, World!");
      //  Pessoa pessoa = new Pessoa();
       Professor prof = new Professor();
        prof.setNomePessoa("Josélia da costa");   
       Funcionario func = new Funcionario();
        
        
      
        func.setNomePessoa("Jóse grandão");
       System.out.println(func.getNomePessoa());
       System.out.println(prof.getNomePessoa());
    
              
    }
}
