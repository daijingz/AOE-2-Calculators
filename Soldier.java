public class Soldier {
    private String Name;
    private int Hit_Point;
    private int Attack;
    private int range;
    private int armour;
    private int shield;
    private double speed;

    Soldier(String name, int hit_point, int attack, int range, int armour, int shield, double speed){
        this.Name = name;
        this.Hit_Point = hit_point;
        this.Attack = attack;
        this.range = range;
        this.armour = armour;
        this.shield = shield;
        this.speed = speed;
    }

    String Get_Name(){
        return this.Name;
    }

    int Get_Hit(){
        return this.Hit_Point;
    }

    int Get_Attack(){
        return this.Attack;
    }

    int Get_Range(){
        return this.range;
    }

    int Get_Armour(){ return this.armour; }

    int Get_Shield(){ return this.shield; }

    double Get_Speed(){ return this.speed; }

    void change_Name(String Name){
        if (Name.length() == 0){
            throw new IllegalArgumentException("Error: New selected name must be non-empty!!!");
        }
        this.Name = Name;
    }

    void Print_Identity(Soldier Input){
        System.out.println("******************************");
        System.out.println("Soldier Information: ");
        System.out.println("Soldier Name: " + Input.Get_Name());
        System.out.println("Hit Point: " + Input.Get_Hit());
        System.out.println("Attack: " + Input.Get_Attack());
        System.out.println("Range: " + Input.Get_Range());
        System.out.println("Armour: " + Input.Get_Armour());
        System.out.println("Shield: " + Input.Get_Shield());
        System.out.println("Speed: " + Input.Get_Speed());
        System.out.println("******************************");
    }
}
