// Author: Jingze Dai
// Date: 02/03/2020
// Email Address: david1147062956@163.com
// Version Number: 0.0.2
package AOE2_Fight;
class Soldier_Library {
    int blood;
    int attack;
    private String Name;
    private String Country;

    private String[] country_List = {"Britons", "Byzantines", "Celts", "China", "Franks", "Goths", "Japan", "Mongols",
            "Persians", "Saracens", "Teutons", "Turks", "Vikings", "Aztecs", "Huns", "Koreans", "Mayans", "Spanish",
            "Inca", "Indians", "Italians", "Magyars", "Slavs", "Berbers", "Ethiopians", "Malians", "Portuguese",
            "Burmese", "Khmer", "Malay", "Vietnamese", "Bulgarians", "Cumans", "Lithuanians", "Tatars"};

    Soldier_Library(String N, int b, int a, String Country){
        this.Name = N;
        this.blood = b;
        this.attack = a;
        this.Country = Country;
    }

    protected String get_Name(){
        return this.Name;
    }

    int get_Blood(){
        return this.blood;
    }

    int get_Attack(){
        return this.attack;
    }

    String get_Country() {return this.Country; }
}
