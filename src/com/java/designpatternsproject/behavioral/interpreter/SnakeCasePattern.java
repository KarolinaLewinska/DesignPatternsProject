public class SnakeCasePattern extends Pattern{
    @Override
    public String conversion(String expression) {
        String output = "";
        String[] words = expression.split(" ");
        for(int i=0; i<words.length; i++){
            String word = words[i].toLowerCase();
            if(i == words.length - 1){
                output += word;
            }
            else{
                output += word+"_";
            }
        }
        return output;
    }
}
