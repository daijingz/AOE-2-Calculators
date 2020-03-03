// Author: Jingze Dai
// Date: 02/03/2020
// Email Address: david1147062956@163.com
// Version Number: 0.0.2
package AOE2_Fight;
public class Exception {
    private boolean Contains(String[] list, String str){
        for (String s : list) {
            if (s.equals(str)) {
                return true;
            }
        }
        return false;
    }

    public void Soldier_Border_Exception(Soldier_Library that){
        if (that.get_Blood() >= 1000){
            System.out.println("Error(Limitation): AOE2 Soldiers and Heroes's blood cannot be over than 1000.");
        } else if (that.get_Attack() >= 50){
            System.out.println("Error(Limitation): AOE2 Soldiers and Heroes's attack cannot be over than 50.");
        }//In Progress: Check whether Country input is available in the country list
    }
}
