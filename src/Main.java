import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.println("Выберите задачу (1-20) или 0 для выхода:");
            int task = scanner.nextInt();
            switch (task) {
                case 1: evenOrOdd(); break; // Задача 1: Четное или нечетное число
                case 2: minOfThree(); break; // Задача 2: Минимальное из трех чисел
                case 3: multiplicationTable(); break; // Задача 3: Таблица умножения
                case 4: sumFromOneToN(); break; // Задача 4: Сумма чисел от 1 до N
                case 5: fibonacciSequence(); break; // Задача 5: Число Фибоначчи
                case 6: primeCheck(); break; // Задача 6: Проверка простого числа
                case 7: reverseNumbers(); break; // Задача 7: Обратный порядок чисел
                case 8: sumEvenNumbersInRange(); break; // Задача 8: Сумма четных чисел
                case 9: reverseString(); break; // Задача 9: Реверс строки
                case 10: countDigits(); break; // Задача 10: Количество цифр в числе
                case 11: factorial(); break; // Задача 11: Факториал числа
                case 12: sumOfDigits(); break; // Задача 12: Сумма цифр числа
                case 13: palindromeCheck(); break; // Задача 13: Палиндром
                case 14: maxInArray(); break; // Задача 14: Найти максимальное число в массиве
                case 15: sumOfArrayElements(); break; // Задача 15: Сумма всех элементов массива
                case 16: countPosAndNeg(); break; // Задача 16: Количество положительных и отрицательных чисел
                case 17: primeNumbersInRange(); break; // Задача 17: Простые числа в диапазоне
                case 18: countVowelsAndConsonants(); break; // Задача 18: Подсчет гласных и согласных в строке
                case 19: reverseWordsInString(); break; // Задача 19: Перестановка слов в строке
                case 20: armstrongCheck(); break; // Задача 20: Число Армстронга
                case 0: return; // Выход из программы
                default: System.out.println("Некорректный выбор. Пожалуйста, выберите снова."); // Некорректный ввод
            }
        }
    }

    // Задача 1: Четное или нечетное число
    static void evenOrOdd() {
        System.out.print("Введите целое число: ");
        int number = scanner.nextInt();
        System.out.println(number % 2 == 0 ? "Четное" : "Нечетное");
    }

    // Задача 2: Минимальное из трех чисел
    static void minOfThree() {
        System.out.print("Введите три целых числа: ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int min = Math.min(a, Math.min(b, c));
        System.out.println("Минимальное число: " + min);
    }

    // Задача 3: Таблица умножения
    static void multiplicationTable() {
        System.out.println("Таблица умножения на 5:");
        for (int i = 1; i <= 10; i++) {
            System.out.println("5 * " + i + " = " + (5 * i));
        }
    }

    // Задача 4: Сумма чисел от 1 до N
    static void sumFromOneToN() {
        System.out.print("Введите целое число N: ");
        int N = scanner.nextInt();
        int sum = (N * (N + 1)) / 2; // Формула суммы первых N чисел
        System.out.println("Сумма от 1 до " + N + ": " + sum);
    }

    // Задача 5: Число Фибоначчи
    static void fibonacciSequence() {
        System.out.print("Введите целое число N: ");
        int N = scanner.nextInt();
        int a = 0, b = 1; // Стартовые числа Фибоначчи
        System.out.print("Первые " + N + " чисел Фибоначчи: ");
        for (int i = 0; i < N; i++) {
            System.out.print(a + " ");
            int next = a + b; // Следующее число
            a = b; // Сдвиг
            b = next; // Сдвиг
        }
        System.out.println();
    }

    // Задача 6: Проверка простого числа
    static void primeCheck() {
        System.out.print("Введите целое число: ");
        int number = scanner.nextInt();
        if (number < 2) {
            System.out.println(number + " не является простым числом.");
            return;
        }
        boolean isPrime = true; // Флаг для проверки простоты
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                isPrime = false; // Если делится на i, то не простое
                break;
            }
        }
        System.out.println(isPrime ? number + " является простым числом." : number + " не является простым числом.");
    }

    // Задача 7: Обратный порядок чисел
    static void reverseNumbers() {
        System.out.print("Введите целое число N: ");
        int N = scanner.nextInt();
        System.out.print("Числа от " + N + " до 1: ");
        for (int i = N; i > 0; i--) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    // Задача 8: Сумма четных чисел
    static void sumEvenNumbersInRange() {
        System.out.print("Введите два целых числа A и B: ");
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int sum = 0;
        for (int i = A; i <= B; i++) {
            if (i % 2 == 0) { // Проверка на четность
                sum += i;
            }
        }
        System.out.println("Сумма четных чисел в диапазоне от " + A + " до " + B + ": " + sum);
    }

    // Задача 9: Реверс строки
    static void reverseString() {
        System.out.print("Введите строку: ");
        String str = scanner.next();
        String reversed = new StringBuilder(str).reverse().toString(); // Реверс строки
        System.out.println("Обратная строка: " + reversed);
    }

    // Задача 10: Количество цифр в числе
    static void countDigits() {
        System.out.print("Введите целое число: ");
        int number = scanner.nextInt();
        int count = String.valueOf(Math.abs(number)).length(); // Длина строки без учета знака
        System.out.println("Количество цифр: " + count);
    }

    // Задача 11: Факториал числа
    static void factorial() {
        System.out.print("Введите целое число N: ");
        int N = scanner.nextInt();
        long fact = 1; // Начальное значение факториала
        for (int i = 2; i <= N; i++) {
            fact *= i; // Вычисление факториала
        }
        System.out.println("Факториал " + N + ": " + fact);
    }

    // Задача 12: Сумма цифр числа
    static void sumOfDigits() {
        System.out.print("Введите целое число: ");
        int number = scanner.nextInt();
        int sum = 0;
        while (number != 0) {
            sum += number % 10; // Суммирование последней цифры
            number /= 10; // Удаление последней цифры
        }
        System.out.println("Сумма цифр: " + sum);
    }

    // Задача 13: Палиндром
    static void palindromeCheck() {
        System.out.print("Введите строку: ");
        String str = scanner.next();
        String reversed = new StringBuilder(str).reverse().toString(); // Реверс строки
        System.out.println(str.equals(reversed) ? "Строка является палиндромом." : "Строка не является палиндромом.");
    }

    // Задача 14: Найти максимальное число в массиве
    static void maxInArray() {
        System.out.print("Введите размер массива: ");
        int size = scanner.nextInt();
        int[] array = new int[size];
        System.out.println("Введите элементы массива:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt(); // Ввод элементов массива
        }
        int max = array[0]; // Начальное значение максимума
        for (int i = 1; i < size; i++) {
            if (array[i] > max) { // Поиск максимального
                max = array[i];
            }
        }
        System.out.println("Максимальное число в массиве: " + max);
    }

    // Задача 15: Сумма всех элементов массива
    static void sumOfArrayElements() {
        System.out.print("Введите размер массива: ");
        int size = scanner.nextInt();
        int[] array = new int[size];
        System.out.println("Введите элементы массива:");
        int sum = 0;
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt(); // Ввод элементов массива
            sum += array[i]; // Суммирование
        }
        System.out.println("Сумма всех элементов массива: " + sum);
    }

    // Задача 16: Количество положительных и отрицательных чисел
    static void countPosAndNeg() {
        System.out.print("Введите размер массива: ");
        int size = scanner.nextInt();
        int[] array = new int[size];
        int posCount = 0, negCount = 0; // Счетчики положительных и отрицательных
        System.out.println("Введите элементы массива:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt(); // Ввод элементов массива
            if (array[i] > 0) posCount++; // Положительное
            else if (array[i] < 0) negCount++; // Отрицательное
        }
        System.out.println("Количество положительных чисел: " + posCount);
        System.out.println("Количество отрицательных чисел: " + negCount);
    }

    // Задача 17: Простые числа в диапазоне
    static void primeNumbersInRange() {
        System.out.print("Введите два целых числа A и B: ");
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        System.out.println("Простые числа в диапазоне от " + A + " до " + B + ":");
        for (int number = A; number <= B; number++) {
            if (number < 2) continue; // Пропуск, если число меньше 2
            boolean isPrime = true; // Флаг для проверки простоты
            for (int i = 2; i <= Math.sqrt(number); i++) {
                if (number % i == 0) {
                    isPrime = false; // Не простое
                    break;
                }
            }
            if (isPrime) {
                System.out.print(number + " "); // Вывод простого числа
            }
        }
        System.out.println();
    }

    // Задача 18: Подсчет гласных и согласных в строке
    static void countVowelsAndConsonants() {
        System.out.print("Введите строку: ");
        String str = scanner.next();
        int vowels = 0, consonants = 0; // Счетчики гласных и согласных
        for (char ch : str.toCharArray()) {
            if (Character.isLetter(ch)) {
                if ("AEIOUaeiou".indexOf(ch) != -1) {
                    vowels++; // Если гласная
                } else {
                    consonants++; // Если согласная
                }
            }
        }
        System.out.println("Количество гласных: " + vowels);
        System.out.println("Количество согласных: " + consonants);
    }

    // Задача 19: Перестановка слов в строке
    static void reverseWordsInString() {
        System.out.print("Введите строку: ");
        scanner.nextLine(); // Очистка буфера
        String str = scanner.nextLine();
        String[] words = str.split(" "); // Разделение на слова
        StringBuilder reversed = new StringBuilder();
        for (int i = words.length - 1; i >= 0; i--) {
            reversed.append(words[i]).append(" "); // Сборка в обратном порядке
        }
        System.out.println("Слова в обратном порядке: " + reversed.toString().trim());
    }

    // Задача 20: Число Армстронга
    static void armstrongCheck() {
        System.out.print("Введите целое число: ");
        int number = scanner.nextInt();
        int sum = 0, original = number;
        int digits = String.valueOf(number).length(); // Количество цифр
        while (number != 0) {
            int digit = number % 10; // Извлечение последней цифры
            sum += Math.pow(digit, digits); // Сумма в степени количества цифр
            number /= 10; // Удаление последней цифры
        }
        System.out.println(sum == original ? original + " является числом Армстронга." : original + " не является числом Армстронга.");
    }
}