public class InterpreterMain {
    public static void main(String[] args){
        String expression = "This is an example of interpreter pattern";

        CamelCasePattern camelCaseInterpreter = new CamelCasePattern();
        PascalCasePattern pascalCaseInterpreter = new PascalCasePattern();
        SnakeCasePattern snakeCaseInterpreter = new SnakeCasePattern();

        String camelCase = camelCaseInterpreter.conversion(expression);
        String PascalCase = pascalCaseInterpreter.conversion(expression);
        String snake_case = snakeCaseInterpreter.conversion(expression);

        System.out.println("Expression in camel case: " + camelCase);
        System.out.println("Expression in pascal case: " + PascalCase);
        System.out.println("Expression in snake case: " + snake_case);
    }
}
