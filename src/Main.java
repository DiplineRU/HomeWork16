import java.util.Scanner;
public class Main {
    public static void main(String[] args) {}
/*
1. Напишите статический метод, который принимает на вход три параметра: login, password и confirmPassword.
2. Параметр Login содержит в себе только латинские буквы, цифры и знак подчеркивания.
*Например, java_skypro_go.* У параметра login есть ограничение по длине – он должен быть равен или меньше 20 символов.
 Если login длиннее 20 символов или содержит в себе недопустимые символы, то необходимо выбросить исключение – `WrongLoginException`.
3. Параметр Password содержит в себе только латинские буквы, цифры и знак подчеркивания. *Например, D_1hWiKjjP_9.*
 Если password длиннее 20 символов или содержит в себе недопустимые символы, то необходимо выбросить исключение – `WrongPasswordException`.
4. Параметры password и confirmPassword должны быть равны. Если это требование не соблюдается, то нужно выбросить `WrongPasswordException`.
5. Для обработки исключений используйте multi-catch block.
6. Метод ничего не должен возвращать, если значения параметров подходят под ограничения,  или бросать исключение, если условия не выполняются.
7. При вызове метода необходимо обработать потенциальные исключения.*/
        private static void check(String login, String password, String confirmPassword){
            Scanner in = new Scanner(System.in);
            System.out.print("Введите логин (логин должен быть не длиннее 20 символов, может содержать: латинские буквы, цифры, знак подчёркивания): ");
            login = in.nextLine();
            System.out.print("Введите пароль (пароль должен быть не длиннее 20 символов, может содержать: латинские буквы, цифры, знак подчёркивания): ");
            password = in.nextLine();
            System.out.print("Введите подтверждение пароля: ");
            confirmPassword = in.nextLine();
            ValidatorCont validator = new ValidatorCont(login, password, confirmPassword);
            try {
                validator.checkLogin();
                validator.checkPassword();
                validator.checkPasswordConfirm();
                System.out.println("Пользователь прошел валидацию");
            } catch (WrongLoginException | WrongPasswordException e) {
                System.out.println("Ошибка валидации: " + e.getMessage());
            }
        }
    }