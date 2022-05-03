public class Match {
    Fighter f1;
    Fighter f2;
    int minWeight;
    int maxWeight;
    public Match(Fighter f1, Fighter f2, int minWeight, int maxWeight) {
        this.f1 = f1;
        this.f2 = f2;
        this.minWeight = minWeight;
        this.maxWeight = maxWeight;
    }
    void Run(){
        if (IsCheck()){
            while (this.f1.health>0 && this.f2.health>0) {
                
                System.out.println("===========YENİ ROUND===========");
                this.f2.health = this.f1.Hit(this.f2);
                if (IsWin()){
                    break;
                }
                
                this.f1.health = this.f2.Hit(this.f1);
                if (IsWin()){
                    break;
                }
                System.out.println(this.f1.name + " Sağlık: " + this.f1.health);
                System.out.println(this.f2.name + " Sağlık: " + this.f2.health);

            }
        }else{
            System.out.println("Sporcuların sikletleri uyuşmuyor!");
        }
    }

    boolean IsCheck(){
        return (this.f1.weight>=this.minWeight && this.f1.weight<=this.maxWeight) && (this.f2.weight>=this.minWeight && this.f2.weight<=this.maxWeight);
    }
    boolean IsWin(){
        if (this.f1.health == 0){
            System.out.println(this.f2.name + " kazandı!");
            return true;
        }
        if (this.f2.health == 0){
            System.out.println(this.f1.name + " kazandı!");
            return true;
        }
        return false;
    }
    
}
