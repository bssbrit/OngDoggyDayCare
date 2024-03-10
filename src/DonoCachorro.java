import java.util.ArrayList;
public class DonoCachorro {
    private int vidaDono = 100;
    private String nome;
    private ArrayList<Cachorro> matilha = new ArrayList<Cachorro>();
    public DonoCachorro (String nome) {
        this.nome = nome;
    }

    public int getVidaDono() {
        return vidaDono;
    }

    public void setVidaDono(int vidaDono) {

        this.vidaDono = novaVida;
    }

    public void adotarCachorro (Cachorro cachorro) {
        matilha.add(cachorro);
    }

    public void abandonarDoggo(Cachorro cachorro) {
        matilha.remove(cachorro);
        setVidaDono(vidaDono - 90);
    }

    public void bellyScratch(Cachorro cachorro) {
        System.out.println(cachorro.getNome() + "is making *PAT PAT PAT* com as patas");
    }
 }
