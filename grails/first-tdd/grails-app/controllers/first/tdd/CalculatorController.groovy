package first.tdd

class CalculatorController {

    def index() { }

    /** The method can take 0, 1 or 2 numbers, and will return their sum 
    (for an empty string it will return 0) */
    int add(String numbers) { 
    	if(numbers.isEmpty()){
    		return 0
    	}else if(numbers.length()==1){
    		return Integer.parseInt(numbers);
    	}else{
    		String[] numbersArray = numbers.split(",");
    		int sum = 0;
    		numbersArray.each { no ->
    			sum += Integer.parseInt(no);
    		}                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           
    		return sum;
    	}
    }
}                                                                                                                                                       
