package Model;

public class Aluno extends Pessoa{
    
    int idAluno;
    String matriculaAluno;

    public Aluno(){}

    
    public Aluno(int idAluno, String matriculaAluno) {
        this.idAluno = idAluno;
        this.matriculaAluno = matriculaAluno;
    }


    public int getIdAluno() {
        return idAluno;
    }
    public void setIdAluno(int idAluno) {
        this.idAluno = idAluno;
    }
    public String getMatriculaAluno() {
        return matriculaAluno;
    }
    public void setMatriculaAluno(String matriculaAluno) {
        this.matriculaAluno = matriculaAluno;
    }

    

}
