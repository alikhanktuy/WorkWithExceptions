public class Main {
    /*Написать класс магазин по продаже машин.
   Класс имеет метод:
   -по заполнению магазина машинами
   -вывод стоймости всех имеющихся машин
   -продать машину (вывести что машина продана и убрать из магазина)*/
    public static void main(String[] args) {
        Mazda mazda = new Mazda("RX7", 5000, 1000, 1500, 4500);
        Nissan nissan = new Nissan("G34", 6000, 1000, 2500, 5000);
        Toyota toyota = new Toyota("Supra", 4500, 2100, 40000, 60000);
        Shop shop = new Shop();
        try {
            shop.addCars(mazda);
            shop.addCars(nissan);
            shop.addCars(toyota);
        } catch (OutOfFreePlaceException e){
            System.out.println("Does not have enough space for your car");
        } catch (TooBigCarException tooBigCarException){
            System.out.println("Your car too big");
        }

            shop.printAllCars();
            shop.soldCar(1);//
            shop.printAllCars();
        }
    }
