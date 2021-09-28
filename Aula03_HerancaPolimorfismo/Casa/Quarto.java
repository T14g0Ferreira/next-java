package Aula03_HerancaPolimorfismo.Casa;

public class Quarto {
    private boolean banheiro;
    private float metragemQuadrada;
    private PortaQuarto varPorta;

    public Quarto(){
        this.varPorta = new PortaQuarto();
    }


    public PortaQuarto getVarPorta() {
        return this.varPorta;
    }

    public void setVarPorta(PortaQuarto varPorta) {
        this.varPorta = varPorta;
    }

    public boolean isBanheiro() {
        return this.banheiro;
    }

    public boolean getBanheiro() {
        return this.banheiro;
    }

    public void setBanheiro(boolean banheiro) {
        this.banheiro = banheiro;
    }

    public float getMetragemQuadrada() {
        return this.metragemQuadrada;
    }

    public void setMetragemQuadrada(float metragemQuadrada) {
        this.metragemQuadrada = metragemQuadrada;
    }

}
