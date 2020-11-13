package model;

public class Revista extends Publicacao {
    
    private String periodicidade;
    
    public Revista(){
    }

    public Revista(String nome, String dataPublicacao, String editora, String periodicidade) {
        super(nome, dataPublicacao, editora);
        this.periodicidade = periodicidade;
    }

    public String getPeriodicidade() {
        return periodicidade;
    }

    public void setPeriodicidade(String periodicidade) {
        this.periodicidade = periodicidade;
    }
     public String toString(){
        return "Revista: "+getNome()+", Data de Publicação: "+getDataPublicacao()+ ", Editora: "+getEditora()+""
                + ", Periodicidade: "+this.periodicidade;
    }
}
