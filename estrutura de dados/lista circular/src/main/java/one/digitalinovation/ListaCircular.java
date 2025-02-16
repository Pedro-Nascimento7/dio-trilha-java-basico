package one.digitalinovation;

public class ListaCircular <T> {

    private No<T> cabeça;
    private No<T> cauda;
    private int tamanhoLista;



    public ListaCircular() {
        this.cauda = null;
        this.cabeça =null;
        this.tamanhoLista = 0;
    }

    public void add(T conteudo) {
        No<T> novoNO = new No<>(conteudo);
        if (this.tamanhoLista == 0) {
            this.cabeça = novoNO;
            this.cauda = this.cabeça;
            this.cabeça.setNoProximo(cauda);
        } else  {
            novoNO.setNoProximo(this.cauda);
            this.cabeça.setNoProximo(novoNO);
            this.cauda = novoNO;
        }
        this.tamanhoLista++;
    }

    public  void remouve(int index) {
        if (index >= this.tamanhoLista)
            throw new IndexOutOfBoundsException("O indice é maior que o tamanho da lista");
        No<T> noAuxiliar = this.cauda;
        if (index == 0) {
            this.cauda = this.cauda.getNoProximo();
            this.cabeça.setNoProximo(this.cauda);
            }else if(index == 1) {
                this.cauda.setNoProximo(this.cauda.getNoProximo().getNoProximo());
        } else {
            for (int i = 0; i< index-1; i++) {
                noAuxiliar = noAuxiliar.getNoProximo();
            }
            noAuxiliar.setNoProximo(noAuxiliar.getNoProximo().getNoProximo());
        }
        this.tamanhoLista--;
    }


    public T get(int index){
        return this.getNO(index).getConteudo();
    }

    private No<T> getNO(int index) {
        if (this.isEmpty())
            throw new IndexOutOfBoundsException("A lista está vazia");

        if (index == 0) {
            return  this.cauda;
        }

        No<T> noAuxiliar = this.cauda;
        for (int i = 0; (i<index) && (noAuxiliar != null); i++) {
            noAuxiliar = noAuxiliar.getNoProximo();
        }

        return noAuxiliar;

    }

    public boolean isEmpty(){  //testa se a lista está vazia ou não
return  this.tamanhoLista == 0 ? true : false;
    }

    public int size(){
        return  this.tamanhoLista;
    }

    @Override
    public String toString() {
        String strRetorno = "";
        No<T> noAuxiliar = this.cauda;
        for (int i = 0; i < this.size(); i++) {
            strRetorno += "[No{conteudo =" + noAuxiliar.getConteudo() + "}]--->";
            noAuxiliar = noAuxiliar.getNoProximo();
        }

        strRetorno += this.size() != 0 ? "(Retorna ao inicio)" : "[]";

        return strRetorno;
    }
}
