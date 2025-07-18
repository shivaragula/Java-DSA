public class GasStation {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int totalTank = 0;
        int currentTank = 0;
        int startStation = 0;

        for (int i = 0; i < gas.length; i++) {
            int netGain = gas[i] - cost[i];
            totalTank += netGain;
            currentTank += netGain;

            if (currentTank < 0) {
                startStation = i + 1;
                currentTank = 0;
            }
        }

        return totalTank >= 0 ? startStation : -1;
    }
}
