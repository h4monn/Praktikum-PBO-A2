/*
*File : MapMahasiswa.java
*Deskripsi : Program penggunaan Map untuk menyimpan data mahasiswa dengan NIM sebagai key dan nama sebagai value, serta menampilkan data menggunakan lambda expression.
*Pembuat : Axel Anggian Hamonangan Purba
*Tanggal : 25 Mei 2026
NIM: 24060124140127
*/

import java.util.HashMap;
import java.util.Map;

public class MapMahasiswa {
    public static void main(String[] args) {
        Map<String, String> mhsMap = new HashMap<>();
        
        mhsMap.put("2025001", "Adi");
        mhsMap.put("2025002", "Bambang");
        mhsMap.put("2025003", "Cici");
        mhsMap.put("2025004", "Didi");
        
        mhsMap.forEach((nim, nama) -> {
            System.out.println("NIM: " + nim + ", Nama: " + nama);
        });
    }
}