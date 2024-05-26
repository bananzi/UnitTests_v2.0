[![Tests](https://github.com/bananzi/UnitTests_v2.0/actions/workflows/main.yml/badge.svg)](https://github.com/bananzi/UnitTests_v2.0/actions/workflows/main.yml)

#### Задание 

Реализована на `Java` простейшая программа, которая будет считывать из файла числа, а далее отдельными функциями искать среди этих чисел минимальное число, максимальное число, считать их общую сумму и произведение. 

Функции называются, соответственно `min` (минимальное число), `max` (максимальное число), `sum` (сумма всех чисел), `mult` (произведение всех чисел). 

Числа в файле записаны в одной строке, друг от друга отделены пробелами. В файле есть минимум одно число. Максимально возможное количество чисел в файле - 1 млн.
Код был реализован для входных чисел не превышающих int. При значении суммы/произведения значения long - выводится фраза [Сумма/произведение больше чем long]  

Для этой программы подготовлены тесты:
- проверяющие корректность работы функций поиска минимума и максимума
- проверяющие корректность работы функций сложения и умножения
- проверяющие скорость работы программы при увеличении размера входного файла (*при увеличении количества чисел в файле*) [информация по этому пункту выводиться в лог теста в actions]
- а также проверяющий метод scanFile на выбрасывание исключения, если файл не существует.

Так же интегрированна CI система github actions. Тесты проводятся автоматически при push. Так же тесты можно запустить вручную по каждому методу: Actions -> ManualTests -> в выпадающем списке выбрать интересующую функцию.
При успешном прохождении всех тестов реализовано отправка сообщения "всё ок" в телеграмм кана через бота. При нерпохождении тестов конкретного метода, бот присылает сообщения в виде [{название теста метода} не пройден]


![image](https://github.com/bananzi/UnitTests_v2.0/assets/54536912/7011e9db-b934-474d-b14b-886e7b397186)

На графике изображёна зависимость времени исполнения метода поиска минимального значения от количества чисел в файле. Т.к. сложность алгоритма O(n), то график приближен к прямой
