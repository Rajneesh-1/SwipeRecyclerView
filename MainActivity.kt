package com.smartherd.recyclerviewdemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.LinearLayoutManager
import com.smartherd.recyclerviewdemo.adapters.SwipeAdapter
import com.smartherd.recyclerviewdemo.databinding.ActivityMainBinding
import android.util.Log
import android.widget.Toast
import androidx.recyclerview.widget.ItemTouchHelper
import androidx.recyclerview.widget.RecyclerView
import android.graphics.Canvas
import android.graphics.Color
import androidx.appcompat.content.res.AppCompatResources

import androidx.core.content.ContextCompat

import it.xabaras.android.recyclerview.swipedecorator.RecyclerViewSwipeDecorator





const val BASE_URL ="https://jsonplaceholder.typicode.com/"
class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding
    private var toast: Toast? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        val list = ArrayList<String>()
        list.add("Android1")
        list.add("Android2")
        list.add("Android3")
        list.add("Android4")
        list.add("Android5")
        list.add("Android6")

        binding.rvRecyclerView.adapter = SwipeAdapter(this, list)
        binding.rvRecyclerView.layoutManager = LinearLayoutManager(this)

        object : SwipeHelper(this@MainActivity, binding.rvRecyclerView, false) {

            override fun instantiateUnderlayButton(
                viewHolder: RecyclerView.ViewHolder?,
                underlayButtons: MutableList<SwipeHelper.UnderlayButton>?
            ) {
                // Archive Button
                underlayButtons?.add(SwipeHelper.UnderlayButton(
                    "",
                    AppCompatResources.getDrawable(
                        this@MainActivity,
                        R.drawable.ic_baseline_delete_sweep_24
                    ),
                    Color.parseColor("#FF0000"), Color.parseColor("#ffffff"),
                    object : SwipeHelper.UnderlayButtonClickListener {
                        override fun onClick(pos: Int) {
                            Toast.makeText(
                                this@MainActivity,
                                "Delete clicked at " + pos,
                                Toast.LENGTH_SHORT
                            ).show()
                            //adapter.modelList.removeAt(pos);
                            //adapter.notifyItemRemoved(pos)
                        }
                    }

                ))

                // Flag Button
                /*underlayButtons?.add(SwipeHelper.UnderlayButton(
                    "Flag",
                    AppCompatResources.getDrawable(
                        this@MainActivity,
                        R.drawable.ic_flag_black_24dp
                    ),
                    Color.parseColor("#FF0000"), Color.parseColor("#ffffff"),
                    object : UnderlayButtonClickListener {
                        override fun onClick(pos: Int) {
                            Toast.makeText(
                                this@MainActivity,
                                "Flag Button Clicked at Position: " + pos,
                                Toast.LENGTH_SHORT
                            ).show()
                            //adapter.notifyItemChanged(pos)
                        }
                    }

                ))*/

                // More Button
                /*underlayButtons?.add(SwipeHelper.UnderlayButton(
                    "More",
                    AppCompatResources.getDrawable(
                        this@MainActivity,
                        R.drawable.ic_more_horiz_black_24dp
                    ),
                    Color.parseColor("#00FF00"), Color.parseColor("#ffffff"),
                    object : UnderlayButtonClickListener {
                        override fun onClick(pos: Int) {
                            Toast.makeText(
                                this@MainActivity,
                                "More Button CLicked at Position: " + pos,
                                Toast.LENGTH_SHORT
                            ).show()
                            //adapter.notifyItemChanged(pos)
                        }
                    }

                ))*/

            }

        }
    }
}
     /*   val itemTouchHelper = ItemTouchHelper(object : SwipeHelper(binding.rvRecyclerView) {
            override fun instantiateUnderlayButton(position: Int): List<UnderlayButton> {

                var buttons = listOf<UnderlayButton>()
                val deleteButton = deleteButton(position)
                //val markAsUnreadButton = markAsUnreadButton(position)
                //val archiveButton = archiveButton(position)
                when (position) {
                    //1 -> buttons = listOf(deleteButton)
                    //2 -> buttons = listOf(deleteButton, markAsUnreadButton)
                    //3 -> buttons = listOf(deleteButton, markAsUnreadButton, archiveButton)
                    else -> buttons = listOf(deleteButton)
                }
                return buttons
            }
        })

        itemTouchHelper.attachToRecyclerView(binding.rvRecyclerView)
    }

    private fun toast(text: String) {
        toast?.cancel()
        toast = Toast.makeText(this, text, Toast.LENGTH_SHORT)
        toast?.show()
    }

    private fun deleteButton(position: Int): SwipeHelper.UnderlayButton {
        return SwipeHelper.UnderlayButton(
            this,
            "Delete",
            14.0f,
            android.R.color.holo_red_light,
            object : SwipeHelper.UnderlayButtonClickListener {
                override fun onClick() {
                    Log.d("TAg", "------------Deleted--------------")

                        toast("Deleted item")
                }
            })
    }*/


    //getMyData()

        /*val creator = SwipeMenuCreator { menu -> // create "open" item
            val openItem = SwipeMenuItem(
                applicationContext
            )
            // set item background
            openItem.background = ColorDrawable(
                Color.rgb(
                    0xC9, 0xC9,
                    0xCE
                )
            )
            // set item width
            openItem.width = 170
            // set item title
            openItem.title = "Open"
            // set item title fontsize
            openItem.titleSize = 18
            // set item title font color
            openItem.titleColor = Color.parseColor("0000FF")
            // add to menu
            menu.addMenuItem(openItem)

            // create "delete" item
            val deleteItem = SwipeMenuItem(
                applicationContext
            )
            // set item background
            deleteItem.background = ColorDrawable(
                Color.rgb(
                    0xF9,
                    0x3F, 0x25
                )
            )
            // set item width
            deleteItem.width = 170
            // set a icon
            deleteItem.setIcon(R.drawable.ic_baseline_delete_sweep_24)
            // add to menu
            menu.addMenuItem(deleteItem)
        }

// set creator

// set creator
        binding.listView.setMenuCreator(creator)

        binding.listView.setOnMenuItemClickListener(object : SwipeMenuListView.OnMenuItemClickListener {
            override fun onMenuItemClick(position: Int, menu: SwipeMenu?, index: Int): Boolean {
                when (index) {
                    0 -> {
                    }
                    1 -> {
                    }
                }
                // false : close the menu; true : not close the menu
                return false
            }
        })*/

    /*private fun getMyData() {
        val retrofitBuilder = Retrofit.Builder()
            .addConverterFactory(GsonConverterFactory.create())
            .baseUrl(BASE_URL)
            .build()
            .create(RetrofitInterface::class.java)

        val retrofitData = retrofitBuilder.getData()

        retrofitData.enqueue(object : Callback<List<RetrofitModel>?> {
            override fun onResponse(
                call: Call<List<RetrofitModel>?>,
                response: Response<List<RetrofitModel>?>
            ) {
                val responseBody = response.body()!!
                val listofusersdetails = ArrayList<RetrofitModel>()

                responseBody.forEach { i ->

                    listofusersdetails.add(RetrofitModel(i.body, i.id, i.title, i.userId))

                    binding.reclrview.adapter = RetrofitAdapter(this@MainActivity, listofusersdetails)
                    binding.reclrview.layoutManager = LinearLayoutManager(this@MainActivity)

                }
            }

            override fun onFailure(call: Call<List<RetrofitModel>?>, t: Throwable) {
                Log.d("MainActivity", "onFailure$t")
            }
        })
    }*/
