public class BonusMilesService {
    public int calculate(int cost) {
        int every = 20;
        int mile = 1;
        int miles = (cost/every*mile);
        return miles;
    }
}
