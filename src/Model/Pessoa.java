package Model;

import java.sql.Date;

public class Pessoa {
  int idPessoa;
  String nomePessoa;
  Date dnPessoa;
  String cpfPessoa;

  public Pessoa() {
  }

  public Pessoa(int idPessoa, String nomePessoa, Date dnPessoa, String cpfPessoa) {
    this.idPessoa = idPessoa;
    this.nomePessoa = nomePessoa;
    this.dnPessoa = dnPessoa;
    this.cpfPessoa = cpfPessoa;
  }

  public int getIdPessoa() {
    return idPessoa;
  }

  public void setIdPessoa(int idPessoa) {
    this.idPessoa = idPessoa;
  }

  public String getNomePessoa() {
    return nomePessoa;
  }

  public void setNomePessoa(String nomePessoa) {
    this.nomePessoa = nomePessoa;
  }

  public Date getDnPessoa() {
    return dnPessoa;
  }

  public void setDnPessoa(Date dnPessoa) {
    this.dnPessoa = dnPessoa;
  }

  public String getCpfPessoa() {
    return cpfPessoa;
  }

  public void setCpfPessoa(String cpfPessoa) {
    this.cpfPessoa = cpfPessoa;
  }

}
