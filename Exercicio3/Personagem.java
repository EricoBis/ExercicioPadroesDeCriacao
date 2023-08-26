// --> Classe personagem utilizando o padrão "static factory method"

public class Personagem {
    private int visibilidade;  // --> Poderia ser final caso o jogo não permita modificar após criar o personagem  
    private int poder;
    private int vidas;

    /*
    --> Uma futura modificação poderia utilizar constante para valores padrões ("normal"), como:
            private static final int visibilidadeP = 10;
            private static final int poderP = 50;
            private static final int vidasP= 3;
    */

    private Personagem(int visibilidade, int poder, int vidas) {
        this.visibilidade = visibilidade;
        this.poder = poder;
        this.vidas = vidas;
    }

    // --> Método para personagem normal/valores padrão
    public static Personagem criarPersonagemNormal() {
        return new Personagem(10, 50, 3);
    }

    // --> Método para personagens poderosos
    //     -> poder
    public static Personagem criarPersonagemPoderoso(int poder) {
        return new Personagem(10, poder, 3);
    }

    // --> Método para personagens soturnos
    //     -> visibilidade
    public static Personagem criarPersonagemSoturno(int visibilidade) {
        return new Personagem(visibilidade, 50, 3);
    }

    // --> Método para personagem 100% personalizado
    //     -> todos os atributos
    public static Personagem criarPersonagemCustomizado(int visibilidade, int poder, int vidas) {
        return new Personagem(visibilidade, poder, vidas);
    }

    public String toString() {
        return "Personagem [visibilidade => " + visibilidade + ", poder => " + poder + ", vidas => " + vidas + "]";
    }
}
