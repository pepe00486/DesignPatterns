package HelloWorld


import spock.lang.Specification

class HelloWorldSpec extends Specification {
    def 'TestableMethod'() {
        given:
            HelloWorld helloWorld = new HelloWorld()
        expect:
            assert helloWorld.testableMethod() == "Hello World"
    }
}

