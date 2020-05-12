// Author: Jingze Dai
// Email Address: david1147062956@163.com
// Date: 12/05/2020
public class Soldier {
    private String Name;
    private int Hit_Point;
    private int Attack;
    private int range;
    private int armour;
    private int shield;


    Soldier(String name, int hit_point, int attack, int range, int armour, int shield){
        this.Name = name;
        this.Hit_Point = hit_point;
        this.Attack = attack;
        this.range = range;
        this.armour = armour;
        this.shield = shield;
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

    void change_Name(String Name){
        this.Name = Name;
    }
}
