package deepcoding.study.seoulwifi

import android.content.Context
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.model.MarkerOptions
import com.google.maps.android.clustering.Cluster
import com.google.maps.android.clustering.ClusterManager
import com.google.maps.android.clustering.view.DefaultClusterRenderer

class ClusterRenderer(context: Context?,map:GoogleMap?, clusterManager: ClusterManager<MyItem>?):
    DefaultClusterRenderer<MyItem>(context, map,clusterManager) {

    init {
        clusterManager?.renderer = this
    }

    override fun onBeforeClusterItemRendered(item: MyItem, markerOptions: MarkerOptions) {
        markerOptions.icon(item.getIcon())
        markerOptions.visible(true)
    }
}