import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    static ArrayList<Driver> drivers = new ArrayList<>();
    static ArrayList<Customer> customers = new ArrayList<>();

    public static void main(String[] args) {
        int menu;
        do {
            System.out.println("1. Input Driver");
            System.out.println("2. Input Customer");
            System.out.println("3. Info Driver");
            System.out.println("4. Info Customer");
            System.out.println("5. Top Up Saldo");
            System.out.println("6. Transaksi jasa pengantaran");
            System.out.println("7. Keluar");
            System.out.println("Masukan menu : ");
            menu = sc.nextInt();

            switch (menu) {
                case 1:
                    inputDriver();
                    break;
                case 2:
                    inputCustomer();
                    break;
                case 3:
                    infoMemberDrivers();
                    break;
                case 4:
                    infoMemberCustomers();
                    break;
                case 5:
                    topUpSaldo();
                    break;
                case 6:
                    bayarDriver();
                    break;
                case 7:
                    System.out.println("====================");
                    break;
                default:
                    System.out.println("CHOOSE MENU\n");
                    break;

            }
        } while (menu != 7);
    }
    static void inputDriver(){
        String nik,nama,noTelp,plat,jenisMobil;
        double saldo;

        System.out.println("NIK : ");
        nik = sc.next();
        System.out.println("Nama : ");
        nama = sc.next();
        System.out.println("No Telepon: ");
        noTelp = sc.next();
        System.out.println("Saldo : ");
        saldo = sc.nextDouble();
        System.out.println("Plat Mobil : ");
        plat = sc.next();
        System.out.println("Jenis Mobil : ");
        jenisMobil = sc.next();

        drivers.add(new Driver(nik, nama, noTelp, saldo, plat, jenisMobil));
        System.out.println();
    }

    static void inputCustomer(){
        String nik, nama, noTelp;
        double saldo;

        System.out.println("NIK : ");
        nik = sc.next();
        System.out.println("Nama : ");
        nama = sc.next();
        System.out.println("No Telepon: ");
        noTelp = sc.next();
        System.out.println("Saldo : ");
        saldo = sc.nextDouble();

        customers.add(new Customer(nik,nama,noTelp,saldo));
        System.out.println();
    }

    static void infoMemberDrivers(){
        for (Driver driver : drivers){
            System.out.println("NIK : " + driver.getNik() +
                    "\nNama : " + driver.getNama() +
                    "\nNo Telepon : " + driver.getNoTelp() +
                    "\nSaldo : " + driver.getSaldo() +
                    "\nNo Plat : " + driver.getPlat() +
                    "\nJenis Mobil : " + driver.getJenisMobil() +
                    "\n");
        }
        System.out.println();
    }

    static void infoMemberCustomers(){
        for(Customer customer : customers){
            System.out.println("NIK : " + customer.getNik() +
                    "\nNama : " + customer.getNama() +
                    "\nNo Telepon : " + customer.getNoTelp() +
                    "\nSaldo : " + customer.getSaldo() +
                    "\n");
        }
        System.out.println();
    }

    static void topUpSaldo(){
        int dropDriver, dropCustomer;
        double topUp;

        System.out.println("Driver : ");
        dropDriver = sc.nextInt();
        System.out.println("Customer : ");
        dropCustomer = sc.nextInt();
        System.out.println("Jumlah : ");
        topUp = sc.nextInt();

        drivers.get(dropDriver).saldo -= topUp;
        customers.get(dropCustomer).saldo += topUp;

        System.out.println("Transaksi sukses\n");
    }

    static void bayarDriver(){
        int dropDriver, dropCust;
        double bayar;

        System.out.println("Driver : ");
        dropDriver = sc.nextInt();
        System.out.println("Customer : ");
        dropCust = sc.nextInt();
        System.out.println("Jumlah : ");
        bayar = sc.nextDouble();

        customers.get(dropCust).saldo -= bayar;
        drivers.get(dropDriver).saldo +=bayar;

        System.out.println("Transaksi sukses\n");

    }
}