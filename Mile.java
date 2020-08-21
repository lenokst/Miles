public class Mile {
    public static void main(String[] args) {
        BonusMilesService service = new BonusMilesService();
        int mile = service.calculate(75);
        System.out.println(mile);
    }
}
