/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

public class Livro extends Publicacao {
    
    private String isbn;
    
    public Livro(){
    }

    public Livro(String nome, String dataPublicacao, String editora, String isbn) {
        super(nome, dataPublicacao, editora);
        this.isbn = isbn;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }
    public String toString(){
        return "Livro: "+getNome()+", Data de Publicação: "+getDataPublicacao()+ ", Editora: "+getEditora()+""
                + ", ISBN: "+this.isbn;
    }
}
