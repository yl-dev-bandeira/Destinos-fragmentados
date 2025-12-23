public class Item {
    //Construtor de classes//
    private String nome;
    private String descricao;
    //Classe pública//
    public Item(String nome,String descricao){
        this.nome=nome;
        this.descricao=descricao;
    }
    //funções//
    public String getnome(){return nome;}
    public String getdescricao(){return descricao;}
    @Override
    public String toString(){return nome;}
}
