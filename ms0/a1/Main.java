package ms0.a1;



public class Main {
    public static void main(String[] args) {

        Tokenizer tkn = new Tokenizer("           A 42   Epsilon Q      16          ");
        Tokenizer tkn1 = new Tokenizer("        The quick brown     fox  jumps over  the lazy    dog         ");
        Tokenizer tkn2 = new Tokenizer("        lala 12");




        System.out.println(tkn.next());
        System.out.println(tkn.next());
        System.out.println(tkn.next());
        System.out.println(tkn.next());
        System.out.println(tkn.done());
        System.out.println(tkn.next());
        System.out.println(tkn.done());
        System.out.println(tkn.next());

        System.out.println();
        System.out.println(tkn1.next());
        System.out.println(tkn1.next());
        System.out.println(tkn1.next());
        System.out.println(tkn1.next());
        System.out.println(tkn1.next());
        System.out.println(tkn1.next());
        System.out.println(tkn1.done());
        System.out.println(tkn1.next());
        System.out.println(tkn1.next());
        System.out.println(tkn1.next());
        System.out.println(tkn1.done());
        System.out.println(tkn1.next());

        System.out.println();
        System.out.println(tkn2.next());
        System.out.println(tkn2.next());
        System.out.println(tkn2.next());
        System.out.println(tkn2.done());
        System.out.println(tkn2.next());
    }
}
