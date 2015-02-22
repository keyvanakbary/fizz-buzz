package fizzbuzz

import spock.lang.*

class FizzBuzzSpec extends Specification {

    @Unroll
    def 'Plays a game'() {
        given: 'A Fizz Buzz game'
        def game = new FizzBuzz()

        when: 'I play a game'
        def result = game.play(number)

        then: 'The result follows the Fizz Buzz algorithm'
        result == expected

        where:
        number | expected
        0      | 'FizzBuzz'
        3      | 'Fizz'
        4      | '4'
        5      | 'Buzz'
        9      | 'Fizz'
        10     | 'Buzz'
        15     | 'FizzBuzz'
        16     | '16'
        30     | 'FizzBuzz'
    }
}
