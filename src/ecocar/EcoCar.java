package ecocar;

public class EcoCar {
    public static void main(String[] args) {
        Administracao adm = new Administracao();
        
        
        Cliente c1 = new Cliente("Pedro", 1996, "Rio de Janeiro", "Niteroi", "Nilo Peçanha", 31);
        Cliente c2 = new Cliente("Ana", 1993, "Rio de Janeiro", "Volta Redonda", "Alvares de mello", 585);
        //c1.exibirCliente();
        
        
        Funcionario f1 = new Funcionario("Alberto", 1990, "Rio de Janeiro", "São Gonçalo", "Getúlio Vargas", 1238, "Gerente", 4900);       
        //f1.exibirFuncionario();
        
        Carro car1 = new Carro(1,"ECO Sedan", 2019, 45000, 37000);
        Carro car2 = new Carro(2,"Florest Hatch", 2019, 60000, 45000);
        //car1.exibirCarro();
        
        Agencia a1 = new Agencia(1, "Rio de Janeiro", "Niterói", "Amaral Peixoto", 500);
        Agencia a2 = new Agencia(2, "São Paulo", "Campinas", "Marcos Neto", 1384);
        
        adm.adicionarAgencia(a1);
        adm.adicionarAgencia(a2);
        
        a1.adicionarCliente(c1);
        a1.adicionarCliente(c2);
        a1.adicionarFuncionario(f1);
        
        a1.adicionarCarroVendido(car1, f1, c1);
        a1.adicionarCarroVendido(car1, f1, c1);
        a1.adicionarCarroVendido(car1, f1, c1);
        
        //a1.listarClientes();
        //a1.listarFuncionarios();
        //a1.listarCarrosVendidos();
        
        double lucro = a1.calcularLucro();
        //System.out.println("O lucro da Agencia é: " + lucro);
        
        int qtd = a1.unidadesVendidas(car1);
        //System.out.println("Unidades vendidas: " + qtd);
        
        //a1.exibirAgencia();
        adm.listarAgencias();
    }
    
}
