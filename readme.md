## Kotlin_Homework
Учебный проект по изучению котлина содержит 4 функции. Каждая функция находится в отдельном файле.
1. `square` -  функция-расширения для работы с изменяемой (mutable) коллекцией, содержащей в себе тип Int, функция расширения возводит все элементы коллекции в квадрат.

      ***Пример входных и выходных данных:***
   
   Коллекция, для которой вызывается функция расширения:

    >[1, 4, 9, 16, 25]

   Новые значения:
   >[1, 16, 81, 256, 625]
 
***   
###  Примечание
Так как информации о поведении функции в случае значений, выходящих за диапазон int, нет, квадрат чисел больше 46341 и меньше -46341 даст 0.
***

&nbsp;
2.`compareTypes` - функция, которая принимает в себя Any? и, исходя из того к какому типу принадлежит объект делает определенные действия:

- если объект типа String, выводится полученный тип, его значение и длина строки
- если Int - выводится полученный тип, его значение, и его значение, возведенное в квадрат
- если Double - выводится полученный тип, его значение и значение, округленное до 2х знаков после запятой (незначащие нули отбрасываются)
- если LocalDate - выводится полученный тип, его значение и ответ на вопрос, меньше ли введенная дата даты основания Tinkoff (будем считать что это 24 декабря 2006)
- для других типов поведение не определено, поэтому выводится сообщение “Мне этот тип неизвестен“
- если передано null, выводится "Объект равен null"
***
### Примечание
В целях тестирования функция возвращает строку.
***
   ***Пример входных и выходных данных:***
```
  compareTypes("Test string")
  compareTypes(254)
  compareTypes(Int.MAX_VALUE)
  compareTypes(225.234)
  compareTypes(225.0)
  compareTypes(LocalDate.of(1990,1,1))
  compareTypes(null)
  compareTypes(225.0f)
```
```
Я получил String = 'Test string', eё длина равна 11
Я получил Int = 254, его квадрат равен 64516
Я получил Int = 2147483647, его квадрат не входит в диапазон INT
Я получил Double = 225.234, это число округляется до 225,23
Я получил Double = 225.0, это число округляется до 225
Я получил LocalDate 1990-01-01, она меньше даты основания Tinkoff
Объект равен null
Мне этот тип неизвестен
```

3. `formatList` - функция принимает в себя лист (коллекцию) с числами типа Double? (nullable) , после чего:

- делит на 2 элемент, если он нечетный, а если четный - возводит в квадрат ( проверка на четность/нечетность - без учета дробной части)
- выкидывает все цифры больше 25
- отбрасывает null
- сортирует коллекцию по убыванию
- отбрасывает все элементы коллекции кроме первых 10
- возвращает сумму элементов в оставшейся коллекции

***Пример входящего и выходящего значений:***

Входной массив

>[13.31, 3.98, 12.0, 2.99, 9.0]

Вывод с округлением до двух знаков после запятой

>22,09

4.`numberToText` - функция возвращает строку с прописью натурального числа `n <= 1000` на русском языке.

***Пример входящего и выходящего значений:***
>975

Выходные данные:
>девятьсот семдесят пять

## Тестирование

Класс Tests для тестирования выше описанных функций содержит:
- testSquare() - тест функции `square`
- testCompareTypes() - тест функции `compareTypes`
- testFormatList() - тест функции `formatList`
- testNumberToText() - тест функции `numberToText`

Для запуска тестов необходимо:
1. Склонировать репозиторий 
 >https://github.com/cerlich/kotlin_homework

2. Запустить команду: 
> ./gradlew test
