package ecocar;

import java.util.ArrayList;

public class Agencia {
    //Endereço
        private int id;
        private String estado;
        private String cidade;
        private String rua;
        private int numero;
    
    
    //Listas
        ArrayList<Cliente> clientes = new ArrayList<>();
        ArrayList<Funcionario> funcionarios = new ArrayList<>();
        ArrayList<Carro> carrosVendidos = new ArrayList<>();
    
    //Indicadores
        private int qtdClientes;
        private int qtdFuncionarios;
        private int qtdCarrosVendidos;
    
    //Construtor
        public Agencia(int id, String estado, String cidade, String rua, int numero) {
            this.id = id;
            this.estado = estado;
            this.cidade = cidade;
            this.rua = rua;
            this.numero = numero;
            this.qtdCarrosVendidos = 0;
            this.qtdClientes = 0;
            this.qtdFuncionarios = 0;            
        }
        
     //Métodos setters e getters
        public int getId() {
            return id;
        }       

        public String getEstado() {
            return estado;
        }

        public String getCidade() {
            return cidade;
        }

        public String getRua() {
            return rua;
        }

        public int getNumero() {
            return numero;
        }

        public int getQtdClientes() {
            return qtdClientes;
        }

        public void setQtdClientes(int qtdClientes) {
            this.qtdClientes = qtdClientes;
        }

        public int getQtdFuncionarios() {
            return qtdFuncionarios;
        }

        public void setQtdFuncionarios(int qtdFuncionarios) {
            this.qtdFuncionarios = qtdFuncionarios;
        }

        public int getQtdCarrosVendidos() {
            return qtdCarrosVendidos;
        }

        public void setQtdCarrosVendidos(int qtdCarrosVendidos) {
            this.qtdCarrosVendidos = qtdCarrosVendidos;
        }
    
    //Funções da classe    
        public void adicionarCliente(Cliente c1){
            clientes.add(c1);
            this.qtdClientes = this.qtdClientes + 1;
        }
        
        public void listarClientes(){
            for(int i = 0; i < clientes.size();i++){
                clientes.get(i).exibirCliente();
                System.out.println("");
            }
        }
        
        public void adicionarFuncionario(Funcionario f1){
            funcionarios.add(f1);
            this.qtdFuncionarios = this.qtdFuncionarios + 1;
        }
        
        public void listarFuncionarios(){
            for(int i = 0; i < funcionarios.size();i++){
                funcionarios.get(i).exibirFuncionario();
                System.out.println("");
            }
        }
        
        public void adicionarCarroVendido(Carro car1, Funcionario f1, Cliente c1){
            carrosVendidos.add(car1);            
            car1.setUnidadesVendidas(car1.getUnidadesVendidas() + 1);                       
            f1.setQtdCarrosVendidos(f1.getQtdCarrosVendidos() + 1);
            f1.setValorTotalVendido(car1.getValorDeVenda() + f1.getValorTotalVendido());
            c1.setCarrosComprados(c1.getCarrosComprados() + 1);
            c1.setValorTotalComprado(car1.getValorDeVenda() + c1.getValorTotalComprado());
            this.qtdCarrosVendidos = this.qtdCarrosVendidos + 1;
        }
        
        public void listarCarrosVendidos(){
            for(int i = 0; i < carrosVendidos.size();i++){
                carrosVendidos.get(i).exibirCarro();
                System.out.println("");
            }
        }
        
        public double calcularFaturamento(){
            double soma = 0.0;
            for(int i = 0; i < carrosVendidos.size(); i++){
                soma = soma + carrosVendidos.get(i).getValorDeVenda();
            }  
            return soma;
        }
        
        public double calcularDespesa(){
            double soma = 0.0;
            for(int i = 0; i < funcionarios.size(); i++){
                soma = soma + funcionarios.get(i).getSalario();
            }
            
            for(int i = 0; i < carrosVendidos.size(); i++){
                soma = soma + carrosVendidos.get(i).getCustoDeFabricacao();
            }
            return soma;
        }
        
        public double calcularLucro(){
            return calcularFaturamento() - calcularDespesa();
        }
        
        public int unidadesVendidas(Carro c){
            int qtd = 0;
            for(int i = 0; i < carrosVendidos.size();i++){
                if(carrosVendidos.get(i).getId() == c.getId()){
                    qtd = qtd + 1;
                }
            }
            return qtd;
        }
        
        public void exibirAgencia(){
            System.out.println("ID: " + this.id);
            System.out.print("Endereço: ");
            System.out.println(this.rua + ", número " + this.numero + ", " + this.cidade + ", " + this.estado);
            System.out.println("");
            System.out.println("Quantidade de clientes: " + this.qtdClientes);
            System.out.println("Quantidade de carros vendidos: " + this.qtdCarrosVendidos);
            System.out.println("Quantidade de funcionários: " + this.qtdFuncionarios);
            System.out.println("Lucro: " + calcularLucro());
        }
        
}
