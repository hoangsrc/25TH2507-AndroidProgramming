package ntu.minhhoangg.baith5_xulysukien1;

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

    // Khai báo các biến toàn cục
    EditText editTextSo1, editTextSo2;
    TextView editTextKQ;
    Button nutCong, nutTru, nutNhan, nutChia;

    private void timDieuKhien() {
        editTextSo1 = findViewById(R.id.edtSo1);
        editTextSo2 = findViewById(R.id.edtSo2);
        editTextKQ = findViewById(R.id.edtKetQua);

        nutCong = findViewById(R.id.btnCong);
        nutTru = findViewById(R.id.btnTru);
        nutNhan = findViewById(R.id.btnNhan);
        nutChia = findViewById(R.id.btnChia);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        timDieuKhien();
        //gắn bộ lắng nghe sự kiện và code xử lý cho từng nút
        nutCong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                XULY_CONG();
            }
        });

        nutTru.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                XULY_TRU();
            }
        });

        nutNhan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                XULY_NHAN();
            }
        });

        nutChia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                XULY_CHIA();
            }
        });
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }

    // Xử Lý Cộng
    void XULY_CONG() {
        String so1 = editTextSo1.getText().toString();
        String so2 = editTextSo2.getText().toString();
        if (!so1.isEmpty() && !so2.isEmpty()) {
            float num1 = Float.parseFloat(so1);
            float num2 = Float.parseFloat(so2);
            float tong = num1 + num2;
            String chuoiKQ = String.valueOf(tong);
            editTextKQ.setText(chuoiKQ);
        } else {
            editTextKQ.setText("Vui lòng nhập đủ số!");
        }
    }

    // Xử Lý Trừ
    void XULY_TRU() {
        String so1 = editTextSo1.getText().toString();
        String so2 = editTextSo2.getText().toString();
        if (!so1.isEmpty() && !so2.isEmpty()) {
            float num1 = Float.parseFloat(so1);
            float num2 = Float.parseFloat(so2);
            float hieu = num1 - num2;
            String chuoiKQ = String.valueOf(hieu);
            editTextKQ.setText(chuoiKQ);
        } else {
            editTextKQ.setText("Vui lòng nhập đủ số!");
        }
    }

    // Xử Lý Nhân
    void XULY_NHAN() {
        String so1 = editTextSo1.getText().toString();
        String so2 = editTextSo2.getText().toString();
        if (!so1.isEmpty() && !so2.isEmpty()) {
            float num1 = Float.parseFloat(so1);
            float num2 = Float.parseFloat(so2);
            float tich = num1 * num2;
            String chuoiKQ = String.valueOf(tich);
            editTextKQ.setText(chuoiKQ);
        } else {
            editTextKQ.setText("Vui lòng nhập đủ số!");
        }
    }

    // Xử Lý Chia
    void XULY_CHIA() {
        String so1 = editTextSo1.getText().toString();
        String so2 = editTextSo2.getText().toString();
        if (!so1.isEmpty() && !so2.isEmpty()) {
            float num1 = Float.parseFloat(so1);
            float num2 = Float.parseFloat(so2);
            if (num2 != 0) {
                float thuong = num1 / num2;
                String chuoiKQ = String.valueOf(thuong);
                editTextKQ.setText(chuoiKQ);
            } else {
                editTextKQ.setText("Không thể chia cho 0");
            }
        } else {
            editTextKQ.setText("Vui lòng nhập đủ số!");
        }
    }
}