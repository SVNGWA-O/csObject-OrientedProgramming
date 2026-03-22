package lecture02.answers;
public class ClassicInterview {

    public String fizzbuzz(int num){
        if((num % 3) == 0 && (num % 5) == 0){
            return "fizzbuzz";
        }
        else if((num % 3) == 0){
            return "fizz";
        }
        else if((num % 5) == 0){
            return "buzz";
        }
        else{
            return String.format("%d", num);
        }
    }
}
