/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package computador.Generalizacoes;

/**
 *
 * @author Paulo Victor
 */
public abstract class Arquivo {
    private String nome;
    private String path;

    public Arquivo(String nome, String path) {
        this.nome = nome;
        this.path = path;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }
    
}
