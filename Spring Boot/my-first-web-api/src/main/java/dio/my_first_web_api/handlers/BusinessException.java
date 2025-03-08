package dio.my_first_web_api.handlers;

public class BusinessException extends RuntimeException{
    public BusinessException(String mensagem) {
        super(mensagem);
    }
    public BusinessException(String mensagem, Object ... params){
        super(String.format(mensagem, params));
    }
}
