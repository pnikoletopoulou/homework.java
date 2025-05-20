package homework_01.PetClinic;

import java.util.Scanner;

public class PetClinic {
    public static void main(String[] args) {

        Pet[] pets = new Pet[10];

        pets [0] = new Pet("Pluto", "dog");
        pets [1] = new Pet("Lola", "cat");
        pets [2] = new Pet("Duke", "dog");
        pets [3] = new Pet("Katherine", "duck");
        pets [4] = new Pet("Pit", "hamster");
        pets [5] = new Pet("Rex", "dog");
        pets [6] = new Pet("Elsa", "cat");
        pets [7] = new Pet("Penny", "duck");
        pets [8] = new Pet("Ratatouille", "hamster");
        pets [9] = new Pet("Loukas", "fish");

        Scanner scanner = new Scanner(System.in);

        int count = 0;

        System.out.println("Give type: ");
        String type = scanner.next();

        for (Pet pet : pets) {
            if (type.equals(pet.getType())) {
                System.out.println(pet);
                count++;
            }
        }
        System.out.println("Total animals of " + type + ": " + count);
    }
}
