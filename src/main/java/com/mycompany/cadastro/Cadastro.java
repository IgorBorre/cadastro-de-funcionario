
package com.mycompany.cadastro;

import java.util.ArrayList;
        
public class Cadastro {

    ArrayList<Funcionario> listFuncionario;
    
    public Cadastro(){
        listFuncionario = new ArrayList<>();
    }
        
    public void addFuncionario(String nome, String endereco, String cpf, String nascimento){
        Funcionario c = new Funcionario(nome, endereco, cpf, nascimento); 
        listFuncionario.add(c);      
    }
    
    public void removeFuncionario(String cpf){
        for(int i = 0; i < listFuncionario.size(); i++){
            Funcionario f = listFuncionario.get(i);
            
            if(f.getCpf().equals(cpf)){
                listFuncionario.remove(f);
            }
        }
    }
    
    public String procuraFuncionario(String cpf){
        for(int i = 0; i < listFuncionario.size(); i++){
            Funcionario f = listFuncionario.get(i);
            
            if(cpf.equals(f.getCpf())){
                f.getNome();
                f.getEndereco();
                f.getCpf();
                f.getNascimento();
                return "Nome: " +f.getNome() + " Endereço: " +f.getEndereco() + " CPF: " +f.getCpf() + " Data de nascimento: " +f.getNascimento();
            }
        }
        return null;
    }
    
    public void atualizaFuncionario(String nome, String endereco, String cpf, String data){
        for(int i = 0; i < listFuncionario.size(); i++){
            Funcionario f = listFuncionario.get(i);
            
            if(cpf.equals(f.getCpf())){
                f.setNome(nome);
                f.setEndereco(endereco);
                f.setNascimento(data);
            }
        }
    }
    
    
    @Override
    public String toString() {
        String s = new String();
        
        for (Funcionario funcionario : listFuncionario) {
            s += funcionario.toString();
            s += "\n";
        }
        return s;
    }
}
