package designpatterns.observer

import spock.lang.Specification

class DBMockTest extends Specification {
    DBMock dbMock;
    def setup(){
        dbMock = new DBMock(Mock(Observable))
    }

    def 'DBMock should exist'() {
        expect: 'DBMock to not be null'
        dbMock != null
    }

    def 'DBMock should have empty username by default'() {
        expect: 'DBMock should return empty username'
        dbMock.getUsername() == ''
    }

    def 'DBMock should change username everytime set is called'(){
        when:"username is set to $username)"
        dbMock.setUsername(username)

        then:"getUserName will return $username"
        dbMock.getUsername() == username

        where: username << ['Joe', 'Mat']
    }
}
