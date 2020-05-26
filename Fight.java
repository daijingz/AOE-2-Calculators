class Fight {
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

    Result Mixed_duel(Soldier Yourself, Soldier Target){
        double defeat_You, defeat_Enemy;
        boolean Yourself_is_Ranger= Check_Soldier_Type(Yourself) == Soldier_Type.Ranger;
        if (Yourself_is_Ranger){
            defeat_You = Attack_Times(Yourself.Get_Hit(),Target.Get_Attack() - Yourself.Get_Armour());
            defeat_Enemy = Attack_Times(Target.Get_Hit(),Yourself.Get_Attack() - Yourself.Get_Shield());
            defeat_Enemy = defeat_Enemy - ((int)(Yourself.Get_Range()/3) + 1);
        } else {
            defeat_You = Attack_Times(Yourself.Get_Hit(),Target.Get_Attack() - Yourself.Get_Shield());
            defeat_Enemy = Attack_Times(Target.Get_Hit(),Yourself.Get_Attack() - Yourself.Get_Armour());
            defeat_You = defeat_You - ((int)(Target.Get_Range()/3) + 1);
        }
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

    Result Laugh(Soldier Yourself, Soldier Target){
        int Score_You = 0;
        int Score_Target = 0;
        if (Yourself.Get_Name().replace(" ", "").length() < Target.Get_Name().
                replace(" ", "").length()){
            Score_You += 1;
        } else if (Yourself.Get_Name().replace(" ", "").length() > Target.Get_Name().
                replace(" ", "").length()) {
            Score_Target += 1;
        }

        if (Uppercase_Times(Yourself) > Uppercase_Times(Target)){
            Score_You += 1;
        } else if (Uppercase_Times(Yourself) < Uppercase_Times(Target)) {
            Score_Target += 1;
        }

        if (Score_You > Score_Target){
            return Result.Win;
        } else if (Score_You == Score_Target){
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

    private int Uppercase_Times(Soldier Input){
        char[] charArray = Input.Get_Name().toCharArray();
        int count = 0;
        for (char c : charArray) {
            if (Character.isUpperCase(c)) {
                count++;
            }
        }
        return count;
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
