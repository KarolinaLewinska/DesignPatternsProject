public class PascalCasePattern extends Pattern{
    @Override
    public String conversion(String expression) {
        String output = "";
        String[] words = expression.split(" ");
        for(int i=0; i<words.length; i++){
            String word = words[i];
            output += word.substring(0,1).toUpperCase()+word.substring(1);
        }
        return output;
    }
}
