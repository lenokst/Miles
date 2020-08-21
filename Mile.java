public class Mile {
    public static void main(String[] args) {
        BonusMilesService service = new BonusMilesService();
        double cost = 75.00;
        int mile = service.calculate(cost);
        System.out.println(mile);
    }
}
