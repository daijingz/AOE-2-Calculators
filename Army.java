import java.util.Arrays;
public class Army {
    private String Army_Name;
    private String Country;
    private String[] Member_List;

    Army (String Army_Name, String Country){
        this.Army_Name = Army_Name;
        this.Member_List = new String[100];
        Arrays.fill(this.Get_Member_List(), "");
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

    void Add_Member(String Member){
        int count = 0;
        for(int i = 0; i <this.Member_List.length; i++){
            if (!this.Member_List[i].equals("")){
                count += 1;
            }
        }
        if (count == this.Member_List.length){
            throw new IndexOutOfBoundsException("Failure: This group has already full");
        } else if (Includes(this,Member)){
            throw new IllegalArgumentException("Failure: This member already exists");
        } else {
            this.Member_List[count] = Member;
        }
    }

    void Delete_Member(String Member){
        int count = 0;
        if (!Includes(this, Member)){
            throw new IllegalArgumentException("Failure: Member Named " + Member + "does not exist");
        } else {
            String[] New_Array = new String[this.Get_Member_List().length];
            Arrays.fill(New_Array, "");
            for (int i = 0; i < this.Get_Member_List().length; i++){
                if (!this.Get_Member_List()[i].equals(Member)){
                    New_Array[count] = this.Get_Member_List()[i];
                    count++;
                }
            }
            this.Member_List = New_Array;
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
