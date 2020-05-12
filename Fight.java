// Author: Jingze Dai
// Email Address: david1147062956@163.com
// Date: 12/05/2020
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

    Result Ranged_duel(Soldier Yourself, Soldier Target){
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

    private int Attack_Times(int Int1, int Int2){
        double attack = (double)Int1/(double)Int2;
        if (attack != (double)(Int1/Int2)){
            return Int1/Int2 + 1;
        } else {
            return Int1/Int2;
        }
    }
}
