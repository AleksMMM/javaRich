package task1417;

import java.util.ArrayList;
import java.util.List;

/* 
Валюты
*/

public class Solution {
    public static void main(String[] args) {
        Person ivan = new Person("Иван");
        ivan.setAllMoney(new Hryvnia(25.00));
        ivan.setAllMoney(new Ruble(20.00));
        ivan.setAllMoney(new USD(35.00));
        for (Money money : ivan.getAllMoney()) {
            System.out.println(ivan.name + " имеет заначку в размере " + money.getAmount() + " " + money.getCurrencyName());
        }
    }

    static class Person {
        public String name;

        Person(String name) {
            this.name = name;
            this.allMoney = new ArrayList<>();
            //напишите тут ваш код
        }

        private List<Money> allMoney;

        public void setAllMoney(Money money) {

            allMoney.add(money);

        }

        public List<Money> getAllMoney() {
            return allMoney;
        }
    }
}
