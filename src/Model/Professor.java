package Model;

import java.sql.Date;

public class Professor extends Pessoa{

    int idProfessor;
    float salarioProfessor;
    String disciplinaProfessor;

        public Professor(){}


    public Professor(int idProfessor, float salarioProfessor, String disciplinaProfessor) {
        this.idProfessor = idProfessor;
        this.salarioProfessor = salarioProfessor;
        this.disciplinaProfessor = disciplinaProfessor;
    }

    public Professor(int idPessoa, String nomePessoa, Date dnPessoa, String cpfPessoa, int idProfessor,
            float salarioProfessor, String disciplinaProfessor) {
        super(idPessoa, nomePessoa, dnPessoa, cpfPessoa);
        this.idProfessor = idProfessor;
        this.salarioProfessor = salarioProfessor;
        this.disciplinaProfessor = disciplinaProfessor;
    }


    public int getIdProfessor() {
        return idProfessor;
    }


    public void setIdProfessor(int idProfessor) {
        this.idProfessor = idProfessor;
    }


    public float getSalarioProfessor() {
        return salarioProfessor;
    }


    public void setSalarioProfessor(float salarioProfessor) {
        this.salarioProfessor = salarioProfessor;
    }


    public String getDisciplinaProfessor() {
        return disciplinaProfessor;
    }


    public void setDisciplinaProfessor(String disciplinaProfessor) {
        this.disciplinaProfessor = disciplinaProfessor;
    }

    
    

    

    
    }
   

    

    






