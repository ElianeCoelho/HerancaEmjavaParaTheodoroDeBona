package Model;

public class Professor extends Pessoa{

    int idProfessor;
    float salarioProfessor;
    String disciplinaProfessor;

    public Professor(){}

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
