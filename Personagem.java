public class Personagem {
    private String nome;
    private String nomeReal;
    private Superpoderes[] poderes;
    private int numPoderes;

    public Personagem() {
        this.nome = "";
        this.nomeReal = "";
        this.poderes = new Superpoderes[4];
        this.numPoderes = 0;
    }
    public Personagem(String nome, String nomeReal) {
       this.nome = nome;
       this.nomeReal = nomeReal; 
       this.poderes = new Superpoderes[4];
       this.numPoderes = 0;
    }
    public String getnome() {
        return nome;
    }
    public String getnomeReal() {
        return nomeReal;
    }
    public void adicionaSuperpoderes(Superpoderes sp) {
        if (numPoderes < 4) {
            poderes[numPoderes] = sp;
            numPoderes++;
        }else{
            System.out.println("Limite máximo de poderes atingido!");
        }
    }
    public int getPoderTotal() {
        int total = 0;
        for (int i = 0; 1 < numPoderes; i++) {
            total += poderes[i].getcategoria();
        }
        return total;
    }
}
