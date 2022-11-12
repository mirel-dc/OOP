import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Zoo zoo = new Zoo();

        Scanner in = new Scanner(System.in);
        int key, i;
        String name;

        Herbivore cow = new Herbivore("Cow");
        Herbivore monkey = new Herbivore("Monkey");
        Herbivore elephant = new Herbivore("Elephant");
        zoo.addAnimal(cow);
        zoo.addAnimal(monkey);
        zoo.addAnimal(elephant);

        Predator wolf = new Predator("Wolf");
        Predator tiger = new Predator("Tiger");
        Predator bat = new Predator("Bat");
        zoo.addAnimal(wolf);
        zoo.addAnimal(tiger);
        zoo.addAnimal(bat);

        Visitor vanya = new Visitor("Vanya");
        Visitor misha = new Visitor("Misha");
        Visitor.addVisitor(vanya);
        Visitor.addVisitor(misha);
        zoo.addObserver(vanya);

        Employee nadya = new Employee("Nadya");
        Accountant zina = new Accountant("Zina");
        Employee.addEmployee(nadya);
        Employee.addEmployee(zina);

        while (true) {
            System.out.println("Choose object to work with: ");
            System.out.println("1: Human");
            System.out.println("2: Animals");
            System.out.println("0: Break");
            key = in.nextInt();
            if (key == 0)
                break;
            switch (key) {

                // Human block
                case 1:
                    while (true) {
                        System.out.println("1: Visitor");
                        System.out.println("2: Employee");
                        // TODO System.out.println("3: Accountant");
                        System.out.println("0: Back");
                        key = in.nextInt();
                        if (key == 0)
                            break;
                        switch (key) {

                            // Visitor block
                            case 1:
                                System.out.println("1: Add visitor");
                                System.out.println("2: Choose visitor");
                                System.out.println("0: Back");
                                key = in.nextInt();
                                if (key == 0)
                                    break;
                                switch (key) {
                                    case 1:
                                        System.out.println("Enter name please: ");
                                        name = in.next();
                                        Visitor.addVisitor(new Visitor(name));
                                        break;
                                    case 2:
                                        Visitor.visitorsOut();
                                        i = in.nextInt();
                                        if (i == 0)
                                            break;
                                        while (true) {
                                            System.out.println("1: Became subscriber");
                                            System.out.println("2: Unsubscribe");
                                            System.out.println("3: Speak");
                                            System.out.println("4: Walk");
                                            key = in.nextInt();
                                            if (key == 0)
                                                break;
                                            switch (key) {
                                                case 1:
                                                    zoo.addObserver(Visitor.visitors.get(i - 1));
                                                    break;
                                                case 2:
                                                    zoo.removeObserver(Visitor.visitors.get(i - 1));
                                                    break;
                                                case 3:
                                                    Visitor.visitors.get(i - 1).speak();
                                                    break;
                                                case 4:
                                                    Visitor.visitors.get(i - 1).walk();
                                                    break;
                                                default:
                                                    break;
                                            }
                                            break;
                                        }
                                        break;
                                    default:
                                        break;
                                }
                                break;

                            // Employee block
                            case 2:
                                System.out.println("1: Add employee");
                                System.out.println("2: Choose employee");
                                // TODO System.out.println("3: Accountant");
                                System.out.println("0: Back");
                                key = in.nextInt();
                                if (key == 0)
                                    break;
                                switch (key) {
                                    case 1:
                                        System.out.println("Enter name please: ");
                                        name = in.next();
                                        Employee.addEmployee(new Employee(name));
                                        break;
                                    case 2:
                                        Employee.employeesOut();
                                        i = in.nextInt();
                                        if (i == 0)
                                            break;
                                        while (true) {
                                            System.out.println("1: speak");
                                            System.out.println("2: walk");
                                            key = in.nextInt();
                                            if (key == 0)
                                                break;
                                            switch (key) {
                                                case 1:
                                                    Employee.employees.get(i - 1).speak();
                                                    break;
                                                case 2:
                                                    Employee.employees.get(i - 1).walk();
                                                    break;
                                                default:
                                                    break;
                                            }
                                            break;
                                        }
                                    default:
                                        break;
                                }
                                break;

                            // TODO Accountant block
                            case 3:
                                System.out.println("1: Add accountant");
                                System.out.println("2: Choose accountant");
                                System.out.println("0: Back");
                                key = in.nextInt();
                                if (key == 0)
                                    break;
                                switch (key) {
                                    case 1:
                                        System.out.println("Enter name please: ");
                                        name = in.next();
                                        Employee.addEmployee(new Accountant(name));
                                        break;
                                    case 2:
                                        Accountant.accountantOut();
                                        i = in.nextInt();
                                        if (i == 0)
                                            break;
                                        while (true) {
                                            System.out.println("1: speak");
                                            System.out.println("2: walk");
                                            System.out.println("3: get balance");
                                            key = in.nextInt();
                                            if (key == 0)
                                                break;
                                            switch (key) {
                                                case 1:
                                                    Employee.employees.get(i - 1).speak();
                                                    break;
                                                case 2:
                                                    Employee.employees.get(i - 1).walk();
                                                    break;
                                                case 3:
                                                    // FIXME (Accountant)Employee.employees.get(i - 1).getBalance();
                                                default:
                                                    break;
                                            }
                                            break;
                                        }
                                    default:
                                        break;
                                }
                                break;

                            default:
                                break;
                        }
                    }

                    // Animal block
                case 2:
                    while (true) {
                        System.out.println("1: Predator");
                        System.out.println("2: Herbivore");
                        System.out.println("0: Back");
                        key = in.nextInt();
                        if (key == 0)
                            break;
                        switch (key) {

                            // Predator block
                            case 1:
                                while (true) {
                                    System.out.println("1: Add predator");
                                    System.out.println("2: Choose predator");
                                    System.out.println("3: Cage");
                                    System.out.println("0: Back");
                                    key = in.nextInt();
                                    if (key == 0)
                                        break;
                                    switch (key) {
                                        case 1:
                                            System.out.println("Enter name please: ");
                                            name = in.next();
                                            zoo.addAnimal(new Predator(name));
                                            break;
                                        case 2:
                                            Cage.outPredCage();
                                            i = in.nextInt();
                                            if (i == 0)
                                                break;
                                            while (true) {
                                                System.out.println("1: Voice");
                                                System.out.println("2: Walk");
                                                key = in.nextInt();
                                                if (key == 0)
                                                    break;
                                                switch (key) {
                                                    case 1:
                                                        Cage.getPredCage().get(i - 1).voice();
                                                        break;
                                                    case 2:
                                                        Cage.getPredCage().get(i - 1).walk();
                                                        break;
                                                    default:
                                                        break;
                                                }
                                                break;
                                            }
                                            break;
                                        case 3:
                                            Cage.outPredCage();
                                            break;
                                        default:
                                            break;
                                    }
                                }
                                break;

                            // Herbivore block
                            case 2:
                                while (true) {
                                    System.out.println("1: Add Herbivore");
                                    System.out.println("2: Choose Herbivore");
                                    System.out.println("3: Cage");
                                    System.out.println("0: Back");
                                    key = in.nextInt();
                                    if (key == 0)
                                        break;
                                    switch (key) {
                                        case 1:
                                            System.out.println("Enter name please: ");
                                            name = in.next();
                                            zoo.addAnimal(new Herbivore(name));
                                            break;
                                        case 2:
                                            Cage.outHerbCage();
                                            i = in.nextInt();
                                            if (i == 0)
                                                break;
                                            while (true) {
                                                System.out.println("1: Voice");
                                                System.out.println("2: Walk");
                                                key = in.nextInt();
                                                if (key == 0)
                                                    break;
                                                switch (key) {
                                                    case 1:
                                                        Cage.getHerbCage().get(i - 1).voice();
                                                        break;
                                                    case 2:
                                                        Cage.getHerbCage().get(i - 1).walk();
                                                        break;
                                                    default:
                                                        break;
                                                }
                                                break;
                                            }
                                            break;
                                        case 3:
                                            Cage.outHerbCage();
                                            break;
                                        default:
                                            break;
                                    }
                                }
                                break;

                            default:
                                break;
                        }
                    }
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