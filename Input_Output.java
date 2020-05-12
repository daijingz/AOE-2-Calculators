// Author: Jingze Dai
// Email Address: david1147062956@163.com
// Date: 12/05/2020
public class Input_Output {
    Soldier Create_Soldier(String Line){
        String Name = Line.split(" ")[0];
        int Hit = Integer.parseInt(Line.split(" ")[1]);
        int Attack = Integer.parseInt(Line.split(" ")[2]);
        int Range = Integer.parseInt(Line.split(" ")[3]);
        int Armour = Integer.parseInt(Line.split(" ")[4]);
        int Shield = Integer.parseInt(Line.split(" ")[5]);
        return new Soldier(Name, Hit, Attack, Range, Armour, Shield);
    }

    int Get_Sum(String Input){
        String New_String = Input.replace("+", " ");
        if (!Input.contains("+")){
            throw new IllegalArgumentException("Input Error: Unrecognized ");
        } else {
            String[] argument = Input.split(" ");
            int sum = 0;
            for(int i = 0; i < argument.length; i++){
                sum += Integer.parseInt(argument[i]);
            }
            return sum;
        }
    }
}