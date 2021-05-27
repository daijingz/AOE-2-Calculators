import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class Test_Input_Output extends Input_Output {
    private String Line_1, Line_2, Line_3, Line_4, Line_5, Line_6;
    private String Str_1, Str_2, Str_3, Str_4, Str_5, Str_6;

    @Before
    public void Set_Up(){
        Line_1 = "Eagle_Warrior 60 9 0 0 4 1.15";
        Line_2 = "Pikeman 55 4 0 0 0 1.00";
        Line_3 = "Hand_Cannoneer 35 17 7 1 0 0.96";
        Line_4 = "Archer 30 4 4 0 0 0.96";
        Line_5 = "Knight 100 10 0 2 2 1.35";
        Line_6 = "Elite_Tarkan 150 11 0 1 4 1.35";
        Str_1 = "3+0";
        Str_2 = "0+2";
        Str_3 = "0+3+6+7";
        Str_4 = "10+1+4";
        Str_5 = "4+3+2+1+0";
        Str_6 = "2+2+2+2+2+2";
    }

    @Test
    public void Test_Create_Soldier(){
        Soldier S1 = Create_Soldier(Line_1);
        assertEquals("Eagle_Warrior", S1.Get_Name());
        Soldier S2 = Create_Soldier(Line_2);
        assertEquals(55, S2.Get_Hit());
        Soldier S3 = Create_Soldier(Line_3);
        assertEquals(17, S3.Get_Attack());
        Soldier S4 = Create_Soldier(Line_4);
        assertEquals(4, S4.Get_Range());
        Soldier S5 = Create_Soldier(Line_5);
        assertEquals(2, S5.Get_Armour());
        Soldier S6 = Create_Soldier(Line_6);
        assertEquals(4, S6.Get_Shield());
    }

    @Test
    public void Test_Get_Sum(){
        assertEquals(3, Get_Sum(Str_1));
        assertEquals(2, Get_Sum(Str_2));
        assertEquals(16, Get_Sum(Str_3));
        assertEquals(15, Get_Sum(Str_4));
        assertEquals(10, Get_Sum(Str_5));
        assertEquals(12, Get_Sum(Str_6));
    }
}
