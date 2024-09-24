import com.proferoman.*
import com.proferoman.solutions.getAdults
import com.proferoman.solutions.sumOfAges
import com.proferoman.solutions.sumOfAgesVersion2
import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

class MainKtTest {

    @Test
    fun namesLen() {
        assertEquals(
            namesLen(emptyList()),
            emptyList<String>()
        )

        assertEquals(
            namesLen(listOf("a", "aa", "")),
            listOf(1, 2, 0)
        )
    }

    @Test
    fun reverseNames() {
        assertEquals(
            reverseNames(emptyList()),
            emptyList<String>()
        )

        assertEquals(
            reverseNames(listOf("ab", "otto", "Brak", "")),
            listOf("ba", "otto", "karB", "")
        )
    }

    @Test
    fun onlyFiveCharWords() {
        assertEquals(
            onlyFiveCharWords(emptyList()),
            emptyList<String>()
        )

        assertEquals(
            onlyFiveCharWords(listOf("aaa", "bbbb", "ccccc", "dddddd", "eeeeeee", "")),
            listOf("dddddd", "eeeeeee")
        )
    }

    @Test
    fun onlySentencesWithA() {
        assertEquals(
            onlySentencesWithA(emptyList()),
            emptyList<String>()
        )

        assertEquals(
            onlySentencesWithA(listOf("sin", "no", "aeiou", "eaiou", "eioua", "bA")),
            listOf("aeiou", "eaiou", "eioua", "bA")
        )
    }

    @Test
    fun getAdults() {
        val persons = listOf(
            Person("Alice", 17),
            Person("Bob", 18),
            Person("Mary", 19),
            Person("Jon", 10)
        )

        assertEquals(
            getAdults(emptyList()),
            emptyList<Person>()
        )

        assertEquals(
            getAdults(persons),
            listOf(
                Person("Bob", 18),
                Person("Mary", 19)
            )
        )
    }

    @Test
    fun sumOfAges() {
        val persons = listOf(
            Person("Alice", 17),
            Person("Bob", 18),
            Person("Mary", 19),
            Person("Jon", 10)
        )

        assertEquals(
            sumOfAges(emptyList()),
            0
        )

        assertEquals(
            sumOfAges(persons),
            17 + 18 + 19 + 10
        )
    }

    @Test
    fun sumOfAgesVersion2() {
        val persons = listOf(
            Person("Alice", 17),
            Person("Bob", 18),
            Person("Mary", 19),
            Person("Jon", 10)
        )

        assertEquals(
            sumOfAgesVersion2(emptyList()),
            0
        )

        assertEquals(
            sumOfAgesVersion2(persons),
            17 + 18 + 19 + 10
        )
    }
}