package Aula03_HerancaPolimorfismo.Cinema;

import java.util.Objects;

public class IngressoVip extends Ingresso {
    private Double valorAdicional;

    public IngressoVip(Double valor, Double valorAdicional) {
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
        if (!(o instanceof IngressoVip)) {
            return false;
        }
        IngressoVip ingressoVip = (IngressoVip) o;
        return super.equals(o) && Objects.equals(valorAdicional, ingressoVip.valorAdicional);
    }
}
