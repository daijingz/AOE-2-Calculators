// Author: Jingze Dai
// Email Address: david1147062956@163.com
// Date: 11/05/2020
public class Input_Output {
    Soldier Create_Soldier(String Line){
        String Name = Line.split(" ")[0];
        int Hit = Integer.parseInt(Line.split(" ")[1]);
        int Attack = Integer.parseInt(Line.split(" ")[2]);
        int Range = Integer.parseInt(Line.split(" ")[3]);
        return new Soldier(Name, Hit, Attack, Range);
    }
}