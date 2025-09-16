public class NinjaDeTaijutsu extends Personagem implements Ninja{
    public NinjaDeTaijutsu(String nome, int idade, String aldeia, String [] jutsu, int chakra){
        super(nome, idade, aldeia, jutsu, chakra);
    }
    @Override
    public void usarJutsu(){
        System.out.println(getNome() + " está usando um golpe de TaiJutsu!");
    }
    @Override
    public void desviar(){
        System.out.println(getNome() + " está desviando de um ataque usando TaiJutsu!");
    }
}
