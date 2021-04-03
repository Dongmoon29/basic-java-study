package MarioPyramid;

public class MarioPyramid {
    public static String pyramid(int height) {
        //To-do
        // takes an Integer input between 1 ~ 9
        if(height < 1 || height > 9) return "You have inputted out of bound";
        if(height == 1) return "#";
        StringBuilder sb = new StringBuilder();
        //   #
        //  ##
        // ###
        int spaces, dashes;
        for(int i = 1; i <= height; i++) {
            for(spaces = (height - (i + 1)); spaces >= 0; spaces--) {
                sb.append(" ");
            }
            for(dashes = 1; dashes <= i; dashes++) {
                sb.append("#");
            }
            if(i != height) {
                sb.append("\n");
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(MarioPyramid.pyramid(9));
    }
}
