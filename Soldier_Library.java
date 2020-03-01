class Soldier_Library {
    int blood;
    int attack;
    private String Name;

    Soldier_Library(String N, int b, int a){
        this.Name = N;
        this.blood = b;
        this.attack = a;
    }

    protected String get_Name(){
        return this.Name;
    }

    protected int get_Blood(){
        return this.blood;
    }

    protected int get_Attack(){
        return this.attack;
    }
}
