import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
public class Test_Civilization{
    private Civilization Civil1, Civil2, Civil3, Civil4, Civil5, Civil6;

    @Before
    public void Set_Up(){
        Civil1 = new Civilization("Mother Russia", 1000, 800, 200, 600,
                100);
        Civil2 = new Civilization("Giant Qing", 500, 2000, 500, 200,
                200);
        Civil3 = new Civilization("Colony of Great British", 1000, 1000, 1000, 1000,
                50);
        Civil4 = new Civilization("Poland", 10000, 10000, 0, 0,
                80);
        Civil5 = new Civilization("Japan Empire", 0, 0, 2000, 2000,
                120);
        Civil6 = new Civilization("United States of America", 200, 500, 100, 200,
                100);
    }

    @Test
    public void Test_Get_Name(){
        assertEquals("Mother Russia", Civil1.Get_Name());
        assertEquals("Giant Qing", Civil2.Get_Name());
        assertEquals("Colony of Great British", Civil3.Get_Name());
        assertEquals("Poland", Civil4.Get_Name());
        assertEquals("Japan Empire", Civil5.Get_Name());
        assertEquals("United States of America", Civil6.Get_Name());
    }

    @Test
    public void Test_Get_Lumber(){
        assertEquals(1000, Civil1.Get_Lumber());
        assertEquals(500, Civil2.Get_Lumber());
        assertEquals(1000, Civil3.Get_Lumber());
        assertEquals(10000, Civil4.Get_Lumber());
        assertEquals(0, Civil5.Get_Lumber());
        assertEquals(200, Civil6.Get_Lumber());
    }

    @Test
    public void Test_Get_Food(){
        assertEquals(800, Civil1.Get_Food_Storage());
        assertEquals(2000, Civil2.Get_Food_Storage());
        assertEquals(1000, Civil3.Get_Food_Storage());
        assertEquals(10000, Civil4.Get_Food_Storage());
        assertEquals(0, Civil5.Get_Food_Storage());
        assertEquals(500, Civil6.Get_Food_Storage());
    }

    @Test
    public void Test_Get_Gold(){
        assertEquals(200, Civil1.Get_Gold());
        assertEquals(500, Civil2.Get_Gold());
        assertEquals(1000, Civil3.Get_Gold());
        assertEquals(0, Civil4.Get_Gold());
        assertEquals(2000, Civil5.Get_Gold());
        assertEquals(100, Civil6.Get_Gold());
    }

    @Test
    public void Test_Get_Stone(){
        assertEquals(600, Civil1.Get_Stone_Storage());
        assertEquals(200, Civil2.Get_Stone_Storage());
        assertEquals(1000, Civil3.Get_Stone_Storage());
        assertEquals(0, Civil4.Get_Stone_Storage());
        assertEquals(2000, Civil5.Get_Stone_Storage());
        assertEquals(200, Civil6.Get_Stone_Storage());
    }

    @Test
    public void Test_Get_Villager_List(){
        assertNull(Civil1.Get_Villager_List()[0]);
        assertNull(Civil2.Get_Villager_List()[0]);
        assertNull(Civil3.Get_Villager_List()[0]);
        assertNull(Civil4.Get_Villager_List()[0]);
        assertNull(Civil5.Get_Villager_List()[0]);
        assertNull(Civil6.Get_Villager_List()[0]);
    }

    @Test
    public void Test_Get_Relics(){
        assertEquals(0, Civil1.Get_Relics());
        assertEquals(0, Civil2.Get_Relics());
        assertEquals(0, Civil3.Get_Relics());
        assertEquals(0, Civil4.Get_Relics());
        assertEquals(0, Civil5.Get_Relics());
        assertEquals(0, Civil6.Get_Relics());
    }

    @Test
    public void Test_Change_Lumber(){
        Civil1.Change_Lumber(-300);
        assertEquals(700, Civil1.Get_Lumber());
        Civil2.Change_Lumber(200);
        assertEquals(700, Civil2.Get_Lumber());
        Civil3.Change_Lumber(-450);
        assertEquals(550, Civil3.Get_Lumber());
        Civil4.Change_Lumber(-2000);
        assertEquals(8000, Civil4.Get_Lumber());
        Civil5.Change_Lumber(155);
        assertEquals(155, Civil5.Get_Lumber());
        Civil6.Change_Lumber(-75);
        assertEquals(125, Civil6.Get_Lumber());
    }

    @Test
    public void Test_Change_Food(){
        Civil1.Change_Food(-300);
        assertEquals(500, Civil1.Get_Food_Storage());
        Civil2.Change_Food(200);
        assertEquals(2200, Civil2.Get_Food_Storage());
        Civil3.Change_Food(-450);
        assertEquals(550, Civil3.Get_Food_Storage());
        Civil4.Change_Food(-2000);
        assertEquals(8000, Civil4.Get_Food_Storage());
        Civil5.Change_Food(155);
        assertEquals(155, Civil5.Get_Food_Storage());
        Civil6.Change_Food(-75);
        assertEquals(425, Civil6.Get_Food_Storage());
    }

    @Test
    public void Test_Change_Gold(){
        Civil1.Change_Gold(-100);
        assertEquals(100, Civil1.Get_Gold());
        Civil2.Change_Gold(200);
        assertEquals(700, Civil2.Get_Gold());
        Civil3.Change_Gold(-450);
        assertEquals(550, Civil3.Get_Gold());
        Civil4.Change_Gold(2000);
        assertEquals(2000, Civil4.Get_Gold());
        Civil5.Change_Gold(155);
        assertEquals(2155, Civil5.Get_Gold());
        Civil6.Change_Gold(-75);
        assertEquals(25, Civil6.Get_Gold());
    }

    @Test
    public void Test_Change_Stone(){
        Civil1.Change_Stone(-100);
        assertEquals(500, Civil1.Get_Stone_Storage());
        Civil2.Change_Stone(200);
        assertEquals(400, Civil2.Get_Stone_Storage());
        Civil3.Change_Stone(-450);
        assertEquals(550, Civil3.Get_Stone_Storage());
        Civil4.Change_Stone(2000);
        assertEquals(2000, Civil4.Get_Stone_Storage());
        Civil5.Change_Stone(155);
        assertEquals(2155, Civil5.Get_Stone_Storage());
        Civil6.Change_Stone(-75);
        assertEquals(125, Civil6.Get_Stone_Storage());
    }

    @Test
    public void Test_Donation(){
        Civil1.Donation(100,100,100,100,2, Civil2);
        assertEquals(900, Civil1.Get_Lumber());
        assertEquals(700, Civil1.Get_Food_Storage());
        assertEquals(100, Civil1.Get_Gold());
        assertEquals(500, Civil1.Get_Stone_Storage());
        assertEquals(600, Civil2.Get_Lumber());
        assertEquals(2100, Civil2.Get_Food_Storage());
        assertEquals(600, Civil2.Get_Gold());
        assertEquals(300, Civil2.Get_Stone_Storage());

        Civil3.Donation(0,0,500,500, 1, Civil4);
        assertEquals(1000, Civil3.Get_Lumber());
        assertEquals(1000, Civil3.Get_Food_Storage());
        assertEquals(400, Civil3.Get_Gold());
        assertEquals(400, Civil3.Get_Stone_Storage());
        assertEquals(10000, Civil4.Get_Lumber());
        assertEquals(10000, Civil4.Get_Food_Storage());
        assertEquals(500, Civil4.Get_Gold());
        assertEquals(500, Civil4.Get_Stone_Storage());

        Civil5.Donation(0, 0, 1000, 1000, 0, Civil6);
        assertEquals(0, Civil5.Get_Lumber());
        assertEquals(0, Civil5.Get_Food_Storage());
        assertEquals(700, Civil5.Get_Gold());
        assertEquals(700, Civil5.Get_Stone_Storage());
        assertEquals(200, Civil6.Get_Lumber());
        assertEquals(500, Civil6.Get_Food_Storage());
        assertEquals(1100, Civil6.Get_Gold());
        assertEquals(1200, Civil6.Get_Stone_Storage());
    }
}
