package designpatterns.observer

import spock.lang.Specification

class DBCommunicationTest extends Specification {
    DBCommunication dBCommunation;

    def setup() {
        dBCommunation = new DBCommunication()
    }

    def 'DBCommunication should exist'() {
        expect: 'it should not be null'
        dBCommunation != null
    }

    def 'DBCommunication should have list of observators that i can add'() {
        when: 'DBOserver is added'
        dBCommunation.add(new DBClient())

        then: 'dBCommunation.observatorsList is not empty'
        !dBCommunation.observatorsList.isEmpty()

        and: 'dBCommunation.observatorsList contains 1 element'
        dBCommunation.observatorsList.size() == 1
    }

    def 'DBCommunication should have list of observators that i can remove'() {
        given: 'DBCommunation.observatorsList is not empty'
        def observator = new DBClient()
        dBCommunation.observatorsList.add(observator)

        when: 'Observator is removed'
        dBCommunation.remove(observator)

        then: 'Observators list is empty'
        dBCommunation.observatorsList.isEmpty()
    }

    def 'DBCommunication.observatorsList should have one element after i add 2 and remove 1'() {
        given: 'DBCommunation.observatorsList has 2 elements'
        def observator_1 = new DBClient()
        def observator_2 = new DBClient()
        dBCommunation.add(observator_1)
        dBCommunation.add(observator_2)

        when: 'observator_1 is removed'
        dBCommunation.remove(observator_1)

        then: 'observatorsList size is 1'
        dBCommunation.observatorsList.size() == 1

        and: 'observator is observator_2'
        dBCommunation.observatorsList.get(0) == observator_2
    }

    def 'DBCommunication.observatorsList should have 3 element after i add 5 and remove 2'() {
        given: 'DBCommunation.observatorsList has 2 elements'
        def observator_1 = new DBClient()
        def observator_2 = new DBClient()
        def observator_3 = new DBClient()
        def observator_4 = new DBClient()
        def observator_5 = new DBClient()
        dBCommunation.add(observator_1)
        dBCommunation.add(observator_2)
        dBCommunation.add(observator_3)
        dBCommunation.add(observator_4)
        dBCommunation.add(observator_5)

        when: 'observator_3 is removed'
        dBCommunation.remove(observator_3)

        and: 'observator_4 is removed'
        dBCommunation.remove(observator_4)

        then: 'observatorsList size is 3'
        dBCommunation.observatorsList.size() == 3

        and: 'observators are observator_1, observator_2, observator_5'
        dBCommunation.observatorsList.containsAll(observator_1, observator_2, observator_5)

        and: 'not contain observator_3'
        !dBCommunation.observatorsList.contains(observator_3)

        and: 'not contain observator_4'
        !dBCommunation.observatorsList.contains(observator_4)
    }

    def 'DBCommunication should Notify all observers on Notify call'() {
        given:'At least one observator is added'
        def observator_1 = Mock(Client)
        dBCommunation.add(observator_1)

        when: 'Notify is called'
        dBCommunation.notifyClients()

        then: 'Observator update is called'
        1 * observator_1.update(_)
    }
}