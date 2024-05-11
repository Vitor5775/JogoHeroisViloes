public class Vilao extends Personagem {
    private int tempoDePrisao;
    public int poder;
    public Vilao(String nome, String nomeVidaReal, int tempoDePrisao) {
        super(nome, nomeVidaReal);
        this.tempoDePrisao = tempoDePrisao;
    }
}