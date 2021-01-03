package designpatterns.observer

import spock.lang.Specification

class IntegrationTest extends Specification {
    def 'Observators usernames are updated when DBMock username changes'() {
        setup: 'Observators exist'
        def dbCommunication = new DBCommunicationObservable()

        for (i in 0..< 10) {
            dbCommunication.add(DBObservator.buildDBObserver(dbCommunication))
        }

        def dbMock = new DBMock(dbCommunication)
        when: 'DBMock username changes'
        dbMock.setUsername(username)

        then: 'each observator has the username updated'
        dbCommunication.observatorsList.each {
            assert it.username == username
        }
        where: username << ['test_user_1', 'Mateuszek', 'Inne imie']
    }
}
