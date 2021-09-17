package Aula03_HerancaPolimorfismo.Cinema;

import java.util.Objects;

public class Ingresso extends Object {
    private Double valor;

    public Ingresso() { }

    public Ingresso(double valor) {
        this.valor = valor;
    }

    public Double getValor() {
        return this.valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "Valor do igresso: " + valor + "\n";
    }

    // Faz a mesma coisa do equals
    public boolean ehIgual(Ingresso outroIngresso) {
        return Objects.equals(valor, outroIngresso.valor);
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Ingresso)) {
            return false;
        }
        Ingresso ingresso = (Ingresso) o;
        return valor.equals(ingresso.valor);
    }
}