package com.projetono;

public class No <T> {

    private T conteudo;
    private No <T> proximNo;

    public No(T conteudo) {
        this.proximNo = null;
        this.conteudo = conteudo;
    }
    public T getConteudo() {
        return conteudo;
    }
    public void setConteudo(T conteudo) {
        this.conteudo = conteudo;
    }
    public No<T> getProximoNo(){
        return proximNo;
    }
    public void setProximoNo(No<T> proximoNo){
        this.proximNo = proximoNo;
    }

    @Override
    public String toString() {
        return "No{" + "conteudo='" + conteudo + '\''+'}' ;
    }
    
}
