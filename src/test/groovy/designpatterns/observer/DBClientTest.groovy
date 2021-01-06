package designpatterns.observer

import spock.lang.Specification

class DBClientTest extends Specification {
    DBClient dbObservator
    def setup(){
        dbObservator = new DBClient()
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
        def dBCommunication = new DBCommunication()
        when:'created'
        def dbObservator = DBClient.buildDBClient(dBCommunication)
        then:'it adds itself to dbCommunication'
        dBCommunication.observatorsList.contains(dbObservator)
    }



}
