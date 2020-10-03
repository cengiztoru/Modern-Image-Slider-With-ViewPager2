package com.cengiztoru.imagesliderviewpager2

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView
import androidx.viewpager2.widget.CompositePageTransformer
import androidx.viewpager2.widget.MarginPageTransformer
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.math.abs

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val adapter = TravelLocationAdapter(getTravelLocations())
        vpLocations.adapter = adapter

        //For multiple page
        vpLocations.clipToPadding = false
        vpLocations.clipChildren = false
        vpLocations.offscreenPageLimit = 3
        vpLocations.getChildAt(0).overScrollMode = RecyclerView.OVER_SCROLL_NEVER

        val compositeTransformer = CompositePageTransformer()
        compositeTransformer.addTransformer(MarginPageTransformer(40))
        compositeTransformer.addTransformer { page, position ->
            val r = 1 - abs(position)
            page.scaleY = (0.95f + r * 0.05f)
        }
        vpLocations.setPageTransformer(compositeTransformer)

    }

    private fun getTravelLocations(): ArrayList<TravelLocation> {
        val travelLocations = arrayListOf<TravelLocation>()
        travelLocations.add(
            TravelLocation(
                "France",
                "Eiffel Tower",
                "https://images.unsplash.com/photo-1511739001486-6bfe10ce785f?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=2134&q=80",
                4.8f
            )
        )
        travelLocations.add(
            TravelLocation(
                "Indonesia",
                "Mountain View",
                "https://images.unsplash.com/photo-1485470733090-0aae1788d5af?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=1391&q=80",
                4.8f
            )
        )
        travelLocations.add(
            TravelLocation(
                "India",
                "Taj Mahal",
                "https://images.unsplash.com/photo-1564507592333-c60657eea523?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=1351&q=80",
                4.8f
            )
        )
        travelLocations.add(
            TravelLocation(
                "Canada",
                "Lake View",
                "https://images.unsplash.com/photo-1451148693655-87a82f19229d?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=1352&q=80",
                4.8f
            )
        )
        travelLocations.add(
            TravelLocation(
                "France",
                "Eiffel Tower",
                "https://images.unsplash.com/photo-1511739001486-6bfe10ce785f?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=2134&q=80",
                4.8f
            )
        )
        travelLocations.add(
            TravelLocation(
                "Indonesia",
                "Mountain View",
                "https://images.unsplash.com/photo-1485470733090-0aae1788d5af?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=1391&q=80",
                4.8f
            )
        )
        travelLocations.add(
            TravelLocation(
                "India",
                "Taj Mahal",
                "https://images.unsplash.com/photo-1564507592333-c60657eea523?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=1351&q=80",
                4.8f
            )
        )
        travelLocations.add(
            TravelLocation(
                "Canada",
                "Lake View",
                "https://images.unsplash.com/photo-1451148693655-87a82f19229d?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=1352&q=80",
                4.8f
            )
        )
        travelLocations.add(
            TravelLocation(
                "France",
                "Eiffel Tower",
                "https://images.unsplash.com/photo-1511739001486-6bfe10ce785f?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=2134&q=80",
                4.8f
            )
        )
        travelLocations.add(
            TravelLocation(
                "Indonesia",
                "Mountain View",
                "https://images.unsplash.com/photo-1485470733090-0aae1788d5af?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=1391&q=80",
                4.8f
            )
        )
        travelLocations.add(
            TravelLocation(
                "India",
                "Taj Mahal",
                "https://images.unsplash.com/photo-1564507592333-c60657eea523?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=1351&q=80",
                4.8f
            )
        )
        travelLocations.add(
            TravelLocation(
                "Canada",
                "Lake View",
                "https://images.unsplash.com/photo-1451148693655-87a82f19229d?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=1352&q=80",
                4.8f
            )
        )
        return travelLocations
    }
}