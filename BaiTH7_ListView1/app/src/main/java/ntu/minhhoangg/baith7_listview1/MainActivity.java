package ntu.minhhoangg.baith7_listview1;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ArrayList<String> dsTenTinhThanhVN; //Khai báo (-- Đã chuyển từ onCreate ra ngoài)

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
        //--------------------------------------
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
        lvTenTinhThanh.setOnItemClickListener(boLangNgheVaXuLy);



    }
    //Tạo bộ lắng nghe và xử lý sự kiện onItemClick, đặt vào một biến
    //Vd: boLangNgheVaXuLy
        AdapterView.OnItemClickListener boLangNgheVaXuLy = new AdapterView.OnItemClickListener() {
        @Override
        public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
            //Code xử lý ở đây
            //i là vị trí phần tử vừa được Tương tác
            //Ví dụ xử lý ở đây, là hiện lên màn hình một thông báo nhanh về vị trí của phần tử vừa chọn
            //Ví dụ khác, thay vì hiện ví trị hiện của của phần tử thì ta hiện giá trị
                //Lấy giá trị ở phần tử thứ i
            String strTenTinhChon = dsTenTinhThanhVN.get(i);
            Toast.makeText(MainActivity.this,strTenTinhChon,Toast.LENGTH_LONG).show();  //Trước show chỉ là make text thôi, (.show() thì mới show ra)



//            Toast.makeText(MainActivity.this,"Bạn vừa chọn:"+String.valueOf(i),Toast.LENGTH_LONG).show();  //Trước show chỉ là make text thôi, (.show() thì mới show ra)

        }
    };


}