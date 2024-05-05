
public class Scanner {
    class A{

        public void main(String[] args){

            Scanner sc = new Scanner(System.in);

            int counter = 1;

            boolean pin_code_coincided = true;

            while (true){

                String correct = sc.nextLine();

                String vasya = sc.nextLine();

                counter++;

                if (correct.charAt(0) == '0') {
                    correct = correct.substring(1);
                }

                if(correct.equals(vasya)){

                    System.out.println("СORRECT");

                    break;

                }

                System.out.println("INCORRECT. Attempts left: " + (5 - counter));

                if (counter == 5) {
                    pin_code_coincided = false;
                    break;
                }

            }

            if (!pin_code_coincided){

                System.out.println("Error");

            }else{

                System.out.println("CORRECT");

            }

        }

    }
}
