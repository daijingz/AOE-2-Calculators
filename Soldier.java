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
        } else if (Name.contains("&") || Name.contains("*")){
            throw new IllegalArgumentException();
        }
        this.Name = Name;
    }

    void change_Hit(int Hit){
        if (Hit == 0){
            throw new IllegalArgumentException("Error: No changes can be made!!!");
        } else if (this.Hit_Point + Hit < 0){
            throw new IllegalArgumentException("Error: This amount is unavailable on changing");
        }
        this.Hit_Point = this.Hit_Point + Hit;
    }

    void change_Attack(int Attack){
        if (Attack == 0){
            throw new IllegalArgumentException("Error: No changes can be made!!!");
        } else if (this.Attack + Attack < 0) {
            throw new IllegalArgumentException("Error: This amount is unavailable on changing");
        }
        this.Attack = this.Attack + Attack;
    }

    void change_Range(int range){
        if (range == 0){
            throw new IllegalArgumentException("Error: No changes can be made!!!");
        } else if (this.range + range < 0){
            throw new IllegalArgumentException("Error: This amount is unavailable on changing");
        }
        this.range = this.range + range;
    }

    void change_Armour(int Armour){
        if (Armour == 0){
            throw new IllegalArgumentException("Error: No changes can be made!!!");
        } else if (this.armour + Armour < 0){
            throw new IllegalArgumentException("Error: This amount is unavailable on changing");
        }
        this.armour = this.armour + Armour;
    }

    void change_Shield(int shield){
        if (shield == 0){
            throw new IllegalArgumentException("Error: No changes can be made!!!");
        } else if (this.shield + shield < 0){
            throw new IllegalArgumentException("Error: This amount is unavailable on changing");
        }
        this.shield = this.shield + shield;
    }

    void change_Speed(double Speed){
        this.speed = this.speed + Speed;
    }
}
