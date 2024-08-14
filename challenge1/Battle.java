package challenge1;

import java.util.EnumMap;
import java.util.Map;

public final class Battle {

    public static void battle(String goods,String evils) {
        EnumMap<Powers.Goods,Integer> goodsMap = new EnumMap(Powers.Goods.class);
        EnumMap<Powers.Evils,Integer> evilsMap = new EnumMap(Powers.Evils.class);

        String[] goodsArray = goods.split(" ");
        String[] evilsArray = evils.split(" ");
        for (int i = 0; i<goodsArray.length; i++) {
            goodsMap.put(Powers.Goods.values()[i],Integer.parseInt(goodsArray[i]));
        }

        for (int i = 0; i<evilsArray.length; i++) {
            evilsMap.put(Powers.Evils.values()[i],Integer.parseInt(evilsArray[i]));
        }

        int goodsTotalPower = 0;
        for (Map.Entry<Powers.Goods,Integer> g : goodsMap.entrySet()) {
            goodsTotalPower += g.getValue() * g.getKey().getPower();
        }

        int evilsTotalPower = 0;
        for (Map.Entry<Powers.Evils,Integer> e : evilsMap.entrySet()) {
            evilsTotalPower += e.getValue() * e.getKey().getPower();
        }

        if (goodsTotalPower > evilsTotalPower) {
            System.out.println("Goods win!");
            System.out.println("Goods: " + goodsTotalPower + ", Evils: " + evilsTotalPower);
        }

        else if(goodsTotalPower < evilsTotalPower) {
            System.out.println("Evils win!");
            System.out.println("Goods: " + goodsTotalPower + ", Evils: " + evilsTotalPower);
        }

        else {
            System.out.println("Draw.");
            System.out.println("Goods: " + goodsTotalPower + ", Evils: " + evilsTotalPower);
        }

    }
}
