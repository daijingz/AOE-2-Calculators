// Author: Jingze Dai
// Email Address: david1147062956@163.com
// Date: 12/05/2020
public class Army {
    private String Army_Name;
    private String Country;
    private String[] Member_List;

    Army (String Army_Name, String Country){
        this.Army_Name = Army_Name;
        this.Member_List = new String[100];
        this.Country = Country;
    }

    String Get_Army_Name(){
        return this.Army_Name;
    }

    String[] Get_Member_List(){
        return this.Member_List;
    }

    int Get_Member_List_Size(){
        return this.Member_List.length;
    }

    String Get_Country() { return this.Country; }

    void Change_Army_Name(String New_Name){
        this.Army_Name = New_Name;
    }

    void Add_Member(Army Group, String Member){
        int count = 0;
        for(int i = 0; i <Group.Member_List.length; i++){
            if (Group.Member_List[i] != null){
                count += 1;
            }
        }
        if (count == Group.Member_List.length){
            throw new IndexOutOfBoundsException("Failure: This group has already full");
        } else if (Includes(Group,Member)){
            throw new IllegalArgumentException("Failure: This member already exists");
        } else {
            Group.Member_List[count] = Member;
        }
    }

    void Delete_Member(Army Group, String Member){
        int count = 0;
        if (!Includes(Group, Member)){
            throw new IllegalArgumentException("Failure: Member Named " + Member + "does not exist");
        } else {
            String[] New_Array = new String[Group.Get_Member_List().length];
            for (int i = 0; i < Group.Get_Member_List().length; i++){
                if (!Group.Get_Member_List()[i].equals(Member)){
                    New_Array[count] = Get_Member_List()[i];
                    count++;
                }
            }
            Group.Member_List = New_Array;
        }
    }

    private boolean Includes(Army Group, String Name){
        for(int i = 0; i < Group.Get_Member_List_Size(); i++){
            if(Group.Get_Member_List()[i].equals(Name)){
                return true;
            }
        }
        return false;
    }
}
