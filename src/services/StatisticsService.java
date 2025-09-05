package services;

import java.util.List;

public class StatisticsService {

    public StatisticsService(List<Integer> numbers) {
    }

    public static void printStatistics(List<Integer> numbers) {
        PrintBannerService.printStatisticsBanner();
        System.out.println("Tryes: " + numbers.size());
        System.out.println("First number: " + numbers.getFirst());
        System.out.println("Last number: " + numbers.getLast());
    }

}
