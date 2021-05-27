import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class Test_Army {
    private Army A1, A2, A3, A4, A5, A6;
    private Soldier S1, S2, S3, S4, S5, S6;
    //Reminder: All Objects on test cases are built with random data, which may be different with real game
    @Before
    public void Set_Up(){
        A1 = new Army("Toronto Rapter", "Britons", "Tom Steven");
        A2 = new Army("ShangHai Bayi", "Chinese", "Nicola Nikki");
        A3 = new Army("Blue JJJ", "Inca", "Adolf Churchill");
        A4 = new Army("Monster Building", "Teutons", "Franklin Clington");
        A5 = new Army("Celts group", "Celts", "Mike Desantos");
        A6 = new Army("Lightning Vehicle","Goths", "Trival Fillips");

        S1 = new Soldier("Longbowman", 35, 7, 12, 0 , 0, 0.96);
        S2 = new Soldier("Battle Elephant", 400, 15, 0, 2,2, 0.70);
        S3 = new Soldier("Champion", 70, 14, 0, 2, 1, 1.05);
        S4 = new Soldier("Elite Genitour", 90, 9, 5, 0,2, 1.00);
        S5 = new Soldier("Slinger", 40, 6, 5, 0, 2, 0.96);
        S6 = new Soldier("Cavalry Archer", 100, 7, 0, 0, 0, 1.35);
    }

    @Test
    public void Test_Get_Army_Name(){
        assertEquals("Toronto Rapter", A1.Get_Army_Name());
        assertEquals("Blue JJJ", A3.Get_Army_Name());
        assertEquals("Celts group", A5.Get_Army_Name());
    }

    @Test
    public void Test_Get_Member_List(){
        assertEquals("",A2.Get_Member_List()[0].Get_Name());
        assertEquals("",A4.Get_Member_List()[0].Get_Name());
        assertEquals("",A6.Get_Member_List()[0].Get_Name());
    }

    @Test
    public void Test_Get_Member_List_Size(){
        assertEquals(50,A1.Get_Member_List_Size());
        assertEquals(50,A2.Get_Member_List_Size());
        assertEquals(50,A3.Get_Member_List_Size());
    }

    @Test
    public void Test_Get_Country(){
        assertEquals("Teutons",A4.Get_Country());
        assertEquals("Celts",A5.Get_Country());
        assertEquals("Goths",A6.Get_Country());
    }

    @Test
    public void Test_Get_Leader(){
        assertEquals("Tom Steven", A1.Get_Leader());
        assertEquals("Adolf Churchill", A3.Get_Leader());
        assertEquals("Mike Desantos", A5.Get_Leader());
    }

    @Test
    public void Test_Change_Army_Name(){
        A6.Change_Army_Name("Baby BOOM");
        assertEquals("Baby BOOM", A6.Get_Army_Name());
        A1.Change_Army_Name("Taylor Swift Fans Club");
        assertEquals("Taylor Swift Fans Club", A1.Get_Army_Name());
        A4.Change_Army_Name("StrawBerry Farm");
        assertEquals("StrawBerry Farm", A4.Get_Army_Name());
    }

    @Test
    public void Test_Add_Member(){
        A3.Add_Member(new Soldier("Longbowman", 35, 7, 12, 0 , 0, 0.96));
        A3.Add_Member(new Soldier("Battle Elephant", 400, 15, 0, 2,2, 0.70));
        A3.Add_Member(new Soldier("Champion", 70, 14, 0, 2, 1, 1.05));
        assertEquals("Longbowman",A3.Get_Member_List()[0].Get_Name());
        assertEquals("Battle Elephant",A3.Get_Member_List()[1].Get_Name());
        assertEquals("Champion",A3.Get_Member_List()[2].Get_Name());

        A5.Add_Member(new Soldier("Imperial Skirmisher", 80, 10, 0, 1, 1, 1.4));
        A5.Add_Member(new Soldier("Pikeman", 45, 6, 0, 0, 3, 1.00));
        A5.Add_Member(new Soldier("Elite Eagle Warrior", 60, 9, 0, 0, 4, 1.15));
        assertEquals("Imperial Skirmisher", A5.Get_Member_List()[0].Get_Name());
        assertEquals("Pikeman", A5.Get_Member_List()[1].Get_Name());
        assertEquals("Elite Eagle Warrior", A5.Get_Member_List()[2].Get_Name());
    }

    @Test
    public void Test_Delete_Member(){
        A2.Add_Member(S1);
        A2.Add_Member(S2);
        A2.Add_Member(S3);
        A2.Delete_Member(S2);
        assertEquals(0, A2.Get_Member_List()[0].Get_Armour());
        assertEquals(2, A2.Get_Member_List()[1].Get_Armour());

        A5.Add_Member(S4);
        A5.Add_Member(S5);
        A5.Add_Member(S6);
        A5.Delete_Member(S4);
        assertEquals(0.96, A5.Get_Member_List()[0].Get_Speed(), 0.00);
        assertEquals(1.35, A5.Get_Member_List()[1].Get_Speed(), 0.00);
    }

    @Test
    public void Test_Extend_Army(){
        A1.Add_Member(new Soldier("Longbowman", 35, 7, 12, 0 , 0, 0.96));
        A1.Add_Member(new Soldier("Battle Elephant", 400, 15, 0, 2,2, 0.70));
        A1.Add_Member(new Soldier("Champion", 70, 14, 0, 2, 1, 1.05));
        A1.Extend_Army(100);
        assertEquals("Longbowman", A1.Get_Member_List()[0].Get_Name());
        assertEquals("Battle Elephant", A1.Get_Member_List()[1].Get_Name());
        assertEquals("Champion", A1.Get_Member_List()[2].Get_Name());
        assertNull(A1.Get_Member_List()[101]);
        assertNull(A1.Get_Member_List()[149]);

        A4.Add_Member(new Soldier("Elite Genitour", 90, 9, 5, 0,2, 1.00));
        A4.Add_Member(new Soldier("Slinger", 40, 6, 5, 0, 2, 0.96));
        A4.Add_Member(new Soldier("Cavalry Archer", 100, 7, 0, 0, 0, 1.35));
        A4.Extend_Army(50);
        assertEquals("Elite Genitour", A4.Get_Member_List()[0].Get_Name());
        assertEquals("Slinger", A4.Get_Member_List()[1].Get_Name());
        assertEquals("Cavalry Archer", A4.Get_Member_List()[2].Get_Name());
        assertNull(A4.Get_Member_List()[99]);
        assertNull(A4.Get_Member_List()[75]);
    }
}
