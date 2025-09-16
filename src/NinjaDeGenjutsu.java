public class NinjaDeGenjutsu extends Personagem implements Ninja{
    public NinjaDeGenjutsu(String nome, int idade, String aldeia, String[] jutsus, int chakra){
        super(nome, idade, aldeia, jutsus, chakra);
    }
    @Override
    public void usarJutsu(){
        System.out.println(getNome() + " está usando um Genjutsu para manipular a mente do inimigo!");
    }
    @Override
    public void desviar(){
        System.out.println(getNome() + " está desviando de um ataque usando ilusões de Genjutsu!");
    }
}
