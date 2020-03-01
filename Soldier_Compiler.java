import java.util.Scanner;

public class Soldier_Compiler extends Soldier_Library {
    protected Soldier_Compiler(String N, int b, int a) {
        super(N, b, a);
    }

    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
        String Input_Line1 = keyboard.nextLine();
        String Input_Line2 = keyboard.nextLine();
        String Name_1 = Input_Line1.split(" ")[0];
        String Name_2 = Input_Line2.split(" ")[0];
        String Blood_1 = Input_Line1.split(" ")[1];
        String Blood_2 = Input_Line2.split(" ")[1];
        String Attack_1 = Input_Line1.split(" ")[2];
        String Attack_2 = Input_Line2.split(" ")[2];

        Soldier_Library Object1 = new Soldier_Library(Name_1,Integer.parseInt(Blood_1),Integer.parseInt(Attack_1));
        Soldier_Library Object2 = new Soldier_Library(Name_2,Integer.parseInt(Blood_2),Integer.parseInt(Attack_2));

        int HitPoint_1 = Object1.blood/Object2.attack;
        if (Integer.parseInt(Blood_1) % Integer.parseInt(Attack_2) != 0) {
            HitPoint_1 = HitPoint_1 + 1;
        }
        int HitPoint_2 = Object2.blood/Object1.attack;
        if (Integer.parseInt(Blood_2) % Integer.parseInt(Attack_1) != 0) {
            HitPoint_2 = HitPoint_2 + 1;
        }

        if (HitPoint_1 > HitPoint_2) {
            System.out.println("Your soldiers win the fight with your enemy");
        } else if (HitPoint_1 == HitPoint_2){
            System.out.println("Balanced situation: your soldier is the same strong as your enemy");
        } else {
            System.out.println("Failure: you loses the fight");
        }
    }
}
