import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.taskzen.R

class MyAdapter(private val dataSet: ArrayList<String>) :
        RecyclerView.Adapter<MyAdapter.ViewHolder>() {

// This ViewHolder class holds references to the views for each item in the RecyclerView
class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val textView: TextView = view.findViewById(R.id.textView2) // Replace "R.id.textView" with the ID of the TextView in your item layout
        }

        // This method creates a new ViewHolder instance when needed
        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context)
        .inflate(R.layout.activity_main, parent, false) // Replace "R.layout.item_layout" with the layout file for each item in your RecyclerView
        return ViewHolder(view)
        }

        // This method binds data to the views in each ViewHolder
        override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.textView.text = dataSet[position] // Set the text of the TextView to the corresponding data item
        }

        // This method returns the size of the dataset, i.e., the number of items in the RecyclerView
        override fun getItemCount(): Int {
        return dataSet.size
        }
        }
