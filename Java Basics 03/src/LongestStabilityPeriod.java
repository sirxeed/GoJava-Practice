import java.util.LinkedList;
import java.util.List;

public  class LongestStabilityPeriod {
    public int count(int[] gdp) {
        if (gdp.length == 1) {
            return 1;
        }

        int period = 0;

            //Let's find all periodes
            List<Integer> periodes = new LinkedList<>();
            for (int i = 1; i < gdp.length; i++) {
                if (Math.abs(gdp[i] - gdp[i - 1]) <= 1) {
                    period++;
                } else {
                    periodes.add(period);
                    period = 0;
                }
            }
        periodes.add(period);

        if (periodes.size() == 0) {
            return 1;
        }

            //Let's find the longest one
            period = periodes.get(0);
            for (int i = 1; i < periodes.size(); i++) {
                if (period < periodes.get(i)) {
                    period = periodes.get(i);
                }
            }

            return period;
        }

    }