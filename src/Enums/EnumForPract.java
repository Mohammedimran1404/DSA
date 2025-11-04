package Enums;

public enum EnumForPract {

    SUCCESS(200),BADREQUEST(400),PAGENOTFOUND(404);
    private int code;

    EnumForPract(int code) {
        this.code=code;
    }

    public int getCode(){
        return code;
    }





}
