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
    public String getnome(){return nome;}
    public int getvida(){return vida;}
    public int getvidaMaxima(){return vidaMaxima;}
    public int getataqueBase(){return ataqueBase;}
    public int getdefesaBase(){return defesaBase;}
    public List<Item>getinventario(){return inventario;}
    public List<Status>getstatus(){return statusAtivo;}
    //receber dano//
    public void receberdano(int dano){
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
    }
}