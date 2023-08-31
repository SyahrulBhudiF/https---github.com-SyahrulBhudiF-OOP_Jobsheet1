package Tugas;

public class Main {
    public static void main(String[] args) {
        kucing kcng = new kucing("kucing", "Mamalia", "Daratan");
        kcng.print();
        kcng.bersuara();
        System.out.println(kcng.eat("Whiskas"));
        System.out.println("===========================\n");

        Nilai mhs = new Nilai("Asep", "2241720132", "4A", 3.5, 4, 3, 3.25);
        mhs.calcIPK();
        mhs.print();
        System.out.println("Predikat\t: " + mhs.getPredikat());
        System.out.println("===========================\n");

        String matkul[] = { "OOP", "Web", "Mobile", "AI", "Matematika" };
        matkul mk = new matkul("Asep", "2241720132", "4A", matkul);
        mk.printMatkul();
        System.out.println("===========================\n");

        laptop lp = new laptop("Asus ROG Strix G15", "Intel Core i7-12700H", "8 GB", "512 GB", "Rp20.999.000",
                "RTX 3060 6 GB", "67Whr", 1);
        lp.print();
        lp.buyLaptop();
        System.out.println("Stok saat ini : " + lp.getStok());
        lp.buyLaptop();
        System.out.println("===========================\n");

    }
}
