package module2.Furama.service;

import module2.Furama.model.Facility;
import module2.Furama.model.House;
import module2.Furama.model.Room;
import module2.Furama.model.Villa;
import module2.Furama.until.ReadAndWriteHouse;
import module2.Furama.until.ReadAndWriteRoom;
import module2.Furama.until.ReadAndWriteVilla;

import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Scanner;

public class FacilityService implements IFacilityService {
    private static LinkedHashMap<Facility, Integer> facilitieHashMap = new LinkedHashMap<>();

    @Override
    public void display() {
        facilitieHashMap = new LinkedHashMap<>();
        try {
            LinkedHashMap<Facility, Integer> list = ReadAndWriteVilla.readCSV();
            for (Facility villa : list.keySet()) {
                facilitieHashMap.put(villa, list.get(villa));
            }
            list = ReadAndWriteHouse.readCSV();
            for (Facility house : list.keySet()) {
                facilitieHashMap.put(house, list.get(house));
            }
            list = ReadAndWriteRoom.readCSV();
            for (Facility room : list.keySet()) {
                facilitieHashMap.put(room, list.get(room));
            }
            for (Facility facility : facilitieHashMap.keySet()) {
                System.out.println(facility + "," + facilitieHashMap.get(facility));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void add() {
        facilitieHashMap = new LinkedHashMap<>();
        Scanner sc = new Scanner(System.in);
        int choice;
        do {
            System.out.println("1.Add New Villa\n" +
                    "2.Add New House\n" +
                    "3.Add New Room\n" +
                    "4.Back to menu");
            System.out.println("Chọn số : ");
            choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1:
                    Villa tempVilla = addVilla();
                    facilitieHashMap.put(tempVilla, 0);
                    display();
                    break;
                case 2:
                    House tempHouse = addHouse();
                    facilitieHashMap.put(tempHouse, 0);
                    display();
                    break;
                case 3:
                    Room tempRoom = addRoom();
                    facilitieHashMap.put(tempRoom, 0);
                    display();
                    break;
                case 4:
                    break;
            }
        } while (choice < 4);
    }

    public Villa addVilla() {
        facilitieHashMap = new LinkedHashMap<>();
        try {
            LinkedHashMap<Facility, Integer> list = ReadAndWriteVilla.readCSV();
            for (Facility villa : list.keySet()) {
                facilitieHashMap.put(villa, list.get(villa));
            }
            for (Facility facility : facilitieHashMap.keySet()) {
                System.out.println(facility + ", " + facilitieHashMap.get(facility));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập ID Service");
        String id = sc.nextLine();
        System.out.println("Nhập Tên Dịch Vụ");
        String name = sc.nextLine();
        // giá
        double price = 0;
        do {
            try {
                System.out.println("Nhập Giá : ");
                price = Double.parseDouble(sc.nextLine());
                if (price < 0) {
                    System.out.println("Vui Lòng Nhập Số Lớn Hơn 0 !");
                }
            } catch (NumberFormatException e) {
                System.out.println("Sai Định Dạng,Đề Nghị Nhập Lại !");
            }
        } while (price < 0);
        // số lượng
        int numberr = 0;
        do {
            try {
                System.out.println("Nhập Số Lượng : ");
                numberr = Integer.parseInt(sc.nextLine());
                if (numberr < 0 || numberr > 20) {
                    System.out.println("Vui Lòng Nhập Số Lớn Hơn 0 Và Bé Hơn 20");
                }
            } catch (NumberFormatException e) {
                System.out.println("Sai Định Dạng,Đề Nghị Nhập Lại(>0 && <20) !");
            }
        } while (numberr < 0 || numberr > 20);
        System.out.println("Nhập Loại Facility : ");
        String type = sc.nextLine();
        // diện tích sử dụng được
        double usableArea = 0;
        do {
            try {
                System.out.println("Diện Tích Sử Dụng : ");
                usableArea = Double.parseDouble(sc.nextLine());
                if (usableArea < 30) {
                    System.out.println("Vui Lòng Nhập Số Lớn Hơn 30 !");
                }
            } catch (NumberFormatException e) {
                System.out.println("Sai Định Dạng,Đề Nghị Nhập Lại(>30) !");
            }
        } while (usableArea < 30);

        System.out.println("Tiêu Chuẩn Phòng : ");
        String roomStandard = sc.nextLine();
        // số tầng
        int numberOfFloors = 0;
        do {
            try {
                System.out.println("Nhập Số Tầng");
                numberOfFloors = Integer.parseInt(sc.nextLine());
                if (numberOfFloors < 0) {
                    System.out.println("Vui Lòng Nhập Số Lớn Hơn 0!");
                }
            } catch (NumberFormatException e) {
                System.out.println("Sai Định Dạng,Đề Nghị Nhập Lại(>0) !");
            }
        } while (numberOfFloors < 0);
        // diện tích hồ bơi
        double poolArea = 0;
        do {
            try {
                System.out.println("Nhập Diện Tích Hồ Bơi : ");
                poolArea = Double.parseDouble(sc.nextLine());
                if (poolArea < 30) {
                    System.out.println("Sai Định Dạng,Đề Nghị Nhập Lại(>30) !");
                }
            } catch (NumberFormatException e) {
                System.out.println("Sai Định Dạng,Đề Nghị Nhập Lại(>30) !");
            }
        } while (poolArea < 30);
        return new Villa(id, name, usableArea,price, numberr, type, roomStandard,poolArea, numberOfFloors);

    }

    public Room addRoom() {
        facilitieHashMap = new LinkedHashMap<>();
        try {
            LinkedHashMap<Facility, Integer> list = ReadAndWriteRoom.readCSV();
            for (Facility room : list.keySet()) {
                facilitieHashMap.put(room, list.get(room));
            }
            for (Facility facility : facilitieHashMap.keySet()) {
                System.out.println(facility + ", " + facilitieHashMap.get(facility));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập ID Dịch Vụ : ");
        String id = sc.nextLine();
        System.out.println("Nhập Tên Dịch Vụ : ");
        String name = sc.nextLine();
        double price = 0;
        do {
            try {
                System.out.println("Nhập Giá  : ");
                price = Double.parseDouble(sc.nextLine());
                if (price < 0) {
                    System.out.println("Vui Lòng Nhập Số Lớn Hơn 0 : ");
                }
            } catch (NumberFormatException e) {
                System.out.println("Sai Định Dạng,Đề Nghị Nhập Lại(>0) !");
            }
        } while (price < 0);
        int numberr = 0;
        do {
            try {
                System.out.println("Nhập Số Lượng : ");
                numberr = Integer.parseInt(sc.nextLine());
                if (numberr < 0 || numberr > 20) {
                    System.out.println("Sai Định Dạng,Đề Nghị Nhập Lại(>0 && <20) !");
                }
            } catch (NumberFormatException e) {
                System.out.println("Sai Định Dạng,Đề Nghị Nhập Lại(>0 && <20) !");
            }
        } while (numberr < 0 || numberr > 20);
        System.out.println("Nhập Kiểu Facility : ");
        String type = sc.nextLine();
        double usableArea = 0;
        do {
            try {
                System.out.println("Diện Tích Sử Dụng : ");
                usableArea = Double.parseDouble(sc.nextLine());
                if (usableArea < 30) {
                    System.out.println("Vui Lòng Nhập Số Lớn Hơn 30");
                }
            } catch (NumberFormatException e) {
                System.out.println("Sai Định Dạng,Đề Nghị Nhập Lại(>30) !");
            }
        } while (usableArea < 30);
        System.out.println("Khu Vực Miễn Phí : ");
        String freeService = sc.nextLine();
        return new Room(id, name,usableArea, price, numberr, type, freeService);
    }

    public House addHouse() {
        facilitieHashMap = new LinkedHashMap<>();

        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập ID Dịch Vụ : ");
        String id = sc.nextLine();
        System.out.println("Nhập Tên Dịch Vụ : ");
        String name = sc.nextLine();
        double price = 0;
        do {
            try {
                System.out.println("Nhập Giá : ");
                price = Double.parseDouble(sc.nextLine());
                if (price < 0) {
                    System.out.println("Vui Lòng Nhập Số Lớn Hơn 0");
                }
            } catch (NumberFormatException e) {
                System.out.println("Sai Định Dạng,Đề Nghị Nhập Lại(>0) !");
            }
        } while (price < 0);
        int numberr = 0;
        do {
            try {
                System.out.println("Nhập Số Lượng : ");
                numberr = Integer.parseInt(sc.nextLine());
                if (numberr < 0 || numberr > 20) {
                    System.out.println("Sai Định Dạng,Đề Nghị Nhập Lại(0< && <20) !");
                }
            } catch (NumberFormatException e) {
                System.out.println("BSai Định Dạng,Đề Nghị Nhập Lại(0< && <20) !");
            }
        } while (numberr < 0 || numberr > 20);
        System.out.println("Nhập Kiểu : ");
        String type = sc.nextLine();
        double usableArea = 0;
        do {
            try {
                System.out.println("Diện Tích Sử Dụng : ");
                usableArea = Double.parseDouble(sc.nextLine());
                if (usableArea < 30) {
                    System.out.println("Vui Lòng Nhập Số Lớn Hơn 30");
                }
            } catch (NumberFormatException e) {
                System.out.println("Sai Định Dạng,Đề Nghị Nhập Lại(>30) !");
            }
        } while (usableArea < 30);
        System.out.println("Tiêu Chuẩn Phòng : ");
        String roomStandard = sc.nextLine();
        int numberOfFloors = 0;
        do {
            try {
                System.out.println("Nhập Số Tầng : ");
                numberOfFloors = Integer.parseInt(sc.nextLine());
                if (numberOfFloors < 0) {
                    System.out.println("Vui Lòng Nhập Số Lớn Hơn 0");
                }
            } catch (NumberFormatException e) {
                System.out.println("Sai Định Dạng,Đề Nghị Nhập Lại(>0) !");
            }
        } while (numberOfFloors < 0);
        return new House(id, name,usableArea, price, numberr, type, roomStandard, numberOfFloors);
    }

    public void edit() {
        facilitieHashMap = new LinkedHashMap<>();
    }

    @Override
    public void delete() {
        facilitieHashMap = new LinkedHashMap<>();
    }
}
