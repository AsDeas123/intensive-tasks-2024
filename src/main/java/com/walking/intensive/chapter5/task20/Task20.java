package com.walking.intensive.chapter5.task20;

/**
 * Создайте метод, возвращающий определитель матрицы (R) ранга N и дополнительный метод валидации,
 * который будет определять, что матрица является квадратной и у нее может быть рассчитан определитель.
 *
 * <p>Описание основного метода:
 *
 * <ul>
 * <li>Метод может реализовывать рекурсивный алгоритм подсчета определителя (A или <i>det A</i>)
 *      разложением по элементам первой строки. Можно ознакомиться
 *      <a href="https://portal.tpu.ru/SHARED/k/KONVAL/Sites/Russian_sites/2/06_e1.htm">здесь</a>.
 * <li>Метод должен проверять, является ли матрица квадратной.
 * <li>Метод должен принимать в качестве аргумента двумерный массив.
 * <li>В случае некорректных входных данных метод должен возвращать null.
 * </ul>
 *
 * <p>P.S. Алгоритмы для расчета могут быть как рекурсивными, так и нет.
 *
 * <p>P.P.S. Решение не должно использовать встроенные методы сортировки, коллекции,
 * Stream API и иной материал, выходящий за рамки пройденного курса.
 *
 * <p><a href="https://github.com/KFalcon2022/intensive-tasks-2024/blob/master/README.md">Требования к оформлению</a>
 */
public class Task20 {
    public static void main(String[] args) {
//        Для собственных проверок можете делать любые изменения в этом методе
    }

    /**
     * Входное значение - матрица, представленная в виде двумерного массива.
     *
     * <p>Пояснение о типе Integer: это ссылочный тип - класс-обертка над int.
     * В основном курсе вы сможете ознакомиться с такими типами подробнее.
     * Вы можете работать со значением Integer как с обычной переменной типа int,
     * но также у нее есть и другие возможности. В данной задаче нам этот тип нужен только
     * для возможности вернуть в случае ошибки не числовое значение - null.
     *
     * <p>Позже вы познакомитесь с концепцией исключений, что упростит обработку ошибок.
     * До тех пор приходится находить обходные пути для обозначения ситуаций, когда что-то пошло не по плану.
     */
    static Integer getDeterminant(int[][] matrix) {
        // Ваш код
        return null;
    }

    /**
     * Входное значение - валидируемая матрица, представленная в виде двумерного массива.
     *
     * <p>Метод должен возвращать true, если у матрицы может быть рассчитан определитель. В противном случае - false.
     *
     * <p>Логика валидации должна быть определена в этом методе, чтобы не усложнять логику getDeterminant(). При этом
     * getDeterminant() должен использовать isValid().
     */
    static boolean isValid(int[][] matrix) {
        return false;
    }
}
