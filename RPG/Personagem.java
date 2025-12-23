import java.util.ArrayList;
import java.util.List;
public class Personagem{
    //Classe Construtora Protegida//
    protected String nome;protected int vida;int vidaMaxima;int ataqueBase;int defesaBase;protected List<Item>inventario;protected List<Status>statusAtivo;
    //Classe pública do personagem//
    public Personagem(String nome,int vida,int ataqueBase,int defesaBase){
        this.nome=nome;
        this.vida=vida;
        this.ataqueBase=ataqueBase;
        this.defesaBase=defesaBase;
    }
    public String getNome(){return nome;}
    public int getVida(){return vida;}
    public int getVidaMaxima(){return vidaMaxima;}
    public int getAtaqueBase(){return ataqueBase;}
    public int getDefesaBase(){return defesaBase;}
    public List<Item>getInventario(){return inventario;}
    public List<Status>getStatus(){return statusAtivo;}
    //receber dano//
    public void receberDano(int dano){
        this.vida-=dano;
        if(this.vida<0){this.vida=0;}
        System.out.println(this.nome+" recebeu "+dano+" de dano. Vida restante: "+this.vida);
        if(this.vida==0){System.out.println(this.nome+" foi derrotado!");}
    }
    //Sistema de Status//
    public void adicionarStatus(Status status){
        this.statusAtivo.add(status);
        System.out.println(this.nome+" foi afetado por "+status.gettipo()+"!");
    }
    public void aplicarStatus(Status status){
        List<Status> statusRemover=new ArrayList<>();
        for(status : statusAtivo){
            if(status.gettipo().equals("Queimadura")){System.out.println(this.nome+" está queimado! E recebeu "+status.getDanoPorTurno()+" de dano de queimadura.");}
        }
    public void cura(int quantidadeDeCura){
        this.vida+=this.quantidade_cura;
        if(this.vida>this.vidaMaxima){
            this.vida=this.vidaMaxima;
        }
        System.out.println(this.nome+" curou "+ this.quantidade_Cura+" de vida. Vida atual: "+this.vida);
    }
    public void ataque(personagem Alvo){
        int dano=ataqueBase-alvo.defesaBase;
        if(dano<0){
            dano=0;
            System.out.println(this.nome+" atacou "+alvo.nome+" e causou "+dano+" de dano.");
            alvo.receberDano(dano);
        }
    public void exibirStatus(){
        System.out.println("==="+this.nome+"===");
        System.out.println("Vida: "+this.vida+"/"+this.vidaMaxima);
        System.out.println("Ataque: "+this.ataque);
        System.out.println("Defesa: "+this.vida);
        System.out.println("Mana: "+this.mana+"/"+this.manaMaxima);
        if(!statusAtivos.isempty()){
            System.out.println("Status: ");
            for(status s:statusAtivos){
                System.out.println(s.getTipo()+"("s.getDuracao()+turnos")");
            }
        }
        public boolean estaVivo(){
            return this.vida>0;
        }
    }
    }
}
