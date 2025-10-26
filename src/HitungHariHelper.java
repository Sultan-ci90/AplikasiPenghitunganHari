import java.time.LocalDate;
import java.time.Month;
import java.time.format.TextStyle;
import java.util.Locale;
import java.time.temporal.ChronoUnit;
import java.util.Date;
import java.time.ZoneId;

public class HitungHariHelper {

    // Hitung jumlah hari dalam bulan
    public int getJumlahHari(int tahun, int bulan) {
        LocalDate tanggal = LocalDate.of(tahun, bulan, 1);
        return tanggal.lengthOfMonth();
    }

    // Dapatkan hari pertama dan terakhir dalam bulan
    public String getHariPertama(int tahun, int bulan) {
        LocalDate tgl = LocalDate.of(tahun, bulan, 1);
        return tgl.getDayOfWeek().getDisplayName(TextStyle.FULL, new Locale("id", "ID"));
    }

   public String getHariTerakhir(int tahun, int bulan) {
    
    LocalDate tgl = LocalDate.of(tahun, bulan, 1);
    LocalDate hariTerakhir = tgl.withDayOfMonth(tgl.lengthOfMonth());
    return hariTerakhir.getDayOfWeek().getDisplayName(TextStyle.FULL, new Locale("id", "ID"));
}

    // Hitung selisih antara dua tanggal
    public long getSelisihHari(Date awal, Date akhir) {
        LocalDate tglAwal = awal.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        LocalDate tglAkhir = akhir.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        return ChronoUnit.DAYS.between(tglAwal, tglAkhir);
    }
}
