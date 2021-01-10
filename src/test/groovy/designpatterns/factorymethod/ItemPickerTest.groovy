package designpatterns.factorymethod

import spock.lang.Specification

class ItemPickerTest extends Specification {
    def 'Should pick item based on type'() {
        given:
            ItemPicker itemPicker = new ItemPicker()
            EqItem item
        when: 'Should pick Food is picked'
            item = itemPicker.pickItem('Food')

        then: 'Item is food'
            item in Food

        when: 'Sword is picked'
            item = itemPicker.pickItem('Sword')

        then: 'Item is sword'
            item in Sword
    }
}
