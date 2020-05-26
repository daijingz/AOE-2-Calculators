import java.util.Arrays;
class Army {
    private String Army_Name;
    private String Country;
    private Soldier[] Member_List;
    private String Leader;

    Army (String Army_Name, String Country, String Leader){
        this.Army_Name = Army_Name;
        this.Member_List = new Soldier[50];
        Arrays.fill(this.Member_List, new Soldier("", 0,0,0, 0, 0, 0));
        this.Country = Country;
        this.Leader = Leader;
    }

    String Get_Army_Name(){
        return this.Army_Name;
    }

    Soldier[] Get_Member_List(){
        return this.Member_List;
    }

    int Get_Member_List_Size(){
        return this.Member_List.length;
    }

    String Get_Country() { return this.Country; }

    String Get_Leader() {
        if (this.Leader.equals("")){
            throw new IllegalArgumentException("Failure: Group Named: " + this.Get_Army_Name() + "does not have leader");
        } else {
            return this.Leader;
        }
    }

    void Change_Army_Name(String New_Name){
        this.Army_Name = New_Name;
    }

    void Add_Member(Soldier Member){
        int count = 0;
        for (int i = 0; i < this.Get_Member_List().length; i++) {
            if (!this.Get_Member_List()[i].Get_Name().equals("")) {
                count += 1;
            }
        }
        if (count == this.Member_List.length){
            throw new IndexOutOfBoundsException("Failure: This group has already full");
        } else if (Includes(this, Member)){
            throw new IllegalArgumentException("Failure: This member already exists");
        } else {
            this.Member_List[count] = Member;
        }
    }

    void Delete_Member(Soldier Member){
        int count = 0;
        if (!Includes(this, Member)){
            throw new IllegalArgumentException("Failure: Member Named " + Member + "does not exist");
        } else {
            Soldier[] New_Array = new Soldier[this.Get_Member_List().length];
            Arrays.fill(New_Array, new Soldier("", 0,0,0, 0, 0, 0));
            for (int i = 0; i < this.Get_Member_List().length; i++){
                if (!this.Get_Member_List()[i].equals(Member) && !this.Get_Member_List()[i].Get_Name().equals("")){
                    New_Array[count] = this.Get_Member_List()[i];
                    count++;
                }
            }
            this.Member_List = New_Array;
        }
    }

    void Extend_Army(int extend_amount){
        if (this.Get_Member_List().length + extend_amount > 200){
            throw new IllegalArgumentException("Failure: Exceeded maximum capacity restriction: 200!!!");
        }
        Soldier[] New_Army_List = new Soldier[this.Get_Member_List().length + extend_amount];
        for (int i = 0; i < this.Get_Member_List().length + extend_amount; i++){
            if(i < this.Get_Member_List().length){
                New_Army_List[i] = this.Get_Member_List()[i];
            } else {
                New_Army_List[i] = null;
            }
        }
        this.Member_List = New_Army_List;
    }

    private boolean Includes(Army Group, Soldier Input){
        for(int i = 0; i < Group.Get_Member_List_Size(); i++){
            if(Group.Get_Member_List()[i].equals(Input) && Group.Get_Member_List()[i] != null){
                return true;
            }
        }
        return false;
    }
}
