package kadu.studies.restapi.handler;

public class RequiredFieldException extends UserInfoException{
    public RequiredFieldException(String field) {
        super("The field %s is a required field.", field);
    }

}
