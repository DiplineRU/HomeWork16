RU text
Работа с исключениями
1. Напишите статический метод, который принимает на вход три параметра: login, password и confirmPassword.
2. Параметр Login содержит в себе только латинские буквы, цифры и знак подчеркивания. 
*Например, java_skypro_go.* У параметра login есть ограничение по длине – он должен быть равен или меньше 20 символов. Если login длиннее 20 символов или содержит в себе недопустимые символы, то необходимо выбросить исключение – `WrongLoginException`.
3. Параметр Password содержит в себе только латинские буквы, цифры и знак подчеркивания. *Например, D_1hWiKjjP_9.* Если password длиннее 20 символов или содержит в себе недопустимые символы, то необходимо выбросить исключение – `WrongPasswordException`.
4. Параметры password и confirmPassword должны быть равны. Если это требование не соблюдается, то нужно выбросить `WrongPasswordException`. 
5. Для обработки исключений используйте multi-catch block.
6. Метод ничего не должен возвращать , если значения параметров подходят под ограничения,  или бросать исключение, если условия не выполняются. 
7. При вызове метода необходимо обработать потенциальные исключения.

ENG text
Working with exceptions
1. Write a static method that accepts three parameters as input: login, password, and confirmPassword.
2. The Login parameter contains only Latin letters, numbers and an underscore. 
*For example, java_skypro_go.* The login parameter has a length limit – it must be equal to or less than 20 characters. If the login is longer than 20 characters or contains invalid characters, then you need to throw an exception – `WrongLoginException'.
3. The Password parameter contains only Latin letters, numbers and an underscore. *For example, D_1hWiKjjP_9.* If the password is longer than 20 characters or contains invalid characters, then an exception must be thrown – `WrongPasswordException'.
4. The password and confirmPassword parameters must be equal. If this requirement is not met, then you need to throw the `WrongPasswordException'. 
5. Use multi-catch block to handle exceptions.
6. The method should not return anything if the parameter values fit the constraints, or throw an exception if the conditions are not met. 
7. When calling the method, it is necessary to handle potential exceptions.
