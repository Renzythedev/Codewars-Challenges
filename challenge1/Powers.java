package challenge1;

public final class Powers {

    public enum Goods {
        HOBBITS(1),
        MEN(2),
        ELVES(3),
        DWARVES(3),
        EAGLES(4),
        WIZARDS(10);

        private int power;

        Goods(int power) {
            this.power = power;
        }

        public int getPower() {
            return power;
        }
    }

    public enum Evils {

        ORCS(1),
        MEN(2),
        WARGS(2),
        GOBLINS(2),
        URUK_HAI(3),
        TROLLS(5),
        WIZARDS(10);
        private int power;

        Evils(int power) {
            this.power = power;
        }

        public int getPower() {
            return power;
        }
    }
}
