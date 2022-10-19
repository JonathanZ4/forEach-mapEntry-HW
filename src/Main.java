import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> $chosenNums = new ArrayList<Integer>();
        System.out.println("Give me the first number you think of");
        int $pickings = input.nextInt();
        $chosenNums.add($pickings);
        System.out.println("Give me the second number that comes to mind");
        $pickings = input.nextInt();
        $chosenNums.add($pickings);
        System.out.println("Give me the the month you were born");
        $pickings = input.nextInt();
        $chosenNums.add($pickings);
        System.out.println("Give me the year you graduated");
        $pickings = input.nextInt();
        System.out.println("How many letters in your name?");
        $pickings = input.nextInt();

        int sum = 0;
        int prod = 1;
        int largest = 0;
        int smallest = 0;
        for (int num:$chosenNums){
            sum += num;
            prod *= num;
            if (num > largest){
                largest = num;
            }
            if (num < smallest) {
                smallest = num;
            }
        }
        System.out.printf("Sum = %d\n",sum);
        System.out.printf("Prod = %d\n",prod);
        System.out.printf("Largest = %d\n",largest);
        System.out.printf("Smallest = %d\n",smallest);

        HashMap<String, String> cars = new HashMap<>();

        cars.put("Challenger", "Dodge");
        cars.put("Accord", "Honda");
        cars.put("G-Wagon", "Benz");
        cars.put("Sedan", "Maserati");
        cars.put("Urus", "Lambo");
        cars.put("V12", "Rolls Royce Ghost");

        System.out.println("Eye it – try it – buy it- name a model!");
        String $eyeCandy = input.next();

        if (cars.containsKey($eyeCandy)) {
            System.out.println("Let's go places!");
        } else {
            System.out.println("You wouldn't look right in that anyway...New Thinking. New Possibilities.");
        }


    }
}