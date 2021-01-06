package designpatterns.singleton

import spock.lang.Specification

class SingletonExampleTest extends Specification {
    def 'Test Singleton'() {
        given: 'Singleton is constructed'
            SingletonExample singletonExample = SingletonExample.getInstance()
        expect: 'Singleton To be not null'
            singletonExample !=null
        when: 'new Singleton is instantiated '
            SingletonExample singletonExample1 = SingletonExample.getInstance()
        then: 'it is still same'
            singletonExample1 == singletonExample
        and: 'has same id'
            singletonExample.getId() == singletonExample1.getId()
            println singletonExample.getId()
    }
}

