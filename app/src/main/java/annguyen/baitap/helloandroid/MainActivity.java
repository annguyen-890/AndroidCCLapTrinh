package annguyen.baitap.helloandroid;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        // Ham nay duoc goi "dau tien" truoc khi app hien ra
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main); // Gan voi giao dien

        // Tim dieu khien de tham chieu den va thao tac
         EditText dieuKhienSoA = findViewById(R.id.edtA);
                    // java <--------------------- xml be file activity_main.xml
         EditText dieuKhienSoB = findViewById(R.id.edtB);

        Button nutTinhToan = findViewById(R.id.btnTong);
        //................................................
        //2 Qui dinh ham se duoc goi khi nguoi dung nhan vao nut tinh toan
        // 2.1, tro ra file xml, tim thuoc tinh OnClick
        //      cua nut bam, dat cho mot ten (ten ham)
        //      vi du: OnClick: XyLyTinhTong
        //2.2. Ra khoi ham OnCreate nay de viet ham XuLyTinhTong
    }// Het ham OnCreate

    // Ta viet ham xu ly tinh toan o day
    public void XyLyTinhTong (View v){
        //1. Tim dieu khien can thao tac neu chua tim
        EditText dieuKhienA = findViewById(R.id.edtA);
        EditText dieuKhienB = findViewById(R.id.edtB);
        TextView tvKetQua = findViewById(R.id.tvKetQua);
        //2. Lay du lieu tu cac dieu khien
        String strSoThuNhat = dieuKhienA.getText().toString();
                                    // phai dua ve string vi getText() cho ta 1 Object
        String strSoThuHai = dieuKhienB.getText().toString();
        //3. Dua ve kieu du lieu phu hop (o day la du lieu so) de tinh toan
        double soA = Double.parseDouble(strSoThuNhat);
        double soB = Double.parseDouble(strSoThuHai);
        //4. Tinh toan
        double ketQua = soA + soB;

        //5. Xuat ket qua ra dieu khien tuong ung
        // Chuan bi: dua sang dang Chuoi
        String chuoiThongBao = String.valueOf(ketQua);
        // de settext
        tvKetQua.setText(chuoiThongBao);


    }
}