public class Civilization {
    private String Name;
    private int Lumber;
    private int food_Storage;
    private int Gold;
    private int Stone_Storage;

    Civilization(String Name, int Lumber, int food_Storage, int Gold, int Stone_Storage){
        this.Name = Name;
        this.Lumber = Lumber;
        this.food_Storage = food_Storage;
        this.Gold = Gold;
        this.Stone_Storage = Stone_Storage;
    }

    String Get_Name(){
        return this.Name;
    }

    int Get_Lumber(){
        return this.Lumber;
    }

    int Get_Food_Storage(){
        return this.food_Storage;
    }

    int Get_Gold(){
        return this.Gold;
    }

    int Get_Stone_Storage(){
        return this.Stone_Storage;
    }

    void Change_Lumber(int change_Amount){
        if (change_Amount == 0){
            throw new IllegalArgumentException("Failure: Cannot make any changes");
        }
        this.Lumber = this.Lumber + change_Amount;
    }

    void Change_Food(int change_Amount){
        if (change_Amount == 0){
            throw new IllegalArgumentException("Failure: Cannot make any changes");
        }
        this.food_Storage = this.food_Storage + change_Amount;
    }

    void Change_Gold(int change_Amount){
        if (change_Amount == 0){
            throw new IllegalArgumentException("Failure: Cannot make any changes");
        }
        this.Gold = this.Gold + change_Amount;
    }

    void Change_Stone(int change_Amount){
        if (change_Amount == 0){
            throw new IllegalArgumentException("Failure: Cannot make any changes");
        }
        this.Stone_Storage = this.Stone_Storage + change_Amount;
    }
}
