package Aula03_HerancaPolimorfismo.Cinema;

import java.util.Objects;

public class ingressoVip extends Ingresso {
    private Double valorAdicional;

    public ingressoVip(Double valor, Double valorAdicional) {
        super(valor);
        this.valorAdicional = valorAdicional;
    }

    @Override
    public String toString() {
        return "Valor do igresso: " + (super.getValor() + valorAdicional);
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof ingressoVip)) {
            return false;
        }
        ingressoVip ingressoVip = (ingressoVip) o;
        return super.equals(o) && Objects.equals(valorAdicional, ingressoVip.valorAdicional);
    }
}
