package Aula03_HerancaPolimorfismo.Casa;

public class Porta {
    private String cor;
    private float largura;
    private float altura;
    private Double peso;

    public void abrir(){
        System.out.println("Abrindo a porta normal");
    }

    public void fechar(){

    }

    public String getCor() {
        return this.cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public float getLargura() {
        return this.largura;
    }

    public void setLargura(float largura) {
        this.largura = largura;
    }

    public float getAltura() {
        return this.altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public Double getPeso() {
        return this.peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }
}
