public class Input_Output {
    Soldier Create_Soldier(String Line){
        String Name = Line.split(" ")[0];
        int Hit = Integer.parseInt(Line.split(" ")[1]);
        int Attack = Integer.parseInt(Line.split(" ")[2]);
        int Range = Integer.parseInt(Line.split(" ")[3]);
        int Armour = Integer.parseInt(Line.split(" ")[4]);
        int Shield = Integer.parseInt(Line.split(" ")[5]);
        double Speed = Double.parseDouble(Line.split(" ")[6]);
        return new Soldier(Name, Hit, Attack, Range, Armour, Shield, Speed);
    }

    int Get_Sum(String Input){
        if (!Input.contains("+")){
            throw new IllegalArgumentException("Input Error: Unrecognized Input!!!");
        }
        String New_String = Input.replace("+", " ");
        String[] argument = New_String.split(" ");
        int sum = 0;
        for (String s : argument) {
            sum += Integer.parseInt(s);
        }
        return sum;
    }
}