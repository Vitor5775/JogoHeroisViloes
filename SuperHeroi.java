public class SuperHeroi extends Personagem {
    public int poder;
    public SuperHeroi(String nome, String nomeReal) {
        super(nome, nomeReal);
    }
    @Override
    public int getPoderTotal() {
        int PoderTotal = super.getPoderTotal();
        int inflator = (int) (PoderTotal * 0.1);
        return PoderTotal + inflator;
    }
}