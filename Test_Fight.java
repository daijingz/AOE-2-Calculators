import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
public class Test_Fight extends Fight{
    private Soldier S1, S2, S3, S4, S5, S6, S7, S8, S9, S10;

    @Before
    public void Set_up(){
        S1 = new Soldier("Eagle Warrior", 55, 7, 0, 0, 3,
                1.15);
        S2 = new Soldier("Crossbowman", 35, 5, 5, 0, 0,
                0.96);
        S3 = new Soldier("Hussar", 75, 7, 0, 0, 2,
                1.5);
        S4 = new Soldier("Condottiero", 80, 9, 0, 1, 0,
                1.2);
        S5 = new Soldier("Hand Cannoneer", 35, 17, 7, 1, 0,
                0.96);
        S6 = new Soldier("Camel Rider", 100, 6, 0, 0, 0,
                1.45);
        S7 = new Soldier("Halberdier", 60, 6, 0, 0, 0,
                1.00);
        S8 = new Soldier("Mangudai", 60, 6, 4, 0, 0,
                1.45);
        S9 = new Soldier("Berserk", 61, 9, 0, 0, 1, 1.05);
        S10 = new Soldier("War Elephant", 450, 15, 0, 1, 2,
                0.6);
    }

    @Test
    public void Test_Melee_Duel(){
        assertEquals(Result.Win, Melee_duel(S3,S1));
        assertEquals(Result.Win, Melee_duel(S4,S6));
        assertEquals(Result.Fail, Melee_duel(S7,S9));
        assertEquals(Result.Fail, Melee_duel(S7,S10));
        assertEquals(Result.Not_Win_Not_Fail, Melee_duel(S7,S7));
    }

    @Test
    public void Test_Mixed_Duel(){
        assertEquals(Result.Win, Mixed_duel(S5,S4));
        assertEquals(Result.Win, Mixed_duel(S10,S8));
        assertEquals(Result.Win, Mixed_duel(S8,S7));
        assertEquals(Result.Fail, Mixed_duel(S8,S4));
        assertEquals(Result.Fail, Mixed_duel(S2,S1));
    }

    @Test
    public void Test_Pierce_Duel(){
        assertEquals(Result.Fail, Pierce_duel(S2, S5));
        assertEquals(Result.Win, Pierce_duel(S5, S8));
        assertEquals(Result.Not_Win_Not_Fail, Pierce_duel(S5,S5));
        assertEquals(Result.Fail, Pierce_duel(S8, S5));
        assertEquals(Result.Win, Pierce_duel(S8, S2));
    }

    @Test
    public void Test_Laugh(){
        assertEquals(Result.Not_Win_Not_Fail, Laugh(S1,S2));
        assertEquals(Result.Win, Laugh(S3,S4));
        assertEquals(Result.Fail, Laugh(S5,S6));
        assertEquals(Result.Fail, Laugh(S7,S8));
        assertEquals(Result.Not_Win_Not_Fail, Laugh(S9,S10));
    }

    @Test
    public void Test_Check_Soldier_Types(){
        assertEquals(Soldier_Type.Warrior, Check_Soldier_Type(S1));
        assertEquals(Soldier_Type.Ranger, Check_Soldier_Type(S2));
        assertEquals(Soldier_Type.Knight, Check_Soldier_Type(S3));
        assertEquals(Soldier_Type.Ranger, Check_Soldier_Type(S5));
        assertEquals(Soldier_Type.Knight, Check_Soldier_Type(S6));
    }
}
