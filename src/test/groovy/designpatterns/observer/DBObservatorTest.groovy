package designpatterns.observer

import spock.lang.Specification

class DBObservatorTest extends Specification {
    DBObservator dbObservator
    def setup(){
        dbObservator = new DBObservator()
    }

    def 'When update method is called the username updates'(){
        when: 'Update method is called'
        dbObservator.update('test_1')
        then: 'Username is updated'
        dbObservator.username == 'test_1'

        where: username << ['test_user_1', 'test_user_2']
    }

    def 'Observator should add itself to DBCommunication observable'(){
        given:
        def dBCommunication = new DBCommunicationObservable()
        when:'created'
        def dbObservator = DBObservator.buildDBObserver(dBCommunication)
        then:'it adds itself to dbCommunication'
        dBCommunication.observatorsList.contains(dbObservator)
    }



}
