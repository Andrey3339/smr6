package programmingJava.smr6;

import java.util.ArrayList;
import java.util.List;

/**Продумайте структуру класса Кот для информационной системой ветеринарной клиники

Поля:
Имя 
Возраст
Привит ли (boolean)


Методы:
Кот .. мяукнул n раз
Метод прививки кота
1 придумаем */
public class Cat {
    String name;
    int age;   
    boolean isVaccinated;
    List<String> diseases = new ArrayList<>();

    public void mayN(int n) {
        System.out.println(this.name + " мяукнул " + n + " раз");
    }
    public void vaccinated() {
        if (isVaccinated) {
            System.out.println(this.name + " уже привит!");
        }
        else {
            isVaccinated = true;
            System.out.println("Мы привили кота " + this.name);
        }
    }
    public void addDiseases(String disease) {
        this.diseases.add(disease);
        System.out.println(this.diseases);
    } 
    public void showDiseases() {
        System.out.println(this.diseases);
    }
}
