package one.digitalinovation;

public class Pilha {

    private No refNoEntradaPilha;

    public Pilha() {

        this.refNoEntradaPilha = null;

    }

    public void push(No novoNo){
    No refAuxiliar = refNoEntradaPilha;
    refNoEntradaPilha = novoNo;
    refNoEntradaPilha.setReNo(refAuxiliar);
    }

    public No pop(){
        if (!this.isEmpty()){
           No noPoped = refNoEntradaPilha;
           refNoEntradaPilha = refNoEntradaPilha.getRefNo();
           return noPoped;
        }
        return null;
    }

    public No top(){
        return refNoEntradaPilha;
    }

    public boolean isEmpty(){

//        if (refNoEntradaPilha == null){
//            return true;
//        }
//
//        return false;
        return refNoEntradaPilha == null ? true : false;
    }

    @Override
    public String toString() {

        String stringRetorno = "-------------------\n";
        stringRetorno += "     Pilha\n";
        stringRetorno += "-------------------\n";

        No noAuxiliar = refNoEntradaPilha;

        while (true){
            if (noAuxiliar != null){
                stringRetorno += "[no{dado=" +noAuxiliar.getDado() + "}]\n";
                noAuxiliar = noAuxiliar.getRefNo();
            }else  {
                break;
            }
        }
        stringRetorno += "===================\n";
       return stringRetorno;

    }
}
