/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package computador.Generalizacoes;

import java.util.List;

/**
 *
 * @author Paulo Victor
 */
public abstract class ArmazenamentoEmNuvem {
    protected int espacoArmazenamento;
    protected String usuario;
    protected String senha;
    protected List<Arquivo> arquivosArmazenados;

    public ArmazenamentoEmNuvem(int espacoArmazenamento, String usuario, String senha) {
        this.espacoArmazenamento = espacoArmazenamento;
        this.usuario = usuario;
        this.senha = senha;
    }

    public int getEspacoArmazenamento() {
        return espacoArmazenamento;
    }

    public void setEspacoArmazenamento(int espacoArmazenamento) {
        this.espacoArmazenamento = espacoArmazenamento;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public List<Arquivo> getArquivosArmazenados() {
        return arquivosArmazenados;
    }

    public void setArquivosArmazenados(List<Arquivo> arquivosArmazenados) {
        this.arquivosArmazenados = arquivosArmazenados;
    }
    
    
}
