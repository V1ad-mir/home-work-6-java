import java.util.*;

import static java.lang.Integer.parseInt;



//        Подумать над структурой класса Ноутбук для магазина техники - выделить поля и методы. Реализовать в java.
//        Создать множество ноутбуков.
//        Написать метод, который будет запрашивать у пользователя критерий (или критерии) фильтрации и выведет ноутбуки,
//        отвечающие фильтру. Критерии фильтрации можно хранить в Map.
//        Например:
//        “Введите цифру, соответствующую необходимому критерию:
//        1 - ОЗУ
//        2 - Объем ЖД
//        3 - Операционная система
//        4 - Цвет …
//        5 - показать ноутбуки
//        Далее нужно запросить минимальные значения для указанных критериев - сохранить параметры фильтрации можно также в Map.
//        Отфильтровать ноутбуки из первоначального множества и вывести проходящие по условиям.
//        1=6
//        4="белый"
public class task1_6_2 {


    public static <k> void main(String[] args) {

        Set<Laptop> shop = new HashSet<>();

        Laptop laptop1 = new Laptop("Asus",15.6,8,2048,"intel",
                "Windows",true, false);
        Laptop laptop2 = new Laptop("Acer",17,12,1024,"amd",
                "LinuX",false, true);
        Laptop laptop3 = new Laptop("HP",15.6,16,2048,"intel",
                "linux",false, false);
        Laptop laptop4 = new Laptop("Msi",16.1,32,750,"amd",
                "Linux",true, true);
        Laptop laptop5 = new Laptop("Lenovo",15.6,8,1024,"intel",
                "Windows",true, false);
        Laptop laptop6 = new Laptop("Asus",16.1,12,2048,"amd",
                "windows",false, true);
        Laptop laptop7 = new Laptop("Msi",14,16,1024,"amd",
                "Windows",false, false);
        Laptop laptop8 = new Laptop("Lenovo",15.6,32,2048,"intel",
                "WINDOWS",true, true);
        Laptop laptop9 = new Laptop("Dell",10.8,6,750,"amd",
                "Без ОС",true, false);
        Laptop laptop10 = new Laptop("HP",11.6,12,2048,"intel",
                "Windows",false, true);

        shop.add(laptop1);
        shop.add(laptop2);
        shop.add(laptop3);
        shop.add(laptop4);
        shop.add(laptop5);
        shop.add(laptop6);
        shop.add(laptop7);
        shop.add(laptop8);
        shop.add(laptop9);
        shop.add(laptop10);

//        Laptop laptopSearch = quest();
        Set<Laptop> result = new HashSet<>();
        List<Laptop> res = new ArrayList<>();
        int count = 0;
        TreeMap<Integer, String> request = quest();
        for (Laptop laptop: shop) {
            for (Map.Entry<Integer, String> entry: request.entrySet()){
                int num = entry.getKey();

                switch (num){
                    case (1): if (laptop.nameLaptop.equalsIgnoreCase(request.get(1))){
                        count++;
                        break;
                    }
                    case (2):
                        if (laptop.sizeDisplay >= Double.parseDouble(request.get(2))){
                        count++;
                        break;

                    }
                    case (3): if (laptop.rom >= Integer.parseInt(request.get(3))){
                        count++;
                    }
                    case (4): if (laptop.ram >= Integer.parseInt(request.get(4))){
                        count++;
                    }
                    case (5): if (laptop.nameCpu.equalsIgnoreCase(request.get(5))){
                        count++;
                    }
                    case (6): if (laptop.nameOs.equalsIgnoreCase(request.get(6))){
                        count++;
                    }
                    case (7): if (laptop.touchScreen == Boolean.parseBoolean(request.get(7))){
                        count++;
                    }
                    case (8): if (laptop.opticalDrive == Boolean.parseBoolean(request.get(8))){
                        count++;
                    }


                }


            }
            System.out.println(count);
            if(count == request.size()){
                System.out.println(laptop);
                count = 0;
            }



        }

            
    }





    public static TreeMap<Integer, String> quest(){
        TreeMap<Integer, String> request = new TreeMap<>();
        Scanner scanner = new Scanner(System.in);
        String parameter = "";
        int exit = 1;

        while (exit!=0){

            System.out.println("Ввыберите парамет для поиска:"+"\n"+
                    "1-Производитель"+"\n"+
                    "2-Размер экрана"+"\n"+
                    "3-Размер оперативной памяти в Гб" +"\n"+
                    "4-Размер постоянной памяти в Гб" +"\n"+
                    "5-Производитель CPU" +"\n"+
                    "6-Предустановленная операционная система"+"\n"+
                    "7-Наличие сенсорного экрана" +"\n"+
                    "8-Наличие оптического привода"+ "\n"+
                    "0-Начало поиска по заданным параметрам");
            exit = parseInt(scanner.nextLine());
            switch (exit){
                case (1):
                    System.out.println("Введите название производителя");
                    parameter = scanner.nextLine();
                    request.put(exit,parameter);
                    break;
                case (2):
                    System.out.println("Введите размер экрана");
                    parameter = scanner.nextLine();
                    request.put(exit,parameter);
                    break;
                case (3):
                    System.out.println("Введите размер оперативной памяти в Гб");
                    parameter = scanner.nextLine();
                    request.put(exit,parameter);
                    break;
                case (4):
                    System.out.println("Введите размер постоянной памяти в Гб");
                    parameter = scanner.nextLine();
                    request.put(exit,parameter);
                    break;
                case (5):
                    System.out.println("Введите производителя CPU");
                    parameter = scanner.nextLine();
                    request.put(exit,parameter);
                    break;
                case (6):
                    System.out.println("Ввндите какая операционная система предустановлена");
                    parameter = scanner.nextLine();
                    request.put(exit,parameter);
                    break;
                case (7):
                    System.out.println("Наличие сенсорного экрана(true/false)");
                    parameter = scanner.nextLine();
                    request.put(exit,parameter);
                    break;
                case (8):
                    System.out.println("Наличие оптического привода(true/false)");
                    parameter = (scanner.nextLine());
                    request.put(exit,parameter);
                    break;


            }
        }
        return request;
    }





}