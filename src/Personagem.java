import java.util.ArrayList;
import java.util.List;

public class Personagem {

    private String nome;
    private int idade;
    private String aldeia;
    private List<String> jutsus;
    private int chakra;

    public Personagem(String nome, int idade, String aldeia, String[] jutsus, int chakra) {
        this.nome = nome;
        this.idade = idade;
        this.aldeia = aldeia;
        this.jutsus = new ArrayList<>(List.of(jutsus));
        this.chakra = chakra;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getAldeia() {
        return aldeia;
    }

    public void setAldeia(String aldeia) {
        this.aldeia = aldeia;
    }

    public List<String> getJutsus() {
        return jutsus;
    }

    public void setJutsus(String[] jutsus) {
        this.jutsus = new ArrayList<>(List.of(jutsus));
    }

    public int getChakra() {
        return chakra;
    }

    public void setChakra(int chakra) {
        this.chakra = chakra;
    }
}
