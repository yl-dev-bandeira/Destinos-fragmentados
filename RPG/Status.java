public class Status {
    //Construtor dos status//
    private String tipo;
    private int duracao;
    private int DanoPorTurno;
    //Classe pública dos status//
    public Status(String tipo,int duracao,int DanoPorTurno){
        this.tipo=tipo;
        this.duracao=duracao;
        this.DanoPorTurno=DanoPorTurno;
    }
    public String gettipo(){return tipo;}
    public int getduracao(){return duracao;}
    public int getDanoPorTurno(){return DanoPorTurno;}
    public void decrementoduracao(){this.duracao--;}
}