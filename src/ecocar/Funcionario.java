package ecocar;

import java.util.Calendar;

public class Funcionario {
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
    
    //Serviço
        private String cargo;
        private int qtdCarrosVendidos;
        private double salario;
        private double valorTotalVendido;
    
    //Construtor
        public Funcionario(String nome, int ano_nascimento, String estado, String cidade, String rua, int numero, String cargo, double salario) {
            this.nome = nome;
            this.ano_nascimento = ano_nascimento;
            this.estado = estado;
            this.cidade = cidade;
            this.rua = rua;
            this.numero = numero;
            this.cargo = cargo;
            this.salario = salario;
            this.qtdCarrosVendidos = 0;
            this.valorTotalVendido = 0;
        }
        
        
    //Métodos setters e getters
        public String getNome() {
            return nome;
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

        public String getCargo() {
            return cargo;
        }

        public void setCargo(String cargo) {
            this.cargo = cargo;
        }

        public int getQtdCarrosVendidos() {
            return qtdCarrosVendidos;
        }

        public void setQtdCarrosVendidos(int qtdCarrosVendidos) {
            this.qtdCarrosVendidos = qtdCarrosVendidos;
        }

        public double getSalario() {
            return salario;
        }

        public void setSalario(double salario) {
            this.salario = salario;
        }

        public double getValorTotalVendido() {
            return valorTotalVendido;
        }

        public void setValorTotalVendido(double valorTotalVendido) {
            this.valorTotalVendido = valorTotalVendido;
        }
        
        
        
        //Funções da classe
            public void exibirFuncionario(){
                System.out.println("Funcionário: " + this.nome);
                int idade = this.ano - this.ano_nascimento;
                System.out.println("Idade: " + idade + " anos");
                System.out.print("Endereço: ");
                System.out.println(this.rua + ", número " + this.numero + ", " + this.cidade + ", " + this.estado);
                System.out.println("");
                System.out.println("Cargo: " + this.cargo);
                System.out.println("Total de carros vendidos: " + this.qtdCarrosVendidos + " unidades");
                System.out.println("Valor total vendido: " + this.valorTotalVendido + " reais");
                System.out.println("Salário: " + this.salario + " reais");
            }
        
}
