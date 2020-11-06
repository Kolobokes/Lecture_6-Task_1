package ru.netology.stats;

public class StatsService {

    long[] salesAmountByMonth = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

    public long calculateTotalAmount(long[] salesAmountByMonth) {
        long totalAmount = 0;
        for (long amount : salesAmountByMonth) {
            // аналог sum = sum + purchase;
            totalAmount = totalAmount + amount;
        }
        return totalAmount;
    }

    public long calculateAverageAmount(long[] salesAmountByMonth){
       long numberOfMonths = salesAmountByMonth.length;
       long averageAmount = calculateTotalAmount(salesAmountByMonth) / numberOfMonths;
       return averageAmount;
    }

    public long findMonthMaxAmount(long[] salesAmountByMonth) {
        long numberOfMonth = 0;
        long monthOfMaximumSales = 0;
        long lastAmount = 0;
        for (long amount : salesAmountByMonth) {
            numberOfMonth = numberOfMonth + 1;
            if (lastAmount <= amount) {
                monthOfMaximumSales = numberOfMonth;
                lastAmount = amount;
            }
        }
        return monthOfMaximumSales;
    }

    public long findMonthMinAmount(long[] salesAmountByMonth) {
        long numberOfMonth = 0;
        long monthOfMinimumSales = 0;
        long lastAmount = salesAmountByMonth[0];
        for (long amount : salesAmountByMonth) {
            numberOfMonth = numberOfMonth + 1;
            if (lastAmount >= amount) {
                monthOfMinimumSales = numberOfMonth;
                lastAmount = amount;
            }
        }
        return monthOfMinimumSales;
    }

    public long belowAverageSalesMonth(long[] salesAmountByMonth) {
        long averageAmount = calculateAverageAmount(salesAmountByMonth);
        long numberOfMonths = 0;
        for (long amount : salesAmountByMonth){
            if (averageAmount > amount){
                numberOfMonths = numberOfMonths + 1;
            }
        }
        return numberOfMonths;
    }

    public long montOfSalesAboveAverage(long[] salesAmountByMonth) {
        long averageAmount = calculateAverageAmount(salesAmountByMonth);
        long numberOfMonths = 0;
        for (long amount : salesAmountByMonth){
            if (averageAmount < amount){
                numberOfMonths = numberOfMonths + 1;
            }
        }
        return numberOfMonths;
    }
}
