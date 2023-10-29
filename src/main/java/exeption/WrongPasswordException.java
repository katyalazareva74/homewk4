package exeption;

/**
 * Класс WrongPasswordException формирует исключение в случаях, когда пароль слишком длинный или когда
 * пароль и строка подтверждения пароля не сопадают.
 */
public class WrongPasswordException extends RuntimeException {
    private int length;
    private boolean confirm;

    WrongPasswordException(int length, boolean confirm) {
        super();
        this.length = length;
        this.confirm = confirm;
    }

    @Override
    public String getMessage() {
        return String.format("The password was entered incorrectly! Length - " + this.length + "; " + "Password confirmation: " + this.confirm);
    }
}
