package ntu.minhhoangg.baith7_listview1;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        //Hiển thị dữ liệu lên ListView
        //B1: Cần có dữ liệu
        // ?? Từ đâu có: Từ cơ sở dữ liệu (SQL, noSQL, XML,...)
        //Ở bài này chúng ta hard-code dữ liệu trực tiếp
        //Cần biến phù hợp để chứa dữ liệu

        ArrayList<String> dsTenTinhThanhVN; //Khai báo
        dsTenTinhThanhVN = new ArrayList<String>(); //Tạo thể hiện cụ thể, Xin mới
            //Thêm dữ liệu ở đây (đúng ra, ta phải đọc từ một nguồn nào đó)
            //Nhưng ta hard-code (cho sẵn để demo)
            dsTenTinhThanhVN.add("Hà Nội");
            dsTenTinhThanhVN.add("Thành phố Hồ Chí Minh");
            dsTenTinhThanhVN.add("Đồng Nai");
            dsTenTinhThanhVN.add("Cà Mau");
            dsTenTinhThanhVN.add("Vũng Tàu");
            dsTenTinhThanhVN.add("Bến Tre");

        //B2: Tạo Adapter
        ArrayAdapter<String> adapterTinhThanh;
        adapterTinhThanh = new ArrayAdapter<String>(
                                                    this,
                                                    android.R.layout.simple_list_item_1,
                                                    dsTenTinhThanhVN
                                                    );

        //B3: Gắn vào điều khiển hiển thị ListView
        // 3.1 Tìm
        ListView lvTenTinhThanh = findViewById(R.id.lvDanSachTT);
        // 3.2 Gắn
        lvTenTinhThanh.setAdapter(adapterTinhThanh);
        // 3.3 Lắng nghe và xử lý sự kiện người dùng tương tác
        //Để sau


    }
}