package challenge12;

import java.util.Arrays;
import java.util.List;

public final class RegularExpressionParser {

    public static void main(String[] args) {
        RegExp expr1 = new Str(Arrays.asList(
                new Normal('a'),
                new ZeroOrMore(new Normal('b'))
        ));
        System.out.println(expr1);

        RegExp expr2 = new ZeroOrMore(new Str(Arrays.asList(
                new Normal('a'),
                new Normal('b')
        )));
        System.out.println(expr2);

        RegExp expr3 = new Or(
                new Str(Arrays.asList(
                        new Normal('a'),
                        new Normal('b')
                )),
                new Normal('a')
        );
        System.out.println(expr3);

        RegExp expr4 = new Str(Arrays.asList(
                new Normal('a'),
                new Or(new Normal('b'), new Normal('a'))
        ));
        System.out.println(expr4);

        RegExp expr5 = new Or(
                new Normal('a'),
                new ZeroOrMore(new Normal('b'))
        );
        System.out.println(expr5);

        RegExp expr6 = new ZeroOrMore(
                new Or(new Normal('a'), new Normal('b'))
        );
        System.out.println(expr6);

        RegExp expr = new Or(
                new Str(Arrays.asList(
                        new Normal('a'),
                        new ZeroOrMore(new Any())
                )),
                new Str(Arrays.asList(
                        new Normal('b'),
                        new Normal('b')
                ))
        );
        System.out.println(expr);
    }

    public interface RegExp {
        String getType();
    }

    public static final class Void implements RegExp {
        @Override
        public String getType() {
            return "";
        }

        @Override
        public String toString() {
            return getType();
        }
    }

    public static final class Normal implements RegExp {
        private final char c;

        public Normal(char c) {
            this.c = c;
        }

        @Override
        public String getType() {
            return String.valueOf(c);
        }

        @Override
        public String toString() {
            return getType();
        }
    }

    public static final class Any implements RegExp {
        @Override
        public String getType() {
            return ".";
        }

        @Override
        public String toString() {
            return getType();
        }
    }

    public static final class ZeroOrMore implements RegExp {
        private final RegExp regExp;

        public ZeroOrMore(RegExp regExp) {
            this.regExp = regExp;
        }

        @Override
        public String getType() {
            String type = (regExp instanceof Or || regExp instanceof Str) ? "(" + regExp.getType() + ")" : regExp.getType();
            return type + "*";
        }

        @Override
        public String toString() {
            return getType();
        }
    }

    public static final class Or implements RegExp {
        private final RegExp regExp1;
        private final RegExp regExp2;

        public Or(RegExp regExp1, RegExp regExp2) {
            this.regExp1 = regExp1;
            this.regExp2 = regExp2;
        }

        @Override
        public String getType() {
            if ((regExp1 instanceof Str && regExp2 instanceof Str))  {
                Str s1 = (Str) regExp1;
                Str s2 = (Str) regExp2;
                if (s1.getRegExpList().size() > 1 && s2.getRegExpList().size() > 1)
                    return "(" + s1.getType() + ")" + "|" + "(" + s2.getType() +")";

            }

            return regExp1.getType() + "|" + regExp2.getType();
        }

        @Override
        public String toString() {
            return getType();
        }
    }

    public static final class Str implements RegExp {
        private final List<RegExp> regExpList;

        public Str(List<RegExp> regExpList) {
            this.regExpList = regExpList;
        }

        @Override
        public String getType() {
            StringBuilder result = new StringBuilder();
            for (RegExp regExp : regExpList) {
                if (regExp instanceof Or) {
                    result.append("(").append(regExp.getType()).append(")");
                    continue;
                }

                result.append(regExp.getType());
            }
            return result.toString();
        }

        @Override
        public String toString() {
            return getType();
        }

        public List<RegExp> getRegExpList() {
            return regExpList;
        }
    }
}
