package first.tdd

import grails.test.mixin.TestFor
import spock.lang.Specification

/**
 * See the API for {@link grails.test.mixin.web.ControllerUnitTestMixin} for usage instructions
 */
@TestFor(CalculatorController)
class CalculatorControllerSpec extends Specification {

    def setup() {
    }

    def cleanup() {
    }

    void "test empty string"(){    	
    	expect:
    		controller.add("") == 0
    }

    void "test add one number equals this same number"(){
    	expect:
    		controller.add("5") == 5
    }

    void "test add two positive numbers"(){
    	expect:
    		controller.add("$first,$second") == sum
    	where:
    		first | second || sum
    		2     |  5     || 7
    		4     |  0     || 4
    }
}
