
public class Fight {
    Result Melee_duel(Soldier Yourself, Soldier Target){
        double defeat_You = Attack_Times(Yourself.Get_Hit(),Target.Get_Attack() - Yourself.Get_Armour());
        double defeat_Enemy = Attack_Times(Target.Get_Hit(),Yourself.Get_Attack() - Target.Get_Armour());
        if (defeat_You > defeat_Enemy){
            return Result.Win;
        } else if (defeat_You == defeat_Enemy){
            return Result.Not_Win_Not_Fail;
        } else {
            return Result.Fail;
        }
    }

    Result Pierce_duel(Soldier Yourself, Soldier Target){
        double defeat_You = Attack_Times(Yourself.Get_Hit(),Target.Get_Attack() - Yourself.Get_Shield());
        double defeat_Enemy = Attack_Times(Target.Get_Hit(),Yourself.Get_Attack() - Yourself.Get_Shield());
        int difference_Range = Yourself.Get_Range() - Target.Get_Range();

        if (difference_Range > 0){
            defeat_You += (int)(difference_Range/3) + 1;
        } else if (difference_Range < 0){
            defeat_You -= (int)(difference_Range/3) + 1;
        }

        if (defeat_You > defeat_Enemy){
            return Result.Win;
        } else if (defeat_You == defeat_Enemy){
            return Result.Not_Win_Not_Fail;
        } else {
            return Result.Fail;
        }
    }

    Soldier_Type Check_Soldier_Type(Soldier Input){
        if (Input.Get_Range() > 3){
            return Soldier_Type.Ranger;
        } else if (Input.Get_Speed() >= 1.20){
            return Soldier_Type.Knight;
        } else if (Input.Get_Range() == 3){
            return Soldier_Type.Ranged_Warrior;
        } else {
            return Soldier_Type.Warrior;
        }
    }

    private int Attack_Times(int Int1, int Int2){
        double attack = (double)Int1/(double)Int2;
        if (attack != (double)(Int1/Int2)){
            return Int1/Int2 + 1;
        } else {
            return Int1/Int2;
        }
    }
}
