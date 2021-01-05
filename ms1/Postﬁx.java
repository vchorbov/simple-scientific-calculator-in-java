/*
 * Velichka Chorbova
 * Matrikelnummer: 7354029
 */

package ms1;

import static ms1.Mathcore.*;
import ms0.a1.Tokenizer;
import java.math.BigDecimal;
import java.util.Stack;

public class Postﬁx {

    public static String eval(String input) throws Exception {

        Stack<BigDecimal> stack = new Stack<>();
        Tokenizer token = new Tokenizer(input);
        String holder = token.next();
        int count = 0;

        if(validate(token, holder)){
            throw new Exception ("Invalid operation. Please insert a valid postfix expression.");
        }

        while (!token.done()) {

            if(count != 0) {
                holder = token.next();
            }

            if (isNumber(holder) ) {
                if (holder.equals("pi")) {
                    stack.push(pi);
                } else if (holder.equals("e")) {
                    stack.push(e);
                } else if (holder.equals("-e")) {
                    stack.push(negE);
                } else if (holder.equals("-pi")) {
                    stack.push(negPi);
               }else {
                    BigDecimal number = new BigDecimal(holder);
                    stack.push(number);
                }
            } else {
                if ("+".equals(holder)) {
                    if(stack.size()<2){
                      throw new Exception("Not enough elements provided for the given operation");
                    }else {
                        BigDecimal b = stack.pop();
                        BigDecimal a = stack.pop();
                        BigDecimal c = add(a, b);
                        stack.push(c);
                    }
                } else if ("-".equals(holder)) {
                    if(stack.size()<2){
                        throw new Exception("Not enough elements provided for the given operation");
                    }else {
                        BigDecimal b = stack.pop();
                        BigDecimal a = stack.pop();
                        BigDecimal c = sub(a, b);
                        stack.push(c);
                    }
                } else if ("/".equals(holder)) {
                    if(stack.size()<2){
                        throw new Exception("Not enough elements provided for the given operation");
                    }else {
                        BigDecimal b = stack.pop();
                        BigDecimal a = stack.pop();
                        BigDecimal c = div(a, b);
                        stack.push(c);
                    }
                } else if ("*".equals(holder)) {
                    if(stack.size()<2){
                        throw new Exception("Not enough elements provided for the given operation");
                    }else {
                        BigDecimal b = stack.pop();
                        BigDecimal a = stack.pop();
                        BigDecimal c = mul(a, b);
                        stack.push(c);
                    }
                } else if ("!".equals(holder)) {
                    if(stack.size()<1){
                        throw new Exception("Not enough elements provided for the given operation");
                    }else {
                        BigDecimal a = stack.pop();
                        BigDecimal b = fak(a);
                        stack.push(b);
                    }
                } else if ("exp".equals(holder)) {
                    if(stack.size()<1){
                        throw new Exception("Not enough elements provided for the given operation");
                    }else {
                        BigDecimal a = stack.pop();
                        BigDecimal b = exp(a);
                        stack.push(b);
                    }
                } else if ("ln".equals(holder)) {
                    if(stack.size()<1){
                        throw new Exception("Not enough elements provided for the given operation");
                    }else {
                        BigDecimal a = stack.pop();
                        BigDecimal b = ln(a);
                        stack.push(b);
                    }
                } else if ("lg".equals(holder)) {
                    if(stack.size()<1){
                        throw new Exception("Not enough elements provided for the given operation");
                    }else {
                        BigDecimal a = stack.pop();
                        BigDecimal b = lg(a);
                        stack.push(b);
                    }
                } else if ("log".equals(holder)) {
                    if(stack.size()<2){
                        throw new Exception("Not enough elements provided for the given operation");
                    }else {
                        BigDecimal a = stack.pop();
                        BigDecimal b = stack.pop();
                        BigDecimal c = log(a, b);
                        stack.push(c);
                    }
                } else if ("^".equals(holder)) {
                    if(stack.size()<2){
                        throw new Exception("Not enough elements provided for the given operation");
                    }else {
                        BigDecimal b = stack.pop();// b is the exponent //a
                        BigDecimal a = stack.pop();//a is the base//b
                        BigDecimal c = pot(a, b);
                        stack.push(c);
                    }
                } else if ("sqrt".equals(holder)) {
                    if(stack.size()<1){
                        throw new Exception("Not enough elements provided for the given operation");
                    }else {
                        BigDecimal a = stack.pop();
                        BigDecimal b = sqrt(a);
                        stack.push(b);
                    }
                }else if ("root".equals(holder)){
                    if(stack.size()<2){
                        throw new Exception("Not enough elements provided for the given operation");
                    }else {
                        BigDecimal b = stack.pop();
                        BigDecimal a = stack.pop();
                        BigDecimal c = root(a, b);
                        stack.push(c);
                    }
                } else if ("sin".equals(holder)) {
                    if(stack.size()<1){
                        throw new Exception("Not enough elements provided for the given operation");
                    }else {
                        BigDecimal a = stack.pop();
                        BigDecimal b = sin(a);
                        stack.push(b);
                    }
                } else if ("cos".equals(holder)) {
                    if(stack.size()<1){
                        throw new Exception("Not enough elements provided for the given operation");
                    }else {
                        BigDecimal a = stack.pop();
                        BigDecimal b = cos(a);
                        stack.push(b);
                    }
                } else if ("tan".equals(holder)) {
                    if(stack.size()<1){
                        throw new Exception("Not enough elements provided for the given operation");
                    }else {
                        BigDecimal a = stack.pop();
                        BigDecimal b = tan(a);
                        stack.push(b);
                    }
                } else {
                    throw new Exception("Invalid input");
                }
            }
            count++;
        }

        if (stack.empty()) {
            throw new Exception("Invalid operation");
        } else if (stack.size() > 1) {
            throw new Exception("Invalid operation");
        } else {
            BigDecimal ret = stack.pop();
            BigDecimal adjusted = ret.divide(BigDecimal.ONE, mc_out);
            return adjusted.toString();
        }
    }

    public static boolean isNumber(String holder) {
        boolean isNumber = true;
        if (holder.equals("pi") || holder.equals("e") ||
            holder.equals("-pi") || holder.equals("-e") ) {
            return isNumber;
        } else {
            try {
                BigDecimal a = new BigDecimal(holder);
            } catch (NumberFormatException e) {
                isNumber = false;
            }
            return isNumber;
        }
    }

    /*
     *  Validation of the input
     *  if empty or the expression begins with operator instead of operand,
     *  which is expected of postfix-notation expressions,
     *  return true.
     */

    public static boolean validate(Tokenizer tokenizer, String holder){
        boolean firstCondition = tokenizer.done();
        boolean secondCondition = !(isNumber(holder));

        if(firstCondition || secondCondition){
          return true;
        }
        return false;
    }
}
