// Author: Jingze Dai
// Email Address: david1147062956@163.com
// Date: 11/05/2020
public class Soldier {
    private String Name;
    private int Hit_Point;
    private int Attack;
    private int range;

    Soldier(String name, int hit_point, int attack, int range){
        this.Name = name;
        this.Hit_Point = hit_point;
        this.Attack = attack;
        this.range = range;
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

    void change_Name(String Name){
        this.Name = Name;
    }
}
