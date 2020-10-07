public class switch {
    public static void main(String[] args) {

        int favcuisine = 4;
        String cuisine;

        // switch statement to check day
        switch (favcuisine) {
            case 1:
                cuisine = "Mexican";
                break;
            case 2:
                cuisine = "Chinese";
                break;
            case 3:
                cuisine = "Thai";
                break;

            // match the value of Cuisine
            case 4:
                cuisine = "Indian";
                break;
            case 5:
                cuisine = "Middle-Eastern";
                break;
            case 6:
                cuisine = "Japanese";
                break;
            case 7:
                cuisine = "Lebanese";
                break;
            default:
                cuisine = "Invalid Cuisine";
                break;
        }
        System.out.println("Eliana's favourite Cuisine is " + cuisine);
    }
}
