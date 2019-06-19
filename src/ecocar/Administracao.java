package ecocar;

import java.util.ArrayList;

public class Administracao {
    //Listas
        ArrayList<Agencia> agencias = new ArrayList<>();
     
    //Construtor
        public Administracao() {
        }
        
    
    //Funções da Classe
        public void adicionarAgencia(Agencia a){
            agencias.add(a);
        }
        
        public void listarAgencias(){
            for(int i = 0; i < agencias.size(); i++){
                agencias.get(i).exibirAgencia();
                System.out.println("");
            }
        }
}
