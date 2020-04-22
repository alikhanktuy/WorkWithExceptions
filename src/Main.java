public class Main {
    /*Написать класс магазин по продаже машин.
   Класс имеет метод:
   -по заполнению магазина машинами
   -вывод стоймости всех имеющихся машин
   -продать машину (вывести что машина продана и убрать из магазина)*/
    public static void main(String[] args) {
        Mazda mazda = new Mazda("RX7", 5000);
        Nissan nissan = new Nissan("G34", 6000);
        Toyota toyota = new Toyota("Supra", 4500);
        Shop shop = new Shop();
        shop.addCars(mazda);
        shop.addCars(nissan);
        shop.addCars(toyota);
        shop.printAllCars();
        shop.soldCar(1);//
        shop.printAllCars();
    }
}
