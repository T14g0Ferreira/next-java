package Aula02_FundamentosPOO.elevador;

public class Elevador {
    private Integer capacidadeMaxima; //capacidade
    private Integer andarTerreo; //sabe qual o andar do terreo
    private Integer lotacaoAtual; // sabe a quantidade de pessoas que está dentro dele
    private Integer totalAndares; // sabe o total de andares
    private Integer andarAtual; // sabe o andar atual
    private Boolean aberto; // sabe se porta está aberta
    private Boolean emMovimento; // sabe se esta em movimento

    // Inicializa
    public Elevador(
        Integer capacidadeMaxima, 
        Integer andarTerreo, 
        Integer totalAndares, 
        Integer andarAtual
    ) {
        this.capacidadeMaxima = capacidadeMaxima;
        this.andarTerreo = andarTerreo;
        this.totalAndares = totalAndares;
        this.andarAtual = andarAtual;
        this.lotacaoAtual = 0;
    }

    // entrar(pessoas)
    public void entrar(Integer quantidadePessoas) {
        Integer capacidadeRestante = capacidadeMaxima - lotacaoAtual;
        if(quantidadePessoas <= capacidadeRestante) {
            lotacaoAtual += quantidadePessoas;
            System.out.println("Entrou " + quantidadePessoas + " pessoas no elevador.");
        } else {
            System.out.println(
                "O elevador não cabe mais tanta gente,"+
                "mande elas irem pela escada!!!"
            );
        }
    }

    // sair()
    public void sair(Integer quantidadePessoas) {
        if(quantidadePessoas <= lotacaoAtual) {
            lotacaoAtual -= quantidadePessoas;
            System.out.println("Saiu " + quantidadePessoas + " pessoas do elevador.");
        } else {
            System.out.println( "Não há tantas pessoas no elevador!!!" );
        }
    }

    // descer
    public void descer(Integer andar) {
        if(andar == andarAtual) {
            System.out.println("Você já está no andar solicitado!!!");
            return;
        }

        if (andar < andarTerreo || andar > andarAtual) {
            System.out.println("Andar inválido!!!");
            return;
        }
        
        movimentar(andar);
    }

    public void subir(Integer andar) {
        if(andar == andarAtual) {
            System.out.println("Você já está no andar solicitado!!!");
            return;
        }

        if (andar < andarTerreo || andar < andarAtual) {
            System.out.println("Andar inválido!!!");
            return;
        }
        
        movimentar(andar);
    }

    private void movimentar(Integer andar) {
        fecharPorta();
        andarAtual = andar;
        abrirPorta();
    }

    private void abrirPorta() {
        aberto = true;
    }

    private void fecharPorta() {
        aberto = false;
    }

    public Integer getCapacidadeMaxima() {
        return this.capacidadeMaxima;
    }

    public Integer getAndarTerreo() {
        return this.andarTerreo;
    }

    public Integer getLotacaoAtual() {
        return this.lotacaoAtual;
    }

    public Integer getTotalAndares() {
        return this.totalAndares;
    }

    public Integer getAndarAtual() {
        return this.andarAtual;
    }

    public Boolean getAberto() {
        return this.aberto;
    }

    public Boolean isAberto() {
        return this.aberto;
    }

    public Boolean getEmMovimento() {
        return this.emMovimento;
    }

    public Boolean isEmMovimento() {
        return this.emMovimento;
    }
}

