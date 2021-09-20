package Aula03_HerancaPolimorfismo.Rh;

public class Rh {
    public static void main(String[] args) {

        // String nome, String cpf, String nis, Double salario
        Empregado empregadoComum = new Empregado(
            "Tiago Souza",
            "45454574390",
            "54645645",
            5000.0
        );
        System.out.println("Informações: \n" + empregadoComum);

        Gerente gerenteSetorEletrodomestico = new Gerente(
            "Tiago Ferreira",
            "45454574390",
            "54645645",
            5000.0, 
            "Setor Eletrodomésticos"
        );
        System.out.println("Informações gerente: \n" + gerenteSetorEletrodomestico);

        Vendedor vendedorEletroDomesticos = new Vendedor(
            "Tiago de Souza Ferreira",
            "45454574390",
            "54645645",
            5000.0, 
            4.0
        );
        System.out.println("Informações vendedor: \n" + vendedorEletroDomesticos);
    }
}
