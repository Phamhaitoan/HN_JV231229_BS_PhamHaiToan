package ra.bussiness;

import java.util.Scanner;

public class Book {
    private int bookID;
    private String bookName;
    private String author;
    private String descriptions;
    private double importPrice;
    private double exportPrice;
    private float interest;
    private boolean bookStatus;

    public Book(){}

    public Book(int bookID, String bookName, String author, String descriptions, double importPrice, double exportPrice, float interest, boolean bookStatus) {
        this.bookID = bookID;
        this.bookName = bookName;
        this.author = author;
        this.descriptions = descriptions;
        this.importPrice = importPrice;
        this.exportPrice = exportPrice;
        this.interest = interest;
        this.bookStatus = bookStatus;
    }

    public int getBookID() {
        return bookID;
    }

    public void setBookID(int bookID) {
        this.bookID = bookID;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getDescriptions() {
        return descriptions;
    }

    public void setDescriptions(String descriptions) {
        this.descriptions = descriptions;
    }

    public double getImportPrice() {
        return importPrice;
    }

    public void setImportPrice(double importPrice) {
        this.importPrice = importPrice;
    }

    public double getExportPrice() {
        return exportPrice;
    }

    public void setExportPrice(double exportPrice) {
        this.exportPrice = exportPrice;
    }

    public float getInterest() {
        return interest;
    }

    public void setInterest(float interest) {
        this.interest = interest;
    }

    public boolean getBookStatus() {
        return bookStatus;
    }

    public void setBookStatus(boolean bookStatus) {
        this.bookStatus = bookStatus;
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookID=" + bookID +
                ", bookName='" + bookName + '\'' +
                ", author='" + author + '\'' +
                ", descriptions='" + descriptions + '\'' +
                ", importPrice=" + importPrice +
                ", exportPrice=" + exportPrice +
                ", interest=" + interest +
                ", bookStatus=" + bookStatus +
                '}';
    }

    public void displayData(){
        System.out.println("Book{" +
                "bookID=" + bookID +
                ", bookName='" + bookName + '\'' +
                ", author='" + author + '\'' +
                ", descriptions='" + descriptions + '\'' +
                ", importPrice=" + importPrice +
                ", exportPrice=" + exportPrice +
                ", interest=" + interest +
                ", bookStatus=" + bookStatus +
                '}');
    }

    public void inputData(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("mời nhập mã sách");
        bookID = Integer.parseInt(scanner.nextLine());
        System.out.println("mời nhập tên sách");
        bookName = scanner.nextLine();
        System.out.println("mời nhập tên tác giả");
        author = scanner.nextLine();
        System.out.println("mời nhập mô tả về sách");
        descriptions = scanner.nextLine();
        System.out.println("mời nhập giá nhập");
        importPrice = Double.parseDouble(scanner.nextLine());
        System.out.println("mời nhập giá xuất");
        exportPrice =  Double.parseDouble(scanner.nextLine());
        System.out.println("mời nhập trang thái sách");
        bookStatus = Boolean.getBoolean(scanner.nextLine());
        this.interest = (float) (this.exportPrice - this.importPrice);
    }

}
