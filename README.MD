# Анализ решения задач
Структура:
- Мое решение (плюсы и минусы)
- Решение с LeetCode (плюсы и минусы)
- Что понравилось и что нет
## Easy
### "Палиндромы"
Я решил пойти на прямую, используя методы:
1. Для преобразования из int в String
 ```markup
 String isPalindrome = String.ValueOf(x);
```
2. Для реверсирования строки
```markup
new StringBuilder(isPalindrome).reverse().toString()
```
3. Для сравнения строк
```markup
Objects.equals(isPalindrome, new StringBuilder(isPalindrome).reverse().toString())
```
Итоговый код:
```markup
package Easy;  
  
import java.util.Objects;  
  
public class PalindromeNumber {  
    public static void main(String[] args) {  
        int x = 1221;  
        String isPalindrome = String.valueOf(x);  
        if (Objects.equals(isPalindrome, new StringBuilder(isPalindrome).reverse().toString())) {  
            System.out.println("true");  
        } else {  
            System.out.println("false");  
        }     
    }  
}
```
Минус моего способа решения:
* прямолинейность
* использование *специфических* дополнительных методов (приводит к более медленной работе программы)

Более грамотное решение.
```markup
package Easy;  
  
import java.util.Objects;  
  
public class PalindromeNumber {  
    public static void main(String[] args) {
        int x = 121;  
        String isPalindrome = Integer.toString(x);  
        int len = isPalindrome.length();  
        for (int i = 0; i < len / 2; i++) {  
            if (isPalindrome.charAt(i) != isPalindrome.charAt(len - i - 1)) {  
                System.out.println("false");  
            }  
        }  
        System.out.println("true");  
    }  
}
```
Основные плюсы:
* Отсутствие *специфических* дополнительных методов
    * Перевод из Int в String
  ```
  String isPalindrome = Integer.toString(x);
  ```
    * Определение длинны строки
  ```
  int len = isPalindrome.length();
  ```
    * Взятие символа из строки по индексу
  ```
  isPalindrome.charAt(i);
  ```
  ### Итог:
* Прикольный способ определения палиндрома, сравнивания символы с разных сторон.
