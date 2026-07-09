import java.util.*;

class UndergroundSystem {

    private Map<Integer, CheckIn> checkIns;
    private Map<String, long[]> trips;

    public UndergroundSystem() {
        checkIns = new HashMap<>();
        trips = new HashMap<>();
    }

    public void checkIn(int id, String stationName, int t) {
        checkIns.put(id, new CheckIn(stationName, t));
    }

    public void checkOut(int id, String stationName, int t) {
        CheckIn in = checkIns.get(id);

        String route = in.station + "->" + stationName;
        long time = t - in.time;

        trips.putIfAbsent(route, new long[2]);

        trips.get(route)[0] += time;
        trips.get(route)[1] += 1;
    }

    public double getAverageTime(String startStation, String endStation) {
        String route = startStation + "->" + endStation;
        long[] data = trips.get(route);

        return (double) data[0] / data[1];
    }

    static class CheckIn {
        String station;
        int time;

        CheckIn(String station, int time) {
            this.station = station;
            this.time = time;
        }
    }
}