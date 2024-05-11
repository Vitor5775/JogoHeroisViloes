public class Jogo {
    public static void main(String[] args) {
        SuperHeroi superHeroi = new SuperHeroi("Superman", "Clark Kent");
        Vilao vilao = new Vilao("Lex Luthor", "Alexander Luthor", 5);
        superHeroi.poder = 100;
        vilao.poder = 9100;
        Confronto confronto = new Confronto();
        int resultado = confronto.executar(superHeroi, vilao);
        System.out.println("Resultado do confronto: " + resultado);
    }
}