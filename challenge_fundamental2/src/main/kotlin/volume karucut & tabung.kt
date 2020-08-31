import java.awt.SystemColor.menu
import java.util.*
public var input = Scanner(System. `in`)
fun main(){

    print("Nama :")
    val nama: String? = input.nextLine()

    if (nama.isNullOrEmpty()) {
        println("Silahkan di isi terlebih dahulu")
        main()
    }
    print("Kelas :")
    val kelas: String = input.nextLine()

    if (kelas.isNullOrEmpty()) {
        println("Silahkan di isi terlebih dahulu")
        main()
    }

    print("No Absen :")
    val NoAbsen: String?= input.nextLine()

    if (NoAbsen.isNullOrEmpty()){
        println("Silahkan di isi terlebih dahulu")
        main()
    }
    print("GitHub :")
    val git: String? = null
    val gitLength = git?.length ?: "peterparker89"
    println(gitLength)
    println("==============================")
    menu()
}
fun menu(){
    print ("Pengin ngitung apa nii...?\n")
    println("1. Kerucut\n2. Tabung\n3. Batal")
    print ("Silahkan pilih menu Bangun Ruang yang di inginkan :")
    val pilih:Int = input.nextInt()
    when (pilih) {
        1 -> Kerucut()
        2 -> Tabung()
        else -> {
            println("Yap menu telah di batalkan")
            menu()
        }
    }
}
fun Kerucut() {
    println("================================");
    print("Masukan Tinggi Kerucut : ");
    val tinggi: Double = input.nextDouble();
    print("Masukan Jari-jari Kerucut : ");
    val jari: Double = input.nextDouble();

    val v: Double = (0.33333) * Math.PI * (jari * jari) * tinggi;
    println("================================");
    print("Volume Kerucut adalah = ");
    System.out.printf("%.2f", v);
    println()
    println("================================");
    menu()

}
fun Tabung() {
    println("================================");
    print("Masukan Tinggi Tabung : ");
    var tinggi: Double? = null
    tinggi = input.nextDouble();
    print("Masukan jari-jari Tabung: ");
    var jari: Double? = null
    jari = input.nextDouble();
    val v = Math.PI * jari * jari * tinggi;
    println("================================");
    print("Volume Tabung adalah = ")
    System.out.printf("%.2f", v);
    println()

}
