package Model;
import java.sql.Date;

public class Funcionario extends Pessoa{
    int idFuncionario;
    String cargoFuncionario;
    float salarioFuncionario;
    Date dataDeAdmissao;
    
    public Funcionario(){}

    public Funcionario(int idFuncionario, String cargoFuncionario, float salarioFuncionario, Date dataDeAdmissao) {
        this.idFuncionario = idFuncionario;
        this.cargoFuncionario = cargoFuncionario;
        this.salarioFuncionario = salarioFuncionario;
        this.dataDeAdmissao = dataDeAdmissao;
    }

    public int getIdFuncionario() {
        return idFuncionario;
    }

    public void setIdFuncionario(int idFuncionario) {
        this.idFuncionario = idFuncionario;
    }

    public String getCargoFuncionario() {
        return cargoFuncionario;
    }

    public void setCargoFuncionario(String cargoFuncionario) {
        this.cargoFuncionario = cargoFuncionario;
    }

    public float getSalarioFuncionario() {
        return salarioFuncionario;
    }

    public void setSalarioFuncionario(float salarioFuncionario) {
        this.salarioFuncionario = salarioFuncionario;
    }

    public Date getDataDeAdmissao() {
        return dataDeAdmissao;
    }

    public void setDataDeAdmissao(Date dataDeAdmissao) {
        this.dataDeAdmissao = dataDeAdmissao;
    }

    
}
