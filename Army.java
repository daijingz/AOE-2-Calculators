// Author: Jingze Dai
// Email Address: david1147062956@163.com
// Date: 11/05/2020
public class Army {
    private String Army_Name;
    private String[] Member_List;

    Army (String Army_Name){
        this.Army_Name = Army_Name;
        this.Member_List = new String[]{};
    }

    String Get_Army_Name(){
        return this.Army_Name;
    }

    String[] Get_Member_List(){
        return this.Member_List;
    }

    void Change_Army_Name(String New_Name){
        this.Army_Name = New_Name;
    }
}
