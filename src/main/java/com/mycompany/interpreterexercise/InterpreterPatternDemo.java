
package com.mycompany.interpreterexercise;

public class InterpreterPatternDemo {
    
    //Regra: Robert e John são machos
    public static Expression getMaleExpression(){
        Expression robert = new TerminalExpression("Robert");
        Expression john = new TerminalExpression("John");
        return new OrExpression(robert,john);
    }
    
    //Regra: Julia é uma mulher casada
    public static Expression getMarriedWomanExpression(){
        Expression julie = new TerminalExpression("Julie");
        Expression married = new TerminalExpression("Married");
        return new AndExpression(julie,married);
    }
    
    public static void main(String[] args){
        Expression isMale = getMaleExpression();
        Expression isMarriedWoman = getMarriedWomanExpression();
        
        System.out.println("John é macho?" + isMale.interpret("John"));
        System.out.println("Julie é uma mulher casada?" + isMarriedWoman.interpret("Julie casada."));
        
    }
    
}
