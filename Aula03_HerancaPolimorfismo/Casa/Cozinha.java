package Aula03_HerancaPolimorfismo.Casa;

public class Cozinha {
    private boolean Americana;
    private float metragemQuadrada;
    private PortaCozinha varPorta = new PortaCozinha();


    public boolean isAmericana() {
        return this.Americana;
    }

    public boolean getAmericana() {
        return this.Americana;
    }

    public void setAmericana(boolean Americana) {
        this.Americana = Americana;
    }

    public float getMetragemQuadrada() {
        return this.metragemQuadrada;
    }

    public void setMetragemQuadrada(float metragemQuadrada) {
        this.metragemQuadrada = metragemQuadrada;
    }

    public PortaCozinha getVarPorta() {
        return this.varPorta;
    }

    public void setVarPorta(PortaCozinha varPorta) {
        this.varPorta = varPorta;
    }

}
