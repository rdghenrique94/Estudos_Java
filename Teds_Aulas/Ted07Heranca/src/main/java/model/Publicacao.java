package model;

public class Publicacao {
    
    private String nome, dataPublicacao, editora;
    
    public Publicacao(){
        
    }

    public Publicacao(String nome, String dataPublicacao, String editora) {
        this.nome = nome;
        this.dataPublicacao = dataPublicacao;
        this.editora = editora;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDataPublicacao() {
        return this.dataPublicacao;
    }

    public void setDataPublicacao(String dataPublicacao) {
        this.dataPublicacao = dataPublicacao;
    }

    public String getEditora() {
        return this.editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }
    public String toString(){
        return "PUBLICAÇÃO= Livro: "+this.nome+" Data de Publicação: "+this.dataPublicacao+" Editora: "+this.editora;
} 
}
