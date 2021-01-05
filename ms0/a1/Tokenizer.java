package ms0.a1;

public class Tokenizer {

    private String input;
  //  private String[] tokens;
    private int size=0;

    public Tokenizer(String input){
        this.input=input;

    }

        static String[] tokenize(String input){


        input = input.trim();
        String [] str = input.split(" \\s*");

        return str;
    }

    public String next() {
        String[] tokens = tokenize(input);
        if (size == tokens.length) {
            return null;
        } else {
            return tokens[size++];

        }
    }

    public boolean done (){
        String[] tokens = tokenize(this.input);
        if(size < tokens.length){
            return false;
        }
        return true;
    }


}



