package Aula03_HerancaPolimorfismo.Rh;

public class Gerente extends Empregado{
    private String departamento;

    public Gerente(String nome, String cpf, String nis, Double salario, String departamento){
        super(nome, cpf, nis, salario);
        this.departamento = departamento;
    }


    public String getDepartamento() {
        return this.departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    @Override
    public String toString(){
        return super.toString() + 
        "Departamento: " + getDepartamento() + "/n";
    }
}
