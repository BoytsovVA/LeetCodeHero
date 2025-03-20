package edu.learn.TwoPointers

/**
 * Класс Solution реализует алгоритм для проверки, является ли строка s подпоследовательностью строки t.
 * Подпоследовательность получается путём удаления некоторых символов из строки без изменения порядка оставшихся символов.
 * */

/**
 * Временная сложность: O(n+m)
 * Где n — длина строки s, а m — длина строки t. Каждый указатель проходит по своей строке не более одного раза.
 *
 * Пространственная сложность: O(1)
 * Используется только постоянное дополнительное пространство для хранения указателей.
 */
class Solution {

    /**
     * Проверяет, является ли строка s подпоследовательностью строки t.
     *
     * Алгоритм:
     * 1. Инициализируются два указателя: sPointer для строки s и tPointer для строки t.
     * 2. Пока оба указателя находятся в пределах своих строк, происходит сравнение текущих символов:
     *    - Если символ s[sPointer] совпадает с символом t[tPointer], увеличиваем sPointer, переходя к следующему символу в s.
     *    - Независимо от совпадения, tPointer увеличивается для перехода к следующему символу в t.
     * 3. После завершения цикла, если sPointer достиг длины строки s, значит, все символы s были найдены в t в нужном порядке.
     *
     * @param s Строка, которую нужно проверить на подпоследовательность.
     * @param t Строка, в которой ищется подпоследовательность.
     * @return true, если строка s является подпоследовательностью строки t, иначе false.
     */
    fun isSubsequence(s: String, t: String): Boolean {
        // Инициализация указателей для строк s и t
        var sPointer = 0
        var tPointer = 0

        // Проходим по строке t, пока не достигнем конца одной из строк
        while (sPointer < s.length && tPointer < t.length) {
            // Если текущий символ из s совпадает с текущим символом из t
            if (s[sPointer] == t[tPointer]) {
                // Сдвигаем указатель для строки s, переходя к следующему символу
                sPointer++
            }
            // Всегда сдвигаем указатель для строки t, чтобы проходить по всем её символам
            tPointer++
        }
        // Если sPointer достиг длины строки s, значит все символы s найдены в t в правильном порядке
        return sPointer == s.length
    }
}


fun main() {
    val reader = System.`in`.bufferedReader()
    val s = reader.readLine()
    val t = reader.readLine()
    val solution = Solution()
    println(solution.isSubsequence(s, t))
}