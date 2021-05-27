import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class Test_Soldier {
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
    public void Test_Get_Name(){
        assertEquals("Eagle Warrior", S1.Get_Name());
        assertEquals("Crossbowman", S2.Get_Name());
        assertEquals("Hussar", S3.Get_Name());
        assertEquals("Condottiero", S4.Get_Name());
        assertEquals("Hand Cannoneer", S5.Get_Name());
    }

    @Test
    public void Test_Get_Hit(){
        assertEquals(100, S6.Get_Hit());
        assertEquals(60, S7.Get_Hit());
        assertEquals(60, S8.Get_Hit());
        assertEquals(61, S9.Get_Hit());
        assertEquals(450, S10.Get_Hit());
    }

    @Test
    public void Test_Get_Attack(){
        assertEquals(7, S1.Get_Attack());
        assertEquals(7, S3.Get_Attack());
        assertEquals(17, S5.Get_Attack());
        assertEquals(6, S7.Get_Attack());
        assertEquals(9, S9.Get_Attack());
    }

    @Test
    public void Test_Get_Range(){
        assertEquals(5, S2.Get_Range());
        assertEquals(0, S4.Get_Range());
        assertEquals(0, S6.Get_Range());
        assertEquals(4, S8.Get_Range());
        assertEquals(0, S10.Get_Range());
    }

    @Test
    public void Test_Get_Armour(){
        assertEquals(0, S1.Get_Armour());
        assertEquals(1, S4.Get_Armour());
        assertEquals(0, S6.Get_Armour());
        assertEquals(0, S7.Get_Armour());
        assertEquals(1, S10.Get_Armour());
    }

    @Test
    public void Test_Get_Sheild(){
        assertEquals(0, S2.Get_Shield());
        assertEquals(2, S3.Get_Shield());
        assertEquals(0, S5.Get_Shield());
        assertEquals(0, S8.Get_Shield());
        assertEquals(1, S9.Get_Shield());
    }

    @Test
    public void Test_Get_Speed(){
        assertEquals(1.05, S9.Get_Speed(), 0.0);
        assertEquals(1.2, S4.Get_Speed(), 0.0);
        assertEquals(1.15, S1.Get_Speed(), 0.0);
        assertEquals(1.00, S7.Get_Speed(), 0.0);
        assertEquals(0.96, S2.Get_Speed(), 0.0);
    }

    @Test
    public void Test_Change_Name(){
        S3.change_Name("Angle Fighter");
        assertEquals("Angle Fighter", S3.Get_Name());
        S6.change_Name("Fire Bursting Boy");
        assertEquals("Fire Bursting Boy", S6.Get_Name());
        S7.change_Name("Honor Ranger");
        assertEquals("Honor Ranger", S7.Get_Name());
    }
}
