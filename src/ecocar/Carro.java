package ecocar;


public class Carro {
    private int id;
    private String modelo;
    private int anoDefabricacao;
    
    private double valorDeVenda;
    private double custoDeFabricacao;
    private int unidadesVendidas;
    
    //Construtor
        public Carro(int id, String modelo, int anoDefabricacao, double valorDeVenda, double custoDeFabricacao) {
            this.id = id;
            this.modelo = modelo;
            this.anoDefabricacao = anoDefabricacao;
            this.valorDeVenda = valorDeVenda;
            this.custoDeFabricacao = custoDeFabricacao;
            this.unidadesVendidas = 0;
        }
    
    //Métodos setters e getters
        public int getId() {
            return id;
        }
   
        public String getModelo() {
            return modelo;
        }

        public int getAnoDefabricacao() {
            return anoDefabricacao;
        }

        public void setAnoDefabricacao(int anoDefabricacao) {
            this.anoDefabricacao = anoDefabricacao;
        }

        public double getValorDeVenda() {
            return valorDeVenda;
        }

        public void setValorDeVenda(double valorDeVenda) {
            this.valorDeVenda = valorDeVenda;
        }

        public double getCustoDeFabricacao() {
            return custoDeFabricacao;
        }

        public void setCustoDeFabricacao(double custoDeFabricacao) {
            this.custoDeFabricacao = custoDeFabricacao;
        }

        public int getUnidadesVendidas() {
            return unidadesVendidas;
        }

        public void setUnidadesVendidas(int unidadesVendidas) {
            this.unidadesVendidas = unidadesVendidas;
        }
        
        
        
    //Funções da classe
        public void exibirCarro(){
            System.out.println("ID: " + this.id);
            System.out.println("Modelo: " + this.modelo);
            System.out.println("Ano: " + this.anoDefabricacao);
            System.out.println("Preço: " + this.valorDeVenda);
            System.out.println("Custo de Fabricação: " + this.custoDeFabricacao);
            System.out.println("Unidades vendidas: " + this.unidadesVendidas);
        }
        
        public double LucroDeVenda(){
            return this.valorDeVenda - this.custoDeFabricacao;
        }
    
}
