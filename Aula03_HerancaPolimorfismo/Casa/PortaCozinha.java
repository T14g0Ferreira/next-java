package Aula03_HerancaPolimorfismo.Casa;

public class PortaCozinha extends Porta{
    
    @Override
    public void abrir(){
        System.out.println("Abrindo a porta de um jeito diferente");
    }

    @Override
    public void fechar(){
        
    }
}
