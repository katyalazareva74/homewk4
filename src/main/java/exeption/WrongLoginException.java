package exeption;

/**
 * Класс WrongLoginException формирует исключение в случае, когда логин слишком длинный.
 */
public class WrongLoginException extends RuntimeException {
    WrongLoginException(String message) {
        super(message);
    }
}
