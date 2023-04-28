package tryFacade;

public class Sports2000Facade {
    ItemPurchased i;
    Sports2000ProcessSales s;

    public Sports2000Facade(boolean b,float a) {
        // TODO Auto-generated constructor stub
        i=new ItemPurchased();
        s=new Sports2000ProcessSales(b, a, i.getTypeCount());

    }

    void displayItems() {
        i.showItems();
    }

    void dispAmount() {
        s.processSales();
    }

}

