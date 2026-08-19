package ntu.minhhoangg.baith6_xulysukien_tinhtong;

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
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        //Tìm view
        TimView();
        // Gắn các bộ lắng ghe
        buttonCong.setOnClickListener(boLangNgheVaXuLyCong);
        buttonTru.setOnClickListener(boLangNgheVaXuLyTru);
        buttonNhan.setOnClickListener(boLangNgheVaXuLyNhan);
        //buttonChia.setOnClickListener(boLangNgheVaXuLyChia);
            //Ví dụ bộ lắng nghe ẩn danh
                buttonChia.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        //Code xử lý Cộng
                        //b1. Lấy số 1, 2
                        String strSo1 = edtSoA.getText().toString();
                        String strSo2 = edtSoB.getText().toString();
                        //b1. Chuyển thành số để tính toán
                        double soA = Double.parseDouble(strSo1);
                        double soB = Double.parseDouble(strSo2);
                        //b3. Tính toán
                        double chia = soA / soB;
                        //b4. Xuất kết quả
                        String strKQ = String.valueOf(chia);
                        edtKQ.setText(strKQ);
                    }
                });
    }
    //----------------------------------------------------//
    //Tạo các bộ lắng ghe và xử lý sự Kiện
    View.OnClickListener boLangNgheVaXuLyCong = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
        //Code xử lý Cộng
            //b1. Lấy số 1, 2
            String strSo1 = edtSoA.getText().toString();
            String strSo2 = edtSoB.getText().toString();
            //b1. Chuyển thành số để tính toán
            double soA = Double.parseDouble(strSo1);
            double soB = Double.parseDouble(strSo2);
            //b3. Tính toán
            double tong = soA + soB;
            //b4. Xuất kết quả
            String strKQ = String.valueOf(tong);
            edtKQ.setText(strKQ);
        }
    };
    View.OnClickListener boLangNgheVaXuLyTru = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            //Code xử lý Cộng
            //b1. Lấy số 1, 2
            String strSo1 = edtSoA.getText().toString();
            String strSo2 = edtSoB.getText().toString();
            //b1. Chuyển thành số để tính toán
            double soA = Double.parseDouble(strSo1);
            double soB = Double.parseDouble(strSo2);
            //b3. Tính toán
            double Tru = soA - soB;
            //b4. Xuất kết quả
            String strKQ = String.valueOf(Tru);
            edtKQ.setText(strKQ);
        }
    };
    View.OnClickListener boLangNgheVaXuLyNhan = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            //Code xử lý Cộng
            //b1. Lấy số 1, 2
            String strSo1 = edtSoA.getText().toString();
            String strSo2 = edtSoB.getText().toString();
            //b1. Chuyển thành số để tính toán
            double soA = Double.parseDouble(strSo1);
            double soB = Double.parseDouble(strSo2);
            //b3. Tính toán
            double nhan = soA * soB;
            //b4. Xuất kết quả
            String strKQ = String.valueOf(nhan);
            edtKQ.setText(strKQ);
        }
    };
//    View.OnClickListener boLangNgheVaXuLyChia = new View.OnClickListener() {
//        @Override
//        public void onClick(View v) {
//            //Code xử lý Cộng
//            //b1. Lấy số 1, 2
//            String strSo1 = edtSoA.getText().toString();
//            String strSo2 = edtSoB.getText().toString();
//            //b1. Chuyển thành số để tính toán
//            double soA = Double.parseDouble(strSo1);
//            double soB = Double.parseDouble(strSo2);
//            //b3. Tính toán
//            double chia = soA / soB;
//            //b4. Xuất kết quả
//            String strKQ = String.valueOf(chia);
//            edtKQ.setText(strKQ);
//        }
//    };
    //----------------------------------------------------//
    public void TimView() {
        edtSoA = (EditText) findViewById(R.id.edtSo1);
        edtSoB = (EditText) findViewById(R.id.edtSo2);
        buttonCong = (Button) findViewById(R.id.btnCong);
        buttonTru = (Button) findViewById(R.id.btnTru);
        buttonNhan = (Button) findViewById(R.id.btnNhan);
        buttonChia = (Button) findViewById(R.id.btnChia);
        edtKQ = (EditText) findViewById(R.id.edtKetQua);
    }
    //Khai báo các đối tượng tương ứng với các điều khiển (view) cần thao tác
    EditText edtSoA;
    EditText edtSoB;
    Button buttonCong, buttonTru, buttonNhan, buttonChia;
    EditText edtKQ;
    //----------------------------------------------------//


}