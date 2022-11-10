public class App {
    public static void main(String[] args) throws Exception {
        Visitor vanya = new Visitor("Vanya");
        Employee nadya = new Employee("Nadya");

        vanya.addVisitor(vanya);
        Visitor.visitorsOut();

        Predator tiger = new Predator("Tiger");
        Herbivore cow = new Herbivore("Cow");
        Animal cat = new Predator("Cat");

        cow.addAnimal(cow);
        tiger.addAnimal(tiger);
        cat.addAnimal(cat);

        Animal.animalsOut();
    }
}

// TODOLIST
// TODO~ В программе должны быть реализованы интерфейсы Walker, Voicer, Speeker.
// + В модели есть люди: посетители и сотрудники, наследующие класс Person и
// реализующие интерфейсы Walker, Speeker.
// + В модели есть животные, наследующие класс Animal и реализующие интерфейсы
// Walker, Voicer.
// + Также для животных введено enum-перечисление с типами животных HERBIVORE и
// PREDATOR и соответствующие классы AnimalPredator, AnimalHerbivore
// TODO- Существует класс Бухгалтера, который имеет метод getBalance(Animal[]
// animals) – принимает массив животных и печатает в консоль, сколько из них
// хищных и травоядных
// TODO- В Zoo есть две клетки (класс Cage) которые наполняются животными:
// хищные
// отдельно, травоядные отдельно. Для добавления животного должны быть
// реализованы методы в Zoo.
// TODO- В программе должен быть реализован паттерн Observer (Наблюдатель).
// Подумайте сами, какие интерфейсы нужно создать и какие классы будут их
// реализовывать. Реализация на ваше усмотрение.
// TODO- Программа должна иметь консольное управление. Наполнение программы
// разработать самостоятельно.