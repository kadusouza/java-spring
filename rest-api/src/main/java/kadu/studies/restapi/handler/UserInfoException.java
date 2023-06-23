package kadu.studies.restapi.handler;

public class UserInfoException extends RuntimeException {
    public UserInfoException(String mensagem) {
        super(mensagem);
    }
    public UserInfoException(String mensagem, Object ... params) {
        super(String.format(mensagem, params));
    }
}