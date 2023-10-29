package exeption;

public class Verification {
    /**
     * Метод check проверяет правильность введенных логина и пароля. Если выбрасывается исключение в случае длинного логина,
     * то это исключение здесь и обрабатывается.
     *
     * @param login       - пользовательский логин
     * @param password    - пользовательский пароль
     * @param confirmpass строка подтверждения пароля
     * @return - возвращает истину в случае, правильных логина и пароля
     * @throws WrongLoginException    - выбрасывается исключения в случае длинного логина
     * @throws WrongPasswordException - выбрасывается исключение в случаях длинного пароля или не совпадения пароля
     *                                со строкой подтверждения.
     */
    public static boolean check(String login, String password, String confirmpass) throws WrongPasswordException {
        try {
            if (login.length() >= 4) {
                String str = "Username is too long! Length - " + login.length();
                throw new WrongLoginException(str);
            }
        } catch (WrongLoginException e) {
            System.out.println(e);
            return false;
        }
        if ((password.length() >= 4) || (!confirmpass.equals(password))) {
            throw new WrongPasswordException(password.length(), confirmpass.equals(password));
        }
        return true;
    }
}
