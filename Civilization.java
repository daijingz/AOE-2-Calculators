public class Civilization {
    private String Name;
    private int Lumber;
    private int food_Storage;
    private int Gold;
    private int Stone_Storage;
    private Villager_Jobs[] Villager_List;
    private int relics;

    Civilization(String Name, int Lumber, int food_Storage, int Gold, int Stone_Storage){
        this.Name = Name;
        this.Lumber = Lumber;
        this.food_Storage = food_Storage;
        this.Gold = Gold;
        this.Stone_Storage = Stone_Storage;
        this.Villager_List = new Villager_Jobs[]{};
        this.relics = 0;
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

    Villager_Jobs[] Get_Villager_List(){
        return this.Villager_List;
    }

    int Get_Relics(){
        return this.relics;
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

    void Donation(int Lumber, int Food, int Gold, int Stone, int tech_Level, Civilization Target){
        if (Lumber != 0){
            this.Change_Lumber((int)((-1)*Donation_Rate(tech_Level)*Lumber));
            Target.Change_Lumber(Lumber);
        }
        if (Food != 0){
            this.Change_Food((int)((-1)*Donation_Rate(tech_Level)*Food));
            Target.Change_Food(Food);
        }
        if (Gold != 0){
            this.Change_Gold((-1)*(int)Donation_Rate(tech_Level)*Gold);
            Target.Change_Gold(Gold);
        }
        if (Stone != 0){
            this.Change_Stone((-1)*(int)Donation_Rate(tech_Level)*Stone);
            Target.Change_Stone(Stone);
        }
    }

    private double Donation_Rate(int Tech_Level){
        double return_Rate;
        switch (Tech_Level){
            case 0:
                return_Rate = 1.3;
                break;
            case 1:
                return_Rate = 1.2;
                break;
            case 2:
                return_Rate = 1.0;
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + Tech_Level);
        }
        return return_Rate;
    }
}
