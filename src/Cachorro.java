public class Cachorro {
    private donoCachorro dono;
    private String nome;
    private int idade;
    private String raca;
    public Cachorro (String nome, String raca, int idade) {
        this.nome = nome;
        this.raca = raca;
        this.idade = idade;
    }

    public donoCachorro getDono() {
        return dono;
    }

    public void setDono(donoCachorro dono) {
        this.dono = dono;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public java.lang.String getNome() {
        return nome;
    }

    public void setNome(java.lang.String nome) {
        this.nome = nome;
    }

    public java.lang.String getRaca() {
        return raca;
    }

    public void setRaca(java.lang.String raca) {
        this.raca = raca;
    }

    public void Latir(){
        System.out.println(this.nome + "latindo: AUAUAUAUAUAUAUAUAUAUAUAUAUUAUAUAUAUAUAUAUAUAUAUAU");;
    }

    method void morderDono() {
        int novaVida = this.dono.getVida - 10;
        this.dono.setVida(novaVida);
    }
}
