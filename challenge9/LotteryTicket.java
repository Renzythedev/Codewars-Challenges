package challenge9;

import java.util.Arrays;
import java.util.List;

public final class LotteryTicket {

    public static String ticket(List<List<Object>> tickets, int winAmount) {
        int currWinAmount = 0;
        for (List<Object> ticket : tickets) {
            if (ticket.size()>2) continue;

            String s = ticket.get(0).toString();
            int miniWinAmount = 0;

            for (char c : s.toCharArray()) {
                if ((int) c==(int)ticket.get(1)) {
                    miniWinAmount++;
                    break;
                }

            }
            currWinAmount += miniWinAmount;
        }

        return currWinAmount >= winAmount ? "Kazandınız!" : "Kaybettiniz :(";
    }

    public static void main(String[] args) {
        List<List<Object>> ticket = Arrays.asList(
                Arrays.asList("AAA", 65),
                Arrays.asList("HGR", 72),
                Arrays.asList("BYHT", 74)
        );

        System.out.println(ticket(ticket,2));
    }
}
