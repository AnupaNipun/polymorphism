public class CentralBank {
    void leasingRate() {
        System.out.println("30% below");
    }
}

class CommercialBank extends  CentralBank {
void HousingLoneRate(){

}
    @Override
    void leasingRate() {
        System.out.println("25%");
    }
}
class CommercialLeasing extends CentralBank {

    @Override
    void leasingRate() {
        System.out.println("23%");
    }
}

class CommercialCredit extends CommercialBank {
    @Override
    void HousingLoneRate() {
        System.out.println("20%");
    }

    @Override
    void leasingRate() {
        System.out.println("22%");
    }
}
class RateResult {
    public static void main(String[] args) {
        CentralBank c = new CentralBank();
        CentralBank cb = new CommercialBank();
        CentralBank cl = new CommercialLeasing();
        CentralBank cc = new CommercialCredit();
        c.leasingRate();
        cb.leasingRate();
        cl.leasingRate();
        cc.leasingRate();
        CommercialBank cbl, ccl;
        cbl = new CommercialBank();
        ccl = new CommercialCredit();
        cbl.HousingLoneRate();
        ccl.HousingLoneRate(); 

    }
}