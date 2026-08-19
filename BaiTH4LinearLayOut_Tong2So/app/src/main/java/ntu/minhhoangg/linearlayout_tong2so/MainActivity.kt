package ntu.minhhoangg.linearlayout_tong2so

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

    // Khai báo các biến toàn cục (muốn để kiểu lateinit để gán sau trong hàm)
    private lateinit var editTextSo1: EditText
    private lateinit var editTextSo2: EditText
    private lateinit var editTextKQ: TextView

    private lateinit var nutCong: Button
    private lateinit var nutTru: Button
    private lateinit var nutNhan: Button
    private lateinit var nutChia: Button

    private fun timDieuKhien() {
        editTextSo1 = findViewById(R.id.edtSo1)
        editTextSo2 = findViewById(R.id.edtSo2)
        editTextKQ = findViewById(R.id.edtKetQua)

        nutCong = findViewById(R.id.btnCong)
        nutTru = findViewById(R.id.btnTru)
        nutNhan = findViewById(R.id.btnNhan)
        nutChia = findViewById(R.id.btnChia)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        timDieuKhien()
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets

        }

    }

    //Xử Lý Cộng
    fun xuLyCong(v: View) {
        val soThu1 = editTextSo1.text.toString()
        val soThu2 = editTextSo2.text.toString()

        // Kiểm tra xem 2 ô có đang để trống không
        if (soThu1.isNotBlank() && soThu2.isNotBlank()) {
            val soA = soThu1.toFloat()
            val soB = soThu2.toFloat()
            val tong = soA + soB
            editTextKQ.setText(tong.toString())
        } else {
            editTextKQ.setText("Vui lòng nhập đủ số!")
        }
    }

    //Xử Lý Trừ
    fun xuLyTru (v: View) {
        //Code xử lý ở đây
        //b1. lấy dữ liệu 2 số
        //b1.1. tìm view của Edit Text của ô nhập 1 và 2
        //b1.2 lấy dữ liệu từ 2 ô nhập
        val soThu1 = editTextSo1.text.toString()
        val soThu2 = editTextSo2.text.toString()
        // Kiểm tra xem 2 ô có đang để trống không
        if (soThu1.isNotBlank() && soThu2.isNotBlank()) {
            val soA = soThu1.toFloat()
            val soB = soThu2.toFloat()
            val hieu = soA - soB
            editTextKQ.setText(hieu.toString())
        } else {
            editTextKQ.setText("Vui lòng nhập đủ số!")
        }
    }

    //Xử Lý Nhân
    fun xuLyNhan (v: View) {
        //Code xử lý ở đây
        //b1. lấy dữ liệu 2 số
        //b1.1. tìm view của Edit Text của ô nhập 1 và 2
        //b1.2 lấy dữ liệu từ 2 ô nhập
        val soThu1 = editTextSo1.text.toString()
        val soThu2 = editTextSo2.text.toString()
        // Kiểm tra xem 2 ô có đang để trống không
        if (soThu1.isNotBlank() && soThu2.isNotBlank()) {
            val soA = soThu1.toFloat()
            val soB = soThu2.toFloat()
            val tich = soA - soB
            editTextKQ.setText(tich.toString())
        } else {
            editTextKQ.setText("Vui lòng nhập đủ số!")
        }
    }

    fun xuLyChia(v: View) {
        val soThu1 = editTextSo1.text.toString()
        val soThu2 = editTextSo2.text.toString()

        if (soThu1.isNotBlank() && soThu2.isNotBlank()) {
            val soA = soThu1.toFloat()
            val soB = soThu2.toFloat()

            if (soB != 0f) {
                val thuong = soA / soB
                editTextKQ.setText(thuong.toString())
            } else {
                editTextKQ.setText("Không thể chia cho 0")
            }
        }
    }

}