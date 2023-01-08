public class GasStation {

    public int canCompleteCircuit(int[] gas, int[] cost) {
        if(gas.length != cost.length) return -2;
        int i = 0, tank = 0, repeat = 0;

        do {
           if(gas[i] - cost[i] >= 0){ // if gas is enough for the next station start driving.
               tank += gas[i]; // fills gas from this station.
               System.out.println("Driving from station at " + "(index " + i + ").");
               System.out.println();

               for(int n = i; n >= 0; n++){
                   System.out.println(tank + " - " + cost[n] + " :  " + (tank-cost[n]));
                   tank -= cost[n];

                   if(tank < 0 ) { // if we will run out of gas before circuit is complete try the next station.
                       tank = 0;
                       break;
                   } else if(n == gas.length-1){ // repeats For-loop to complete circuit.
                       if(repeat == 1) {
                           System.out.println("Circuit Completed.");
                           return i;   //if we complete a circuit return starting gas station's index.
                       }
                       int more = gas[0];
                       System.out.println(tank + " + " + gas[0] + " : " + (more + tank));
                       tank += more;
                       System.out.println();
                       repeat++;
                       n = -1;
                   } else{ // adds gas at every station.
                       System.out.println(tank + " + " + gas[n+1] + " : " + (tank + gas[n+1]));
                       tank += gas[n+1];
                       System.out.println();
                   }
               }
           }
           i++;

           if(repeat == 1) break; // breaks the while loop if we make a full circle from any station at all.
       } while(i < gas.length);

        return -1;
    }

    public static void main(String[] args) {
     /* int[] gas = {1,2,3,4,5};
        int[] cost = {3,4,5,1,2}; */

     /* int[] gas = {1,5,3,4,5};
        int[] cost = {3,3,5,5,2}; */

        int[] gas = {1,5,3,4,5};
        int[] cost = {3,3,5,5,2};

    /*   int[] gas = {2,3,4};
        int[] cost = {3,4,3}; */

        GasStation gasStation = new GasStation();
        int value = gasStation.canCompleteCircuit(gas, cost);
        System.out.println(value);
    }
}
