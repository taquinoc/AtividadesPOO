/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pacoteescola;

/**
 *
 * @author e6661387
 */
public class Pessoa {

    
    private String nome;
    private String sexo;
    private String matricula;
  private String idade;
  
  
    public Pessoa() {
        this.nome = "Não informado";
        this.sexo = "Não informado";
        this.matricula = "Não informada";
        this.idade = "Não dita";
    }
  
    
 
    
   public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getIdade() {
        return idade;
    }

    public void setIdade(String idade) {
        this.idade = idade;
    }



}
