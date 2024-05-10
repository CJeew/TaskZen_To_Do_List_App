//import android.os.Bundle
//import android.widget.Toast
//import androidx.appcompat.app.AppCompatActivity
//import androidx.recyclerview.widget.LinearLayoutManager
//import com.example.taskzen.MyAdapter
//import com.example.taskzen.R
//import kotlinx.android.synthetic.main.activity_main.*
//import androidx.recyclerview.widget.RecyclerView
//
//
//
//
//class MainActivity : AppCompatActivity() {
//
//    private lateinit var mAdapter: MyAdapter
//    private lateinit var recyclerView: RecyclerView
//    private val dataset = ArrayList<String>() // Initialize dataset
//
//    override fun onCreate(savedInstanceState: Bundle?) {
//
//        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_main)
//        recyclerView = findViewById(R.id.recyclerView)
//
//        // Initialize RecyclerView
//        val recyclerView = null
//        recyclerView.setHasFixedSize(true)
//
//        // Use a LinearLayoutManager
//        recyclerView.layoutManager = LinearLayoutManager(this)
//
//        // Initialize the adapter with an empty list
//        mAdapter = MyAdapter(dataset)
//        recyclerView.adapter = mAdapter
//
//        // Set OnClickListener for imageButton
//        val imageButton = null
//        imageButton.setOnClickListener {
//            // Add new data to your dataset
//            dataset.add("New Data") // You can replace "New Data" with your actual data
//            mAdapter.notifyDataSetChanged() // Notify the adapter that the dataset has changed
//            Toast.makeText(this@MainActivity, "New data added!", Toast.LENGTH_SHORT).show()
//        }
//    }
//}
//-----------------------------------------------------------------
//import android.os.Bundle
//import android.widget.Toast
//import androidx.appcompat.app.AppCompatActivity
//import androidx.recyclerview.widget.LinearLayoutManager
//import androidx.recyclerview.widget.RecyclerView
//import com.example.taskzen.R
//import kotlinx.android.synthetic.main.activity_main.*
//
//class MainActivity : AppCompatActivity() {
//
//    private lateinit var mAdapter: MyAdapter
//    private val dataset = ArrayList<String>() // Initialize dataset
//
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_main)
//
//        val recyclerView = findViewById<RecyclerView>(R.id.recyclerView)
//
//        // Use a LinearLayoutManager
//        recyclerView.layoutManager = LinearLayoutManager(this)
//
//        // Initialize the adapter with an empty list
//        mAdapter = MyAdapter(dataset)
//        recyclerView.adapter = mAdapter
//
//        // Set OnClickListener for imageButton
//        imageButton.setOnClickListener {
//            // Add new data to your dataset
//            dataset.add("New Data") // You can replace "New Data" with your actual data
//            mAdapter.notifyDataSetChanged() // Notify the adapter that the dataset has changed
//            Toast.makeText(this@MainActivity, "New data added!", Toast.LENGTH_SHORT).show()
//        }
//    }
//}
//------
import android.os.Bundle
import android.widget.ImageButton
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
//import com.example.taskzen.MyAdapter
import com.example.taskzen.R
//import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private lateinit var mAdapter: MyAdapter
    private lateinit var recyclerView: RecyclerView
    private lateinit var imageButton: ImageButton // Declare ImageButton

    private val dataset = ArrayList<String>() // Initialize dataset

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerView = findViewById(R.id.recyclerView)
        imageButton = findViewById(R.id.imageButton) // Initialize ImageButton

        // Use a LinearLayoutManager
        recyclerView.layoutManager = LinearLayoutManager(this)

        // Initialize the adapter with an empty list
        mAdapter = MyAdapter(dataset)
        recyclerView.adapter = mAdapter

        // Set OnClickListener for imageButton
        imageButton.setOnClickListener {
            // Add new data to your dataset
            dataset.add("New Data") // You can replace "New Data" with your actual data
            mAdapter.notifyDataSetChanged() // Notify the adapter that the dataset has changed
            Toast.makeText(this@MainActivity, "New data added!", Toast.LENGTH_SHORT).show()
        }
    }
}
