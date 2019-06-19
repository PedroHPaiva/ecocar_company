package ecocar;

import java.util.Calendar;

public class Cliente {
    //Data Atual
        private Calendar cal = Calendar.getInstance();   
        int ano = this.cal.get(Calendar.YEAR);
 
    //Informacoes pessoais
        private String nome;
        private final int ano_nascimento;
    
    //Endereço
        private String estado;
        private String cidade;
        private String rua;
        private int numero;
        
    //Compra
        private int carrosComprados;
        private double valorTotalComprado;
    
    //Construtor
        public Cliente(String nome, int ano_nascimento, String estado, String cidade, String rua, int numero) {
            this.nome = nome;
            this.ano_nascimento = ano_nascimento;
            this.estado = estado;
            this.cidade = cidade;
            this.rua = rua;
            this.numero = numero;
            this.carrosComprados = 0;
            this.valorTotalComprado = 0;
        }
    
    //Métodos setters e getters úteis
        public String getNome() {
            return nome;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }

        public String getEstado() {
            return estado;
        }

        public void setEstado(String estado) {
            this.estado = estado;
        }

        public String getCidade() {
            return cidade;
        }

        public void setCidade(String cidade) {
            this.cidade = cidade;
        }

        public String getRua() {
            return rua;
        }

        public void setRua(String rua) {
            this.rua = rua;
        }

        public int getNumero() {
            return numero;
        }

        public void setNumero(int numero) {
            this.numero = numero;
        }

        public int getCarrosComprados() {
            return carrosComprados;
        }

        public void setCarrosComprados(int carrosComprados) {
            this.carrosComprados = carrosComprados;
        }

        public double getValorTotalComprado() {
            return valorTotalComprado;
        }

        public void setValorTotalComprado(double valorTotalComprado) {
            this.valorTotalComprado = valorTotalComprado;
        }
        
        //Funções da classe
            public void exibirCliente(){
                System.out.println("Cliente: " + this.nome);
                int idade = this.ano - this.ano_nascimento;
                System.out.println("Idade: " + idade + " anos");
                System.out.print("Endereço: ");
                System.out.println(this.rua + ", número " + this.numero + ", " + this.cidade + ", " + this.estado);
                System.out.println("");   
                System.out.println("Total de carros comprados: " + this.carrosComprados + " unidades");
                System.out.println("Valor total gasto: " + this.valorTotalComprado + " reais");
            }
}
