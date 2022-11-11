import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Zoo zoo = new Zoo();
        Scanner in = new Scanner(System.in);
        int key;
        while (true) {
            System.out.println("Choose object to work with: ");
            System.out.println("1: Human");
            System.out.println("2: Animals");
            System.out.println("0: Break");
            key = in.nextInt();
            switch (key) {
                case 1: // TODO Доделать выходы, 0=брейк
                    while (true) {
                        System.out.println("1: Visitor");
                        System.out.println("2: Employee");
                        System.out.println("3: Accountant");
                        key = in.nextInt();
                        switch (key) {
                            case 1:
                                while (true) {

                                }
                                break;
                            case 2:

                                break;
                            case 3:

                                break;
                            default:
                                break;
                        }
                    }
                    break;
                case 2:

                case 0:
                    break;

                default:
                    System.out.println("Wrong");
                    break;
            }
        }

    }
}

// TODOLIST
// FIXME~ В программе должны быть реализованы интерфейсы Walker, Voicer,
// Speeker.
// + В модели есть люди: посетители и сотрудники, наследующие класс Person и
// реализующие интерфейсы Walker, Speeker.
// + В модели есть животные, наследующие класс Animal и реализующие интерфейсы
// Walker, Voicer.
// + Также для животных введено enum-перечисление с типами животных HERBIVORE и
// PREDATOR и соответствующие классы AnimalPredator, AnimalHerbivore
// + Существует класс Бухгалтера, который имеет метод getBalance(Animal[]
// animals) – принимает массив животных и печатает в консоль, сколько из них
// хищных и травоядных
// - В Zoo есть две клетки (класс Cage) которые наполняются животными:
// хищные
// отдельно, травоядные отдельно. Для добавления животного должны быть
// реализованы методы в Zoo.
// - В программе должен быть реализован паттерн Observer (Наблюдатель).
// Подумайте сами, какие интерфейсы нужно создать и какие классы будут их
// реализовывать. Реализация на ваше усмотрение.
// TODO- Программа должна иметь консольное управление. Наполнение программы
// разработать самостоятельно.