public class App{
        public static void main(String[] args) {
        // --> Criação dos personagens
        Personagem personagemNormal = Personagem.criarPersonagemNormal();
        Personagem personagemPoderoso = Personagem.criarPersonagemPoderoso(80);
        Personagem personagemSoturno = Personagem.criarPersonagemSoturno(5);
        Personagem personagemCustomizado = Personagem.criarPersonagemCustomizado(9, 100, 4);

        System.out.println("Nossos personagens :D");
        System.out.println(personagemNormal);
        System.out.println(personagemPoderoso);
        System.out.println(personagemSoturno);
        System.out.println(personagemCustomizado);
    }
}