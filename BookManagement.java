package ra.run;
import ra.bussiness.Book;

import java.util.Scanner;


public class BookManagement {


    public static void main(String[] args) {

        Book[] books = new Book[100];
        BookManagement bookManagement = new BookManagement();
        Scanner scanner = new Scanner(System.in);
        int bookCount = 0;
        int choice;
        do {
            System.out.println("======================MENU:====================");
            System.out.println("1. Nhập sách mới");
            System.out.println("2. Hiển thị sách");
            System.out.println("3. Sắp xếp sách");
            System.out.println("4. Xóa sách");
            System.out.println("5. Tìm kiếm sách");
            System.out.println("6. Thay đổi thông tin sách");
            System.out.println("7. Thoát");
            System.out.print("Chọn lựa: ");
            choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1:
                    System.out.println("Nhập số lượng sản phẩm muốn thêm");
                    int n = Integer.parseInt(scanner.nextLine());
                    for (int i = 0; i < n; i++) {
                        System.out.println("Mời nhập thông tin của sản phẩm thứ " + (i + 1));
                        Book newBook = new Book();
                        newBook.inputData();
                        books[bookCount] = newBook;
                        bookCount++;
                    }
                    break;
                case 2:
                    if (bookCount <= 0) {
                        System.out.println("Hiện không có sản phẩm nào để hiển thị");
                        break;
                    }
                    for (int i = 0; i < bookCount; i++) {
                        books[i].displayData();
                    }
                    break;
                case 3:
                    if (bookCount <= 0) {
                        System.out.println("Hiện không có sản phẩm nào để sắp xếp");
                        break;
                    }
                    for (int i = 0; i < bookCount - 1; i++) {
                        for (int j = i + 1; j < bookCount; j++) {
                            if (books[i].getInterest() > books[j].getInterest()) {
                                Book temp = books[i];
                                books[i] = books[j];
                                books[j] = temp;
                            }
                        }
                    }

                    for (int i = 0; i < bookCount; i++) {
                            books[i].displayData();
                        }
                        break;



                        case 4:
                            System.out.println("Nhập mã sản phẩm cần xóa:");
                            int deleteId = Integer.parseInt(scanner.nextLine());
                            for (int i = 0; i < bookCount; i++) {
                                if (books[i].getBookID()== deleteId){
                                    for (int j = 0; j < bookCount-1; j++) {
                                        books[j]=books[j+1];
                                    }
                                    bookCount--;
                                    break;
                                }
                            }
                            break;

                        case 7:
                            System.exit(0);
                        default:
                            System.out.println("Lựa chọn không khả dụng");
                            break;
                    }


        }while (true) ;
    }




}

